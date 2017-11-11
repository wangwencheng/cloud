<#include "include/include_head.ftl"/>
</head>
<body class="login-body">
<div class="modal fade" id="LoginModal" tabindex="-1" login="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
        </div>
    </div>
</div>
<div class="container">
    <form class="form-signin" method="post" id="loginForm" >
        <div class="form-signin-heading text-center">
            <h1 class="sign-title">登录</h1>
            <img src="/assets/custom/images/login-logo.png" alt=""/>
        </div>
        <div class="login-wrap">
            <div class="form-group">
                <input type="text" name="userName" class="form-control" placeholder="请输入用户账号" autofocus>
            </div>
            <div class="form-group">
                <input type="text" name="userName" class="form-control" placeholder="请输入用户密码" autofocus>
            </div>
            <div class="rows">
                <div class="col-md-8"><input type="text" id="srand"  name="srand" style="width:180px;margin-left:-15px" class="form-control" placeholder="获取验证码" autofocus></div>
                <div class="col-md-4"><img id="image" name="image" onclick="showImage();" src="/image.jsp" style="height:34px;vertical-align:middle;margin-left:-20px" /></div>
            </div>
            <button class="btn btn-lg btn-login btn-block" type="button" id="online" onclick="login()">
                <i class="fa fa-check"></i>
            </button>
        </div>
    </form>
</div>
</body>
</html>

