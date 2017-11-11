package cloud.simple.service.util;

import java.security.MessageDigest;

public class MD5 {

	public final static String toMD5(String s) {
		byte cResult[] = new byte[16];
		String sResult = "";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(("terton" + s).getBytes());
			cResult = md.digest();
			for (int i = 0; i < cResult.length; i++) {
				if (cResult[i] < 0) {
					cResult[i] += 128;
				}
				String sTemp = Integer.toHexString(cResult[i]).toUpperCase();
				if (cResult[i] < 16) {
					sTemp = "0" + sTemp;
				}
				sResult += sTemp;
			}
		} catch (Exception e) {
			sResult = "";
		}
		return sResult;
	}

	public static final String toMD5(byte[] message) throws Exception {
		try {
			MessageDigest digest = MessageDigest.getInstance("MD5");
			digest.reset();
			digest.update(message);
			byte[] abyte = digest.digest();
			return byte2hex(abyte);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	private static String byte2hex(byte[] b) {
		String hs = "", stmp = "";
		for (int n = 0; n < b.length; n++) {
			stmp = (Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1) {
				hs = hs + "0" + stmp;
			} else
				hs = hs + stmp;
		}
		return hs.toLowerCase();
	}

	/*public static final void main(String[] args) {
		System.out.println("123456 = " + MD5.toMD5("123456"));
	}*/
}
