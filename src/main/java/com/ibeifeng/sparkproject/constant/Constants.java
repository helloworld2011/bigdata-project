package com.ibeifeng.sparkproject.constant;

/**
 * 常量接口
 * @author Administrator
 *
 */
public interface Constants {

	/**
	 * 数据库相关的常量
	 */
	String JDBC_DRIVER = "jdbc.driver";
	String JDBC_DATASOURCE_SIZE = "jdbc.datasource.size";
	String JDBC_URL = "jdbc.url";
	String JDBC_USER = "jdbc.user";
	String JDBC_PASSWORD = "jdbc.password";
	String SPARK_APP_NAME_SESSION = "Spark";
	String Spark_LOCAL = "spark.local";


	String PARAM_START_DATE = "start_date";
	String PARAM_END_DATE = "end_date";

	String FIELD_SESSION_ID = "session_id";
	String FIELD_SEARCH_KEYWORDS = "search_keywords";
	String FIELD_CLICK_CATEGORY_IDS = "click_category_ids";

	String FIELD_AGE = "session_id";
	String FIELD_PROFESSIONAL = "search_keywords";
	String FIELD_CITY = "city";

	String FIELD_SEX = "sex";
}
