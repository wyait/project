package com.wyait.common.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

/**
 * @项目名称：wyait-manage
 * @包名：com.wyait-common.utils
 * @类描述：
 * @创建人：wyait
 * @创建时间：2018-01-08 15:36
 * @version：V1.0
 */
public class ValidateUtil {
		
		private static final Pattern P_EMAIL = Pattern
				.compile("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$");

		/**
		 *
		 * @描述：校验email格式
		 * @创建人：wyait
		 * @创建时间：2016年12月21日 下午1:38:45
		 * @param str
		 * @return
		 */
		public static boolean isEmail(String str) {
			return str != null && P_EMAIL.matcher(str).matches();
		}

		private static final Pattern SIMPLE_PASSWORD = Pattern
			.compile("^[0-9_a-zA-Z]{6,20}$");
		public static boolean isSimplePassword(String str) {
			return StringUtils.isNotBlank(str) && SIMPLE_PASSWORD.matcher(str).matches();
		}
		
		private static final Pattern PASSWORD = Pattern
				.compile("");
		/*private static final Pattern YOUNG_PASSWORD = Pattern
				.compile("");*/
		private static final Pattern CENTER_PASSWORD = Pattern
				.compile("");
		private static final Pattern STRONG_PASSWORD = Pattern
				.compile("");

		/**
		 *
		 * @描述：密码校验：匹配小写字母、大写字母、数字、特殊符号的两种及两种以上【非中文】
		 * @创建人：wyait
		 * @创建时间：2017年1月5日15:19:17
		 * @param str
		 * @return
		 */
		public static boolean isPassword(String str) {
			return str != null && PASSWORD.matcher(str).matches();
		}
		/*public static boolean isYoungPassword(String str) {
			return str != null && YOUNG_PASSWORD.matcher(str).matches();
		}*/
		public static boolean isCenterPassword(String str) {
			return str != null && CENTER_PASSWORD.matcher(str).matches();
		}

		public static boolean isStrongPassword(String str) {
			return str != null && STRONG_PASSWORD.matcher(str).matches();
		}

		private static final Pattern P_MOBILEPHONE = Pattern.compile("^1\\d{10}$");

		/**
		 *
		 * @描述：校验是否为11位1开头手机号
		 * @创建人：wyait
		 * @创建时间：2016年12月21日 下午1:39:01
		 * @param str
		 * @return
		 */
		public static boolean isMobilephone(String str) {
			return StringUtils.isNotBlank(str) && P_MOBILEPHONE.matcher(str).matches();
		}

		// 正负数字
		private static final Pattern P_NUMBER = Pattern.compile("^[-\\+]?[\\d]+$");

		/**
		 *
		 * @描述：校验是否正负数字
		 * @创建人：wyait
		 * @创建时间：2016年12月21日 下午1:39:21
		 * @param str
		 * @return
		 */
		public static boolean isNumber(String str) {
			return StringUtils.isNotBlank(str) && P_NUMBER.matcher(str).matches();
		}

		// QQ校验 4_12位
		private static final Pattern QQ = Pattern.compile("[1-9][0-9]{4,12}");

		/**
		 *
		 * @描述：校验是否为4-12位正整数
		 * @创建人：wyait
		 * @创建时间：2016年12月21日 下午1:39:42
		 * @param str
		 * @return
		 */
		public static boolean isQQ(String str) {
			return StringUtils.isNotBlank(str) && QQ.matcher(str).matches();
		}

		// 6位数验证码
		private static final Pattern CODE = Pattern.compile("[0-9]{6}$");

		/**
		 *
		 * @描述：校验是否为6位数字验证码
		 * @创建人：wyait
		 * @创建时间：2016年12月21日 下午1:39:59
		 * @param str
		 * @return
		 */
		public static boolean isCode(String str) {
			return StringUtils.isNotBlank(str) && CODE.matcher(str).matches();
		}

		// 图片验证码 4位随机字母和数字
		private static final Pattern PICCODE = Pattern.compile("\\w{4}$");

		/**
		 *
		 * @描述：校验是否为4位随机正整数和字母
		 * @创建人：wyait
		 * @创建时间：2016年12月21日 下午1:40:15
		 * @param str
		 * @return
		 */
		public static boolean isPicCode(String str) {
			return str != null && PICCODE.matcher(str).matches();
		}

		// 正负数（包含小数、整数）
		private static final Pattern P_DOUBLE = Pattern.compile("");

		/**
		 *
		 * @描述：校验是否为正负数（包含小数、整数）
		 * @创建人：wyait
		 * @创建时间：2016年12月21日 下午1:40:53
		 * @param str
		 * @return
		 */
		public static boolean isDouble(String str) {
			return str != null && P_DOUBLE.matcher(str).matches();
		}

		// 是否全是中文，如果有其他非中文字符，false
		private static final Pattern P_CHINESE = Pattern
				.compile("^[\u0391-\uFFE5]+$");

		/**
		 *
		 * @描述：校验是否为中文汉字
		 * @创建人：wyait
		 * @创建时间：2016年12月21日 下午1:41:17
		 * @param str
		 * @return
		 */
		public static boolean isChinese(String str) {
			return str != null && P_CHINESE.matcher(str).matches();
		}

		// 是否包含中文，包含即为true
		private static final Pattern P_CHINESE_A = Pattern
				.compile("[\u0391-\uFFE5]");

		/**
		 *
		 * @描述：校验是否包含中文
		 * @创建人：wyait
		 * @创建时间：2016年12月21日 下午1:41:32
		 * @param str
		 * @return
		 */
		public static boolean hasChinese(String str) {
			return str != null && P_CHINESE_A.matcher(str).find();
		}

		// 搜索条件各名称校验
		private static final Pattern NAME = Pattern
				.compile("");

		/**
		 *
		 * @描述：搜索名称校验（字母、数字、汉字、下划线等符号）
		 * @创建人：wyait
		 * @创建时间：2016年12月21日 下午1:41:49
		 * @param str
		 * @return
		 */
		public static boolean isSearchName(String str) {
			return str != null && NAME.matcher(str).matches();
		}

		/**
		 * 银行卡简单校验（16或19位）
		 */
		private static final Pattern BANKCODE = Pattern
				.compile("");

		/**
		 *
		 * @描述：银行卡号校验
		 * @创建人：wyait
		 * @创建时间：2016年12月21日 下午1:43:28
		 * @param str
		 * @return
		 */
		public static boolean isBankCode(String str) {
			return str != null && BANKCODE.matcher(str).matches();
		}

		/**
		 * 6位数字短信验证码
		 */
		private static final Pattern MESCODE = Pattern.compile("^[0-9]{6}$");

		public static boolean isMessageCode(String str) {
			return str != null && MESCODE.matcher(str).matches();
		}

		/**
		 * 正整数、小数点后两位    金额校验
		 */
		private static final Pattern MONEY = Pattern
				.compile("");

		/**
		 *
		 * @描述：正整数、小数点后两位    金额校验
		 * @创建人：wyait
		 * @创建时间：2016年12月21日 下午1:44:00
		 * @param str
		 * @return
		 */
		public static boolean isMoney(String str) {
			return str != null && MONEY.matcher(str).matches();
		}

		/**
		 * 小于等于100的正整数、小数点后两位
		 */
		private static final Pattern BAIMONEY = Pattern
				.compile("");

		/**
		 *
		 * @描述：小于等于100的正整数、小数点后两位
		 * @创建人：wyait
		 * @创建时间：2016年12月21日 下午1:44:00
		 * @param str
		 * @return
		 */
		public static boolean isBaiMoney(String str) {
			return str != null && BAIMONEY.matcher(str).matches();
		}

		// 备注校验 可输入：中英文、空格、中英文标点下划线。
		private static final Pattern REMARK = Pattern
				.compile("");

		/**
		 *
		 * @描述：备注校验 可输入：中英文、空格、中英文标点下划线。
		 * @创建人：wyait
		 * @创建时间：2016年12月21日 下午1:44:09
		 * @param str
		 * @return
		 */
		public static boolean isRemark(String str) {
			return str != null && REMARK.matcher(str).matches();
		}

		/**
		 * 微信号校验
		 */
		private static final Pattern WXNUM = Pattern
				.compile("");

		/**
		 *
		 * @描述：微信号校验
		 * @创建人：wyait
		 * @创建时间：2016年12月26日17:52:08
		 * @param str
		 * @return
		 */
		public static boolean isWxnum(String str) {
			return str != null && WXNUM.matcher(str).matches();
		}

		/**
		 * 用户名校验:字母、数字、中文、下划线组成2-20位【不能以下划线开头】
		 */
		private static final Pattern USERNAME = Pattern
				.compile("");

		/**
		 *
		 * @描述：用户号校验
		 * @创建人：wyait
		 * @创建时间：2016年12月26日17:52:08
		 * @param str
		 * @return
		 */
		public static boolean isUsername(String str) {
			return str != null && USERNAME.matcher(str).matches();
		}

		/**
		 * 用户名校验:字母、中文、点组成2-20位
		 */
		private static final Pattern REALRNAME = Pattern
				.compile("");

		/**
		 *
		 * @描述：真实姓名校验
		 * @创建人：wyait
		 * @创建时间：2016年12月26日17:52:08
		 * @param str
		 * @return
		 */
		public static boolean isRealname(String str) {
			return str != null && REALRNAME.matcher(str).matches();
		}
		/**
		 * 用户名校验:字母、中文、点组成2-20位
		 */
		private static final Pattern ADDRIP = Pattern
				.compile("");

		public static boolean isAddrIP(String str) {
			return str != null && ADDRIP.matcher(str).matches();
		}
		//只能输入两位小数的校验
		private static final Pattern MONEY2 = Pattern
				.compile("");

		public static boolean isMONEY2(String str) {
			return str != null && MONEY2.matcher(str).matches();
		}

		/**年份支持1000-3999 支持横线**/
		private static final Pattern DATE=Pattern
				.compile("");
		public static boolean isDate(String str){
			return str != null && DATE.matcher(str).matches();
		}
		// 测试
		public static void main(String[] args) {
		/*String str = "qwe7891";
		String str10 = "qwertyuio@48911111";
		String str11 = "qwertyuio!5678911110";
		String str1 = "192.0.10.1";
		String str2 = "192.168.10.05";
		String str3 = "192.8.10.50";
		String str4 = "256.168.10.255";
		String str5 = "666.2.2.3";
		String str6 = "255.26.0.0";
		String str7 = "255.25.253.0";
		String str8 = "255.26.273.23";
		String str9 = "255.25.23.2";*/
			String qq="0.12";
			String qq2="1.12";
			String qq3="0.123";
			String qq4="0.1";
			String qq5="1";



			System.out.println(qq+" : "+isMONEY2(qq));
			System.out.println(qq2+" : "+isMONEY2(qq2));
			System.out.println(qq3+" : "+isMONEY2(qq3));
			System.out.println(qq4+" : "+isMONEY2(qq4));
			System.out.println(qq5+" : "+isMONEY2(qq5));
		/*System.out.println(str + ": " + isPassword(str) + "+++长度"
				+ str.length());
		System.out.println(str10 + ": " + isPassword(str10) + "+++长度"
				+ str10.length());
		System.out.println(str11 + ": " + isPassword(str11) + "+++长度"
				+ str11.length());
		System.out.println(str1 + ": " + isAddrIP(str1));
		System.out.println(str2 + ": " + isAddrIP(str2));
		System.out.println(str3 + ": " + isAddrIP(str3));
		System.out.println(str4 + ": " + isAddrIP(str4));
		System.out.println(str5 + ": " + isAddrIP(str5));
		System.out.println(str6 + ": " + isAddrIP(str6));
		System.out.println(str7 + ": " + isAddrIP(str7));
		System.out.println(str8 + ": " + isAddrIP(str8));
		System.out.println(str9 + ": " + isAddrIP(str9));*/
			//		String str = "我是";
			//		String str1 = "王者";
			//		String str2 = "Sdfs abc";
			//		String str3 = "wyait的接口经理经历";
			//		String str4 = "WW abc.fdskfsk";
			//		String str5 = "6";
			//		String str6 = "s";
			//		String str7 = "djafd ffas.fsf";
			//		String str8 = "shi fou";
			//		String str9 = "a. AAAA";
			//		System.out.println(str + ": " + isRealname(str) + "+++长度"
			//				+ str.length());
			//		System.out.println(str1 + ": " + isRealname(str1));
			//		System.out.println(str2 + ": " + isRealname(str2));
			//		System.out.println(str3 + ": " + isRealname(str3));
			//		System.out.println(str4 + ": " + isRealname(str4));
			//		System.out.println(str5 + ": " + isRealname(str5));
			//		System.out.println(str6 + ": " + isRealname(str6));
			//		System.out.println(str7 + ": " + isRealname(str7));
			//		System.out.println(str8 + ": " + isRealname(str8));
			//		System.out.println(str9 + ": " + isRealname(str9));
			//		String str10 = "abcde611121234";
			//		if (isStrongPassword(str10)) {
			//			System.out.println("强");
			//		} else if (isCenterPassword(str10)) {
			//			System.out.println("中");
			//		} else if (isPassword(str10)) {
			//			System.out.println("弱");
			//		}

		}


}
