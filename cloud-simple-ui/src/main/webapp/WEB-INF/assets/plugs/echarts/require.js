require.config({
	paths : {
		echarts : '/wgcss/assets/plugs/dist'
	}
});

//使用
require([ 'echarts', 'echarts/chart/line', // 使用折线图就加载line模块，按需加载
'echarts/chart/pie', // 圆饼图 pie
], function(ec) {
	// 基于准备好的dom，初始化echarts图表
	var memoryCheck = ec.init(document.getElementById('memoryCheck'));
	var memoryUse = ec.init(document.getElementById('memoryUse'));
	var siteDisk = ec.init(document.getElementById('siteDisk'));
	$.ajax({
		url : '/wgcss/main/memoryCheckOption.do',
		type : 'POST',
		dataType : 'json',
		success : function(data) {
			// 设置 内存监测 数据
			var memoryCheckOption = {
				title : {
					text : 'CPU监测'
				},
				tooltip : {
			        trigger: 'axis',
			        formatter: "{a} <br/>{b} : {c}%"
			    },
				xAxis : [ {
					type : 'category',
					boundaryGap : false,
					data : data.data.xAxis
				} ],
				yAxis : [ {
					type : 'value',
					max:100
				} ],
				series : [ {
					name : 'CPU使用率',
					type:'line',
		          	itemStyle: {normal: {
		          		label : {show:true,position:'top',formatter:'{c} %'}
		          	}},
					stack : '总量',
					data : data.data.series
				} ],
				color : [ 'green']
			};
			memoryCheck.setOption(memoryCheckOption);

			// 设置 内存使用 数据
			var memoryUseOption = {
				title : {
					text : '内存使用(最大内存：'+data.other.maxmemory+data.other.memoryunit+')',
					left : 'center'
				},
				tooltip : {
					trigger : 'item',
					formatter : "{a} <br/>{b} : {c}"+data.other.memoryunit+" ({d}%) "
				},
				series : [ {
					name : '内存使用',
					type : 'pie',
					radius : '55%',
					center : [ '50%', '50%' ],
					data : [ {
						value : data.other.memoryuse,
						name : '已用'
					}, {
						value : data.other.memoryfree,
						name : '可用'
					}, ],
				} ],
				color : [ '#7a7676', '#65cea7']
			};
			memoryUse.setOption(memoryUseOption);
			// 设置 站点磁盘 数据
			var siteDiskOption = {
				backgroundColor : 'white',
				title : {
					text : '站点磁盘:'+(data.other.diskall)+'G',
					left : 'center',
					top : 20,
				},

				tooltip : {
					trigger : 'item',
					formatter : "{a} <br/>{b} : {c}G ({d}%)"
				},
				series : [ {
					name : '站点磁盘',
					type : 'pie',
					radius : '55%',
					center : [ '50%', '50%' ],
					data : [ {
						value : data.other.diskuse,
						name : '已用'
					}, {
						value : data.other.diskfree,
						name : '可用'
					}, ],
				} ],
				color : [ '#7a7676', '#65cea7' ]
			};
			// 为echarts对象加载数据
			siteDisk.setOption(siteDiskOption);
		}
	});

});
