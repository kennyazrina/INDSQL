// Generated from Indsql.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IndsqlParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABS=1, ACCESSIBLE_SYM=2, ACOS=3, ACTION=4, ADD_SYM=5, ADDDATE=6, ADDTIME=7, 
		AES_DECRYPT=8, AES_ENCRYPT=9, AFTER_SYM=10, AGAINST=11, AGGREGATE_SYM=12, 
		ALGORITHM_SYM=13, ALL=14, ALTER=15, ANALYZE_SYM=16, ANY=17, ARMSCII8=18, 
		AS_SYM=19, ASC=20, ASCII_SYM=21, ASENSITIVE_SYM=22, ASIN=23, AT_SYM=24, 
		ATAN=25, ATAN2=26, AUTHORS_SYM=27, AUTO_INCREMENT=28, AUTOEXTEND_SIZE_SYM=29, 
		AVG=30, AVG_ROW_LENGTH=31, BACKUP_SYM=32, BEFORE_SYM=33, BEGIN_SYM=34, 
		BENCHMARK=35, BETWEEN=36, BIG5=37, BIGINT=38, BIN=39, BINARY=40, BINLOG_SYM=41, 
		BIT_AND=42, BIT_LENGTH=43, BIT_OR=44, BIT_SYM=45, BIT_XOR=46, BLOB_SYM=47, 
		BLOCK_SYM=48, BOOL_SYM=49, BOOLEAN_SYM=50, BOTH=51, BTREE_SYM=52, BY_SYM=53, 
		BYTE_SYM=54, CACHE_SYM=55, CALL_SYM=56, CASCADE=57, CASCADED=58, CASE_SYM=59, 
		CAST_SYM=60, CEIL=61, CEILING=62, CHAIN_SYM=63, CHANGE=64, CHANGED=65, 
		CHAR=66, CHAR_LENGTH=67, CHARACTER_SYM=68, CHARSET=69, CHECK_SYM=70, CHECKSUM_SYM=71, 
		CIPHER_SYM=72, CLIENT_SYM=73, CLOSE_SYM=74, COALESCE=75, CODE_SYM=76, 
		COERCIBILITY=77, COLLATE_SYM=78, COLLATION=79, COLUMN_FORMAT=80, COLUMN_SYM=81, 
		COLUMNS_SYM=82, COMMENT_SYM=83, COMMIT_SYM=84, COMMITTED_SYM=85, COMPACT_SYM=86, 
		COMPLETION_SYM=87, COMPRESS=88, COMPRESSED_SYM=89, CONCAT=90, CONCAT_WS=91, 
		CONCURRENT=92, CONDITION_SYM=93, CONNECTION_ID=94, CONNECTION_SYM=95, 
		CONSISTENT_SYM=96, CONSTRAINT=97, CONTAINS_SYM=98, CONTEXT_SYM=99, CONTINUE_SYM=100, 
		CONTRIBUTORS_SYM=101, CONV=102, CONVERT_SYM=103, CONVERT_TZ=104, COPY_SYM=105, 
		COS=106, COT=107, COUNT=108, CP1250=109, CP1251=110, CP1256=111, CP1257=112, 
		CP850=113, CP852=114, CP866=115, CP932=116, CPU_SYM=117, CRC32=118, CREATE=119, 
		CROSECOND=120, CROSS=121, CUBE_SYM=122, CURDATE=123, CURRENT_TIMESTAMP=124, 
		CURRENT_USER=125, CURSOR_SYM=126, CURTIME=127, DATABASE=128, DATAFILE_SYM=129, 
		DATA_SYM=130, DATE_ADD=131, DATE_FORMAT=132, DATE_SUB=133, DATE_SYM=134, 
		DATEDIFF=135, DATETIME=136, DAY_SYM=137, DAY_HOUR=138, DAY_MICROSECOND=139, 
		DAY_MINUTE=140, DAY_SECOND=141, DAYNAME=142, DAYOFMONTH=143, DAYOFWEEK=144, 
		DAYOFYEAR=145, DEALLOCATE_SYM=146, DEC8=147, DECIMAL_SYM=148, DECLARE_SYM=149, 
		DECODE=150, DEFAULT=151, DEFINER=152, DEGREES=153, DELAY_KEY_WRITE_SYM=154, 
		DELAYED_SYM=155, DELETE_SYM=156, DES_DECRYPT=157, DES_ENCRYPT=158, DES_KEY_FILE=159, 
		DESC=160, DETERMINISTIC_SYM=161, DIRECTORY_SYM=162, DISABLE_SYM=163, DISCARD=164, 
		DISK_SYM=165, DISTINCT=166, DISTINCTROW=167, DO_SYM=168, DOUBLE_SYM=169, 
		DROP=170, DUAL_SYM=171, DUMPFILE=172, DUPLICATE_SYM=173, DYNAMIC_SYM=174, 
		EACH_SYM=175, ELSE_SYM=176, ELSIF_SYM=177, ELT=178, ENABLE_SYM=179, ENCLOSED=180, 
		ENCODE=181, ENCRYPT=182, END_SYM=183, ENDS_SYM=184, ENGINE_SYM=185, ENGINES_SYM=186, 
		ENUM=187, ERRORS=188, ESCAPE_SYM=189, ESCAPED=190, EUCJPMS=191, EUCKR=192, 
		EVENT_SYM=193, EVENTS_SYM=194, EVERY_SYM=195, EXCHANGE_SYM=196, EXECUTE_SYM=197, 
		EXCLUSIVE_SYM=198, EXISTS=199, EXIT_SYM=200, EXP=201, EXPANSION_SYM=202, 
		EXPORT_SET=203, EXTENDED_SYM=204, EXTENT_SIZE_SYM=205, EXTRACT=206, FALSE_SYM=207, 
		FAST_SYM=208, FAULTS_SYM=209, FIELDS_SYM=210, FETCH_SYM=211, FIELD=212, 
		FILE_SYM=213, FIND_IN_SET=214, FIRST_SYM=215, FIXED_SYM=216, FLOAT_SYM=217, 
		FLOOR=218, FLUSH_SYM=219, FOR_SYM=220, FORCE_SYM=221, FOREIGN=222, FORMAT=223, 
		FOUND_ROWS=224, FOUND_SYM=225, FROM=226, FROM_BASE64=227, FROM_DAYS=228, 
		FROM_UNIXTIME=229, FULL=230, FULLTEXT_SYM=231, FUNCTION_SYM=232, GB2312=233, 
		GBK=234, GEOMETRY_SYM=235, GEOMETRYCOLLECTION=236, GEOSTD8=237, GET_FORMAT=238, 
		GET_LOCK=239, GLOBAL_SYM=240, GRANT=241, GRANTS=242, GREEK=243, GROUP_CONCAT=244, 
		GROUP_SYM=245, HANDLER_SYM=246, HASH_SYM=247, HAVING=248, HEBREW=249, 
		HELP_SYM=250, HEX=251, HIGH_PRIORITY=252, HOST_SYM=253, HOSTS_SYM=254, 
		HOUR=255, HOUR_MICROSECOND=256, HOUR_MINUTE=257, HOUR_SECOND=258, HP8=259, 
		IDENTIFIED_SYM=260, IF=261, IFNULL=262, IGNORE_SYM=263, IMPORT=264, IN_SYM=265, 
		INDEX_SYM=266, INDEXES=267, INET_ATON=268, INET_NTOA=269, INFILE=270, 
		INITIAL_SIZE_SYM=271, INNER_SYM=272, INOUT_SYM=273, INPLACE_SYM=274, INSENSITIVE_SYM=275, 
		INSERT=276, INSERT_METHOD=277, INSTALL_SYM=278, INSTR=279, INT_SYM=280, 
		INTEGER_SYM=281, INTERVAL_SYM=282, INTO=283, INVOKER_SYM=284, IO_SYM=285, 
		IPC_SYM=286, IS_FREE_LOCK=287, IS_SYM=288, IS_USED_LOCK=289, ISOLATION=290, 
		ISSUER_SYM=291, ITERATE_SYM=292, JOIN_SYM=293, KEY_BLOCK_SIZE=294, KEY_SYM=295, 
		KEYBCS2=296, KEYS=297, KILL_SYM=298, KOI8R=299, KOI8U=300, LANGUAGE=301, 
		LAST_DAY=302, LAST_INSERT_ID=303, LAST_SYM=304, LATIN1_BIN=305, LATIN1_GENERAL_CS=306, 
		LATIN1=307, LATIN2=308, LATIN5=309, LATIN7=310, LEADING=311, LEAVE_SYM=312, 
		LEAVES=313, LEFT=314, LENGTH=315, LESS_SYM=316, LEVEL_SYM=317, LIKE_SYM=318, 
		LIMIT=319, LINEAR_SYM=320, LINES=321, LINESTRING=322, LIST_SYM=323, LN=324, 
		LOAD=325, LOAD_FILE=326, LOCAL_SYM=327, LOCATE=328, LOCK=329, LOCKS_SYM=330, 
		LOG=331, LOG10=332, LOG2=333, LOGFILE_SYM=334, LOGS_SYM=335, LONG_SYM=336, 
		LONGBLOB=337, LONGTEXT=338, LOOP_SYM=339, LOW_PRIORITY=340, LOWER=341, 
		LPAD=342, LTRIM=343, MACCE=344, MACROMAN=345, MAKE_SET=346, MAKEDATE=347, 
		MAKETIME=348, MASTER_CONNECT_RETRY=349, MASTER_HOST_SYM=350, MASTER_LOG_FILE_SYM=351, 
		MASTER_LOG_POS_SYM=352, MASTER_PASSWORD_SYM=353, MASTER_PORT_SYM=354, 
		MASTER_POS_WAIT=355, MASTER_SERVER_ID_SYM=356, MASTER_SSL_CA_SYM=357, 
		MASTER_SSL_CAPATH_SYM=358, MASTER_SSL_CERT_SYM=359, MASTER_SSL_CIPHER_SYM=360, 
		MASTER_SSL_KEY_SYM=361, MASTER_SSL_SYM=362, MASTER_SSL_VERIFY_SERVER_CERT=363, 
		MASTER_SYM=364, MASTER_USER_SYM=365, MATCH=366, MAX_SYM=367, MAX_CONNECTIONS_PER_HOUR=368, 
		MAX_QUERIES_PER_HOUR=369, MAX_ROWS=370, MAX_SIZE_SYM=371, MAX_UPDATES_PER_HOUR=372, 
		MAX_USER_CONNECTIONS_SYM=373, MAXVALUE_SYM=374, MD5=375, MEDIUM_SYM=376, 
		MEDIUMBLOB=377, MEDIUMINT=378, MEDIUMTEXT=379, MEMORY_SYM=380, MERGE_SYM=381, 
		MICROSECOND=382, MID=383, MIGRATE_SYM=384, MIN_SYM=385, MIN_ROWS=386, 
		MINUTE=387, MINUTE_MICROSECOND=388, MINUTE_SECOND=389, MOD=390, MODE_SYM=391, 
		MODIFIES_SYM=392, MODIFY_SYM=393, MONTH=394, MONTHNAME=395, MULTILINESTRING=396, 
		MULTIPOINT=397, MULTIPOLYGON=398, MUTEX_SYM=399, NAME_CONST=400, NAME_SYM=401, 
		NAMES_SYM=402, NATIONAL_SYM=403, NATURAL=404, NCHAR_SYM=405, NEW_SYM=406, 
		NEXT_SYM=407, NO_SYM=408, NO_WAIT_SYM=409, NO_WRITE_TO_BINLOG=410, NODEGROUP_SYM=411, 
		NONE_SYM=412, NOT_SYM=413, NOW=414, NULL_SYM=415, NUMERIC_SYM=416, NVARCHAR_SYM=417, 
		OCT=418, OFFSET_SYM=419, OJ_SYM=420, OLD_PASSWORD=421, ON=422, ONE_SHOT_SYM=423, 
		ONE_SYM=424, OPEN_SYM=425, OPTIMIZE=426, OPTION=427, OPTIONALLY=428, OPTIONS_SYM=429, 
		ORD=430, ORDER_SYM=431, OUT_SYM=432, OUTER=433, OUTFILE=434, OWNER_SYM=435, 
		PACK_KEYS_SYM=436, PAGE_CHECKSUM_SYM=437, PAGE_SYM=438, PARSER_SYM=439, 
		PARTIAL=440, PARTITION_SYM=441, PARTITIONING_SYM=442, PARTITIONS_SYM=443, 
		PASSWORD=444, PERIOD_ADD=445, PERIOD_DIFF=446, PHASE_SYM=447, PI=448, 
		PLUGIN_SYM=449, PLUGINS_SYM=450, POINT_SYM=451, POLYGON=452, PORT_SYM=453, 
		POW=454, POWER=455, PRECISION=456, PREPARE_SYM=457, PRESERVE_SYM=458, 
		PREV_SYM=459, PRIMARY_SYM=460, PRIVILEGES=461, PROCEDURE=462, PROCESS=463, 
		PROCESSLIST_SYM=464, PROFILE_SYM=465, PROFILES_SYM=466, PURGE=467, QUARTER=468, 
		QUERY_SYM=469, QUICK=470, QUOTE=471, RADIANS=472, RAND=473, RANGE_SYM=474, 
		READ_ONLY_SYM=475, READ_SYM=476, READ_WRITE_SYM=477, READS_SYM=478, REAL=479, 
		REBUILD_SYM=480, RECOVER_SYM=481, REDO_BUFFER_SIZE_SYM=482, REDOFILE_SYM=483, 
		REDUNDANT_SYM=484, REFERENCES=485, REGEXP=486, RELAY_LOG_FILE_SYM=487, 
		RELAY_LOG_POS_SYM=488, RELEASE_LOCK=489, RELEASE_SYM=490, RELOAD=491, 
		REMOVE_SYM=492, RENAME=493, REORGANIZE_SYM=494, REPAIR=495, REPEAT=496, 
		REPEATABLE_SYM=497, REPLACE=498, REPLICATION=499, REQUIRE_SYM=500, RESET_SYM=501, 
		RESOURCES=502, RESTORE_SYM=503, RESTRICT=504, RESUME_SYM=505, RETURN_SYM=506, 
		RETURNS_SYM=507, REVERSE=508, REVOKE=509, RIGHT=510, ROLLBACK=511, ROLLUP_SYM=512, 
		ROUND=513, ROUTINE_SYM=514, ROW_FORMAT_SYM=515, ROW_SYM=516, ROWS_SYM=517, 
		RPAD=518, RTREE_SYM=519, RTRIM=520, SAVEPOINT=521, SCHEDULE_SYM=522, SCHEMA=523, 
		SEC_TO_TIME=524, SECOND=525, SECOND_MICROSECOND=526, SECURITY_SYM=527, 
		SELECT=528, SENSITIVE_SYM=529, SEPARATOR_SYM=530, SERIAL_SYM=531, SERIALIZABLE_SYM=532, 
		SERVER_SYM=533, SESSION_SYM=534, SESSION_USER=535, SET_SYM=536, SHARED_SYM=537, 
		SHARE_SYM=538, SHOW=539, SHUTDOWN=540, SIGN=541, SIGNED_SYM=542, SIMPLE_SYM=543, 
		SIN=544, SJIS=545, SLAVE=546, SLEEP=547, SMALLINT=548, SNAPSHOT_SYM=549, 
		SOCKET_SYM=550, SONAME_SYM=551, SOUNDEX=552, SOUNDS_SYM=553, SOURCE_SYM=554, 
		SPACE=555, SPATIAL_SYM=556, SPECIFIC_SYM=557, SQL_BIG_RESULT=558, SQL_BUFFER_RESULT=559, 
		SQL_CACHE_SYM=560, SQL_CALC_FOUND_ROWS=561, SQL_NO_CACHE_SYM=562, SQL_SMALL_RESULT=563, 
		SQL_SYM=564, SQL_THREAD=565, SQLEXCEPTION_SYM=566, SQLSTATE_SYM=567, SQLWARNING_SYM=568, 
		SQRT=569, SSL_SYM=570, START_SYM=571, STARTING=572, STATS_AUTO_RECALC=573, 
		STATS_PERSISTENT=574, STARTS_SYM=575, STATUS_SYM=576, STD=577, STDDEV=578, 
		STDDEV_POP=579, STDDEV_SAMP=580, STOP_SYM=581, STORAGE_SYM=582, STR_TO_DATE=583, 
		STRAIGHT_JOIN=584, STRCMP=585, STRING_SYM=586, SUBJECT_SYM=587, SUBPARTITION_SYM=588, 
		SUBPARTITIONS_SYM=589, SUBSTRING=590, SUBSTRING_INDEX=591, SUBTIME=592, 
		SUM=593, SUPER_SYM=594, SUSPEND_SYM=595, SWAPS_SYM=596, SWE7=597, SWITCHES_SYM=598, 
		SYSDATE=599, SYSTEM_USER=600, TABLE=601, TABLE_CHECKSUM_SYM=602, TABLES=603, 
		TABLESPACE=604, TAN=605, TEMPORARY=606, TEMPTABLE_SYM=607, TERMINATED=608, 
		TEXT_SYM=609, THAN_SYM=610, THEN_SYM=611, TIME_FORMAT=612, TIME_SYM=613, 
		TIME_TO_SEC=614, TIMEDIFF=615, TIMESTAMP=616, TIMESTAMPADD=617, TIMESTAMPDIFF=618, 
		TINYBLOB=619, TINYINT=620, TINYTEXT=621, TIS620=622, TO_BASE64=623, TO_DAYS=624, 
		TO_SECONDS=625, TO_SYM=626, TRAILING=627, TRANSACTION=628, TRANSACTIONAL_SYM=629, 
		TRIGGER_SYM=630, TRIGGERS_SYM=631, TRIM=632, TRUE_SYM=633, TRUNCATE=634, 
		TYPE_SYM=635, TYPES_SYM=636, UCS2=637, UJIS=638, UNCOMMITTED_SYM=639, 
		UNCOMPRESS=640, UNCOMPRESSED_LENGTH=641, UNDEFINED_SYM=642, UNDO_BUFFER_SIZE_SYM=643, 
		UNDO_SYM=644, UNDOFILE_SYM=645, UNHEX=646, UNICODE_SYM=647, UNINSTALL_SYM=648, 
		UNION_SYM=649, UNIQUE_SYM=650, UNIX_TIMESTAMP=651, UNKNOWN_SYM=652, UNLOCK_SYM=653, 
		UNSIGNED_SYM=654, UNTIL_SYM=655, UPDATE=656, UPGRADE_SYM=657, UPPER=658, 
		USAGE=659, USE_FRM=660, USE_SYM=661, USER=662, USING_SYM=663, UTC_DATE=664, 
		UTC_TIME=665, UTC_TIMESTAMP=666, UTF16LE=667, UTF16=668, UTF32=669, UTF8=670, 
		UUID=671, VALUE_SYM=672, VALUES=673, VAR_POP=674, VAR_SAMP=675, VARBINARY=676, 
		VARCHAR=677, VARIABLES=678, VARIANCE=679, VARYING=680, VERSION_SYM=681, 
		VIEW_SYM=682, WAIT_SYM=683, WARNINGS=684, WEEK=685, WEEKDAY=686, WEEKOFYEAR=687, 
		WEIGHT_STRING=688, WHEN_SYM=689, WHERE=690, WHILE_SYM=691, WITH=692, WORK_SYM=693, 
		WRAPPER_SYM=694, WRITE_SYM=695, X509_SYM=696, XA_SYM=697, XML_SYM=698, 
		XOR=699, YEAR=700, YEAR_MONTH=701, YEARWEEK=702, ZEROFILL=703, DIVIDE=704, 
		MOD_SYM=705, OR_SYM=706, AND_SYM=707, ARROW=708, EQ_SYM=709, NOT_EQ=710, 
		LET=711, GET=712, SET_VAR=713, SHIFT_LEFT=714, SHIFT_RIGHT=715, ALL_FIELDS=716, 
		SEMI=717, COLON=718, DOT=719, COMMA=720, ASTERISK=721, RPAREN=722, LPAREN=723, 
		RBRACK=724, LBRACK=725, PLUS=726, MINUS=727, NEGATION=728, VERTBAR=729, 
		BITAND=730, POWER_OP=731, GTH=732, LTH=733, INTEGER_NUM=734, HEX_DIGIT=735, 
		BIT_NUM=736, REAL_NUMBER=737, TEXT_STRING=738, ID=739, USER_VAR=740, WHITE_SPACE=741, 
		SL_COMMENT=742, ML_COMMENT=743;
	public static final String[] tokenNames = {
		"<INVALID>", "ABS", "ACCESSIBLE_SYM", "ACOS", "ACTION", "ADD_SYM", "ADDDATE", 
		"ADDTIME", "AES_DECRYPT", "AES_ENCRYPT", "AFTER_SYM", "AGAINST", "AGGREGATE_SYM", 
		"ALGORITHM_SYM", "ALL", "ALTER", "ANALYZE_SYM", "ANY", "ARMSCII8", "AS_SYM", 
		"ASC", "ASCII_SYM", "ASENSITIVE_SYM", "ASIN", "AT_SYM", "ATAN", "ATAN2", 
		"AUTHORS_SYM", "AUTO_INCREMENT", "AUTOEXTEND_SIZE_SYM", "AVG", "AVG_ROW_LENGTH", 
		"BACKUP_SYM", "BEFORE_SYM", "BEGIN_SYM", "BENCHMARK", "BETWEEN", "BIG5", 
		"BIGINT", "BIN", "BINARY", "BINLOG_SYM", "BIT_AND", "BIT_LENGTH", "BIT_OR", 
		"BIT_SYM", "BIT_XOR", "BLOB_SYM", "BLOCK_SYM", "BOOL_SYM", "BOOLEAN_SYM", 
		"BOTH", "BTREE_SYM", "BY_SYM", "BYTE_SYM", "CACHE_SYM", "CALL_SYM", "CASCADE", 
		"CASCADED", "CASE_SYM", "CAST_SYM", "CEIL", "CEILING", "CHAIN_SYM", "CHANGE", 
		"CHANGED", "CHAR", "CHAR_LENGTH", "CHARACTER_SYM", "CHARSET", "CHECK_SYM", 
		"CHECKSUM_SYM", "CIPHER_SYM", "CLIENT_SYM", "CLOSE_SYM", "COALESCE", "CODE_SYM", 
		"COERCIBILITY", "COLLATE_SYM", "COLLATION", "COLUMN_FORMAT", "COLUMN_SYM", 
		"COLUMNS_SYM", "COMMENT_SYM", "COMMIT_SYM", "COMMITTED_SYM", "COMPACT_SYM", 
		"COMPLETION_SYM", "COMPRESS", "COMPRESSED_SYM", "CONCAT", "CONCAT_WS", 
		"CONCURRENT", "CONDITION_SYM", "CONNECTION_ID", "CONNECTION_SYM", "CONSISTENT_SYM", 
		"CONSTRAINT", "CONTAINS_SYM", "CONTEXT_SYM", "CONTINUE_SYM", "CONTRIBUTORS_SYM", 
		"CONV", "CONVERT_SYM", "CONVERT_TZ", "COPY_SYM", "COS", "COT", "COUNT", 
		"CP1250", "CP1251", "CP1256", "CP1257", "CP850", "CP852", "CP866", "CP932", 
		"CPU_SYM", "CRC32", "CREATE", "CROSECOND", "CROSS", "CUBE_SYM", "CURDATE", 
		"CURRENT_TIMESTAMP", "CURRENT_USER", "CURSOR_SYM", "CURTIME", "DATABASE", 
		"DATAFILE_SYM", "DATA_SYM", "DATE_ADD", "DATE_FORMAT", "DATE_SUB", "DATE_SYM", 
		"DATEDIFF", "DATETIME", "DAY_SYM", "DAY_HOUR", "DAY_MICROSECOND", "DAY_MINUTE", 
		"DAY_SECOND", "DAYNAME", "DAYOFMONTH", "DAYOFWEEK", "DAYOFYEAR", "DEALLOCATE_SYM", 
		"DEC8", "DECIMAL_SYM", "DECLARE_SYM", "DECODE", "DEFAULT", "DEFINER", 
		"DEGREES", "DELAY_KEY_WRITE_SYM", "DELAYED_SYM", "DELETE_SYM", "DES_DECRYPT", 
		"DES_ENCRYPT", "DES_KEY_FILE", "DESC", "DETERMINISTIC_SYM", "DIRECTORY_SYM", 
		"DISABLE_SYM", "DISCARD", "DISK_SYM", "DISTINCT", "DISTINCTROW", "DO_SYM", 
		"DOUBLE_SYM", "DROP", "DUAL_SYM", "DUMPFILE", "DUPLICATE_SYM", "DYNAMIC_SYM", 
		"EACH_SYM", "ELSE_SYM", "ELSIF_SYM", "ELT", "ENABLE_SYM", "ENCLOSED", 
		"ENCODE", "ENCRYPT", "END_SYM", "ENDS_SYM", "ENGINE_SYM", "ENGINES_SYM", 
		"ENUM", "ERRORS", "ESCAPE_SYM", "ESCAPED", "EUCJPMS", "EUCKR", "EVENT_SYM", 
		"EVENTS_SYM", "EVERY_SYM", "EXCHANGE_SYM", "EXECUTE_SYM", "EXCLUSIVE_SYM", 
		"EXISTS", "EXIT_SYM", "EXP", "EXPANSION_SYM", "EXPORT_SET", "EXTENDED_SYM", 
		"EXTENT_SIZE_SYM", "EXTRACT", "FALSE_SYM", "FAST_SYM", "FAULTS_SYM", "FIELDS_SYM", 
		"FETCH_SYM", "FIELD", "FILE_SYM", "FIND_IN_SET", "FIRST_SYM", "FIXED_SYM", 
		"FLOAT_SYM", "FLOOR", "FLUSH_SYM", "FOR_SYM", "FORCE_SYM", "FOREIGN", 
		"FORMAT", "FOUND_ROWS", "FOUND_SYM", "FROM", "FROM_BASE64", "FROM_DAYS", 
		"FROM_UNIXTIME", "FULL", "FULLTEXT_SYM", "FUNCTION_SYM", "GB2312", "GBK", 
		"GEOMETRY_SYM", "GEOMETRYCOLLECTION", "GEOSTD8", "GET_FORMAT", "GET_LOCK", 
		"GLOBAL_SYM", "GRANT", "GRANTS", "GREEK", "GROUP_CONCAT", "GROUP_SYM", 
		"HANDLER_SYM", "HASH_SYM", "HAVING", "HEBREW", "HELP_SYM", "HEX", "HIGH_PRIORITY", 
		"HOST_SYM", "HOSTS_SYM", "HOUR", "HOUR_MICROSECOND", "HOUR_MINUTE", "HOUR_SECOND", 
		"HP8", "IDENTIFIED_SYM", "IF", "IFNULL", "IGNORE_SYM", "IMPORT", "IN_SYM", 
		"INDEX_SYM", "INDEXES", "INET_ATON", "INET_NTOA", "INFILE", "INITIAL_SIZE_SYM", 
		"INNER_SYM", "INOUT_SYM", "INPLACE_SYM", "INSENSITIVE_SYM", "INSERT", 
		"INSERT_METHOD", "INSTALL_SYM", "INSTR", "INT_SYM", "INTEGER_SYM", "INTERVAL_SYM", 
		"INTO", "INVOKER_SYM", "IO_SYM", "IPC_SYM", "IS_FREE_LOCK", "IS_SYM", 
		"IS_USED_LOCK", "ISOLATION", "ISSUER_SYM", "ITERATE_SYM", "JOIN_SYM", 
		"KEY_BLOCK_SIZE", "KEY_SYM", "KEYBCS2", "KEYS", "KILL_SYM", "KOI8R", "KOI8U", 
		"LANGUAGE", "LAST_DAY", "LAST_INSERT_ID", "LAST_SYM", "LATIN1_BIN", "LATIN1_GENERAL_CS", 
		"LATIN1", "LATIN2", "LATIN5", "LATIN7", "LEADING", "LEAVE_SYM", "LEAVES", 
		"LEFT", "LENGTH", "LESS_SYM", "LEVEL_SYM", "LIKE_SYM", "LIMIT", "LINEAR_SYM", 
		"LINES", "LINESTRING", "LIST_SYM", "LN", "LOAD", "LOAD_FILE", "LOCAL_SYM", 
		"LOCATE", "LOCK", "LOCKS_SYM", "LOG", "LOG10", "LOG2", "LOGFILE_SYM", 
		"LOGS_SYM", "LONG_SYM", "LONGBLOB", "LONGTEXT", "LOOP_SYM", "LOW_PRIORITY", 
		"LOWER", "LPAD", "LTRIM", "MACCE", "MACROMAN", "MAKE_SET", "MAKEDATE", 
		"MAKETIME", "MASTER_CONNECT_RETRY", "MASTER_HOST_SYM", "MASTER_LOG_FILE_SYM", 
		"MASTER_LOG_POS_SYM", "MASTER_PASSWORD_SYM", "MASTER_PORT_SYM", "MASTER_POS_WAIT", 
		"MASTER_SERVER_ID_SYM", "MASTER_SSL_CA_SYM", "MASTER_SSL_CAPATH_SYM", 
		"MASTER_SSL_CERT_SYM", "MASTER_SSL_CIPHER_SYM", "MASTER_SSL_KEY_SYM", 
		"MASTER_SSL_SYM", "MASTER_SSL_VERIFY_SERVER_CERT", "MASTER_SYM", "MASTER_USER_SYM", 
		"MATCH", "MAX_SYM", "MAX_CONNECTIONS_PER_HOUR", "MAX_QUERIES_PER_HOUR", 
		"MAX_ROWS", "MAX_SIZE_SYM", "MAX_UPDATES_PER_HOUR", "MAX_USER_CONNECTIONS_SYM", 
		"MAXVALUE_SYM", "MD5", "MEDIUM_SYM", "MEDIUMBLOB", "MEDIUMINT", "MEDIUMTEXT", 
		"MEMORY_SYM", "MERGE_SYM", "MICROSECOND", "MID", "MIGRATE_SYM", "MIN_SYM", 
		"MIN_ROWS", "MINUTE", "MINUTE_MICROSECOND", "MINUTE_SECOND", "MOD", "MODE_SYM", 
		"MODIFIES_SYM", "MODIFY_SYM", "MONTH", "MONTHNAME", "MULTILINESTRING", 
		"MULTIPOINT", "MULTIPOLYGON", "MUTEX_SYM", "NAME_CONST", "'NAME'", "'NAMES'", 
		"NATIONAL_SYM", "NATURAL", "NCHAR_SYM", "NEW_SYM", "NEXT_SYM", "NO_SYM", 
		"NO_WAIT_SYM", "NO_WRITE_TO_BINLOG", "NODEGROUP_SYM", "NONE_SYM", "NOT_SYM", 
		"NOW", "NULL_SYM", "NUMERIC_SYM", "NVARCHAR_SYM", "OCT", "OFFSET_SYM", 
		"OJ_SYM", "OLD_PASSWORD", "ON", "ONE_SHOT_SYM", "ONE_SYM", "OPEN_SYM", 
		"OPTIMIZE", "OPTION", "OPTIONALLY", "OPTIONS_SYM", "ORD", "ORDER_SYM", 
		"OUT_SYM", "OUTER", "OUTFILE", "OWNER_SYM", "PACK_KEYS_SYM", "PAGE_CHECKSUM_SYM", 
		"PAGE_SYM", "PARSER_SYM", "PARTIAL", "PARTITION_SYM", "PARTITIONING_SYM", 
		"PARTITIONS_SYM", "PASSWORD", "PERIOD_ADD", "PERIOD_DIFF", "PHASE_SYM", 
		"PI", "PLUGIN_SYM", "PLUGINS_SYM", "POINT_SYM", "POLYGON", "PORT_SYM", 
		"POW", "POWER", "PRECISION", "PREPARE_SYM", "PRESERVE_SYM", "PREV_SYM", 
		"PRIMARY_SYM", "PRIVILEGES", "PROCEDURE", "PROCESS", "PROCESSLIST_SYM", 
		"PROFILE_SYM", "PROFILES_SYM", "PURGE", "QUARTER", "QUERY_SYM", "QUICK", 
		"QUOTE", "RADIANS", "RAND", "RANGE_SYM", "READ_ONLY_SYM", "READ_SYM", 
		"READ_WRITE_SYM", "READS_SYM", "REAL", "REBUILD_SYM", "RECOVER_SYM", "REDO_BUFFER_SIZE_SYM", 
		"REDOFILE_SYM", "REDUNDANT_SYM", "REFERENCES", "REGEXP", "RELAY_LOG_FILE_SYM", 
		"RELAY_LOG_POS_SYM", "RELEASE_LOCK", "RELEASE_SYM", "RELOAD", "REMOVE_SYM", 
		"RENAME", "REORGANIZE_SYM", "REPAIR", "REPEAT", "REPEATABLE_SYM", "REPLACE", 
		"REPLICATION", "REQUIRE_SYM", "RESET_SYM", "RESOURCES", "RESTORE_SYM", 
		"RESTRICT", "RESUME_SYM", "RETURN_SYM", "RETURNS_SYM", "REVERSE", "REVOKE", 
		"RIGHT", "ROLLBACK", "ROLLUP_SYM", "ROUND", "ROUTINE_SYM", "ROW_FORMAT_SYM", 
		"ROW_SYM", "ROWS_SYM", "RPAD", "RTREE_SYM", "RTRIM", "SAVEPOINT", "SCHEDULE_SYM", 
		"SCHEMA", "SEC_TO_TIME", "SECOND", "SECOND_MICROSECOND", "SECURITY_SYM", 
		"SELECT", "SENSITIVE_SYM", "SEPARATOR_SYM", "SERIAL_SYM", "SERIALIZABLE_SYM", 
		"SERVER_SYM", "SESSION_SYM", "SESSION_USER", "SET_SYM", "SHARED_SYM", 
		"SHARE_SYM", "SHOW", "SHUTDOWN", "SIGN", "SIGNED_SYM", "SIMPLE_SYM", "SIN", 
		"SJIS", "SLAVE", "SLEEP", "SMALLINT", "SNAPSHOT_SYM", "SOCKET_SYM", "SONAME_SYM", 
		"SOUNDEX", "SOUNDS_SYM", "SOURCE_SYM", "SPACE", "SPATIAL_SYM", "SPECIFIC_SYM", 
		"SQL_BIG_RESULT", "SQL_BUFFER_RESULT", "SQL_CACHE_SYM", "SQL_CALC_FOUND_ROWS", 
		"SQL_NO_CACHE_SYM", "SQL_SMALL_RESULT", "SQL_SYM", "SQL_THREAD", "SQLEXCEPTION_SYM", 
		"SQLSTATE_SYM", "SQLWARNING_SYM", "SQRT", "SSL_SYM", "START_SYM", "STARTING", 
		"STATS_AUTO_RECALC", "STATS_PERSISTENT", "STARTS_SYM", "STATUS_SYM", "STD", 
		"STDDEV", "STDDEV_POP", "STDDEV_SAMP", "STOP_SYM", "STORAGE_SYM", "STR_TO_DATE", 
		"STRAIGHT_JOIN", "STRCMP", "STRING_SYM", "SUBJECT_SYM", "SUBPARTITION_SYM", 
		"SUBPARTITIONS_SYM", "SUBSTRING", "SUBSTRING_INDEX", "SUBTIME", "SUM", 
		"SUPER_SYM", "SUSPEND_SYM", "SWAPS_SYM", "SWE7", "SWITCHES_SYM", "SYSDATE", 
		"SYSTEM_USER", "TABLE", "TABLE_CHECKSUM_SYM", "TABLES", "TABLESPACE", 
		"TAN", "TEMPORARY", "TEMPTABLE_SYM", "TERMINATED", "TEXT_SYM", "THAN_SYM", 
		"THEN_SYM", "TIME_FORMAT", "TIME_SYM", "TIME_TO_SEC", "TIMEDIFF", "TIMESTAMP", 
		"TIMESTAMPADD", "TIMESTAMPDIFF", "TINYBLOB", "TINYINT", "TINYTEXT", "TIS620", 
		"TO_BASE64", "TO_DAYS", "TO_SECONDS", "TO_SYM", "TRAILING", "TRANSACTION", 
		"TRANSACTIONAL_SYM", "TRIGGER_SYM", "TRIGGERS_SYM", "TRIM", "TRUE_SYM", 
		"TRUNCATE", "'TYPE'", "TYPES_SYM", "UCS2", "UJIS", "UNCOMMITTED_SYM", 
		"UNCOMPRESS", "UNCOMPRESSED_LENGTH", "UNDEFINED_SYM", "UNDO_BUFFER_SIZE_SYM", 
		"UNDO_SYM", "UNDOFILE_SYM", "UNHEX", "UNICODE_SYM", "UNINSTALL_SYM", "UNION_SYM", 
		"UNIQUE_SYM", "UNIX_TIMESTAMP", "UNKNOWN_SYM", "UNLOCK_SYM", "UNSIGNED_SYM", 
		"UNTIL_SYM", "UPDATE", "UPGRADE_SYM", "UPPER", "USAGE", "USE_FRM", "USE_SYM", 
		"'USER'", "USING_SYM", "UTC_DATE", "UTC_TIME", "UTC_TIMESTAMP", "UTF16LE", 
		"UTF16", "UTF32", "UTF8", "UUID", "VALUE_SYM", "VALUES", "VAR_POP", "VAR_SAMP", 
		"VARBINARY", "VARCHAR", "VARIABLES", "VARIANCE", "VARYING", "VERSION_SYM", 
		"VIEW_SYM", "WAIT_SYM", "WARNINGS", "WEEK", "WEEKDAY", "WEEKOFYEAR", "WEIGHT_STRING", 
		"WHEN_SYM", "WHERE", "WHILE_SYM", "WITH", "WORK_SYM", "WRAPPER_SYM", "WRITE_SYM", 
		"X509_SYM", "XA_SYM", "XML_SYM", "XOR", "YEAR", "YEAR_MONTH", "YEARWEEK", 
		"ZEROFILL", "DIVIDE", "MOD_SYM", "OR_SYM", "AND_SYM", "'=>'", "EQ_SYM", 
		"NOT_EQ", "'<='", "'>='", "':='", "'<<'", "'>>'", "'.*'", "';'", "':'", 
		"'.'", "','", "'*'", "')'", "'('", "']'", "'['", "'+'", "'-'", "'~'", 
		"'|'", "'&'", "'^'", "'>'", "'<'", "INTEGER_NUM", "HEX_DIGIT", "BIT_NUM", 
		"REAL_NUMBER", "TEXT_STRING", "ID", "USER_VAR", "WHITE_SPACE", "SL_COMMENT", 
		"ML_COMMENT"
	};
	public static final int
		RULE_relational_op = 0, RULE_charset_name = 1, RULE_cast_data_type = 2, 
		RULE_search_modifier = 3, RULE_transcoding_name = 4, RULE_interval_unit = 5, 
		RULE_collation_names = 6, RULE_string_literal = 7, RULE_number_literal = 8, 
		RULE_hex_literal = 9, RULE_boolean_literal = 10, RULE_bit_literal = 11, 
		RULE_literal_value = 12, RULE_functionList = 13, RULE_number_functions = 14, 
		RULE_char_functions = 15, RULE_time_functions = 16, RULE_other_functions = 17, 
		RULE_group_functions = 18, RULE_schema_name = 19, RULE_table_name = 20, 
		RULE_engine_name = 21, RULE_column_name = 22, RULE_view_name = 23, RULE_parser_name = 24, 
		RULE_index_name = 25, RULE_partition_name = 26, RULE_partition_logical_name = 27, 
		RULE_constraint_symbol_name = 28, RULE_foreign_key_symbol_name = 29, RULE_collation_name = 30, 
		RULE_event_name = 31, RULE_user_name = 32, RULE_function_name = 33, RULE_procedure_name = 34, 
		RULE_server_name = 35, RULE_wrapper_name = 36, RULE_alias = 37, RULE_expression = 38, 
		RULE_exp_factor1 = 39, RULE_exp_factor2 = 40, RULE_exp_factor3 = 41, RULE_exp_factor4 = 42, 
		RULE_bool_primary = 43, RULE_predicate = 44, RULE_bit_expr = 45, RULE_factor1 = 46, 
		RULE_factor2 = 47, RULE_factor3 = 48, RULE_factor4 = 49, RULE_factor5 = 50, 
		RULE_factor6 = 51, RULE_factor7 = 52, RULE_simple_expr = 53, RULE_function_call = 54, 
		RULE_case_when_statement = 55, RULE_case_when_statement1 = 56, RULE_case_when_statement2 = 57, 
		RULE_match_against_statement = 58, RULE_column_spec = 59, RULE_expression_list = 60, 
		RULE_interval_expr = 61, RULE_table_references = 62, RULE_table_reference = 63, 
		RULE_table_factor1 = 64, RULE_table_factor2 = 65, RULE_table_factor3 = 66, 
		RULE_table_factor4 = 67, RULE_table_atom = 68, RULE_join_condition = 69, 
		RULE_index_hint_list = 70, RULE_index_options = 71, RULE_index_hint = 72, 
		RULE_index_list = 73, RULE_partition_clause = 74, RULE_partition_names = 75, 
		RULE_root_statement = 76, RULE_data_manipulation_statements = 77, RULE_data_definition_statements = 78, 
		RULE_select_statement = 79, RULE_select_expression = 80, RULE_where_clause = 81, 
		RULE_groupby_clause = 82, RULE_groupby_item = 83, RULE_having_clause = 84, 
		RULE_orderby_clause = 85, RULE_orderby_item = 86, RULE_limit_clause = 87, 
		RULE_offset = 88, RULE_row_count = 89, RULE_select_list = 90, RULE_column_list = 91, 
		RULE_subquery = 92, RULE_table_spec = 93, RULE_displayed_column = 94, 
		RULE_delete_statements = 95, RULE_delete_single_table_statement = 96, 
		RULE_delete_multiple_table_statement1 = 97, RULE_delete_multiple_table_statement2 = 98, 
		RULE_insert_statements = 99, RULE_insert_header = 100, RULE_insert_subfix = 101, 
		RULE_insert_statement1 = 102, RULE_value_list_clause = 103, RULE_column_value_list = 104, 
		RULE_insert_statement2 = 105, RULE_set_columns_cluase = 106, RULE_set_column_cluase = 107, 
		RULE_insert_statement3 = 108, RULE_update_statements = 109, RULE_single_table_update_statement = 110, 
		RULE_multiple_table_update_statement = 111, RULE_call_statement = 112, 
		RULE_do_statement = 113, RULE_handler_statements = 114, RULE_open_handler_statement = 115, 
		RULE_handler_statement1 = 116, RULE_handler_statement2 = 117, RULE_handler_statement3 = 118, 
		RULE_close_handler_statement = 119, RULE_load_data_statement = 120, RULE_load_xml_statement = 121, 
		RULE_replace_statement = 122, RULE_replace_statement_header = 123, RULE_replace_statement1 = 124, 
		RULE_replace_statement2 = 125, RULE_replace_statement3 = 126, RULE_create_database_statement = 127, 
		RULE_create_specification = 128, RULE_alter_database_statements = 129, 
		RULE_alter_database_statement1 = 130, RULE_alter_database_statement2 = 131, 
		RULE_alter_database_specification = 132, RULE_drop_database_statement = 133, 
		RULE_create_event_statement = 134, RULE_schedule_definition = 135, RULE_interval = 136, 
		RULE_timestamp = 137, RULE_alter_event_statement = 138, RULE_drop_event_statement = 139, 
		RULE_create_index_statement = 140, RULE_algorithm_option = 141, RULE_lock_option = 142, 
		RULE_drop_index_statement = 143, RULE_create_server_statement = 144, RULE_create_server_option = 145, 
		RULE_alter_server_statement = 146, RULE_alter_server_option = 147, RULE_drop_server_statement = 148, 
		RULE_create_table_statement = 149, RULE_create_table_statement1 = 150, 
		RULE_create_table_statement2 = 151, RULE_create_table_statement3 = 152, 
		RULE_create_definition = 153, RULE_column_definition = 154, RULE_null_or_notnull = 155, 
		RULE_column_data_type_header = 156, RULE_index_column_name = 157, RULE_reference_definition = 158, 
		RULE_reference_option = 159, RULE_table_options = 160, RULE_table_option = 161, 
		RULE_partition_options = 162, RULE_partition_definition = 163, RULE_subpartition_definition = 164, 
		RULE_length = 165, RULE_alter_table_statement = 166, RULE_alter_table_specification = 167, 
		RULE_index_column_names = 168, RULE_index_type = 169, RULE_index_option = 170, 
		RULE_column_definitions = 171, RULE_rename_table_statement = 172, RULE_drop_table_statement = 173, 
		RULE_truncate_table_statement = 174, RULE_create_view_statement = 175, 
		RULE_create_view_body = 176, RULE_alter_view_statement = 177, RULE_drop_view_statement = 178;
	public static final String[] ruleNames = {
		"relational_op", "charset_name", "cast_data_type", "search_modifier", 
		"transcoding_name", "interval_unit", "collation_names", "string_literal", 
		"number_literal", "hex_literal", "boolean_literal", "bit_literal", "literal_value", 
		"functionList", "number_functions", "char_functions", "time_functions", 
		"other_functions", "group_functions", "schema_name", "table_name", "engine_name", 
		"column_name", "view_name", "parser_name", "index_name", "partition_name", 
		"partition_logical_name", "constraint_symbol_name", "foreign_key_symbol_name", 
		"collation_name", "event_name", "user_name", "function_name", "procedure_name", 
		"server_name", "wrapper_name", "alias", "expression", "exp_factor1", "exp_factor2", 
		"exp_factor3", "exp_factor4", "bool_primary", "predicate", "bit_expr", 
		"factor1", "factor2", "factor3", "factor4", "factor5", "factor6", "factor7", 
		"simple_expr", "function_call", "case_when_statement", "case_when_statement1", 
		"case_when_statement2", "match_against_statement", "column_spec", "expression_list", 
		"interval_expr", "table_references", "table_reference", "table_factor1", 
		"table_factor2", "table_factor3", "table_factor4", "table_atom", "join_condition", 
		"index_hint_list", "index_options", "index_hint", "index_list", "partition_clause", 
		"partition_names", "root_statement", "data_manipulation_statements", "data_definition_statements", 
		"select_statement", "select_expression", "where_clause", "groupby_clause", 
		"groupby_item", "having_clause", "orderby_clause", "orderby_item", "limit_clause", 
		"offset", "row_count", "select_list", "column_list", "subquery", "table_spec", 
		"displayed_column", "delete_statements", "delete_single_table_statement", 
		"delete_multiple_table_statement1", "delete_multiple_table_statement2", 
		"insert_statements", "insert_header", "insert_subfix", "insert_statement1", 
		"value_list_clause", "column_value_list", "insert_statement2", "set_columns_cluase", 
		"set_column_cluase", "insert_statement3", "update_statements", "single_table_update_statement", 
		"multiple_table_update_statement", "call_statement", "do_statement", "handler_statements", 
		"open_handler_statement", "handler_statement1", "handler_statement2", 
		"handler_statement3", "close_handler_statement", "load_data_statement", 
		"load_xml_statement", "replace_statement", "replace_statement_header", 
		"replace_statement1", "replace_statement2", "replace_statement3", "create_database_statement", 
		"create_specification", "alter_database_statements", "alter_database_statement1", 
		"alter_database_statement2", "alter_database_specification", "drop_database_statement", 
		"create_event_statement", "schedule_definition", "interval", "timestamp", 
		"alter_event_statement", "drop_event_statement", "create_index_statement", 
		"algorithm_option", "lock_option", "drop_index_statement", "create_server_statement", 
		"create_server_option", "alter_server_statement", "alter_server_option", 
		"drop_server_statement", "create_table_statement", "create_table_statement1", 
		"create_table_statement2", "create_table_statement3", "create_definition", 
		"column_definition", "null_or_notnull", "column_data_type_header", "index_column_name", 
		"reference_definition", "reference_option", "table_options", "table_option", 
		"partition_options", "partition_definition", "subpartition_definition", 
		"length", "alter_table_statement", "alter_table_specification", "index_column_names", 
		"index_type", "index_option", "column_definitions", "rename_table_statement", 
		"drop_table_statement", "truncate_table_statement", "create_view_statement", 
		"create_view_body", "alter_view_statement", "drop_view_statement"
	};

	@Override
	public String getGrammarFileName() { return "Indsql.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public IndsqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Relational_opContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(IndsqlParser.GET, 0); }
		public TerminalNode GTH() { return getToken(IndsqlParser.GTH, 0); }
		public TerminalNode LET() { return getToken(IndsqlParser.LET, 0); }
		public TerminalNode NOT_EQ() { return getToken(IndsqlParser.NOT_EQ, 0); }
		public TerminalNode EQ_SYM() { return getToken(IndsqlParser.EQ_SYM, 0); }
		public TerminalNode LTH() { return getToken(IndsqlParser.LTH, 0); }
		public Relational_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterRelational_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitRelational_op(this);
		}
	}

	public final Relational_opContext relational_op() throws RecognitionException {
		Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !(((((_la - 709)) & ~0x3f) == 0 && ((1L << (_la - 709)) & ((1L << (EQ_SYM - 709)) | (1L << (NOT_EQ - 709)) | (1L << (LET - 709)) | (1L << (GET - 709)) | (1L << (GTH - 709)) | (1L << (LTH - 709)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Charset_nameContext extends ParserRuleContext {
		public TerminalNode EUCKR() { return getToken(IndsqlParser.EUCKR, 0); }
		public TerminalNode EUCJPMS() { return getToken(IndsqlParser.EUCJPMS, 0); }
		public TerminalNode GEOSTD8() { return getToken(IndsqlParser.GEOSTD8, 0); }
		public TerminalNode HP8() { return getToken(IndsqlParser.HP8, 0); }
		public TerminalNode KOI8R() { return getToken(IndsqlParser.KOI8R, 0); }
		public TerminalNode SWE7() { return getToken(IndsqlParser.SWE7, 0); }
		public TerminalNode LATIN7() { return getToken(IndsqlParser.LATIN7, 0); }
		public TerminalNode GREEK() { return getToken(IndsqlParser.GREEK, 0); }
		public TerminalNode HEBREW() { return getToken(IndsqlParser.HEBREW, 0); }
		public TerminalNode CP850() { return getToken(IndsqlParser.CP850, 0); }
		public TerminalNode GBK() { return getToken(IndsqlParser.GBK, 0); }
		public TerminalNode SJIS() { return getToken(IndsqlParser.SJIS, 0); }
		public TerminalNode LATIN2() { return getToken(IndsqlParser.LATIN2, 0); }
		public TerminalNode BINARY() { return getToken(IndsqlParser.BINARY, 0); }
		public TerminalNode BIG5() { return getToken(IndsqlParser.BIG5, 0); }
		public TerminalNode CP1251() { return getToken(IndsqlParser.CP1251, 0); }
		public TerminalNode DEC8() { return getToken(IndsqlParser.DEC8, 0); }
		public TerminalNode CP932() { return getToken(IndsqlParser.CP932, 0); }
		public TerminalNode UJIS() { return getToken(IndsqlParser.UJIS, 0); }
		public TerminalNode TIS620() { return getToken(IndsqlParser.TIS620, 0); }
		public TerminalNode KOI8U() { return getToken(IndsqlParser.KOI8U, 0); }
		public TerminalNode LATIN5() { return getToken(IndsqlParser.LATIN5, 0); }
		public TerminalNode UCS2() { return getToken(IndsqlParser.UCS2, 0); }
		public TerminalNode GB2312() { return getToken(IndsqlParser.GB2312, 0); }
		public TerminalNode CP1256() { return getToken(IndsqlParser.CP1256, 0); }
		public TerminalNode KEYBCS2() { return getToken(IndsqlParser.KEYBCS2, 0); }
		public TerminalNode CP1250() { return getToken(IndsqlParser.CP1250, 0); }
		public TerminalNode CP866() { return getToken(IndsqlParser.CP866, 0); }
		public TerminalNode ARMSCII8() { return getToken(IndsqlParser.ARMSCII8, 0); }
		public TerminalNode ASCII_SYM() { return getToken(IndsqlParser.ASCII_SYM, 0); }
		public TerminalNode LATIN1() { return getToken(IndsqlParser.LATIN1, 0); }
		public TerminalNode MACCE() { return getToken(IndsqlParser.MACCE, 0); }
		public TerminalNode CP852() { return getToken(IndsqlParser.CP852, 0); }
		public TerminalNode MACROMAN() { return getToken(IndsqlParser.MACROMAN, 0); }
		public TerminalNode UTF8() { return getToken(IndsqlParser.UTF8, 0); }
		public TerminalNode CP1257() { return getToken(IndsqlParser.CP1257, 0); }
		public Charset_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charset_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCharset_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCharset_name(this);
		}
	}

	public final Charset_nameContext charset_name() throws RecognitionException {
		Charset_nameContext _localctx = new Charset_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_charset_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARMSCII8) | (1L << ASCII_SYM) | (1L << BIG5) | (1L << BINARY))) != 0) || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (CP1250 - 109)) | (1L << (CP1251 - 109)) | (1L << (CP1256 - 109)) | (1L << (CP1257 - 109)) | (1L << (CP850 - 109)) | (1L << (CP852 - 109)) | (1L << (CP866 - 109)) | (1L << (CP932 - 109)) | (1L << (DEC8 - 109)))) != 0) || ((((_la - 191)) & ~0x3f) == 0 && ((1L << (_la - 191)) & ((1L << (EUCJPMS - 191)) | (1L << (EUCKR - 191)) | (1L << (GB2312 - 191)) | (1L << (GBK - 191)) | (1L << (GEOSTD8 - 191)) | (1L << (GREEK - 191)) | (1L << (HEBREW - 191)))) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (HP8 - 259)) | (1L << (KEYBCS2 - 259)) | (1L << (KOI8R - 259)) | (1L << (KOI8U - 259)) | (1L << (LATIN1 - 259)) | (1L << (LATIN2 - 259)) | (1L << (LATIN5 - 259)) | (1L << (LATIN7 - 259)))) != 0) || _la==MACCE || _la==MACROMAN || _la==SJIS || _la==SWE7 || ((((_la - 622)) & ~0x3f) == 0 && ((1L << (_la - 622)) & ((1L << (TIS620 - 622)) | (1L << (UCS2 - 622)) | (1L << (UJIS - 622)) | (1L << (UTF8 - 622)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_data_typeContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER_NUM() { return getTokens(IndsqlParser.INTEGER_NUM); }
		public TerminalNode TIME_SYM() { return getToken(IndsqlParser.TIME_SYM, 0); }
		public TerminalNode DATE_SYM() { return getToken(IndsqlParser.DATE_SYM, 0); }
		public TerminalNode UNSIGNED_SYM() { return getToken(IndsqlParser.UNSIGNED_SYM, 0); }
		public TerminalNode COMMA() { return getToken(IndsqlParser.COMMA, 0); }
		public TerminalNode DATETIME() { return getToken(IndsqlParser.DATETIME, 0); }
		public TerminalNode INTEGER_SYM() { return getToken(IndsqlParser.INTEGER_SYM, 0); }
		public TerminalNode SIGNED_SYM() { return getToken(IndsqlParser.SIGNED_SYM, 0); }
		public TerminalNode DECIMAL_SYM() { return getToken(IndsqlParser.DECIMAL_SYM, 0); }
		public TerminalNode CHAR() { return getToken(IndsqlParser.CHAR, 0); }
		public TerminalNode BINARY() { return getToken(IndsqlParser.BINARY, 0); }
		public TerminalNode INTEGER_NUM(int i) {
			return getToken(IndsqlParser.INTEGER_NUM, i);
		}
		public Cast_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCast_data_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCast_data_type(this);
		}
	}

	public final Cast_data_typeContext cast_data_type() throws RecognitionException {
		Cast_data_typeContext _localctx = new Cast_data_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cast_data_type);
		int _la;
		try {
			setState(389);
			switch (_input.LA(1)) {
			case BINARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(362); match(BINARY);
				setState(364);
				_la = _input.LA(1);
				if (_la==INTEGER_NUM) {
					{
					setState(363); match(INTEGER_NUM);
					}
				}

				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(366); match(CHAR);
				setState(368);
				_la = _input.LA(1);
				if (_la==INTEGER_NUM) {
					{
					setState(367); match(INTEGER_NUM);
					}
				}

				}
				break;
			case DATE_SYM:
				enterOuterAlt(_localctx, 3);
				{
				setState(370); match(DATE_SYM);
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 4);
				{
				setState(371); match(DATETIME);
				}
				break;
			case DECIMAL_SYM:
				enterOuterAlt(_localctx, 5);
				{
				setState(372); match(DECIMAL_SYM);
				setState(378);
				_la = _input.LA(1);
				if (_la==INTEGER_NUM) {
					{
					setState(373); match(INTEGER_NUM);
					setState(376);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(374); match(COMMA);
						setState(375); match(INTEGER_NUM);
						}
					}

					}
				}

				}
				break;
			case SIGNED_SYM:
				enterOuterAlt(_localctx, 6);
				{
				setState(380); match(SIGNED_SYM);
				setState(382);
				_la = _input.LA(1);
				if (_la==INTEGER_SYM) {
					{
					setState(381); match(INTEGER_SYM);
					}
				}

				}
				break;
			case TIME_SYM:
				enterOuterAlt(_localctx, 7);
				{
				setState(384); match(TIME_SYM);
				}
				break;
			case UNSIGNED_SYM:
				enterOuterAlt(_localctx, 8);
				{
				setState(385); match(UNSIGNED_SYM);
				setState(387);
				_la = _input.LA(1);
				if (_la==INTEGER_SYM) {
					{
					setState(386); match(INTEGER_SYM);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_modifierContext extends ParserRuleContext {
		public TerminalNode NATURAL() { return getToken(IndsqlParser.NATURAL, 0); }
		public TerminalNode WITH() { return getToken(IndsqlParser.WITH, 0); }
		public TerminalNode BOOLEAN_SYM() { return getToken(IndsqlParser.BOOLEAN_SYM, 0); }
		public TerminalNode LANGUAGE() { return getToken(IndsqlParser.LANGUAGE, 0); }
		public TerminalNode EXPANSION_SYM() { return getToken(IndsqlParser.EXPANSION_SYM, 0); }
		public TerminalNode MODE_SYM() { return getToken(IndsqlParser.MODE_SYM, 0); }
		public TerminalNode QUERY_SYM() { return getToken(IndsqlParser.QUERY_SYM, 0); }
		public TerminalNode IN_SYM() { return getToken(IndsqlParser.IN_SYM, 0); }
		public Search_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterSearch_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitSearch_modifier(this);
		}
	}

	public final Search_modifierContext search_modifier() throws RecognitionException {
		Search_modifierContext _localctx = new Search_modifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_search_modifier);
		try {
			setState(408);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(391); match(IN_SYM);
				setState(392); match(NATURAL);
				setState(393); match(LANGUAGE);
				setState(394); match(MODE_SYM);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(395); match(IN_SYM);
				setState(396); match(NATURAL);
				setState(397); match(LANGUAGE);
				setState(398); match(MODE_SYM);
				setState(399); match(WITH);
				setState(400); match(QUERY_SYM);
				setState(401); match(EXPANSION_SYM);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(402); match(IN_SYM);
				setState(403); match(BOOLEAN_SYM);
				setState(404); match(MODE_SYM);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(405); match(WITH);
				setState(406); match(QUERY_SYM);
				setState(407); match(EXPANSION_SYM);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transcoding_nameContext extends ParserRuleContext {
		public TerminalNode LATIN1() { return getToken(IndsqlParser.LATIN1, 0); }
		public TerminalNode UTF8() { return getToken(IndsqlParser.UTF8, 0); }
		public Transcoding_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transcoding_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterTranscoding_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitTranscoding_name(this);
		}
	}

	public final Transcoding_nameContext transcoding_name() throws RecognitionException {
		Transcoding_nameContext _localctx = new Transcoding_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_transcoding_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( !(_la==LATIN1 || _la==UTF8) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_unitContext extends ParserRuleContext {
		public TerminalNode HOUR_SECOND() { return getToken(IndsqlParser.HOUR_SECOND, 0); }
		public TerminalNode MONTH() { return getToken(IndsqlParser.MONTH, 0); }
		public TerminalNode QUARTER() { return getToken(IndsqlParser.QUARTER, 0); }
		public TerminalNode MINUTE_MICROSECOND() { return getToken(IndsqlParser.MINUTE_MICROSECOND, 0); }
		public TerminalNode MINUTE_SECOND() { return getToken(IndsqlParser.MINUTE_SECOND, 0); }
		public TerminalNode DAY_SECOND() { return getToken(IndsqlParser.DAY_SECOND, 0); }
		public TerminalNode SECOND() { return getToken(IndsqlParser.SECOND, 0); }
		public TerminalNode HOUR_MINUTE() { return getToken(IndsqlParser.HOUR_MINUTE, 0); }
		public TerminalNode MINUTE() { return getToken(IndsqlParser.MINUTE, 0); }
		public TerminalNode YEAR() { return getToken(IndsqlParser.YEAR, 0); }
		public TerminalNode DAY_HOUR() { return getToken(IndsqlParser.DAY_HOUR, 0); }
		public TerminalNode SECOND_MICROSECOND() { return getToken(IndsqlParser.SECOND_MICROSECOND, 0); }
		public TerminalNode DAY_SYM() { return getToken(IndsqlParser.DAY_SYM, 0); }
		public TerminalNode YEAR_MONTH() { return getToken(IndsqlParser.YEAR_MONTH, 0); }
		public TerminalNode DAY_MICROSECOND() { return getToken(IndsqlParser.DAY_MICROSECOND, 0); }
		public TerminalNode DAY_MINUTE() { return getToken(IndsqlParser.DAY_MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(IndsqlParser.HOUR, 0); }
		public TerminalNode HOUR_MICROSECOND() { return getToken(IndsqlParser.HOUR_MICROSECOND, 0); }
		public TerminalNode WEEK() { return getToken(IndsqlParser.WEEK, 0); }
		public Interval_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterInterval_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitInterval_unit(this);
		}
	}

	public final Interval_unitContext interval_unit() throws RecognitionException {
		Interval_unitContext _localctx = new Interval_unitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interval_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_la = _input.LA(1);
			if ( !(((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (DAY_SYM - 137)) | (1L << (DAY_HOUR - 137)) | (1L << (DAY_MICROSECOND - 137)) | (1L << (DAY_MINUTE - 137)) | (1L << (DAY_SECOND - 137)))) != 0) || ((((_la - 255)) & ~0x3f) == 0 && ((1L << (_la - 255)) & ((1L << (HOUR - 255)) | (1L << (HOUR_MICROSECOND - 255)) | (1L << (HOUR_MINUTE - 255)) | (1L << (HOUR_SECOND - 255)))) != 0) || ((((_la - 387)) & ~0x3f) == 0 && ((1L << (_la - 387)) & ((1L << (MINUTE - 387)) | (1L << (MINUTE_MICROSECOND - 387)) | (1L << (MINUTE_SECOND - 387)) | (1L << (MONTH - 387)))) != 0) || ((((_la - 468)) & ~0x3f) == 0 && ((1L << (_la - 468)) & ((1L << (QUARTER - 468)) | (1L << (SECOND - 468)) | (1L << (SECOND_MICROSECOND - 468)))) != 0) || ((((_la - 685)) & ~0x3f) == 0 && ((1L << (_la - 685)) & ((1L << (WEEK - 685)) | (1L << (YEAR - 685)) | (1L << (YEAR_MONTH - 685)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_namesContext extends ParserRuleContext {
		public TerminalNode LATIN1_GENERAL_CS() { return getToken(IndsqlParser.LATIN1_GENERAL_CS, 0); }
		public TerminalNode LATIN1_BIN() { return getToken(IndsqlParser.LATIN1_BIN, 0); }
		public Collation_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCollation_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCollation_names(this);
		}
	}

	public final Collation_namesContext collation_names() throws RecognitionException {
		Collation_namesContext _localctx = new Collation_namesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_collation_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_la = _input.LA(1);
			if ( !(_la==LATIN1_BIN || _la==LATIN1_GENERAL_CS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode TEXT_STRING() { return getToken(IndsqlParser.TEXT_STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitString_literal(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416); match(TEXT_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_literalContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(IndsqlParser.INTEGER_NUM, 0); }
		public TerminalNode REAL_NUMBER() { return getToken(IndsqlParser.REAL_NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(IndsqlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(IndsqlParser.PLUS, 0); }
		public Number_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterNumber_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitNumber_literal(this);
		}
	}

	public final Number_literalContext number_literal() throws RecognitionException {
		Number_literalContext _localctx = new Number_literalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(418);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(421);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_NUM || _la==REAL_NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hex_literalContext extends ParserRuleContext {
		public TerminalNode HEX_DIGIT() { return getToken(IndsqlParser.HEX_DIGIT, 0); }
		public Hex_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterHex_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitHex_literal(this);
		}
	}

	public final Hex_literalContext hex_literal() throws RecognitionException {
		Hex_literalContext _localctx = new Hex_literalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_hex_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423); match(HEX_DIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE_SYM() { return getToken(IndsqlParser.TRUE_SYM, 0); }
		public TerminalNode FALSE_SYM() { return getToken(IndsqlParser.FALSE_SYM, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitBoolean_literal(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_la = _input.LA(1);
			if ( !(_la==FALSE_SYM || _la==TRUE_SYM) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_literalContext extends ParserRuleContext {
		public TerminalNode BIT_NUM() { return getToken(IndsqlParser.BIT_NUM, 0); }
		public Bit_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterBit_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitBit_literal(this);
		}
	}

	public final Bit_literalContext bit_literal() throws RecognitionException {
		Bit_literalContext _localctx = new Bit_literalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bit_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427); match(BIT_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public Bit_literalContext bit_literal() {
			return getRuleContext(Bit_literalContext.class,0);
		}
		public TerminalNode NULL_SYM() { return getToken(IndsqlParser.NULL_SYM, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Hex_literalContext hex_literal() {
			return getRuleContext(Hex_literalContext.class,0);
		}
		public Number_literalContext number_literal() {
			return getRuleContext(Number_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitLiteral_value(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			switch (_input.LA(1)) {
			case TEXT_STRING:
				{
				setState(429); string_literal();
				}
				break;
			case PLUS:
			case MINUS:
			case INTEGER_NUM:
			case REAL_NUMBER:
				{
				setState(430); number_literal();
				}
				break;
			case HEX_DIGIT:
				{
				setState(431); hex_literal();
				}
				break;
			case FALSE_SYM:
			case TRUE_SYM:
				{
				setState(432); boolean_literal();
				}
				break;
			case BIT_NUM:
				{
				setState(433); bit_literal();
				}
				break;
			case NULL_SYM:
				{
				setState(434); match(NULL_SYM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionListContext extends ParserRuleContext {
		public Char_functionsContext char_functions() {
			return getRuleContext(Char_functionsContext.class,0);
		}
		public Time_functionsContext time_functions() {
			return getRuleContext(Time_functionsContext.class,0);
		}
		public Number_functionsContext number_functions() {
			return getRuleContext(Number_functionsContext.class,0);
		}
		public Other_functionsContext other_functions() {
			return getRuleContext(Other_functionsContext.class,0);
		}
		public FunctionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterFunctionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitFunctionList(this);
		}
	}

	public final FunctionListContext functionList() throws RecognitionException {
		FunctionListContext _localctx = new FunctionListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionList);
		try {
			setState(441);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437); number_functions();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438); char_functions();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(439); time_functions();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(440); other_functions();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_functionsContext extends ParserRuleContext {
		public TerminalNode POWER() { return getToken(IndsqlParser.POWER, 0); }
		public TerminalNode LOG10() { return getToken(IndsqlParser.LOG10, 0); }
		public TerminalNode LOG() { return getToken(IndsqlParser.LOG, 0); }
		public TerminalNode RAND() { return getToken(IndsqlParser.RAND, 0); }
		public TerminalNode CEILING() { return getToken(IndsqlParser.CEILING, 0); }
		public TerminalNode DEGREES() { return getToken(IndsqlParser.DEGREES, 0); }
		public TerminalNode ABS() { return getToken(IndsqlParser.ABS, 0); }
		public TerminalNode TRUNCATE() { return getToken(IndsqlParser.TRUNCATE, 0); }
		public TerminalNode LOG2() { return getToken(IndsqlParser.LOG2, 0); }
		public TerminalNode TAN() { return getToken(IndsqlParser.TAN, 0); }
		public TerminalNode ATAN2() { return getToken(IndsqlParser.ATAN2, 0); }
		public TerminalNode ACOS() { return getToken(IndsqlParser.ACOS, 0); }
		public TerminalNode RADIANS() { return getToken(IndsqlParser.RADIANS, 0); }
		public TerminalNode SQRT() { return getToken(IndsqlParser.SQRT, 0); }
		public TerminalNode COT() { return getToken(IndsqlParser.COT, 0); }
		public TerminalNode CONV() { return getToken(IndsqlParser.CONV, 0); }
		public TerminalNode ASIN() { return getToken(IndsqlParser.ASIN, 0); }
		public TerminalNode SIN() { return getToken(IndsqlParser.SIN, 0); }
		public TerminalNode EXP() { return getToken(IndsqlParser.EXP, 0); }
		public TerminalNode ROUND() { return getToken(IndsqlParser.ROUND, 0); }
		public TerminalNode COS() { return getToken(IndsqlParser.COS, 0); }
		public TerminalNode ATAN() { return getToken(IndsqlParser.ATAN, 0); }
		public TerminalNode PI() { return getToken(IndsqlParser.PI, 0); }
		public TerminalNode CRC32() { return getToken(IndsqlParser.CRC32, 0); }
		public TerminalNode SIGN() { return getToken(IndsqlParser.SIGN, 0); }
		public TerminalNode CEIL() { return getToken(IndsqlParser.CEIL, 0); }
		public TerminalNode LN() { return getToken(IndsqlParser.LN, 0); }
		public TerminalNode FLOOR() { return getToken(IndsqlParser.FLOOR, 0); }
		public TerminalNode MOD() { return getToken(IndsqlParser.MOD, 0); }
		public TerminalNode POW() { return getToken(IndsqlParser.POW, 0); }
		public Number_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterNumber_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitNumber_functions(this);
		}
	}

	public final Number_functionsContext number_functions() throws RecognitionException {
		Number_functionsContext _localctx = new Number_functionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_number_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << ACOS) | (1L << ASIN) | (1L << ATAN) | (1L << ATAN2) | (1L << CEIL) | (1L << CEILING))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (CONV - 102)) | (1L << (COS - 102)) | (1L << (COT - 102)) | (1L << (CRC32 - 102)) | (1L << (DEGREES - 102)))) != 0) || _la==EXP || _la==FLOOR || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (LN - 324)) | (1L << (LOG - 324)) | (1L << (LOG10 - 324)) | (1L << (LOG2 - 324)))) != 0) || _la==MOD || _la==PI || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (POW - 454)) | (1L << (POWER - 454)) | (1L << (RADIANS - 454)) | (1L << (RAND - 454)) | (1L << (ROUND - 454)))) != 0) || ((((_la - 541)) & ~0x3f) == 0 && ((1L << (_la - 541)) & ((1L << (SIGN - 541)) | (1L << (SIN - 541)) | (1L << (SQRT - 541)))) != 0) || _la==TAN || _la==TRUNCATE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Char_functionsContext extends ParserRuleContext {
		public TerminalNode FROM_BASE64() { return getToken(IndsqlParser.FROM_BASE64, 0); }
		public TerminalNode MAKE_SET() { return getToken(IndsqlParser.MAKE_SET, 0); }
		public TerminalNode MID() { return getToken(IndsqlParser.MID, 0); }
		public TerminalNode ELT() { return getToken(IndsqlParser.ELT, 0); }
		public TerminalNode TRIM() { return getToken(IndsqlParser.TRIM, 0); }
		public TerminalNode TO_BASE64() { return getToken(IndsqlParser.TO_BASE64, 0); }
		public TerminalNode SUBSTRING_INDEX() { return getToken(IndsqlParser.SUBSTRING_INDEX, 0); }
		public TerminalNode LOCATE() { return getToken(IndsqlParser.LOCATE, 0); }
		public TerminalNode ORD() { return getToken(IndsqlParser.ORD, 0); }
		public TerminalNode INSERT() { return getToken(IndsqlParser.INSERT, 0); }
		public TerminalNode LEFT() { return getToken(IndsqlParser.LEFT, 0); }
		public TerminalNode FIND_IN_SET() { return getToken(IndsqlParser.FIND_IN_SET, 0); }
		public TerminalNode CHAR_LENGTH() { return getToken(IndsqlParser.CHAR_LENGTH, 0); }
		public TerminalNode WEIGHT_STRING() { return getToken(IndsqlParser.WEIGHT_STRING, 0); }
		public TerminalNode SOUNDEX() { return getToken(IndsqlParser.SOUNDEX, 0); }
		public TerminalNode STRCMP() { return getToken(IndsqlParser.STRCMP, 0); }
		public TerminalNode CONCAT_WS() { return getToken(IndsqlParser.CONCAT_WS, 0); }
		public TerminalNode BIT_LENGTH() { return getToken(IndsqlParser.BIT_LENGTH, 0); }
		public TerminalNode REVERSE() { return getToken(IndsqlParser.REVERSE, 0); }
		public TerminalNode LPAD() { return getToken(IndsqlParser.LPAD, 0); }
		public TerminalNode RTRIM() { return getToken(IndsqlParser.RTRIM, 0); }
		public TerminalNode CHAR() { return getToken(IndsqlParser.CHAR, 0); }
		public TerminalNode HEX() { return getToken(IndsqlParser.HEX, 0); }
		public TerminalNode BIN() { return getToken(IndsqlParser.BIN, 0); }
		public TerminalNode REPEAT() { return getToken(IndsqlParser.REPEAT, 0); }
		public TerminalNode OCT() { return getToken(IndsqlParser.OCT, 0); }
		public TerminalNode FORMAT() { return getToken(IndsqlParser.FORMAT, 0); }
		public TerminalNode LTRIM() { return getToken(IndsqlParser.LTRIM, 0); }
		public TerminalNode SPACE() { return getToken(IndsqlParser.SPACE, 0); }
		public TerminalNode RPAD() { return getToken(IndsqlParser.RPAD, 0); }
		public TerminalNode LOWER() { return getToken(IndsqlParser.LOWER, 0); }
		public TerminalNode UPPER() { return getToken(IndsqlParser.UPPER, 0); }
		public TerminalNode FIELD() { return getToken(IndsqlParser.FIELD, 0); }
		public TerminalNode INSTR() { return getToken(IndsqlParser.INSTR, 0); }
		public TerminalNode QUOTE() { return getToken(IndsqlParser.QUOTE, 0); }
		public TerminalNode EXPORT_SET() { return getToken(IndsqlParser.EXPORT_SET, 0); }
		public TerminalNode CONCAT() { return getToken(IndsqlParser.CONCAT, 0); }
		public TerminalNode ASCII_SYM() { return getToken(IndsqlParser.ASCII_SYM, 0); }
		public TerminalNode LOAD_FILE() { return getToken(IndsqlParser.LOAD_FILE, 0); }
		public TerminalNode REPLACE() { return getToken(IndsqlParser.REPLACE, 0); }
		public TerminalNode UNHEX() { return getToken(IndsqlParser.UNHEX, 0); }
		public TerminalNode SUBSTRING() { return getToken(IndsqlParser.SUBSTRING, 0); }
		public TerminalNode LENGTH() { return getToken(IndsqlParser.LENGTH, 0); }
		public TerminalNode RIGHT() { return getToken(IndsqlParser.RIGHT, 0); }
		public Char_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterChar_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitChar_functions(this);
		}
	}

	public final Char_functionsContext char_functions() throws RecognitionException {
		Char_functionsContext _localctx = new Char_functionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_char_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASCII_SYM) | (1L << BIN) | (1L << BIT_LENGTH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CHAR - 66)) | (1L << (CHAR_LENGTH - 66)) | (1L << (CONCAT - 66)) | (1L << (CONCAT_WS - 66)))) != 0) || ((((_la - 178)) & ~0x3f) == 0 && ((1L << (_la - 178)) & ((1L << (ELT - 178)) | (1L << (EXPORT_SET - 178)) | (1L << (FIELD - 178)) | (1L << (FIND_IN_SET - 178)) | (1L << (FORMAT - 178)) | (1L << (FROM_BASE64 - 178)))) != 0) || ((((_la - 251)) & ~0x3f) == 0 && ((1L << (_la - 251)) & ((1L << (HEX - 251)) | (1L << (INSERT - 251)) | (1L << (INSTR - 251)) | (1L << (LEFT - 251)))) != 0) || ((((_la - 315)) & ~0x3f) == 0 && ((1L << (_la - 315)) & ((1L << (LENGTH - 315)) | (1L << (LOAD_FILE - 315)) | (1L << (LOCATE - 315)) | (1L << (LOWER - 315)) | (1L << (LPAD - 315)) | (1L << (LTRIM - 315)) | (1L << (MAKE_SET - 315)))) != 0) || ((((_la - 383)) & ~0x3f) == 0 && ((1L << (_la - 383)) & ((1L << (MID - 383)) | (1L << (OCT - 383)) | (1L << (ORD - 383)))) != 0) || ((((_la - 471)) & ~0x3f) == 0 && ((1L << (_la - 471)) & ((1L << (QUOTE - 471)) | (1L << (REPEAT - 471)) | (1L << (REPLACE - 471)) | (1L << (REVERSE - 471)) | (1L << (RIGHT - 471)) | (1L << (RPAD - 471)) | (1L << (RTRIM - 471)))) != 0) || ((((_la - 552)) & ~0x3f) == 0 && ((1L << (_la - 552)) & ((1L << (SOUNDEX - 552)) | (1L << (SPACE - 552)) | (1L << (STRCMP - 552)) | (1L << (SUBSTRING - 552)) | (1L << (SUBSTRING_INDEX - 552)))) != 0) || ((((_la - 623)) & ~0x3f) == 0 && ((1L << (_la - 623)) & ((1L << (TO_BASE64 - 623)) | (1L << (TRIM - 623)) | (1L << (UNHEX - 623)) | (1L << (UPPER - 623)))) != 0) || _la==WEIGHT_STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_functionsContext extends ParserRuleContext {
		public TerminalNode SYSDATE() { return getToken(IndsqlParser.SYSDATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(IndsqlParser.TIMESTAMP, 0); }
		public TerminalNode UTC_TIME() { return getToken(IndsqlParser.UTC_TIME, 0); }
		public TerminalNode TIMEDIFF() { return getToken(IndsqlParser.TIMEDIFF, 0); }
		public TerminalNode QUARTER() { return getToken(IndsqlParser.QUARTER, 0); }
		public TerminalNode DAYOFMONTH() { return getToken(IndsqlParser.DAYOFMONTH, 0); }
		public TerminalNode SECOND() { return getToken(IndsqlParser.SECOND, 0); }
		public TerminalNode YEAR() { return getToken(IndsqlParser.YEAR, 0); }
		public TerminalNode DATE_SYM() { return getToken(IndsqlParser.DATE_SYM, 0); }
		public TerminalNode CURDATE() { return getToken(IndsqlParser.CURDATE, 0); }
		public TerminalNode MONTHNAME() { return getToken(IndsqlParser.MONTHNAME, 0); }
		public TerminalNode STR_TO_DATE() { return getToken(IndsqlParser.STR_TO_DATE, 0); }
		public TerminalNode TIME_FORMAT() { return getToken(IndsqlParser.TIME_FORMAT, 0); }
		public TerminalNode DATEDIFF() { return getToken(IndsqlParser.DATEDIFF, 0); }
		public TerminalNode PERIOD_ADD() { return getToken(IndsqlParser.PERIOD_ADD, 0); }
		public TerminalNode TIME_TO_SEC() { return getToken(IndsqlParser.TIME_TO_SEC, 0); }
		public TerminalNode MAKEDATE() { return getToken(IndsqlParser.MAKEDATE, 0); }
		public TerminalNode WEEKDAY() { return getToken(IndsqlParser.WEEKDAY, 0); }
		public TerminalNode MINUTE() { return getToken(IndsqlParser.MINUTE, 0); }
		public TerminalNode UNIX_TIMESTAMP() { return getToken(IndsqlParser.UNIX_TIMESTAMP, 0); }
		public TerminalNode NOW() { return getToken(IndsqlParser.NOW, 0); }
		public TerminalNode UTC_TIMESTAMP() { return getToken(IndsqlParser.UTC_TIMESTAMP, 0); }
		public TerminalNode SEC_TO_TIME() { return getToken(IndsqlParser.SEC_TO_TIME, 0); }
		public TerminalNode CURTIME() { return getToken(IndsqlParser.CURTIME, 0); }
		public TerminalNode DATE_ADD() { return getToken(IndsqlParser.DATE_ADD, 0); }
		public TerminalNode DAYNAME() { return getToken(IndsqlParser.DAYNAME, 0); }
		public TerminalNode UTC_DATE() { return getToken(IndsqlParser.UTC_DATE, 0); }
		public TerminalNode LAST_DAY() { return getToken(IndsqlParser.LAST_DAY, 0); }
		public TerminalNode MONTH() { return getToken(IndsqlParser.MONTH, 0); }
		public TerminalNode GET_FORMAT() { return getToken(IndsqlParser.GET_FORMAT, 0); }
		public TerminalNode FROM_UNIXTIME() { return getToken(IndsqlParser.FROM_UNIXTIME, 0); }
		public TerminalNode ADDTIME() { return getToken(IndsqlParser.ADDTIME, 0); }
		public TerminalNode TO_DAYS() { return getToken(IndsqlParser.TO_DAYS, 0); }
		public TerminalNode TIME_SYM() { return getToken(IndsqlParser.TIME_SYM, 0); }
		public TerminalNode TO_SECONDS() { return getToken(IndsqlParser.TO_SECONDS, 0); }
		public TerminalNode MAKETIME() { return getToken(IndsqlParser.MAKETIME, 0); }
		public TerminalNode YEARWEEK() { return getToken(IndsqlParser.YEARWEEK, 0); }
		public TerminalNode SUBTIME() { return getToken(IndsqlParser.SUBTIME, 0); }
		public TerminalNode DAYOFWEEK() { return getToken(IndsqlParser.DAYOFWEEK, 0); }
		public TerminalNode TIMESTAMPADD() { return getToken(IndsqlParser.TIMESTAMPADD, 0); }
		public TerminalNode WEEKOFYEAR() { return getToken(IndsqlParser.WEEKOFYEAR, 0); }
		public TerminalNode CONVERT_TZ() { return getToken(IndsqlParser.CONVERT_TZ, 0); }
		public TerminalNode EXTRACT() { return getToken(IndsqlParser.EXTRACT, 0); }
		public TerminalNode FROM_DAYS() { return getToken(IndsqlParser.FROM_DAYS, 0); }
		public TerminalNode PERIOD_DIFF() { return getToken(IndsqlParser.PERIOD_DIFF, 0); }
		public TerminalNode MICROSECOND() { return getToken(IndsqlParser.MICROSECOND, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(IndsqlParser.DAYOFYEAR, 0); }
		public TerminalNode TIMESTAMPDIFF() { return getToken(IndsqlParser.TIMESTAMPDIFF, 0); }
		public TerminalNode DATE_FORMAT() { return getToken(IndsqlParser.DATE_FORMAT, 0); }
		public TerminalNode HOUR() { return getToken(IndsqlParser.HOUR, 0); }
		public TerminalNode WEEK() { return getToken(IndsqlParser.WEEK, 0); }
		public TerminalNode ADDDATE() { return getToken(IndsqlParser.ADDDATE, 0); }
		public TerminalNode DATE_SUB() { return getToken(IndsqlParser.DATE_SUB, 0); }
		public Time_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterTime_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitTime_functions(this);
		}
	}

	public final Time_functionsContext time_functions() throws RecognitionException {
		Time_functionsContext _localctx = new Time_functionsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_time_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_la = _input.LA(1);
			if ( !(_la==ADDDATE || _la==ADDTIME || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (CONVERT_TZ - 104)) | (1L << (CURDATE - 104)) | (1L << (CURTIME - 104)) | (1L << (DATE_ADD - 104)) | (1L << (DATE_FORMAT - 104)) | (1L << (DATE_SUB - 104)) | (1L << (DATE_SYM - 104)) | (1L << (DATEDIFF - 104)) | (1L << (DAYNAME - 104)) | (1L << (DAYOFMONTH - 104)) | (1L << (DAYOFWEEK - 104)) | (1L << (DAYOFYEAR - 104)))) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (EXTRACT - 206)) | (1L << (FROM_DAYS - 206)) | (1L << (FROM_UNIXTIME - 206)) | (1L << (GET_FORMAT - 206)) | (1L << (HOUR - 206)))) != 0) || ((((_la - 302)) & ~0x3f) == 0 && ((1L << (_la - 302)) & ((1L << (LAST_DAY - 302)) | (1L << (MAKEDATE - 302)) | (1L << (MAKETIME - 302)))) != 0) || ((((_la - 382)) & ~0x3f) == 0 && ((1L << (_la - 382)) & ((1L << (MICROSECOND - 382)) | (1L << (MINUTE - 382)) | (1L << (MONTH - 382)) | (1L << (MONTHNAME - 382)) | (1L << (NOW - 382)) | (1L << (PERIOD_ADD - 382)))) != 0) || _la==PERIOD_DIFF || _la==QUARTER || ((((_la - 524)) & ~0x3f) == 0 && ((1L << (_la - 524)) & ((1L << (SEC_TO_TIME - 524)) | (1L << (SECOND - 524)) | (1L << (STR_TO_DATE - 524)))) != 0) || ((((_la - 592)) & ~0x3f) == 0 && ((1L << (_la - 592)) & ((1L << (SUBTIME - 592)) | (1L << (SYSDATE - 592)) | (1L << (TIME_FORMAT - 592)) | (1L << (TIME_SYM - 592)) | (1L << (TIME_TO_SEC - 592)) | (1L << (TIMEDIFF - 592)) | (1L << (TIMESTAMP - 592)) | (1L << (TIMESTAMPADD - 592)) | (1L << (TIMESTAMPDIFF - 592)) | (1L << (TO_DAYS - 592)) | (1L << (TO_SECONDS - 592)) | (1L << (UNIX_TIMESTAMP - 592)))) != 0) || ((((_la - 664)) & ~0x3f) == 0 && ((1L << (_la - 664)) & ((1L << (UTC_DATE - 664)) | (1L << (UTC_TIME - 664)) | (1L << (UTC_TIMESTAMP - 664)) | (1L << (WEEK - 664)) | (1L << (WEEKDAY - 664)) | (1L << (WEEKOFYEAR - 664)) | (1L << (YEAR - 664)) | (1L << (YEARWEEK - 664)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Other_functionsContext extends ParserRuleContext {
		public TerminalNode MAKE_SET() { return getToken(IndsqlParser.MAKE_SET, 0); }
		public TerminalNode CHARSET() { return getToken(IndsqlParser.CHARSET, 0); }
		public TerminalNode BENCHMARK() { return getToken(IndsqlParser.BENCHMARK, 0); }
		public TerminalNode SCHEMA() { return getToken(IndsqlParser.SCHEMA, 0); }
		public TerminalNode CONNECTION_ID() { return getToken(IndsqlParser.CONNECTION_ID, 0); }
		public TerminalNode ENCRYPT() { return getToken(IndsqlParser.ENCRYPT, 0); }
		public TerminalNode AES_ENCRYPT() { return getToken(IndsqlParser.AES_ENCRYPT, 0); }
		public TerminalNode IFNULL() { return getToken(IndsqlParser.IFNULL, 0); }
		public TerminalNode SYSTEM_USER() { return getToken(IndsqlParser.SYSTEM_USER, 0); }
		public TerminalNode IF() { return getToken(IndsqlParser.IF, 0); }
		public TerminalNode DEFAULT() { return getToken(IndsqlParser.DEFAULT, 0); }
		public TerminalNode GET_LOCK() { return getToken(IndsqlParser.GET_LOCK, 0); }
		public TerminalNode MD5() { return getToken(IndsqlParser.MD5, 0); }
		public TerminalNode LAST_INSERT_ID() { return getToken(IndsqlParser.LAST_INSERT_ID, 0); }
		public TerminalNode INET_ATON() { return getToken(IndsqlParser.INET_ATON, 0); }
		public TerminalNode OLD_PASSWORD() { return getToken(IndsqlParser.OLD_PASSWORD, 0); }
		public TerminalNode COLLATION() { return getToken(IndsqlParser.COLLATION, 0); }
		public TerminalNode RELEASE_LOCK() { return getToken(IndsqlParser.RELEASE_LOCK, 0); }
		public TerminalNode DECODE() { return getToken(IndsqlParser.DECODE, 0); }
		public TerminalNode VALUES() { return getToken(IndsqlParser.VALUES, 0); }
		public TerminalNode INET_NTOA() { return getToken(IndsqlParser.INET_NTOA, 0); }
		public TerminalNode UUID() { return getToken(IndsqlParser.UUID, 0); }
		public TerminalNode DATABASE() { return getToken(IndsqlParser.DATABASE, 0); }
		public TerminalNode IS_USED_LOCK() { return getToken(IndsqlParser.IS_USED_LOCK, 0); }
		public TerminalNode MASTER_POS_WAIT() { return getToken(IndsqlParser.MASTER_POS_WAIT, 0); }
		public TerminalNode AES_DECRYPT() { return getToken(IndsqlParser.AES_DECRYPT, 0); }
		public TerminalNode USER() { return getToken(IndsqlParser.USER, 0); }
		public TerminalNode COERCIBILITY() { return getToken(IndsqlParser.COERCIBILITY, 0); }
		public TerminalNode DES_ENCRYPT() { return getToken(IndsqlParser.DES_ENCRYPT, 0); }
		public TerminalNode ENCODE() { return getToken(IndsqlParser.ENCODE, 0); }
		public TerminalNode PASSWORD() { return getToken(IndsqlParser.PASSWORD, 0); }
		public TerminalNode NAME_CONST() { return getToken(IndsqlParser.NAME_CONST, 0); }
		public TerminalNode SLEEP() { return getToken(IndsqlParser.SLEEP, 0); }
		public TerminalNode FOUND_ROWS() { return getToken(IndsqlParser.FOUND_ROWS, 0); }
		public TerminalNode LOAD_FILE() { return getToken(IndsqlParser.LOAD_FILE, 0); }
		public TerminalNode SESSION_USER() { return getToken(IndsqlParser.SESSION_USER, 0); }
		public TerminalNode VERSION_SYM() { return getToken(IndsqlParser.VERSION_SYM, 0); }
		public TerminalNode IS_FREE_LOCK() { return getToken(IndsqlParser.IS_FREE_LOCK, 0); }
		public TerminalNode CURRENT_USER() { return getToken(IndsqlParser.CURRENT_USER, 0); }
		public TerminalNode DES_DECRYPT() { return getToken(IndsqlParser.DES_DECRYPT, 0); }
		public Other_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterOther_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitOther_functions(this);
		}
	}

	public final Other_functionsContext other_functions() throws RecognitionException {
		Other_functionsContext _localctx = new Other_functionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_other_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AES_DECRYPT) | (1L << AES_ENCRYPT) | (1L << BENCHMARK))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHARSET - 69)) | (1L << (COERCIBILITY - 69)) | (1L << (COLLATION - 69)) | (1L << (CONNECTION_ID - 69)) | (1L << (CURRENT_USER - 69)) | (1L << (DATABASE - 69)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (DECODE - 150)) | (1L << (DEFAULT - 150)) | (1L << (DES_DECRYPT - 150)) | (1L << (DES_ENCRYPT - 150)) | (1L << (ENCODE - 150)) | (1L << (ENCRYPT - 150)))) != 0) || ((((_la - 224)) & ~0x3f) == 0 && ((1L << (_la - 224)) & ((1L << (FOUND_ROWS - 224)) | (1L << (GET_LOCK - 224)) | (1L << (IF - 224)) | (1L << (IFNULL - 224)) | (1L << (INET_ATON - 224)) | (1L << (INET_NTOA - 224)) | (1L << (IS_FREE_LOCK - 224)))) != 0) || ((((_la - 289)) & ~0x3f) == 0 && ((1L << (_la - 289)) & ((1L << (IS_USED_LOCK - 289)) | (1L << (LAST_INSERT_ID - 289)) | (1L << (LOAD_FILE - 289)) | (1L << (MAKE_SET - 289)))) != 0) || ((((_la - 355)) & ~0x3f) == 0 && ((1L << (_la - 355)) & ((1L << (MASTER_POS_WAIT - 355)) | (1L << (MD5 - 355)) | (1L << (NAME_CONST - 355)))) != 0) || _la==OLD_PASSWORD || _la==PASSWORD || ((((_la - 489)) & ~0x3f) == 0 && ((1L << (_la - 489)) & ((1L << (RELEASE_LOCK - 489)) | (1L << (SCHEMA - 489)) | (1L << (SESSION_USER - 489)) | (1L << (SLEEP - 489)))) != 0) || _la==SYSTEM_USER || _la==USER || ((((_la - 671)) & ~0x3f) == 0 && ((1L << (_la - 671)) & ((1L << (UUID - 671)) | (1L << (VALUES - 671)) | (1L << (VERSION_SYM - 671)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_functionsContext extends ParserRuleContext {
		public TerminalNode STDDEV_SAMP() { return getToken(IndsqlParser.STDDEV_SAMP, 0); }
		public TerminalNode VAR_SAMP() { return getToken(IndsqlParser.VAR_SAMP, 0); }
		public TerminalNode STDDEV_POP() { return getToken(IndsqlParser.STDDEV_POP, 0); }
		public TerminalNode SUM() { return getToken(IndsqlParser.SUM, 0); }
		public TerminalNode BIT_XOR() { return getToken(IndsqlParser.BIT_XOR, 0); }
		public TerminalNode VARIANCE() { return getToken(IndsqlParser.VARIANCE, 0); }
		public TerminalNode MIN_SYM() { return getToken(IndsqlParser.MIN_SYM, 0); }
		public TerminalNode AVG() { return getToken(IndsqlParser.AVG, 0); }
		public TerminalNode STD() { return getToken(IndsqlParser.STD, 0); }
		public TerminalNode VAR_POP() { return getToken(IndsqlParser.VAR_POP, 0); }
		public TerminalNode COUNT() { return getToken(IndsqlParser.COUNT, 0); }
		public TerminalNode STDDEV() { return getToken(IndsqlParser.STDDEV, 0); }
		public TerminalNode BIT_AND() { return getToken(IndsqlParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(IndsqlParser.BIT_OR, 0); }
		public TerminalNode GROUP_CONCAT() { return getToken(IndsqlParser.GROUP_CONCAT, 0); }
		public TerminalNode MAX_SYM() { return getToken(IndsqlParser.MAX_SYM, 0); }
		public Group_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterGroup_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitGroup_functions(this);
		}
	}

	public final Group_functionsContext group_functions() throws RecognitionException {
		Group_functionsContext _localctx = new Group_functionsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_group_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVG) | (1L << BIT_AND) | (1L << BIT_OR) | (1L << BIT_XOR))) != 0) || _la==COUNT || _la==GROUP_CONCAT || _la==MAX_SYM || _la==MIN_SYM || ((((_la - 577)) & ~0x3f) == 0 && ((1L << (_la - 577)) & ((1L << (STD - 577)) | (1L << (STDDEV - 577)) | (1L << (STDDEV_POP - 577)) | (1L << (STDDEV_SAMP - 577)) | (1L << (SUM - 577)))) != 0) || ((((_la - 674)) & ~0x3f) == 0 && ((1L << (_la - 674)) & ((1L << (VAR_POP - 674)) | (1L << (VAR_SAMP - 674)) | (1L << (VARIANCE - 674)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Schema_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitSchema_name(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453); ((Schema_nameContext)_localctx).tmpName = match(ID);
			setState(454);
			if (!(strlen((const char *)(((Schema_nameContext)_localctx).tmpName!=null?((Schema_nameContext)_localctx).tmpName.getText():null)->chars) <= 64)) throw new FailedPredicateException(this, "strlen((const char *)$tmpName.text->chars) <= 64");
			printf("schema name = \%s \n",(char*)((((Schema_nameContext)_localctx).tmpName!=null?((Schema_nameContext)_localctx).tmpName.getText():null)->chars));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457); ((Table_nameContext)_localctx).tmpName = match(ID);
			setState(458);
			if (!(strlen((const char *)(((Table_nameContext)_localctx).tmpName!=null?((Table_nameContext)_localctx).tmpName.getText():null)->chars) <= 64)) throw new FailedPredicateException(this, "strlen((const char *)$tmpName.text->chars) <= 64");
			printf("table name = \%s \n",(char*)((((Table_nameContext)_localctx).tmpName!=null?((Table_nameContext)_localctx).tmpName.getText():null)->chars));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Engine_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public Engine_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engine_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterEngine_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitEngine_name(this);
		}
	}

	public final Engine_nameContext engine_name() throws RecognitionException {
		Engine_nameContext _localctx = new Engine_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_engine_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461); ((Engine_nameContext)_localctx).tmpName = match(ID);
			setState(462);
			if (!(strlen((const char *)(((Engine_nameContext)_localctx).tmpName!=null?((Engine_nameContext)_localctx).tmpName.getText():null)->chars) <= 64)) throw new FailedPredicateException(this, "strlen((const char *)$tmpName.text->chars) <= 64");
			printf("engine name = \%s \n",(char*)((((Engine_nameContext)_localctx).tmpName!=null?((Engine_nameContext)_localctx).tmpName.getText():null)->chars));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); ((Column_nameContext)_localctx).tmpName = match(ID);
			setState(466);
			if (!(strlen((const char *)(((Column_nameContext)_localctx).tmpName!=null?((Column_nameContext)_localctx).tmpName.getText():null)->chars) <= 64)) throw new FailedPredicateException(this, "strlen((const char *)$tmpName.text->chars) <= 64");
			printf("column name = \%s \n",(char*)((((Column_nameContext)_localctx).tmpName!=null?((Column_nameContext)_localctx).tmpName.getText():null)->chars));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitView_name(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469); ((View_nameContext)_localctx).tmpName = match(ID);
			setState(470);
			if (!(strlen((const char *)(((View_nameContext)_localctx).tmpName!=null?((View_nameContext)_localctx).tmpName.getText():null)->chars) <= 64)) throw new FailedPredicateException(this, "strlen((const char *)$tmpName.text->chars) <= 64");
			printf("view name = \%s \n",(char*)((((View_nameContext)_localctx).tmpName!=null?((View_nameContext)_localctx).tmpName.getText():null)->chars));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parser_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public Parser_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parser_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterParser_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitParser_name(this);
		}
	}

	public final Parser_nameContext parser_name() throws RecognitionException {
		Parser_nameContext _localctx = new Parser_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parser_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473); ((Parser_nameContext)_localctx).tmpName = match(ID);
			setState(474);
			if (!(strlen((const char *)(((Parser_nameContext)_localctx).tmpName!=null?((Parser_nameContext)_localctx).tmpName.getText():null)->chars) <= 64)) throw new FailedPredicateException(this, "strlen((const char *)$tmpName.text->chars) <= 64");
			printf("index name = \%s \n",(char*)((((Parser_nameContext)_localctx).tmpName!=null?((Parser_nameContext)_localctx).tmpName.getText():null)->chars));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitIndex_name(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477); ((Index_nameContext)_localctx).tmpName = match(ID);
			setState(478);
			if (!(strlen((const char *)(((Index_nameContext)_localctx).tmpName!=null?((Index_nameContext)_localctx).tmpName.getText():null)->chars) <= 64)) throw new FailedPredicateException(this, "strlen((const char *)$tmpName.text->chars) <= 64");
			printf("index name = \%s \n",(char*)((((Index_nameContext)_localctx).tmpName!=null?((Index_nameContext)_localctx).tmpName.getText():null)->chars));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public Partition_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterPartition_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitPartition_name(this);
		}
	}

	public final Partition_nameContext partition_name() throws RecognitionException {
		Partition_nameContext _localctx = new Partition_nameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_partition_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481); ((Partition_nameContext)_localctx).tmpName = match(ID);
			setState(482);
			if (!(strlen((const char *)(((Partition_nameContext)_localctx).tmpName!=null?((Partition_nameContext)_localctx).tmpName.getText():null)->chars) <= 64)) throw new FailedPredicateException(this, "strlen((const char *)$tmpName.text->chars) <= 64");
			printf("partition name = \%s \n",(char*)((((Partition_nameContext)_localctx).tmpName!=null?((Partition_nameContext)_localctx).tmpName.getText():null)->chars));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_logical_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public Partition_logical_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_logical_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterPartition_logical_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitPartition_logical_name(this);
		}
	}

	public final Partition_logical_nameContext partition_logical_name() throws RecognitionException {
		Partition_logical_nameContext _localctx = new Partition_logical_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_partition_logical_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485); ((Partition_logical_nameContext)_localctx).tmpName = match(ID);
			setState(486);
			if (!(strlen((const char *)(((Partition_logical_nameContext)_localctx).tmpName!=null?((Partition_logical_nameContext)_localctx).tmpName.getText():null)->chars) <= 64)) throw new FailedPredicateException(this, "strlen((const char *)$tmpName.text->chars) <= 64");
			printf("partition logical name = \%s \n",(char*)((((Partition_logical_nameContext)_localctx).tmpName!=null?((Partition_logical_nameContext)_localctx).tmpName.getText():null)->chars));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constraint_symbol_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public Constraint_symbol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint_symbol_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterConstraint_symbol_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitConstraint_symbol_name(this);
		}
	}

	public final Constraint_symbol_nameContext constraint_symbol_name() throws RecognitionException {
		Constraint_symbol_nameContext _localctx = new Constraint_symbol_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constraint_symbol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489); ((Constraint_symbol_nameContext)_localctx).tmpName = match(ID);
			setState(490);
			if (!(strlen((const char *)(((Constraint_symbol_nameContext)_localctx).tmpName!=null?((Constraint_symbol_nameContext)_localctx).tmpName.getText():null)->chars) <= 64)) throw new FailedPredicateException(this, "strlen((const char *)$tmpName.text->chars) <= 64");
			printf("constraint symbol name = \%s \n",(char*)((((Constraint_symbol_nameContext)_localctx).tmpName!=null?((Constraint_symbol_nameContext)_localctx).tmpName.getText():null)->chars));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_key_symbol_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public Foreign_key_symbol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_symbol_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterForeign_key_symbol_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitForeign_key_symbol_name(this);
		}
	}

	public final Foreign_key_symbol_nameContext foreign_key_symbol_name() throws RecognitionException {
		Foreign_key_symbol_nameContext _localctx = new Foreign_key_symbol_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_foreign_key_symbol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493); ((Foreign_key_symbol_nameContext)_localctx).tmpName = match(ID);
			setState(494);
			if (!(strlen((const char *)(((Foreign_key_symbol_nameContext)_localctx).tmpName!=null?((Foreign_key_symbol_nameContext)_localctx).tmpName.getText():null)->chars) <= 64)) throw new FailedPredicateException(this, "strlen((const char *)$tmpName.text->chars) <= 64");
			printf("foreign key symbol name = \%s \n",(char*)((((Foreign_key_symbol_nameContext)_localctx).tmpName!=null?((Foreign_key_symbol_nameContext)_localctx).tmpName.getText():null)->chars));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCollation_name(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497); ((Collation_nameContext)_localctx).tmpName = match(ID);
			setState(498);
			if (!(strlen((const char *)(((Collation_nameContext)_localctx).tmpName!=null?((Collation_nameContext)_localctx).tmpName.getText():null)->chars) <= 64)) throw new FailedPredicateException(this, "strlen((const char *)$tmpName.text->chars) <= 64");
			printf("collation name = \%s \n",(char*)((((Collation_nameContext)_localctx).tmpName!=null?((Collation_nameContext)_localctx).tmpName.getText():null)->chars));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Event_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public Event_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterEvent_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitEvent_name(this);
		}
	}

	public final Event_nameContext event_name() throws RecognitionException {
		Event_nameContext _localctx = new Event_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_event_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501); ((Event_nameContext)_localctx).tmpName = match(ID);
			setState(502);
			if (!(strlen((const char *)(((Event_nameContext)_localctx).tmpName!=null?((Event_nameContext)_localctx).tmpName.getText():null)->chars) <= 64)) throw new FailedPredicateException(this, "strlen((const char *)$tmpName.text->chars) <= 64");
			printf("event name = \%s \n",(char*)((((Event_nameContext)_localctx).tmpName!=null?((Event_nameContext)_localctx).tmpName.getText():null)->chars));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class User_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public User_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterUser_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitUser_name(this);
		}
	}

	public final User_nameContext user_name() throws RecognitionException {
		User_nameContext _localctx = new User_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_user_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505); ((User_nameContext)_localctx).tmpName = match(ID);
			setState(506);
			if (!(strlen((const char *)(((User_nameContext)_localctx).tmpName!=null?((User_nameContext)_localctx).tmpName.getText():null)->chars) <= 64)) throw new FailedPredicateException(this, "strlen((const char *)$tmpName.text->chars) <= 64");
			printf("user name = \%s \n",(char*)((((User_nameContext)_localctx).tmpName!=null?((User_nameContext)_localctx).tmpName.getText():null)->chars));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509); ((Function_nameContext)_localctx).tmpName = match(ID);
			setState(510);
			if (!(strlen((const char *)(((Function_nameContext)_localctx).tmpName!=null?((Function_nameContext)_localctx).tmpName.getText():null)->chars) <= 64)) throw new FailedPredicateException(this, "strlen((const char *)$tmpName.text->chars) <= 64");
			printf("function name = \%s \n",(char*)((((Function_nameContext)_localctx).tmpName!=null?((Function_nameContext)_localctx).tmpName.getText():null)->chars));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public Procedure_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterProcedure_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitProcedure_name(this);
		}
	}

	public final Procedure_nameContext procedure_name() throws RecognitionException {
		Procedure_nameContext _localctx = new Procedure_nameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_procedure_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513); ((Procedure_nameContext)_localctx).tmpName = match(ID);
			setState(514);
			if (!(strlen((const char *)(((Procedure_nameContext)_localctx).tmpName!=null?((Procedure_nameContext)_localctx).tmpName.getText():null)->chars) <= 64)) throw new FailedPredicateException(this, "strlen((const char *)$tmpName.text->chars) <= 64");
			printf("procedure name = \%s \n",(char*)((((Procedure_nameContext)_localctx).tmpName!=null?((Procedure_nameContext)_localctx).tmpName.getText():null)->chars));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Server_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public Server_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_server_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterServer_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitServer_name(this);
		}
	}

	public final Server_nameContext server_name() throws RecognitionException {
		Server_nameContext _localctx = new Server_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_server_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517); ((Server_nameContext)_localctx).tmpName = match(ID);
			setState(518);
			if (!(strlen((const char *)(((Server_nameContext)_localctx).tmpName!=null?((Server_nameContext)_localctx).tmpName.getText():null)->chars) <= 64)) throw new FailedPredicateException(this, "strlen((const char *)$tmpName.text->chars) <= 64");
			printf("server name = \%s \n",(char*)((((Server_nameContext)_localctx).tmpName!=null?((Server_nameContext)_localctx).tmpName.getText():null)->chars));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wrapper_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public Wrapper_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wrapper_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterWrapper_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitWrapper_name(this);
		}
	}

	public final Wrapper_nameContext wrapper_name() throws RecognitionException {
		Wrapper_nameContext _localctx = new Wrapper_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_wrapper_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521); ((Wrapper_nameContext)_localctx).tmpName = match(ID);
			setState(522);
			if (!(strlen((const char *)(((Wrapper_nameContext)_localctx).tmpName!=null?((Wrapper_nameContext)_localctx).tmpName.getText():null)->chars) <= 64)) throw new FailedPredicateException(this, "strlen((const char *)$tmpName.text->chars) <= 64");
			printf("wrapper name = \%s \n",(char*)((((Wrapper_nameContext)_localctx).tmpName!=null?((Wrapper_nameContext)_localctx).tmpName.getText():null)->chars));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode AS_SYM() { return getToken(IndsqlParser.AS_SYM, 0); }
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitAlias(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_la = _input.LA(1);
			if (_la==AS_SYM) {
				{
				setState(525); match(AS_SYM);
				}
			}

			setState(528); ((AliasContext)_localctx).tmpName = match(ID);
			setState(529);
			if (!(strlen((const char *)(((AliasContext)_localctx).tmpName!=null?((AliasContext)_localctx).tmpName.getText():null)->chars) <= 256)) throw new FailedPredicateException(this, "strlen((const char *)$tmpName.text->chars) <= 256");
			printf("alias = \%s \n",(char*)((((AliasContext)_localctx).tmpName!=null?((AliasContext)_localctx).tmpName.getText():null)->chars));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Exp_factor1Context exp_factor1(int i) {
			return getRuleContext(Exp_factor1Context.class,i);
		}
		public TerminalNode OR_SYM(int i) {
			return getToken(IndsqlParser.OR_SYM, i);
		}
		public List<Exp_factor1Context> exp_factor1() {
			return getRuleContexts(Exp_factor1Context.class);
		}
		public List<TerminalNode> OR_SYM() { return getTokens(IndsqlParser.OR_SYM); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(532); exp_factor1();
			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(533); match(OR_SYM);
					setState(534); exp_factor1();
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_factor1Context extends ParserRuleContext {
		public Exp_factor2Context exp_factor2(int i) {
			return getRuleContext(Exp_factor2Context.class,i);
		}
		public List<TerminalNode> XOR() { return getTokens(IndsqlParser.XOR); }
		public List<Exp_factor2Context> exp_factor2() {
			return getRuleContexts(Exp_factor2Context.class);
		}
		public TerminalNode XOR(int i) {
			return getToken(IndsqlParser.XOR, i);
		}
		public Exp_factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterExp_factor1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitExp_factor1(this);
		}
	}

	public final Exp_factor1Context exp_factor1() throws RecognitionException {
		Exp_factor1Context _localctx = new Exp_factor1Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_exp_factor1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(540); exp_factor2();
			setState(545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(541); match(XOR);
					setState(542); exp_factor2();
					}
					} 
				}
				setState(547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_factor2Context extends ParserRuleContext {
		public TerminalNode AND_SYM(int i) {
			return getToken(IndsqlParser.AND_SYM, i);
		}
		public List<Exp_factor3Context> exp_factor3() {
			return getRuleContexts(Exp_factor3Context.class);
		}
		public Exp_factor3Context exp_factor3(int i) {
			return getRuleContext(Exp_factor3Context.class,i);
		}
		public List<TerminalNode> AND_SYM() { return getTokens(IndsqlParser.AND_SYM); }
		public Exp_factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterExp_factor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitExp_factor2(this);
		}
	}

	public final Exp_factor2Context exp_factor2() throws RecognitionException {
		Exp_factor2Context _localctx = new Exp_factor2Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_exp_factor2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(548); exp_factor3();
			setState(553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(549); match(AND_SYM);
					setState(550); exp_factor3();
					}
					} 
				}
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_factor3Context extends ParserRuleContext {
		public TerminalNode NOT_SYM() { return getToken(IndsqlParser.NOT_SYM, 0); }
		public Exp_factor4Context exp_factor4() {
			return getRuleContext(Exp_factor4Context.class,0);
		}
		public Exp_factor3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterExp_factor3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitExp_factor3(this);
		}
	}

	public final Exp_factor3Context exp_factor3() throws RecognitionException {
		Exp_factor3Context _localctx = new Exp_factor3Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_exp_factor3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(556); match(NOT_SYM);
				}
				break;
			}
			setState(559); exp_factor4();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_factor4Context extends ParserRuleContext {
		public TerminalNode NOT_SYM() { return getToken(IndsqlParser.NOT_SYM, 0); }
		public TerminalNode IS_SYM() { return getToken(IndsqlParser.IS_SYM, 0); }
		public TerminalNode NULL_SYM() { return getToken(IndsqlParser.NULL_SYM, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Bool_primaryContext bool_primary() {
			return getRuleContext(Bool_primaryContext.class,0);
		}
		public Exp_factor4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterExp_factor4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitExp_factor4(this);
		}
	}

	public final Exp_factor4Context exp_factor4() throws RecognitionException {
		Exp_factor4Context _localctx = new Exp_factor4Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_exp_factor4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561); bool_primary();
			setState(570);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(562); match(IS_SYM);
				setState(564);
				_la = _input.LA(1);
				if (_la==NOT_SYM) {
					{
					setState(563); match(NOT_SYM);
					}
				}

				setState(568);
				switch (_input.LA(1)) {
				case FALSE_SYM:
				case TRUE_SYM:
					{
					setState(566); boolean_literal();
					}
					break;
				case NULL_SYM:
					{
					setState(567); match(NULL_SYM);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_primaryContext extends ParserRuleContext {
		public TerminalNode NOT_SYM() { return getToken(IndsqlParser.NOT_SYM, 0); }
		public TerminalNode ALL() { return getToken(IndsqlParser.ALL, 0); }
		public TerminalNode EXISTS() { return getToken(IndsqlParser.EXISTS, 0); }
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode ANY() { return getToken(IndsqlParser.ANY, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public Bool_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterBool_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitBool_primary(this);
		}
	}

	public final Bool_primaryContext bool_primary() throws RecognitionException {
		Bool_primaryContext _localctx = new Bool_primaryContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_bool_primary);
		int _la;
		try {
			setState(589);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(572); predicate();
				setState(573); relational_op();
				setState(574); predicate();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(576); predicate();
				setState(577); relational_op();
				setState(579);
				_la = _input.LA(1);
				if (_la==ALL || _la==ANY) {
					{
					setState(578);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==ANY) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(581); subquery();
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(584);
				_la = _input.LA(1);
				if (_la==NOT_SYM) {
					{
					setState(583); match(NOT_SYM);
					}
				}

				setState(586); match(EXISTS);
				setState(587); subquery();
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(588); predicate();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public TerminalNode NOT_SYM() { return getToken(IndsqlParser.NOT_SYM, 0); }
		public TerminalNode REGEXP() { return getToken(IndsqlParser.REGEXP, 0); }
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode AND_SYM() { return getToken(IndsqlParser.AND_SYM, 0); }
		public TerminalNode LIKE_SYM() { return getToken(IndsqlParser.LIKE_SYM, 0); }
		public TerminalNode IN_SYM() { return getToken(IndsqlParser.IN_SYM, 0); }
		public TerminalNode BETWEEN() { return getToken(IndsqlParser.BETWEEN, 0); }
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public TerminalNode ESCAPE_SYM() { return getToken(IndsqlParser.ESCAPE_SYM, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode SOUNDS_SYM() { return getToken(IndsqlParser.SOUNDS_SYM, 0); }
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_predicate);
		int _la;
		try {
			setState(632);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(591); bit_expr();
				setState(593);
				_la = _input.LA(1);
				if (_la==NOT_SYM) {
					{
					setState(592); match(NOT_SYM);
					}
				}

				setState(595); match(IN_SYM);
				setState(598);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(596); subquery();
					}
					break;

				case 2:
					{
					setState(597); expression_list();
					}
					break;
				}
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(600); bit_expr();
				setState(602);
				_la = _input.LA(1);
				if (_la==NOT_SYM) {
					{
					setState(601); match(NOT_SYM);
					}
				}

				setState(604); match(BETWEEN);
				setState(605); bit_expr();
				setState(606); match(AND_SYM);
				setState(607); predicate();
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(609); bit_expr();
				setState(610); match(SOUNDS_SYM);
				setState(611); match(LIKE_SYM);
				setState(612); bit_expr();
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(614); bit_expr();
				setState(616);
				_la = _input.LA(1);
				if (_la==NOT_SYM) {
					{
					setState(615); match(NOT_SYM);
					}
				}

				setState(618); match(LIKE_SYM);
				setState(619); simple_expr();
				setState(622);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(620); match(ESCAPE_SYM);
					setState(621); simple_expr();
					}
					break;
				}
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(624); bit_expr();
				setState(626);
				_la = _input.LA(1);
				if (_la==NOT_SYM) {
					{
					setState(625); match(NOT_SYM);
					}
				}

				setState(628); match(REGEXP);
				setState(629); bit_expr();
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(631); bit_expr();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_exprContext extends ParserRuleContext {
		public Factor1Context factor1(int i) {
			return getRuleContext(Factor1Context.class,i);
		}
		public List<Factor1Context> factor1() {
			return getRuleContexts(Factor1Context.class);
		}
		public TerminalNode VERTBAR() { return getToken(IndsqlParser.VERTBAR, 0); }
		public Bit_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterBit_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitBit_expr(this);
		}
	}

	public final Bit_exprContext bit_expr() throws RecognitionException {
		Bit_exprContext _localctx = new Bit_exprContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_bit_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634); factor1();
			setState(637);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(635); match(VERTBAR);
				setState(636); factor1();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor1Context extends ParserRuleContext {
		public TerminalNode BITAND() { return getToken(IndsqlParser.BITAND, 0); }
		public List<Factor2Context> factor2() {
			return getRuleContexts(Factor2Context.class);
		}
		public Factor2Context factor2(int i) {
			return getRuleContext(Factor2Context.class,i);
		}
		public Factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterFactor1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitFactor1(this);
		}
	}

	public final Factor1Context factor1() throws RecognitionException {
		Factor1Context _localctx = new Factor1Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_factor1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639); factor2();
			setState(642);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(640); match(BITAND);
				setState(641); factor2();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor2Context extends ParserRuleContext {
		public List<Factor3Context> factor3() {
			return getRuleContexts(Factor3Context.class);
		}
		public Factor3Context factor3(int i) {
			return getRuleContext(Factor3Context.class,i);
		}
		public TerminalNode SHIFT_RIGHT() { return getToken(IndsqlParser.SHIFT_RIGHT, 0); }
		public TerminalNode SHIFT_LEFT() { return getToken(IndsqlParser.SHIFT_LEFT, 0); }
		public Factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterFactor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitFactor2(this);
		}
	}

	public final Factor2Context factor2() throws RecognitionException {
		Factor2Context _localctx = new Factor2Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_factor2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644); factor3();
			setState(647);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(645);
				_la = _input.LA(1);
				if ( !(_la==SHIFT_LEFT || _la==SHIFT_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(646); factor3();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor3Context extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(IndsqlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(IndsqlParser.PLUS, 0); }
		public List<Factor4Context> factor4() {
			return getRuleContexts(Factor4Context.class);
		}
		public Factor4Context factor4(int i) {
			return getRuleContext(Factor4Context.class,i);
		}
		public Factor3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterFactor3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitFactor3(this);
		}
	}

	public final Factor3Context factor3() throws RecognitionException {
		Factor3Context _localctx = new Factor3Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_factor3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649); factor4();
			setState(652);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(650);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(651); factor4();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor4Context extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(IndsqlParser.ASTERISK, 0); }
		public List<Factor5Context> factor5() {
			return getRuleContexts(Factor5Context.class);
		}
		public Factor5Context factor5(int i) {
			return getRuleContext(Factor5Context.class,i);
		}
		public TerminalNode MOD_SYM() { return getToken(IndsqlParser.MOD_SYM, 0); }
		public TerminalNode DIVIDE() { return getToken(IndsqlParser.DIVIDE, 0); }
		public TerminalNode POWER_OP() { return getToken(IndsqlParser.POWER_OP, 0); }
		public Factor4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterFactor4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitFactor4(this);
		}
	}

	public final Factor4Context factor4() throws RecognitionException {
		Factor4Context _localctx = new Factor4Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_factor4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654); factor5();
			setState(657);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(655);
				_la = _input.LA(1);
				if ( !(((((_la - 704)) & ~0x3f) == 0 && ((1L << (_la - 704)) & ((1L << (DIVIDE - 704)) | (1L << (MOD_SYM - 704)) | (1L << (ASTERISK - 704)) | (1L << (POWER_OP - 704)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(656); factor5();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor5Context extends ParserRuleContext {
		public Factor6Context factor6() {
			return getRuleContext(Factor6Context.class,0);
		}
		public Interval_exprContext interval_expr() {
			return getRuleContext(Interval_exprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(IndsqlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(IndsqlParser.PLUS, 0); }
		public Factor5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterFactor5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitFactor5(this);
		}
	}

	public final Factor5Context factor5() throws RecognitionException {
		Factor5Context _localctx = new Factor5Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_factor5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659); factor6();
			setState(662);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(660);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(661); interval_expr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor6Context extends ParserRuleContext {
		public TerminalNode NEGATION() { return getToken(IndsqlParser.NEGATION, 0); }
		public TerminalNode MINUS() { return getToken(IndsqlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(IndsqlParser.PLUS, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode BINARY() { return getToken(IndsqlParser.BINARY, 0); }
		public Factor6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterFactor6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitFactor6(this);
		}
	}

	public final Factor6Context factor6() throws RecognitionException {
		Factor6Context _localctx = new Factor6Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_factor6);
		int _la;
		try {
			setState(667);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				_la = _input.LA(1);
				if ( !(_la==BINARY || ((((_la - 726)) & ~0x3f) == 0 && ((1L << (_la - 726)) & ((1L << (PLUS - 726)) | (1L << (MINUS - 726)) | (1L << (NEGATION - 726)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(665); simple_expr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(666); simple_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor7Context extends ParserRuleContext {
		public Collation_namesContext collation_names() {
			return getRuleContext(Collation_namesContext.class,0);
		}
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode COLLATE_SYM() { return getToken(IndsqlParser.COLLATE_SYM, 0); }
		public Factor7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterFactor7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitFactor7(this);
		}
	}

	public final Factor7Context factor7() throws RecognitionException {
		Factor7Context _localctx = new Factor7Context(_ctx, getState());
		enterRule(_localctx, 104, RULE_factor7);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669); simple_expr();
			setState(672);
			_la = _input.LA(1);
			if (_la==COLLATE_SYM) {
				{
				setState(670); match(COLLATE_SYM);
				setState(671); collation_names();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_exprContext extends ParserRuleContext {
		public Interval_exprContext interval_expr() {
			return getRuleContext(Interval_exprContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(IndsqlParser.EXISTS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode USER_VAR() { return getToken(IndsqlParser.USER_VAR, 0); }
		public Case_when_statementContext case_when_statement() {
			return getRuleContext(Case_when_statementContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public Match_against_statementContext match_against_statement() {
			return getRuleContext(Match_against_statementContext.class,0);
		}
		public TerminalNode ROW_SYM() { return getToken(IndsqlParser.ROW_SYM, 0); }
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterSimple_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitSimple_expr(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_simple_expr);
		try {
			setState(687);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(674); literal_value();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(675); column_spec();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(676); function_call();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(677); match(USER_VAR);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(678); expression_list();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(679); match(ROW_SYM);
				setState(680); expression_list();
				}
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(681); subquery();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(682); match(EXISTS);
				setState(683); subquery();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(684); match_against_statement();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(685); case_when_statement();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(686); interval_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public Bit_exprContext bit_expr() {
			return getRuleContext(Bit_exprContext.class,0);
		}
		public TerminalNode ALL() { return getToken(IndsqlParser.ALL, 0); }
		public Transcoding_nameContext transcoding_name() {
			return getRuleContext(Transcoding_nameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public TerminalNode ASTERISK() { return getToken(IndsqlParser.ASTERISK, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS_SYM() { return getToken(IndsqlParser.AS_SYM, 0); }
		public TerminalNode USING_SYM() { return getToken(IndsqlParser.USING_SYM, 0); }
		public TerminalNode DISTINCT() { return getToken(IndsqlParser.DISTINCT, 0); }
		public FunctionListContext functionList() {
			return getRuleContext(FunctionListContext.class,0);
		}
		public Group_functionsContext group_functions() {
			return getRuleContext(Group_functionsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public Cast_data_typeContext cast_data_type() {
			return getRuleContext(Cast_data_typeContext.class,0);
		}
		public TerminalNode CONVERT_SYM() { return getToken(IndsqlParser.CONVERT_SYM, 0); }
		public TerminalNode CAST_SYM() { return getToken(IndsqlParser.CAST_SYM, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_function_call);
		int _la;
		try {
			setState(733);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(689); functionList();
				setState(702);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(690); match(LPAREN);
					setState(699);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << ACOS) | (1L << ADDDATE) | (1L << ADDTIME) | (1L << AES_DECRYPT) | (1L << AES_ENCRYPT) | (1L << ASCII_SYM) | (1L << ASIN) | (1L << ATAN) | (1L << ATAN2) | (1L << AVG) | (1L << BENCHMARK) | (1L << BIN) | (1L << BINARY) | (1L << BIT_AND) | (1L << BIT_LENGTH) | (1L << BIT_OR) | (1L << BIT_XOR) | (1L << CASE_SYM) | (1L << CAST_SYM) | (1L << CEIL) | (1L << CEILING))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CHAR - 66)) | (1L << (CHAR_LENGTH - 66)) | (1L << (CHARSET - 66)) | (1L << (COERCIBILITY - 66)) | (1L << (COLLATION - 66)) | (1L << (CONCAT - 66)) | (1L << (CONCAT_WS - 66)) | (1L << (CONNECTION_ID - 66)) | (1L << (CONV - 66)) | (1L << (CONVERT_SYM - 66)) | (1L << (CONVERT_TZ - 66)) | (1L << (COS - 66)) | (1L << (COT - 66)) | (1L << (COUNT - 66)) | (1L << (CRC32 - 66)) | (1L << (CURDATE - 66)) | (1L << (CURRENT_USER - 66)) | (1L << (CURTIME - 66)) | (1L << (DATABASE - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (DATE_ADD - 131)) | (1L << (DATE_FORMAT - 131)) | (1L << (DATE_SUB - 131)) | (1L << (DATE_SYM - 131)) | (1L << (DATEDIFF - 131)) | (1L << (DAYNAME - 131)) | (1L << (DAYOFMONTH - 131)) | (1L << (DAYOFWEEK - 131)) | (1L << (DAYOFYEAR - 131)) | (1L << (DECODE - 131)) | (1L << (DEFAULT - 131)) | (1L << (DEGREES - 131)) | (1L << (DES_DECRYPT - 131)) | (1L << (DES_ENCRYPT - 131)) | (1L << (ELT - 131)) | (1L << (ENCODE - 131)) | (1L << (ENCRYPT - 131)))) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (EXISTS - 199)) | (1L << (EXP - 199)) | (1L << (EXPORT_SET - 199)) | (1L << (EXTRACT - 199)) | (1L << (FALSE_SYM - 199)) | (1L << (FIELD - 199)) | (1L << (FIND_IN_SET - 199)) | (1L << (FLOOR - 199)) | (1L << (FORMAT - 199)) | (1L << (FOUND_ROWS - 199)) | (1L << (FROM_BASE64 - 199)) | (1L << (FROM_DAYS - 199)) | (1L << (FROM_UNIXTIME - 199)) | (1L << (GET_FORMAT - 199)) | (1L << (GET_LOCK - 199)) | (1L << (GROUP_CONCAT - 199)) | (1L << (HEX - 199)) | (1L << (HOUR - 199)) | (1L << (IF - 199)) | (1L << (IFNULL - 199)))) != 0) || ((((_la - 268)) & ~0x3f) == 0 && ((1L << (_la - 268)) & ((1L << (INET_ATON - 268)) | (1L << (INET_NTOA - 268)) | (1L << (INSERT - 268)) | (1L << (INSTR - 268)) | (1L << (INTERVAL_SYM - 268)) | (1L << (IS_FREE_LOCK - 268)) | (1L << (IS_USED_LOCK - 268)) | (1L << (LAST_DAY - 268)) | (1L << (LAST_INSERT_ID - 268)) | (1L << (LEFT - 268)) | (1L << (LENGTH - 268)) | (1L << (LN - 268)) | (1L << (LOAD_FILE - 268)) | (1L << (LOCATE - 268)) | (1L << (LOG - 268)))) != 0) || ((((_la - 332)) & ~0x3f) == 0 && ((1L << (_la - 332)) & ((1L << (LOG10 - 332)) | (1L << (LOG2 - 332)) | (1L << (LOWER - 332)) | (1L << (LPAD - 332)) | (1L << (LTRIM - 332)) | (1L << (MAKE_SET - 332)) | (1L << (MAKEDATE - 332)) | (1L << (MAKETIME - 332)) | (1L << (MASTER_POS_WAIT - 332)) | (1L << (MATCH - 332)) | (1L << (MAX_SYM - 332)) | (1L << (MD5 - 332)) | (1L << (MICROSECOND - 332)) | (1L << (MID - 332)) | (1L << (MIN_SYM - 332)) | (1L << (MINUTE - 332)) | (1L << (MOD - 332)) | (1L << (MONTH - 332)) | (1L << (MONTHNAME - 332)))) != 0) || ((((_la - 400)) & ~0x3f) == 0 && ((1L << (_la - 400)) & ((1L << (NAME_CONST - 400)) | (1L << (NOT_SYM - 400)) | (1L << (NOW - 400)) | (1L << (NULL_SYM - 400)) | (1L << (OCT - 400)) | (1L << (OLD_PASSWORD - 400)) | (1L << (ORD - 400)) | (1L << (PASSWORD - 400)) | (1L << (PERIOD_ADD - 400)) | (1L << (PERIOD_DIFF - 400)) | (1L << (PI - 400)) | (1L << (POW - 400)) | (1L << (POWER - 400)))) != 0) || ((((_la - 468)) & ~0x3f) == 0 && ((1L << (_la - 468)) & ((1L << (QUARTER - 468)) | (1L << (QUOTE - 468)) | (1L << (RADIANS - 468)) | (1L << (RAND - 468)) | (1L << (RELEASE_LOCK - 468)) | (1L << (REPEAT - 468)) | (1L << (REPLACE - 468)) | (1L << (REVERSE - 468)) | (1L << (RIGHT - 468)) | (1L << (ROUND - 468)) | (1L << (ROW_SYM - 468)) | (1L << (RPAD - 468)) | (1L << (RTRIM - 468)) | (1L << (SCHEMA - 468)) | (1L << (SEC_TO_TIME - 468)) | (1L << (SECOND - 468)))) != 0) || ((((_la - 535)) & ~0x3f) == 0 && ((1L << (_la - 535)) & ((1L << (SESSION_USER - 535)) | (1L << (SIGN - 535)) | (1L << (SIN - 535)) | (1L << (SLEEP - 535)) | (1L << (SOUNDEX - 535)) | (1L << (SPACE - 535)) | (1L << (SQRT - 535)) | (1L << (STD - 535)) | (1L << (STDDEV - 535)) | (1L << (STDDEV_POP - 535)) | (1L << (STDDEV_SAMP - 535)) | (1L << (STR_TO_DATE - 535)) | (1L << (STRCMP - 535)) | (1L << (SUBSTRING - 535)) | (1L << (SUBSTRING_INDEX - 535)) | (1L << (SUBTIME - 535)) | (1L << (SUM - 535)))) != 0) || ((((_la - 599)) & ~0x3f) == 0 && ((1L << (_la - 599)) & ((1L << (SYSDATE - 599)) | (1L << (SYSTEM_USER - 599)) | (1L << (TAN - 599)) | (1L << (TIME_FORMAT - 599)) | (1L << (TIME_SYM - 599)) | (1L << (TIME_TO_SEC - 599)) | (1L << (TIMEDIFF - 599)) | (1L << (TIMESTAMP - 599)) | (1L << (TIMESTAMPADD - 599)) | (1L << (TIMESTAMPDIFF - 599)) | (1L << (TO_BASE64 - 599)) | (1L << (TO_DAYS - 599)) | (1L << (TO_SECONDS - 599)) | (1L << (TRIM - 599)) | (1L << (TRUE_SYM - 599)) | (1L << (TRUNCATE - 599)) | (1L << (UNHEX - 599)) | (1L << (UNIX_TIMESTAMP - 599)) | (1L << (UPPER - 599)) | (1L << (USER - 599)))) != 0) || ((((_la - 664)) & ~0x3f) == 0 && ((1L << (_la - 664)) & ((1L << (UTC_DATE - 664)) | (1L << (UTC_TIME - 664)) | (1L << (UTC_TIMESTAMP - 664)) | (1L << (UUID - 664)) | (1L << (VALUES - 664)) | (1L << (VAR_POP - 664)) | (1L << (VAR_SAMP - 664)) | (1L << (VARIANCE - 664)) | (1L << (VERSION_SYM - 664)) | (1L << (WEEK - 664)) | (1L << (WEEKDAY - 664)) | (1L << (WEEKOFYEAR - 664)) | (1L << (WEIGHT_STRING - 664)) | (1L << (YEAR - 664)) | (1L << (YEARWEEK - 664)) | (1L << (LPAREN - 664)) | (1L << (PLUS - 664)) | (1L << (MINUS - 664)))) != 0) || ((((_la - 728)) & ~0x3f) == 0 && ((1L << (_la - 728)) & ((1L << (NEGATION - 728)) | (1L << (INTEGER_NUM - 728)) | (1L << (HEX_DIGIT - 728)) | (1L << (BIT_NUM - 728)) | (1L << (REAL_NUMBER - 728)) | (1L << (TEXT_STRING - 728)) | (1L << (ID - 728)) | (1L << (USER_VAR - 728)))) != 0)) {
						{
						setState(691); expression();
						setState(696);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(692); match(COMMA);
							setState(693); expression();
							}
							}
							setState(698);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(701); match(RPAREN);
					}
				}

				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(704); match(CAST_SYM);
				setState(705); match(LPAREN);
				setState(706); expression();
				setState(707); match(AS_SYM);
				setState(708); cast_data_type();
				setState(709); match(RPAREN);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(711); match(CONVERT_SYM);
				setState(712); match(LPAREN);
				setState(713); expression();
				setState(714); match(COMMA);
				setState(715); cast_data_type();
				setState(716); match(RPAREN);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(718); match(CONVERT_SYM);
				setState(719); match(LPAREN);
				setState(720); expression();
				setState(721); match(USING_SYM);
				setState(722); transcoding_name();
				setState(723); match(RPAREN);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(725); group_functions();
				setState(726); match(LPAREN);
				setState(728);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT || _la==ASTERISK) {
					{
					setState(727);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT || _la==ASTERISK) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(730); bit_expr();
				setState(731); match(RPAREN);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_when_statementContext extends ParserRuleContext {
		public Case_when_statement2Context case_when_statement2() {
			return getRuleContext(Case_when_statement2Context.class,0);
		}
		public Case_when_statement1Context case_when_statement1() {
			return getRuleContext(Case_when_statement1Context.class,0);
		}
		public Case_when_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_when_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCase_when_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCase_when_statement(this);
		}
	}

	public final Case_when_statementContext case_when_statement() throws RecognitionException {
		Case_when_statementContext _localctx = new Case_when_statementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_case_when_statement);
		try {
			setState(737);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(735); case_when_statement1();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(736); case_when_statement2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_when_statement1Context extends ParserRuleContext {
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WHEN_SYM(int i) {
			return getToken(IndsqlParser.WHEN_SYM, i);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public List<TerminalNode> THEN_SYM() { return getTokens(IndsqlParser.THEN_SYM); }
		public TerminalNode ELSE_SYM() { return getToken(IndsqlParser.ELSE_SYM, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<TerminalNode> WHEN_SYM() { return getTokens(IndsqlParser.WHEN_SYM); }
		public TerminalNode THEN_SYM(int i) {
			return getToken(IndsqlParser.THEN_SYM, i);
		}
		public TerminalNode END_SYM() { return getToken(IndsqlParser.END_SYM, 0); }
		public TerminalNode CASE_SYM() { return getToken(IndsqlParser.CASE_SYM, 0); }
		public Case_when_statement1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_when_statement1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCase_when_statement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCase_when_statement1(this);
		}
	}

	public final Case_when_statement1Context case_when_statement1() throws RecognitionException {
		Case_when_statement1Context _localctx = new Case_when_statement1Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_case_when_statement1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739); match(CASE_SYM);
			setState(745); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(740); match(WHEN_SYM);
				setState(741); expression();
				setState(742); match(THEN_SYM);
				setState(743); bit_expr();
				}
				}
				setState(747); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN_SYM );
			setState(751);
			_la = _input.LA(1);
			if (_la==ELSE_SYM) {
				{
				setState(749); match(ELSE_SYM);
				setState(750); bit_expr();
				}
			}

			setState(753); match(END_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_when_statement2Context extends ParserRuleContext {
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public TerminalNode WHEN_SYM(int i) {
			return getToken(IndsqlParser.WHEN_SYM, i);
		}
		public List<TerminalNode> THEN_SYM() { return getTokens(IndsqlParser.THEN_SYM); }
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public TerminalNode ELSE_SYM() { return getToken(IndsqlParser.ELSE_SYM, 0); }
		public List<TerminalNode> WHEN_SYM() { return getTokens(IndsqlParser.WHEN_SYM); }
		public TerminalNode THEN_SYM(int i) {
			return getToken(IndsqlParser.THEN_SYM, i);
		}
		public TerminalNode END_SYM() { return getToken(IndsqlParser.END_SYM, 0); }
		public TerminalNode CASE_SYM() { return getToken(IndsqlParser.CASE_SYM, 0); }
		public Case_when_statement2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_when_statement2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCase_when_statement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCase_when_statement2(this);
		}
	}

	public final Case_when_statement2Context case_when_statement2() throws RecognitionException {
		Case_when_statement2Context _localctx = new Case_when_statement2Context(_ctx, getState());
		enterRule(_localctx, 114, RULE_case_when_statement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755); match(CASE_SYM);
			setState(756); bit_expr();
			setState(762); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(757); match(WHEN_SYM);
				setState(758); bit_expr();
				setState(759); match(THEN_SYM);
				setState(760); bit_expr();
				}
				}
				setState(764); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN_SYM );
			setState(768);
			_la = _input.LA(1);
			if (_la==ELSE_SYM) {
				{
				setState(766); match(ELSE_SYM);
				setState(767); bit_expr();
				}
			}

			setState(770); match(END_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Match_against_statementContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(IndsqlParser.MATCH, 0); }
		public Column_specContext column_spec(int i) {
			return getRuleContext(Column_specContext.class,i);
		}
		public Search_modifierContext search_modifier() {
			return getRuleContext(Search_modifierContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Column_specContext> column_spec() {
			return getRuleContexts(Column_specContext.class);
		}
		public TerminalNode AGAINST() { return getToken(IndsqlParser.AGAINST, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Match_against_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_against_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterMatch_against_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitMatch_against_statement(this);
		}
	}

	public final Match_against_statementContext match_against_statement() throws RecognitionException {
		Match_against_statementContext _localctx = new Match_against_statementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_match_against_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772); match(MATCH);
			{
			setState(773); column_spec();
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(774); match(COMMA);
				setState(775); column_spec();
				}
				}
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(781); match(AGAINST);
			{
			setState(782); expression();
			setState(784);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(783); search_modifier();
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_specContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(IndsqlParser.DOT); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT(int i) {
			return getToken(IndsqlParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Column_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterColumn_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitColumn_spec(this);
		}
	}

	public final Column_specContext column_spec() throws RecognitionException {
		Column_specContext _localctx = new Column_specContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_column_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(789);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(786); schema_name();
					setState(787); match(DOT);
					}
					break;
				}
				setState(791); table_name();
				setState(792); match(DOT);
				}
				break;
			}
			setState(796); column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798); match(LPAREN);
			setState(799); expression();
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(800); match(COMMA);
				setState(801); expression();
				}
				}
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(807); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_exprContext extends ParserRuleContext {
		public Interval_unitContext interval_unit() {
			return getRuleContext(Interval_unitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INTERVAL_SYM() { return getToken(IndsqlParser.INTERVAL_SYM, 0); }
		public Interval_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterInterval_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitInterval_expr(this);
		}
	}

	public final Interval_exprContext interval_expr() throws RecognitionException {
		Interval_exprContext _localctx = new Interval_exprContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_interval_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809); match(INTERVAL_SYM);
			setState(810); expression();
			setState(811); interval_unit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_referencesContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_references; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterTable_references(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitTable_references(this);
		}
	}

	public final Table_referencesContext table_references() throws RecognitionException {
		Table_referencesContext _localctx = new Table_referencesContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_table_references);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(813); table_reference();
			setState(818);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(814); match(COMMA);
					setState(815); table_reference();
					}
					} 
				}
				setState(820);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_referenceContext extends ParserRuleContext {
		public Table_atomContext table_atom() {
			return getRuleContext(Table_atomContext.class,0);
		}
		public Table_factor1Context table_factor1() {
			return getRuleContext(Table_factor1Context.class,0);
		}
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterTable_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitTable_reference(this);
		}
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_table_reference);
		try {
			setState(823);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(821); table_factor1();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(822); table_atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_factor1Context extends ParserRuleContext {
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public Table_atomContext table_atom() {
			return getRuleContext(Table_atomContext.class,0);
		}
		public Table_factor2Context table_factor2() {
			return getRuleContext(Table_factor2Context.class,0);
		}
		public TerminalNode CROSS() { return getToken(IndsqlParser.CROSS, 0); }
		public TerminalNode INNER_SYM() { return getToken(IndsqlParser.INNER_SYM, 0); }
		public TerminalNode JOIN_SYM() { return getToken(IndsqlParser.JOIN_SYM, 0); }
		public Table_factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterTable_factor1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitTable_factor1(this);
		}
	}

	public final Table_factor1Context table_factor1() throws RecognitionException {
		Table_factor1Context _localctx = new Table_factor1Context(_ctx, getState());
		enterRule(_localctx, 128, RULE_table_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825); table_factor2();
			setState(834);
			_la = _input.LA(1);
			if (_la==CROSS || _la==INNER_SYM || _la==JOIN_SYM) {
				{
				setState(827);
				_la = _input.LA(1);
				if (_la==CROSS || _la==INNER_SYM) {
					{
					setState(826);
					_la = _input.LA(1);
					if ( !(_la==CROSS || _la==INNER_SYM) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(829); match(JOIN_SYM);
				setState(830); table_atom();
				setState(832);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(831); join_condition();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_factor2Context extends ParserRuleContext {
		public TerminalNode STRAIGHT_JOIN() { return getToken(IndsqlParser.STRAIGHT_JOIN, 0); }
		public TerminalNode ON() { return getToken(IndsqlParser.ON, 0); }
		public Table_atomContext table_atom() {
			return getRuleContext(Table_atomContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Table_factor3Context table_factor3() {
			return getRuleContext(Table_factor3Context.class,0);
		}
		public Table_factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterTable_factor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitTable_factor2(this);
		}
	}

	public final Table_factor2Context table_factor2() throws RecognitionException {
		Table_factor2Context _localctx = new Table_factor2Context(_ctx, getState());
		enterRule(_localctx, 130, RULE_table_factor2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836); table_factor3();
			setState(843);
			_la = _input.LA(1);
			if (_la==STRAIGHT_JOIN) {
				{
				setState(837); match(STRAIGHT_JOIN);
				setState(838); table_atom();
				setState(841);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(839); match(ON);
					setState(840); expression();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_factor3Context extends ParserRuleContext {
		public TerminalNode OUTER() { return getToken(IndsqlParser.OUTER, 0); }
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public Table_factor4Context table_factor4(int i) {
			return getRuleContext(Table_factor4Context.class,i);
		}
		public TerminalNode LEFT() { return getToken(IndsqlParser.LEFT, 0); }
		public List<Table_factor4Context> table_factor4() {
			return getRuleContexts(Table_factor4Context.class);
		}
		public TerminalNode RIGHT() { return getToken(IndsqlParser.RIGHT, 0); }
		public TerminalNode JOIN_SYM() { return getToken(IndsqlParser.JOIN_SYM, 0); }
		public Table_factor3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterTable_factor3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitTable_factor3(this);
		}
	}

	public final Table_factor3Context table_factor3() throws RecognitionException {
		Table_factor3Context _localctx = new Table_factor3Context(_ctx, getState());
		enterRule(_localctx, 132, RULE_table_factor3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845); table_factor4();
			setState(854);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(846);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(848);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(847); match(OUTER);
					}
				}

				setState(850); match(JOIN_SYM);
				setState(851); table_factor4();
				setState(852); join_condition();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_factor4Context extends ParserRuleContext {
		public TerminalNode OUTER() { return getToken(IndsqlParser.OUTER, 0); }
		public TerminalNode NATURAL() { return getToken(IndsqlParser.NATURAL, 0); }
		public Table_atomContext table_atom(int i) {
			return getRuleContext(Table_atomContext.class,i);
		}
		public List<Table_atomContext> table_atom() {
			return getRuleContexts(Table_atomContext.class);
		}
		public TerminalNode LEFT() { return getToken(IndsqlParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(IndsqlParser.RIGHT, 0); }
		public TerminalNode JOIN_SYM() { return getToken(IndsqlParser.JOIN_SYM, 0); }
		public Table_factor4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterTable_factor4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitTable_factor4(this);
		}
	}

	public final Table_factor4Context table_factor4() throws RecognitionException {
		Table_factor4Context _localctx = new Table_factor4Context(_ctx, getState());
		enterRule(_localctx, 134, RULE_table_factor4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856); table_atom();
			setState(866);
			_la = _input.LA(1);
			if (_la==NATURAL) {
				{
				setState(857); match(NATURAL);
				setState(862);
				_la = _input.LA(1);
				if (_la==LEFT || _la==RIGHT) {
					{
					setState(858);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(860);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(859); match(OUTER);
						}
					}

					}
				}

				setState(864); match(JOIN_SYM);
				setState(865); table_atom();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_atomContext extends ParserRuleContext {
		public TerminalNode OUTER() { return getToken(IndsqlParser.OUTER, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public TerminalNode LEFT() { return getToken(IndsqlParser.LEFT, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public TerminalNode JOIN_SYM() { return getToken(IndsqlParser.JOIN_SYM, 0); }
		public TerminalNode ON() { return getToken(IndsqlParser.ON, 0); }
		public Partition_clauseContext partition_clause() {
			return getRuleContext(Partition_clauseContext.class,0);
		}
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public Index_hint_listContext index_hint_list() {
			return getRuleContext(Index_hint_listContext.class,0);
		}
		public TerminalNode OJ_SYM() { return getToken(IndsqlParser.OJ_SYM, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Table_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterTable_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitTable_atom(this);
		}
	}

	public final Table_atomContext table_atom() throws RecognitionException {
		Table_atomContext _localctx = new Table_atomContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_table_atom);
		int _la;
		try {
			setState(894);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(868); table_spec();
				setState(870);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(869); partition_clause();
					}
					break;
				}
				setState(873);
				_la = _input.LA(1);
				if (_la==AS_SYM || _la==ID) {
					{
					setState(872); alias();
					}
				}

				setState(876);
				_la = _input.LA(1);
				if (_la==FORCE_SYM || _la==IGNORE_SYM || _la==USE_SYM) {
					{
					setState(875); index_hint_list();
					}
				}

				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(878); subquery();
				setState(879); alias();
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(881); match(LPAREN);
				setState(882); table_references();
				setState(883); match(RPAREN);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(885); match(OJ_SYM);
				setState(886); table_reference();
				setState(887); match(LEFT);
				setState(888); match(OUTER);
				setState(889); match(JOIN_SYM);
				setState(890); table_reference();
				setState(891); match(ON);
				setState(892); expression();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_conditionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(IndsqlParser.ON, 0); }
		public TerminalNode USING_SYM() { return getToken(IndsqlParser.USING_SYM, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Join_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterJoin_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitJoin_condition(this);
		}
	}

	public final Join_conditionContext join_condition() throws RecognitionException {
		Join_conditionContext _localctx = new Join_conditionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_join_condition);
		try {
			setState(900);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(896); match(ON);
				setState(897); expression();
				}
				}
				break;
			case USING_SYM:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(898); match(USING_SYM);
				setState(899); column_list();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_hint_listContext extends ParserRuleContext {
		public Index_hintContext index_hint(int i) {
			return getRuleContext(Index_hintContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public List<Index_hintContext> index_hint() {
			return getRuleContexts(Index_hintContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Index_hint_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_hint_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterIndex_hint_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitIndex_hint_list(this);
		}
	}

	public final Index_hint_listContext index_hint_list() throws RecognitionException {
		Index_hint_listContext _localctx = new Index_hint_listContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_index_hint_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(902); index_hint();
			setState(907);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(903); match(COMMA);
					setState(904); index_hint();
					}
					} 
				}
				setState(909);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_optionsContext extends ParserRuleContext {
		public TerminalNode ORDER_SYM() { return getToken(IndsqlParser.ORDER_SYM, 0); }
		public TerminalNode GROUP_SYM() { return getToken(IndsqlParser.GROUP_SYM, 0); }
		public TerminalNode BY_SYM() { return getToken(IndsqlParser.BY_SYM, 0); }
		public TerminalNode INDEX_SYM() { return getToken(IndsqlParser.INDEX_SYM, 0); }
		public TerminalNode KEY_SYM() { return getToken(IndsqlParser.KEY_SYM, 0); }
		public TerminalNode FOR_SYM() { return getToken(IndsqlParser.FOR_SYM, 0); }
		public TerminalNode JOIN_SYM() { return getToken(IndsqlParser.JOIN_SYM, 0); }
		public Index_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterIndex_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitIndex_options(this);
		}
	}

	public final Index_optionsContext index_options() throws RecognitionException {
		Index_optionsContext _localctx = new Index_optionsContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_index_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			_la = _input.LA(1);
			if ( !(_la==INDEX_SYM || _la==KEY_SYM) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(919);
			_la = _input.LA(1);
			if (_la==FOR_SYM) {
				{
				setState(911); match(FOR_SYM);
				setState(917);
				switch (_input.LA(1)) {
				case JOIN_SYM:
					{
					{
					setState(912); match(JOIN_SYM);
					}
					}
					break;
				case ORDER_SYM:
					{
					{
					setState(913); match(ORDER_SYM);
					setState(914); match(BY_SYM);
					}
					}
					break;
				case GROUP_SYM:
					{
					{
					setState(915); match(GROUP_SYM);
					setState(916); match(BY_SYM);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_hintContext extends ParserRuleContext {
		public Index_optionsContext index_options() {
			return getRuleContext(Index_optionsContext.class,0);
		}
		public TerminalNode USE_SYM() { return getToken(IndsqlParser.USE_SYM, 0); }
		public Index_listContext index_list() {
			return getRuleContext(Index_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public TerminalNode FORCE_SYM() { return getToken(IndsqlParser.FORCE_SYM, 0); }
		public TerminalNode IGNORE_SYM() { return getToken(IndsqlParser.IGNORE_SYM, 0); }
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public Index_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterIndex_hint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitIndex_hint(this);
		}
	}

	public final Index_hintContext index_hint() throws RecognitionException {
		Index_hintContext _localctx = new Index_hintContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_index_hint);
		int _la;
		try {
			setState(941);
			switch (_input.LA(1)) {
			case USE_SYM:
				enterOuterAlt(_localctx, 1);
				{
				setState(921); match(USE_SYM);
				setState(922); index_options();
				setState(923); match(LPAREN);
				setState(925);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(924); index_list();
					}
				}

				setState(927); match(RPAREN);
				}
				break;
			case IGNORE_SYM:
				enterOuterAlt(_localctx, 2);
				{
				setState(929); match(IGNORE_SYM);
				setState(930); index_options();
				setState(931); match(LPAREN);
				setState(932); index_list();
				setState(933); match(RPAREN);
				}
				break;
			case FORCE_SYM:
				enterOuterAlt(_localctx, 3);
				{
				setState(935); match(FORCE_SYM);
				setState(936); index_options();
				setState(937); match(LPAREN);
				setState(938); index_list();
				setState(939); match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public List<Index_nameContext> index_name() {
			return getRuleContexts(Index_nameContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Index_nameContext index_name(int i) {
			return getRuleContext(Index_nameContext.class,i);
		}
		public Index_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterIndex_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitIndex_list(this);
		}
	}

	public final Index_listContext index_list() throws RecognitionException {
		Index_listContext _localctx = new Index_listContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_index_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943); index_name();
			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(944); match(COMMA);
				setState(945); index_name();
				}
				}
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_clauseContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public Partition_namesContext partition_names() {
			return getRuleContext(Partition_namesContext.class,0);
		}
		public TerminalNode PARTITION_SYM() { return getToken(IndsqlParser.PARTITION_SYM, 0); }
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public Partition_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterPartition_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitPartition_clause(this);
		}
	}

	public final Partition_clauseContext partition_clause() throws RecognitionException {
		Partition_clauseContext _localctx = new Partition_clauseContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_partition_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951); match(PARTITION_SYM);
			setState(952); match(LPAREN);
			setState(953); partition_names();
			setState(954); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_namesContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public Partition_nameContext partition_name(int i) {
			return getRuleContext(Partition_nameContext.class,i);
		}
		public List<Partition_nameContext> partition_name() {
			return getRuleContexts(Partition_nameContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Partition_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterPartition_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitPartition_names(this);
		}
	}

	public final Partition_namesContext partition_names() throws RecognitionException {
		Partition_namesContext _localctx = new Partition_namesContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_partition_names);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(956); partition_name();
			setState(961);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(957); match(COMMA);
					setState(958); partition_name();
					}
					} 
				}
				setState(963);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Root_statementContext extends ParserRuleContext {
		public Data_manipulation_statementsContext data_manipulation_statements() {
			return getRuleContext(Data_manipulation_statementsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(IndsqlParser.SEMI, 0); }
		public TerminalNode SHIFT_RIGHT() { return getToken(IndsqlParser.SHIFT_RIGHT, 0); }
		public TerminalNode SHIFT_LEFT() { return getToken(IndsqlParser.SHIFT_LEFT, 0); }
		public Data_definition_statementsContext data_definition_statements() {
			return getRuleContext(Data_definition_statementsContext.class,0);
		}
		public Root_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterRoot_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitRoot_statement(this);
		}
	}

	public final Root_statementContext root_statement() throws RecognitionException {
		Root_statementContext _localctx = new Root_statementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_root_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			_la = _input.LA(1);
			if (_la==SHIFT_LEFT) {
				{
				setState(964); match(SHIFT_LEFT);
				setState(965); match(SHIFT_RIGHT);
				}
			}

			setState(970);
			switch (_input.LA(1)) {
			case CALL_SYM:
			case DELETE_SYM:
			case DO_SYM:
			case HANDLER_SYM:
			case INSERT:
			case LOAD:
			case REPLACE:
			case SELECT:
			case UPDATE:
				{
				setState(968); data_manipulation_statements();
				}
				break;
			case ALTER:
			case CREATE:
			case DROP:
			case RENAME:
			case TRUNCATE:
				{
				setState(969); data_definition_statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(973);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(972); match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_manipulation_statementsContext extends ParserRuleContext {
		public Delete_statementsContext delete_statements() {
			return getRuleContext(Delete_statementsContext.class,0);
		}
		public Insert_statementsContext insert_statements() {
			return getRuleContext(Insert_statementsContext.class,0);
		}
		public Replace_statementContext replace_statement() {
			return getRuleContext(Replace_statementContext.class,0);
		}
		public Handler_statementsContext handler_statements() {
			return getRuleContext(Handler_statementsContext.class,0);
		}
		public Call_statementContext call_statement() {
			return getRuleContext(Call_statementContext.class,0);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Load_data_statementContext load_data_statement() {
			return getRuleContext(Load_data_statementContext.class,0);
		}
		public Do_statementContext do_statement() {
			return getRuleContext(Do_statementContext.class,0);
		}
		public Load_xml_statementContext load_xml_statement() {
			return getRuleContext(Load_xml_statementContext.class,0);
		}
		public Update_statementsContext update_statements() {
			return getRuleContext(Update_statementsContext.class,0);
		}
		public Data_manipulation_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_manipulation_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterData_manipulation_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitData_manipulation_statements(this);
		}
	}

	public final Data_manipulation_statementsContext data_manipulation_statements() throws RecognitionException {
		Data_manipulation_statementsContext _localctx = new Data_manipulation_statementsContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_data_manipulation_statements);
		try {
			setState(985);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(975); select_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(976); delete_statements();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(977); insert_statements();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(978); update_statements();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(979); call_statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(980); do_statement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(981); handler_statements();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(982); load_data_statement();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(983); load_xml_statement();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(984); replace_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_definition_statementsContext extends ParserRuleContext {
		public Drop_view_statementContext drop_view_statement() {
			return getRuleContext(Drop_view_statementContext.class,0);
		}
		public Drop_event_statementContext drop_event_statement() {
			return getRuleContext(Drop_event_statementContext.class,0);
		}
		public Create_server_statementContext create_server_statement() {
			return getRuleContext(Create_server_statementContext.class,0);
		}
		public Truncate_table_statementContext truncate_table_statement() {
			return getRuleContext(Truncate_table_statementContext.class,0);
		}
		public Create_event_statementContext create_event_statement() {
			return getRuleContext(Create_event_statementContext.class,0);
		}
		public Create_database_statementContext create_database_statement() {
			return getRuleContext(Create_database_statementContext.class,0);
		}
		public Alter_table_statementContext alter_table_statement() {
			return getRuleContext(Alter_table_statementContext.class,0);
		}
		public Create_index_statementContext create_index_statement() {
			return getRuleContext(Create_index_statementContext.class,0);
		}
		public Drop_server_statementContext drop_server_statement() {
			return getRuleContext(Drop_server_statementContext.class,0);
		}
		public Alter_event_statementContext alter_event_statement() {
			return getRuleContext(Alter_event_statementContext.class,0);
		}
		public Create_view_statementContext create_view_statement() {
			return getRuleContext(Create_view_statementContext.class,0);
		}
		public Alter_server_statementContext alter_server_statement() {
			return getRuleContext(Alter_server_statementContext.class,0);
		}
		public Create_table_statementContext create_table_statement() {
			return getRuleContext(Create_table_statementContext.class,0);
		}
		public Drop_index_statementContext drop_index_statement() {
			return getRuleContext(Drop_index_statementContext.class,0);
		}
		public Alter_database_statementsContext alter_database_statements() {
			return getRuleContext(Alter_database_statementsContext.class,0);
		}
		public Drop_table_statementContext drop_table_statement() {
			return getRuleContext(Drop_table_statementContext.class,0);
		}
		public Rename_table_statementContext rename_table_statement() {
			return getRuleContext(Rename_table_statementContext.class,0);
		}
		public Drop_database_statementContext drop_database_statement() {
			return getRuleContext(Drop_database_statementContext.class,0);
		}
		public Alter_view_statementContext alter_view_statement() {
			return getRuleContext(Alter_view_statementContext.class,0);
		}
		public Data_definition_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_definition_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterData_definition_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitData_definition_statements(this);
		}
	}

	public final Data_definition_statementsContext data_definition_statements() throws RecognitionException {
		Data_definition_statementsContext _localctx = new Data_definition_statementsContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_data_definition_statements);
		try {
			setState(1006);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(987); create_database_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(988); alter_database_statements();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(989); drop_database_statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(990); create_event_statement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(991); alter_event_statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(992); drop_event_statement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(993); create_server_statement();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(994); alter_server_statement();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(995); drop_server_statement();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(996); create_table_statement();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(997); alter_table_statement();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(998); drop_table_statement();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(999); create_view_statement();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1000); alter_view_statement();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1001); rename_table_statement();
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1002); drop_view_statement();
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1003); truncate_table_statement();
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1004); create_index_statement();
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1005); drop_index_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_statementContext extends ParserRuleContext {
		public List<TerminalNode> ALL() { return getTokens(IndsqlParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(IndsqlParser.ALL, i);
		}
		public TerminalNode UNION_SYM(int i) {
			return getToken(IndsqlParser.UNION_SYM, i);
		}
		public List<Select_expressionContext> select_expression() {
			return getRuleContexts(Select_expressionContext.class);
		}
		public Select_expressionContext select_expression(int i) {
			return getRuleContext(Select_expressionContext.class,i);
		}
		public List<TerminalNode> UNION_SYM() { return getTokens(IndsqlParser.UNION_SYM); }
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitSelect_statement(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008); select_expression();
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION_SYM) {
				{
				{
				{
				setState(1009); match(UNION_SYM);
				setState(1011);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(1010); match(ALL);
					}
				}

				}
				setState(1013); select_expression();
				}
				}
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_expressionContext extends ParserRuleContext {
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode LOCK() { return getToken(IndsqlParser.LOCK, 0); }
		public TerminalNode STRAIGHT_JOIN() { return getToken(IndsqlParser.STRAIGHT_JOIN, 0); }
		public TerminalNode SQL_CALC_FOUND_ROWS() { return getToken(IndsqlParser.SQL_CALC_FOUND_ROWS, 0); }
		public TerminalNode SQL_CACHE_SYM() { return getToken(IndsqlParser.SQL_CACHE_SYM, 0); }
		public Partition_clauseContext partition_clause() {
			return getRuleContext(Partition_clauseContext.class,0);
		}
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(IndsqlParser.UPDATE, 0); }
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(IndsqlParser.FROM, 0); }
		public TerminalNode SHARE_SYM() { return getToken(IndsqlParser.SHARE_SYM, 0); }
		public TerminalNode ALL() { return getToken(IndsqlParser.ALL, 0); }
		public TerminalNode HIGH_PRIORITY() { return getToken(IndsqlParser.HIGH_PRIORITY, 0); }
		public TerminalNode SQL_NO_CACHE_SYM() { return getToken(IndsqlParser.SQL_NO_CACHE_SYM, 0); }
		public TerminalNode SELECT() { return getToken(IndsqlParser.SELECT, 0); }
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public TerminalNode IN_SYM() { return getToken(IndsqlParser.IN_SYM, 0); }
		public TerminalNode SQL_BIG_RESULT() { return getToken(IndsqlParser.SQL_BIG_RESULT, 0); }
		public Groupby_clauseContext groupby_clause() {
			return getRuleContext(Groupby_clauseContext.class,0);
		}
		public TerminalNode SQL_SMALL_RESULT() { return getToken(IndsqlParser.SQL_SMALL_RESULT, 0); }
		public TerminalNode DISTINCT() { return getToken(IndsqlParser.DISTINCT, 0); }
		public TerminalNode DISTINCTROW() { return getToken(IndsqlParser.DISTINCTROW, 0); }
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode FOR_SYM() { return getToken(IndsqlParser.FOR_SYM, 0); }
		public TerminalNode MODE_SYM() { return getToken(IndsqlParser.MODE_SYM, 0); }
		public TerminalNode SQL_BUFFER_RESULT() { return getToken(IndsqlParser.SQL_BUFFER_RESULT, 0); }
		public Select_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterSelect_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitSelect_expression(this);
		}
	}

	public final Select_expressionContext select_expression() throws RecognitionException {
		Select_expressionContext _localctx = new Select_expressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_select_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019); match(SELECT);
			setState(1021);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT || _la==DISTINCTROW) {
				{
				setState(1020);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT || _la==DISTINCTROW) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1024);
			_la = _input.LA(1);
			if (_la==HIGH_PRIORITY) {
				{
				setState(1023); match(HIGH_PRIORITY);
				}
			}

			setState(1027);
			_la = _input.LA(1);
			if (_la==STRAIGHT_JOIN) {
				{
				setState(1026); match(STRAIGHT_JOIN);
				}
			}

			setState(1030);
			_la = _input.LA(1);
			if (_la==SQL_SMALL_RESULT) {
				{
				setState(1029); match(SQL_SMALL_RESULT);
				}
			}

			setState(1033);
			_la = _input.LA(1);
			if (_la==SQL_BIG_RESULT) {
				{
				setState(1032); match(SQL_BIG_RESULT);
				}
			}

			setState(1036);
			_la = _input.LA(1);
			if (_la==SQL_BUFFER_RESULT) {
				{
				setState(1035); match(SQL_BUFFER_RESULT);
				}
			}

			setState(1039);
			_la = _input.LA(1);
			if (_la==SQL_CACHE_SYM || _la==SQL_NO_CACHE_SYM) {
				{
				setState(1038);
				_la = _input.LA(1);
				if ( !(_la==SQL_CACHE_SYM || _la==SQL_NO_CACHE_SYM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1042);
			_la = _input.LA(1);
			if (_la==SQL_CALC_FOUND_ROWS) {
				{
				setState(1041); match(SQL_CALC_FOUND_ROWS);
				}
			}

			setState(1044); select_list();
			setState(1059);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1045); match(FROM);
				setState(1046); table_references();
				setState(1048);
				_la = _input.LA(1);
				if (_la==PARTITION_SYM) {
					{
					setState(1047); partition_clause();
					}
				}

				setState(1051);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1050); where_clause();
					}
				}

				setState(1054);
				_la = _input.LA(1);
				if (_la==GROUP_SYM) {
					{
					setState(1053); groupby_clause();
					}
				}

				setState(1057);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(1056); having_clause();
					}
				}

				}
			}

			setState(1062);
			_la = _input.LA(1);
			if (_la==ORDER_SYM) {
				{
				setState(1061); orderby_clause();
				}
			}

			setState(1065);
			_la = _input.LA(1);
			if (_la==LIMIT || _la==INTEGER_NUM) {
				{
				setState(1064); limit_clause();
				}
			}

			setState(1073);
			switch (_input.LA(1)) {
			case FOR_SYM:
				{
				{
				setState(1067); match(FOR_SYM);
				setState(1068); match(UPDATE);
				}
				}
				break;
			case LOCK:
				{
				{
				setState(1069); match(LOCK);
				setState(1070); match(IN_SYM);
				setState(1071); match(SHARE_SYM);
				setState(1072); match(MODE_SYM);
				}
				}
				break;
			case ON:
			case UNION_SYM:
			case WITH:
			case SEMI:
			case COMMA:
			case RPAREN:
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(IndsqlParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitWhere_clause(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075); match(WHERE);
			setState(1076); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Groupby_clauseContext extends ParserRuleContext {
		public List<Groupby_itemContext> groupby_item() {
			return getRuleContexts(Groupby_itemContext.class);
		}
		public Groupby_itemContext groupby_item(int i) {
			return getRuleContext(Groupby_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public TerminalNode BY_SYM() { return getToken(IndsqlParser.BY_SYM, 0); }
		public TerminalNode GROUP_SYM() { return getToken(IndsqlParser.GROUP_SYM, 0); }
		public TerminalNode ROLLUP_SYM() { return getToken(IndsqlParser.ROLLUP_SYM, 0); }
		public TerminalNode WITH() { return getToken(IndsqlParser.WITH, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Groupby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterGroupby_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitGroupby_clause(this);
		}
	}

	public final Groupby_clauseContext groupby_clause() throws RecognitionException {
		Groupby_clauseContext _localctx = new Groupby_clauseContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_groupby_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1078); match(GROUP_SYM);
			setState(1079); match(BY_SYM);
			setState(1080); groupby_item();
			setState(1085);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1081); match(COMMA);
					setState(1082); groupby_item();
					}
					} 
				}
				setState(1087);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			setState(1090);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1088); match(WITH);
				setState(1089); match(ROLLUP_SYM);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Groupby_itemContext extends ParserRuleContext {
		public Bit_exprContext bit_expr() {
			return getRuleContext(Bit_exprContext.class,0);
		}
		public TerminalNode INTEGER_NUM() { return getToken(IndsqlParser.INTEGER_NUM, 0); }
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public Groupby_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterGroupby_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitGroupby_item(this);
		}
	}

	public final Groupby_itemContext groupby_item() throws RecognitionException {
		Groupby_itemContext _localctx = new Groupby_itemContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_groupby_item);
		try {
			setState(1095);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1092); column_spec();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1093); match(INTEGER_NUM);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1094); bit_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(IndsqlParser.HAVING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitHaving_clause(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097); match(HAVING);
			setState(1098); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_clauseContext extends ParserRuleContext {
		public Orderby_itemContext orderby_item(int i) {
			return getRuleContext(Orderby_itemContext.class,i);
		}
		public TerminalNode ORDER_SYM() { return getToken(IndsqlParser.ORDER_SYM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public TerminalNode BY_SYM() { return getToken(IndsqlParser.BY_SYM, 0); }
		public List<Orderby_itemContext> orderby_item() {
			return getRuleContexts(Orderby_itemContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Orderby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterOrderby_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitOrderby_clause(this);
		}
	}

	public final Orderby_clauseContext orderby_clause() throws RecognitionException {
		Orderby_clauseContext _localctx = new Orderby_clauseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_orderby_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1100); match(ORDER_SYM);
			setState(1101); match(BY_SYM);
			setState(1102); orderby_item();
			setState(1107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1103); match(COMMA);
					setState(1104); orderby_item();
					}
					} 
				}
				setState(1109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_itemContext extends ParserRuleContext {
		public Groupby_itemContext groupby_item() {
			return getRuleContext(Groupby_itemContext.class,0);
		}
		public TerminalNode DESC() { return getToken(IndsqlParser.DESC, 0); }
		public TerminalNode ASC() { return getToken(IndsqlParser.ASC, 0); }
		public Orderby_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterOrderby_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitOrderby_item(this);
		}
	}

	public final Orderby_itemContext orderby_item() throws RecognitionException {
		Orderby_itemContext _localctx = new Orderby_itemContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_orderby_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110); groupby_item();
			setState(1112);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1111);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Limit_clauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(IndsqlParser.LIMIT, 0); }
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(IndsqlParser.COMMA, 0); }
		public Row_countContext row_count() {
			return getRuleContext(Row_countContext.class,0);
		}
		public TerminalNode OFFSET_SYM() { return getToken(IndsqlParser.OFFSET_SYM, 0); }
		public Limit_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterLimit_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitLimit_clause(this);
		}
	}

	public final Limit_clauseContext limit_clause() throws RecognitionException {
		Limit_clauseContext _localctx = new Limit_clauseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_limit_clause);
		try {
			setState(1125);
			switch (_input.LA(1)) {
			case LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1114); match(LIMIT);
				{
				setState(1118);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(1115); offset();
					setState(1116); match(COMMA);
					}
					break;
				}
				setState(1120); row_count();
				}
				}
				break;
			case INTEGER_NUM:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1121); row_count();
				setState(1122); match(OFFSET_SYM);
				setState(1123); offset();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(IndsqlParser.INTEGER_NUM, 0); }
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitOffset(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127); match(INTEGER_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_countContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(IndsqlParser.INTEGER_NUM, 0); }
		public Row_countContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_count; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterRow_count(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitRow_count(this);
		}
	}

	public final Row_countContext row_count() throws RecognitionException {
		Row_countContext _localctx = new Row_countContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_row_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1129); match(INTEGER_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(IndsqlParser.ASTERISK, 0); }
		public TerminalNode COMMA() { return getToken(IndsqlParser.COMMA, 0); }
		public Displayed_columnContext displayed_column() {
			return getRuleContext(Displayed_columnContext.class,0);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitSelect_list(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			switch (_input.LA(1)) {
			case ABS:
			case ACOS:
			case ADDDATE:
			case ADDTIME:
			case AES_DECRYPT:
			case AES_ENCRYPT:
			case ASCII_SYM:
			case ASIN:
			case ATAN:
			case ATAN2:
			case AVG:
			case BENCHMARK:
			case BIN:
			case BINARY:
			case BIT_AND:
			case BIT_LENGTH:
			case BIT_OR:
			case BIT_XOR:
			case CASE_SYM:
			case CAST_SYM:
			case CEIL:
			case CEILING:
			case CHAR:
			case CHAR_LENGTH:
			case CHARSET:
			case COERCIBILITY:
			case COLLATION:
			case CONCAT:
			case CONCAT_WS:
			case CONNECTION_ID:
			case CONV:
			case CONVERT_SYM:
			case CONVERT_TZ:
			case COS:
			case COT:
			case COUNT:
			case CRC32:
			case CURDATE:
			case CURRENT_USER:
			case CURTIME:
			case DATABASE:
			case DATE_ADD:
			case DATE_FORMAT:
			case DATE_SUB:
			case DATE_SYM:
			case DATEDIFF:
			case DAYNAME:
			case DAYOFMONTH:
			case DAYOFWEEK:
			case DAYOFYEAR:
			case DECODE:
			case DEFAULT:
			case DEGREES:
			case DES_DECRYPT:
			case DES_ENCRYPT:
			case ELT:
			case ENCODE:
			case ENCRYPT:
			case EXISTS:
			case EXP:
			case EXPORT_SET:
			case EXTRACT:
			case FALSE_SYM:
			case FIELD:
			case FIND_IN_SET:
			case FLOOR:
			case FORMAT:
			case FOUND_ROWS:
			case FROM_BASE64:
			case FROM_DAYS:
			case FROM_UNIXTIME:
			case GET_FORMAT:
			case GET_LOCK:
			case GROUP_CONCAT:
			case HEX:
			case HOUR:
			case IF:
			case IFNULL:
			case INET_ATON:
			case INET_NTOA:
			case INSERT:
			case INSTR:
			case INTERVAL_SYM:
			case IS_FREE_LOCK:
			case IS_USED_LOCK:
			case LAST_DAY:
			case LAST_INSERT_ID:
			case LEFT:
			case LENGTH:
			case LN:
			case LOAD_FILE:
			case LOCATE:
			case LOG:
			case LOG10:
			case LOG2:
			case LOWER:
			case LPAD:
			case LTRIM:
			case MAKE_SET:
			case MAKEDATE:
			case MAKETIME:
			case MASTER_POS_WAIT:
			case MATCH:
			case MAX_SYM:
			case MD5:
			case MICROSECOND:
			case MID:
			case MIN_SYM:
			case MINUTE:
			case MOD:
			case MONTH:
			case MONTHNAME:
			case NAME_CONST:
			case NOW:
			case NULL_SYM:
			case OCT:
			case OLD_PASSWORD:
			case ORD:
			case PASSWORD:
			case PERIOD_ADD:
			case PERIOD_DIFF:
			case PI:
			case POW:
			case POWER:
			case QUARTER:
			case QUOTE:
			case RADIANS:
			case RAND:
			case RELEASE_LOCK:
			case REPEAT:
			case REPLACE:
			case REVERSE:
			case RIGHT:
			case ROUND:
			case ROW_SYM:
			case RPAD:
			case RTRIM:
			case SCHEMA:
			case SEC_TO_TIME:
			case SECOND:
			case SESSION_USER:
			case SIGN:
			case SIN:
			case SLEEP:
			case SOUNDEX:
			case SPACE:
			case SQRT:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case STR_TO_DATE:
			case STRCMP:
			case SUBSTRING:
			case SUBSTRING_INDEX:
			case SUBTIME:
			case SUM:
			case SYSDATE:
			case SYSTEM_USER:
			case TAN:
			case TIME_FORMAT:
			case TIME_SYM:
			case TIME_TO_SEC:
			case TIMEDIFF:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TO_BASE64:
			case TO_DAYS:
			case TO_SECONDS:
			case TRIM:
			case TRUE_SYM:
			case TRUNCATE:
			case UNHEX:
			case UNIX_TIMESTAMP:
			case UPPER:
			case USER:
			case UTC_DATE:
			case UTC_TIME:
			case UTC_TIMESTAMP:
			case UUID:
			case VALUES:
			case VAR_POP:
			case VAR_SAMP:
			case VARIANCE:
			case VERSION_SYM:
			case WEEK:
			case WEEKDAY:
			case WEEKOFYEAR:
			case WEIGHT_STRING:
			case YEAR:
			case YEARWEEK:
			case LPAREN:
			case PLUS:
			case MINUS:
			case NEGATION:
			case INTEGER_NUM:
			case HEX_DIGIT:
			case BIT_NUM:
			case REAL_NUMBER:
			case TEXT_STRING:
			case ID:
			case USER_VAR:
				{
				{
				setState(1131); displayed_column();
				setState(1136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1132); match(COMMA);
						setState(1133); displayed_column();
						}
						} 
					}
					setState(1138);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				}
				}
				break;
			case ASTERISK:
				{
				setState(1139); match(ASTERISK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_listContext extends ParserRuleContext {
		public Column_specContext column_spec(int i) {
			return getRuleContext(Column_specContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public List<Column_specContext> column_spec() {
			return getRuleContexts(Column_specContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterColumn_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitColumn_list(this);
		}
	}

	public final Column_listContext column_list() throws RecognitionException {
		Column_listContext _localctx = new Column_listContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142); match(LPAREN);
			setState(1143); column_spec();
			setState(1148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1144); match(COMMA);
				setState(1145); column_spec();
				}
				}
				setState(1150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1151); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitSubquery(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153); match(LPAREN);
			setState(1154); select_statement();
			setState(1155); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_specContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(IndsqlParser.DOT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Table_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterTable_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitTable_spec(this);
		}
	}

	public final Table_specContext table_spec() throws RecognitionException {
		Table_specContext _localctx = new Table_specContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_table_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1157); schema_name();
				setState(1158); match(DOT);
				}
				break;
			}
			setState(1162); table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Displayed_columnContext extends ParserRuleContext {
		public Bit_exprContext bit_expr() {
			return getRuleContext(Bit_exprContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(IndsqlParser.ASTERISK, 0); }
		public TerminalNode DOT() { return getToken(IndsqlParser.DOT, 0); }
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Displayed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterDisplayed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitDisplayed_column(this);
		}
	}

	public final Displayed_columnContext displayed_column() throws RecognitionException {
		Displayed_columnContext _localctx = new Displayed_columnContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_displayed_column);
		int _la;
		try {
			setState(1176);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1164); table_spec();
				setState(1165); match(DOT);
				setState(1166); match(ASTERISK);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1168); column_spec();
				setState(1170);
				_la = _input.LA(1);
				if (_la==AS_SYM || _la==ID) {
					{
					setState(1169); alias();
					}
				}

				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1172); bit_expr();
				setState(1174);
				_la = _input.LA(1);
				if (_la==AS_SYM || _la==ID) {
					{
					setState(1173); alias();
					}
				}

				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_statementsContext extends ParserRuleContext {
		public TerminalNode LOW_PRIORITY() { return getToken(IndsqlParser.LOW_PRIORITY, 0); }
		public TerminalNode QUICK() { return getToken(IndsqlParser.QUICK, 0); }
		public Delete_multiple_table_statement1Context delete_multiple_table_statement1() {
			return getRuleContext(Delete_multiple_table_statement1Context.class,0);
		}
		public TerminalNode DELETE_SYM() { return getToken(IndsqlParser.DELETE_SYM, 0); }
		public TerminalNode IGNORE_SYM() { return getToken(IndsqlParser.IGNORE_SYM, 0); }
		public Delete_multiple_table_statement2Context delete_multiple_table_statement2() {
			return getRuleContext(Delete_multiple_table_statement2Context.class,0);
		}
		public Delete_single_table_statementContext delete_single_table_statement() {
			return getRuleContext(Delete_single_table_statementContext.class,0);
		}
		public Delete_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterDelete_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitDelete_statements(this);
		}
	}

	public final Delete_statementsContext delete_statements() throws RecognitionException {
		Delete_statementsContext _localctx = new Delete_statementsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_delete_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178); match(DELETE_SYM);
			setState(1180);
			_la = _input.LA(1);
			if (_la==LOW_PRIORITY) {
				{
				setState(1179); match(LOW_PRIORITY);
				}
			}

			setState(1183);
			_la = _input.LA(1);
			if (_la==QUICK) {
				{
				setState(1182); match(QUICK);
				}
			}

			setState(1186);
			_la = _input.LA(1);
			if (_la==IGNORE_SYM) {
				{
				setState(1185); match(IGNORE_SYM);
				}
			}

			setState(1191);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1188); delete_single_table_statement();
				}
				break;

			case 2:
				{
				setState(1189); delete_multiple_table_statement1();
				}
				break;

			case 3:
				{
				setState(1190); delete_multiple_table_statement2();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_single_table_statementContext extends ParserRuleContext {
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Partition_clauseContext partition_clause() {
			return getRuleContext(Partition_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode FROM() { return getToken(IndsqlParser.FROM, 0); }
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Delete_single_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_single_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterDelete_single_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitDelete_single_table_statement(this);
		}
	}

	public final Delete_single_table_statementContext delete_single_table_statement() throws RecognitionException {
		Delete_single_table_statementContext _localctx = new Delete_single_table_statementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_delete_single_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193); match(FROM);
			setState(1194); table_spec();
			setState(1196);
			_la = _input.LA(1);
			if (_la==PARTITION_SYM) {
				{
				setState(1195); partition_clause();
				}
			}

			setState(1199);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1198); where_clause();
				}
			}

			setState(1202);
			_la = _input.LA(1);
			if (_la==ORDER_SYM) {
				{
				setState(1201); orderby_clause();
				}
			}

			setState(1205);
			_la = _input.LA(1);
			if (_la==LIMIT || _la==INTEGER_NUM) {
				{
				setState(1204); limit_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_multiple_table_statement1Context extends ParserRuleContext {
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Table_specContext table_spec(int i) {
			return getRuleContext(Table_specContext.class,i);
		}
		public TerminalNode ALL_FIELDS(int i) {
			return getToken(IndsqlParser.ALL_FIELDS, i);
		}
		public List<TerminalNode> ALL_FIELDS() { return getTokens(IndsqlParser.ALL_FIELDS); }
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public List<Table_specContext> table_spec() {
			return getRuleContexts(Table_specContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public TerminalNode FROM() { return getToken(IndsqlParser.FROM, 0); }
		public Delete_multiple_table_statement1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_multiple_table_statement1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterDelete_multiple_table_statement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitDelete_multiple_table_statement1(this);
		}
	}

	public final Delete_multiple_table_statement1Context delete_multiple_table_statement1() throws RecognitionException {
		Delete_multiple_table_statement1Context _localctx = new Delete_multiple_table_statement1Context(_ctx, getState());
		enterRule(_localctx, 194, RULE_delete_multiple_table_statement1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207); table_spec();
			setState(1209);
			_la = _input.LA(1);
			if (_la==ALL_FIELDS) {
				{
				setState(1208); match(ALL_FIELDS);
				}
			}

			setState(1218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1211); match(COMMA);
				setState(1212); table_spec();
				setState(1214);
				_la = _input.LA(1);
				if (_la==ALL_FIELDS) {
					{
					setState(1213); match(ALL_FIELDS);
					}
				}

				}
				}
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1221); match(FROM);
			setState(1222); table_references();
			setState(1224);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1223); where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_multiple_table_statement2Context extends ParserRuleContext {
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Table_specContext table_spec(int i) {
			return getRuleContext(Table_specContext.class,i);
		}
		public TerminalNode USING_SYM() { return getToken(IndsqlParser.USING_SYM, 0); }
		public TerminalNode ALL_FIELDS(int i) {
			return getToken(IndsqlParser.ALL_FIELDS, i);
		}
		public List<TerminalNode> ALL_FIELDS() { return getTokens(IndsqlParser.ALL_FIELDS); }
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public List<Table_specContext> table_spec() {
			return getRuleContexts(Table_specContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public TerminalNode FROM() { return getToken(IndsqlParser.FROM, 0); }
		public Delete_multiple_table_statement2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_multiple_table_statement2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterDelete_multiple_table_statement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitDelete_multiple_table_statement2(this);
		}
	}

	public final Delete_multiple_table_statement2Context delete_multiple_table_statement2() throws RecognitionException {
		Delete_multiple_table_statement2Context _localctx = new Delete_multiple_table_statement2Context(_ctx, getState());
		enterRule(_localctx, 196, RULE_delete_multiple_table_statement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226); match(FROM);
			setState(1227); table_spec();
			setState(1229);
			_la = _input.LA(1);
			if (_la==ALL_FIELDS) {
				{
				setState(1228); match(ALL_FIELDS);
				}
			}

			setState(1238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1231); match(COMMA);
				setState(1232); table_spec();
				setState(1234);
				_la = _input.LA(1);
				if (_la==ALL_FIELDS) {
					{
					setState(1233); match(ALL_FIELDS);
					}
				}

				}
				}
				setState(1240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1241); match(USING_SYM);
			setState(1242); table_references();
			setState(1244);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1243); where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statementsContext extends ParserRuleContext {
		public Insert_statement1Context insert_statement1() {
			return getRuleContext(Insert_statement1Context.class,0);
		}
		public Insert_statement2Context insert_statement2() {
			return getRuleContext(Insert_statement2Context.class,0);
		}
		public Insert_statement3Context insert_statement3() {
			return getRuleContext(Insert_statement3Context.class,0);
		}
		public Insert_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterInsert_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitInsert_statements(this);
		}
	}

	public final Insert_statementsContext insert_statements() throws RecognitionException {
		Insert_statementsContext _localctx = new Insert_statementsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_insert_statements);
		try {
			setState(1249);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1246); insert_statement1();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1247); insert_statement2();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1248); insert_statement3();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_headerContext extends ParserRuleContext {
		public TerminalNode LOW_PRIORITY() { return getToken(IndsqlParser.LOW_PRIORITY, 0); }
		public TerminalNode HIGH_PRIORITY() { return getToken(IndsqlParser.HIGH_PRIORITY, 0); }
		public Partition_clauseContext partition_clause() {
			return getRuleContext(Partition_clauseContext.class,0);
		}
		public TerminalNode INTO() { return getToken(IndsqlParser.INTO, 0); }
		public TerminalNode INSERT() { return getToken(IndsqlParser.INSERT, 0); }
		public TerminalNode IGNORE_SYM() { return getToken(IndsqlParser.IGNORE_SYM, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public Insert_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterInsert_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitInsert_header(this);
		}
	}

	public final Insert_headerContext insert_header() throws RecognitionException {
		Insert_headerContext _localctx = new Insert_headerContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_insert_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251); match(INSERT);
			setState(1253);
			_la = _input.LA(1);
			if (_la==HIGH_PRIORITY || _la==LOW_PRIORITY) {
				{
				setState(1252);
				_la = _input.LA(1);
				if ( !(_la==HIGH_PRIORITY || _la==LOW_PRIORITY) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1256);
			_la = _input.LA(1);
			if (_la==IGNORE_SYM) {
				{
				setState(1255); match(IGNORE_SYM);
				}
			}

			setState(1259);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1258); match(INTO);
				}
			}

			setState(1261); table_spec();
			setState(1263);
			_la = _input.LA(1);
			if (_la==PARTITION_SYM) {
				{
				setState(1262); partition_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_subfixContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DUPLICATE_SYM() { return getToken(IndsqlParser.DUPLICATE_SYM, 0); }
		public TerminalNode ON() { return getToken(IndsqlParser.ON, 0); }
		public Column_specContext column_spec(int i) {
			return getRuleContext(Column_specContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public TerminalNode KEY_SYM() { return getToken(IndsqlParser.KEY_SYM, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode UPDATE() { return getToken(IndsqlParser.UPDATE, 0); }
		public TerminalNode EQ_SYM(int i) {
			return getToken(IndsqlParser.EQ_SYM, i);
		}
		public List<TerminalNode> EQ_SYM() { return getTokens(IndsqlParser.EQ_SYM); }
		public List<Column_specContext> column_spec() {
			return getRuleContexts(Column_specContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Insert_subfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_subfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterInsert_subfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitInsert_subfix(this);
		}
	}

	public final Insert_subfixContext insert_subfix() throws RecognitionException {
		Insert_subfixContext _localctx = new Insert_subfixContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_insert_subfix);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1265); match(ON);
			setState(1266); match(DUPLICATE_SYM);
			setState(1267); match(KEY_SYM);
			setState(1268); match(UPDATE);
			setState(1269); column_spec();
			setState(1270); match(EQ_SYM);
			setState(1271); expression();
			setState(1279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1272); match(COMMA);
					setState(1273); column_spec();
					setState(1274); match(EQ_SYM);
					setState(1275); expression();
					}
					} 
				}
				setState(1281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statement1Context extends ParserRuleContext {
		public Insert_subfixContext insert_subfix() {
			return getRuleContext(Insert_subfixContext.class,0);
		}
		public Value_list_clauseContext value_list_clause() {
			return getRuleContext(Value_list_clauseContext.class,0);
		}
		public Insert_headerContext insert_header() {
			return getRuleContext(Insert_headerContext.class,0);
		}
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Insert_statement1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterInsert_statement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitInsert_statement1(this);
		}
	}

	public final Insert_statement1Context insert_statement1() throws RecognitionException {
		Insert_statement1Context _localctx = new Insert_statement1Context(_ctx, getState());
		enterRule(_localctx, 204, RULE_insert_statement1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282); insert_header();
			setState(1284);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1283); column_list();
				}
			}

			setState(1286); value_list_clause();
			setState(1288);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1287); insert_subfix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_list_clauseContext extends ParserRuleContext {
		public TerminalNode VALUE_SYM() { return getToken(IndsqlParser.VALUE_SYM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public Column_value_listContext column_value_list(int i) {
			return getRuleContext(Column_value_listContext.class,i);
		}
		public TerminalNode VALUES() { return getToken(IndsqlParser.VALUES, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public List<Column_value_listContext> column_value_list() {
			return getRuleContexts(Column_value_listContext.class);
		}
		public Value_list_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterValue_list_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitValue_list_clause(this);
		}
	}

	public final Value_list_clauseContext value_list_clause() throws RecognitionException {
		Value_list_clauseContext _localctx = new Value_list_clauseContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_value_list_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			_la = _input.LA(1);
			if ( !(_la==VALUE_SYM || _la==VALUES) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1291); column_value_list();
			setState(1296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1292); match(COMMA);
					setState(1293); column_value_list();
					}
					} 
				}
				setState(1298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_value_listContext extends ParserRuleContext {
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(IndsqlParser.DEFAULT); }
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public TerminalNode DEFAULT(int i) {
			return getToken(IndsqlParser.DEFAULT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Column_value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterColumn_value_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitColumn_value_list(this);
		}
	}

	public final Column_value_listContext column_value_list() throws RecognitionException {
		Column_value_listContext _localctx = new Column_value_listContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_column_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299); match(LPAREN);
			setState(1302);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1300); bit_expr();
				}
				break;

			case 2:
				{
				setState(1301); match(DEFAULT);
				}
				break;
			}
			setState(1311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1304); match(COMMA);
				setState(1307);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1305); bit_expr();
					}
					break;

				case 2:
					{
					setState(1306); match(DEFAULT);
					}
					break;
				}
				}
				}
				setState(1313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1314); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statement2Context extends ParserRuleContext {
		public Insert_subfixContext insert_subfix() {
			return getRuleContext(Insert_subfixContext.class,0);
		}
		public Insert_headerContext insert_header() {
			return getRuleContext(Insert_headerContext.class,0);
		}
		public Set_columns_cluaseContext set_columns_cluase() {
			return getRuleContext(Set_columns_cluaseContext.class,0);
		}
		public Insert_statement2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterInsert_statement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitInsert_statement2(this);
		}
	}

	public final Insert_statement2Context insert_statement2() throws RecognitionException {
		Insert_statement2Context _localctx = new Insert_statement2Context(_ctx, getState());
		enterRule(_localctx, 210, RULE_insert_statement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316); insert_header();
			setState(1317); set_columns_cluase();
			setState(1319);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1318); insert_subfix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_columns_cluaseContext extends ParserRuleContext {
		public List<Set_column_cluaseContext> set_column_cluase() {
			return getRuleContexts(Set_column_cluaseContext.class);
		}
		public TerminalNode SET_SYM() { return getToken(IndsqlParser.SET_SYM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public Set_column_cluaseContext set_column_cluase(int i) {
			return getRuleContext(Set_column_cluaseContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Set_columns_cluaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_columns_cluase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterSet_columns_cluase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitSet_columns_cluase(this);
		}
	}

	public final Set_columns_cluaseContext set_columns_cluase() throws RecognitionException {
		Set_columns_cluaseContext _localctx = new Set_columns_cluaseContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_set_columns_cluase);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1321); match(SET_SYM);
			setState(1322); set_column_cluase();
			setState(1327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1323); match(COMMA);
					setState(1324); set_column_cluase();
					}
					} 
				}
				setState(1329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_column_cluaseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(IndsqlParser.DEFAULT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EQ_SYM() { return getToken(IndsqlParser.EQ_SYM, 0); }
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public Set_column_cluaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_column_cluase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterSet_column_cluase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitSet_column_cluase(this);
		}
	}

	public final Set_column_cluaseContext set_column_cluase() throws RecognitionException {
		Set_column_cluaseContext _localctx = new Set_column_cluaseContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_set_column_cluase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330); column_spec();
			setState(1331); match(EQ_SYM);
			setState(1334);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1332); expression();
				}
				break;

			case 2:
				{
				setState(1333); match(DEFAULT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statement3Context extends ParserRuleContext {
		public Insert_subfixContext insert_subfix() {
			return getRuleContext(Insert_subfixContext.class,0);
		}
		public Insert_headerContext insert_header() {
			return getRuleContext(Insert_headerContext.class,0);
		}
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Select_expressionContext select_expression() {
			return getRuleContext(Select_expressionContext.class,0);
		}
		public Insert_statement3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterInsert_statement3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitInsert_statement3(this);
		}
	}

	public final Insert_statement3Context insert_statement3() throws RecognitionException {
		Insert_statement3Context _localctx = new Insert_statement3Context(_ctx, getState());
		enterRule(_localctx, 216, RULE_insert_statement3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336); insert_header();
			setState(1338);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1337); column_list();
				}
			}

			setState(1340); select_expression();
			setState(1342);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1341); insert_subfix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_statementsContext extends ParserRuleContext {
		public Single_table_update_statementContext single_table_update_statement() {
			return getRuleContext(Single_table_update_statementContext.class,0);
		}
		public Multiple_table_update_statementContext multiple_table_update_statement() {
			return getRuleContext(Multiple_table_update_statementContext.class,0);
		}
		public Update_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterUpdate_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitUpdate_statements(this);
		}
	}

	public final Update_statementsContext update_statements() throws RecognitionException {
		Update_statementsContext _localctx = new Update_statementsContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_update_statements);
		try {
			setState(1346);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1344); single_table_update_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1345); multiple_table_update_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_table_update_statementContext extends ParserRuleContext {
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode LOW_PRIORITY() { return getToken(IndsqlParser.LOW_PRIORITY, 0); }
		public Set_columns_cluaseContext set_columns_cluase() {
			return getRuleContext(Set_columns_cluaseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public TerminalNode IGNORE_SYM() { return getToken(IndsqlParser.IGNORE_SYM, 0); }
		public TerminalNode UPDATE() { return getToken(IndsqlParser.UPDATE, 0); }
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Single_table_update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_table_update_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterSingle_table_update_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitSingle_table_update_statement(this);
		}
	}

	public final Single_table_update_statementContext single_table_update_statement() throws RecognitionException {
		Single_table_update_statementContext _localctx = new Single_table_update_statementContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_single_table_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348); match(UPDATE);
			setState(1350);
			_la = _input.LA(1);
			if (_la==LOW_PRIORITY) {
				{
				setState(1349); match(LOW_PRIORITY);
				}
			}

			setState(1353);
			_la = _input.LA(1);
			if (_la==IGNORE_SYM) {
				{
				setState(1352); match(IGNORE_SYM);
				}
			}

			setState(1355); table_reference();
			setState(1356); set_columns_cluase();
			setState(1358);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1357); where_clause();
				}
			}

			setState(1361);
			_la = _input.LA(1);
			if (_la==ORDER_SYM) {
				{
				setState(1360); orderby_clause();
				}
			}

			setState(1364);
			_la = _input.LA(1);
			if (_la==LIMIT || _la==INTEGER_NUM) {
				{
				setState(1363); limit_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiple_table_update_statementContext extends ParserRuleContext {
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode LOW_PRIORITY() { return getToken(IndsqlParser.LOW_PRIORITY, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public Set_columns_cluaseContext set_columns_cluase() {
			return getRuleContext(Set_columns_cluaseContext.class,0);
		}
		public TerminalNode IGNORE_SYM() { return getToken(IndsqlParser.IGNORE_SYM, 0); }
		public TerminalNode UPDATE() { return getToken(IndsqlParser.UPDATE, 0); }
		public Multiple_table_update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_table_update_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterMultiple_table_update_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitMultiple_table_update_statement(this);
		}
	}

	public final Multiple_table_update_statementContext multiple_table_update_statement() throws RecognitionException {
		Multiple_table_update_statementContext _localctx = new Multiple_table_update_statementContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_multiple_table_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366); match(UPDATE);
			setState(1368);
			_la = _input.LA(1);
			if (_la==LOW_PRIORITY) {
				{
				setState(1367); match(LOW_PRIORITY);
				}
			}

			setState(1371);
			_la = _input.LA(1);
			if (_la==IGNORE_SYM) {
				{
				setState(1370); match(IGNORE_SYM);
				}
			}

			setState(1373); table_references();
			setState(1374); set_columns_cluase();
			setState(1376);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1375); where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_statementContext extends ParserRuleContext {
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public Procedure_nameContext procedure_name() {
			return getRuleContext(Procedure_nameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public TerminalNode CALL_SYM() { return getToken(IndsqlParser.CALL_SYM, 0); }
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCall_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCall_statement(this);
		}
	}

	public final Call_statementContext call_statement() throws RecognitionException {
		Call_statementContext _localctx = new Call_statementContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_call_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378); match(CALL_SYM);
			setState(1379); procedure_name();
			setState(1392);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1380); match(LPAREN);
				setState(1389);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << ACOS) | (1L << ADDDATE) | (1L << ADDTIME) | (1L << AES_DECRYPT) | (1L << AES_ENCRYPT) | (1L << ASCII_SYM) | (1L << ASIN) | (1L << ATAN) | (1L << ATAN2) | (1L << AVG) | (1L << BENCHMARK) | (1L << BIN) | (1L << BINARY) | (1L << BIT_AND) | (1L << BIT_LENGTH) | (1L << BIT_OR) | (1L << BIT_XOR) | (1L << CASE_SYM) | (1L << CAST_SYM) | (1L << CEIL) | (1L << CEILING))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CHAR - 66)) | (1L << (CHAR_LENGTH - 66)) | (1L << (CHARSET - 66)) | (1L << (COERCIBILITY - 66)) | (1L << (COLLATION - 66)) | (1L << (CONCAT - 66)) | (1L << (CONCAT_WS - 66)) | (1L << (CONNECTION_ID - 66)) | (1L << (CONV - 66)) | (1L << (CONVERT_SYM - 66)) | (1L << (CONVERT_TZ - 66)) | (1L << (COS - 66)) | (1L << (COT - 66)) | (1L << (COUNT - 66)) | (1L << (CRC32 - 66)) | (1L << (CURDATE - 66)) | (1L << (CURRENT_USER - 66)) | (1L << (CURTIME - 66)) | (1L << (DATABASE - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (DATE_ADD - 131)) | (1L << (DATE_FORMAT - 131)) | (1L << (DATE_SUB - 131)) | (1L << (DATE_SYM - 131)) | (1L << (DATEDIFF - 131)) | (1L << (DAYNAME - 131)) | (1L << (DAYOFMONTH - 131)) | (1L << (DAYOFWEEK - 131)) | (1L << (DAYOFYEAR - 131)) | (1L << (DECODE - 131)) | (1L << (DEFAULT - 131)) | (1L << (DEGREES - 131)) | (1L << (DES_DECRYPT - 131)) | (1L << (DES_ENCRYPT - 131)) | (1L << (ELT - 131)) | (1L << (ENCODE - 131)) | (1L << (ENCRYPT - 131)))) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (EXISTS - 199)) | (1L << (EXP - 199)) | (1L << (EXPORT_SET - 199)) | (1L << (EXTRACT - 199)) | (1L << (FALSE_SYM - 199)) | (1L << (FIELD - 199)) | (1L << (FIND_IN_SET - 199)) | (1L << (FLOOR - 199)) | (1L << (FORMAT - 199)) | (1L << (FOUND_ROWS - 199)) | (1L << (FROM_BASE64 - 199)) | (1L << (FROM_DAYS - 199)) | (1L << (FROM_UNIXTIME - 199)) | (1L << (GET_FORMAT - 199)) | (1L << (GET_LOCK - 199)) | (1L << (GROUP_CONCAT - 199)) | (1L << (HEX - 199)) | (1L << (HOUR - 199)) | (1L << (IF - 199)) | (1L << (IFNULL - 199)))) != 0) || ((((_la - 268)) & ~0x3f) == 0 && ((1L << (_la - 268)) & ((1L << (INET_ATON - 268)) | (1L << (INET_NTOA - 268)) | (1L << (INSERT - 268)) | (1L << (INSTR - 268)) | (1L << (INTERVAL_SYM - 268)) | (1L << (IS_FREE_LOCK - 268)) | (1L << (IS_USED_LOCK - 268)) | (1L << (LAST_DAY - 268)) | (1L << (LAST_INSERT_ID - 268)) | (1L << (LEFT - 268)) | (1L << (LENGTH - 268)) | (1L << (LN - 268)) | (1L << (LOAD_FILE - 268)) | (1L << (LOCATE - 268)) | (1L << (LOG - 268)))) != 0) || ((((_la - 332)) & ~0x3f) == 0 && ((1L << (_la - 332)) & ((1L << (LOG10 - 332)) | (1L << (LOG2 - 332)) | (1L << (LOWER - 332)) | (1L << (LPAD - 332)) | (1L << (LTRIM - 332)) | (1L << (MAKE_SET - 332)) | (1L << (MAKEDATE - 332)) | (1L << (MAKETIME - 332)) | (1L << (MASTER_POS_WAIT - 332)) | (1L << (MATCH - 332)) | (1L << (MAX_SYM - 332)) | (1L << (MD5 - 332)) | (1L << (MICROSECOND - 332)) | (1L << (MID - 332)) | (1L << (MIN_SYM - 332)) | (1L << (MINUTE - 332)) | (1L << (MOD - 332)) | (1L << (MONTH - 332)) | (1L << (MONTHNAME - 332)))) != 0) || ((((_la - 400)) & ~0x3f) == 0 && ((1L << (_la - 400)) & ((1L << (NAME_CONST - 400)) | (1L << (NOW - 400)) | (1L << (NULL_SYM - 400)) | (1L << (OCT - 400)) | (1L << (OLD_PASSWORD - 400)) | (1L << (ORD - 400)) | (1L << (PASSWORD - 400)) | (1L << (PERIOD_ADD - 400)) | (1L << (PERIOD_DIFF - 400)) | (1L << (PI - 400)) | (1L << (POW - 400)) | (1L << (POWER - 400)))) != 0) || ((((_la - 468)) & ~0x3f) == 0 && ((1L << (_la - 468)) & ((1L << (QUARTER - 468)) | (1L << (QUOTE - 468)) | (1L << (RADIANS - 468)) | (1L << (RAND - 468)) | (1L << (RELEASE_LOCK - 468)) | (1L << (REPEAT - 468)) | (1L << (REPLACE - 468)) | (1L << (REVERSE - 468)) | (1L << (RIGHT - 468)) | (1L << (ROUND - 468)) | (1L << (ROW_SYM - 468)) | (1L << (RPAD - 468)) | (1L << (RTRIM - 468)) | (1L << (SCHEMA - 468)) | (1L << (SEC_TO_TIME - 468)) | (1L << (SECOND - 468)))) != 0) || ((((_la - 535)) & ~0x3f) == 0 && ((1L << (_la - 535)) & ((1L << (SESSION_USER - 535)) | (1L << (SIGN - 535)) | (1L << (SIN - 535)) | (1L << (SLEEP - 535)) | (1L << (SOUNDEX - 535)) | (1L << (SPACE - 535)) | (1L << (SQRT - 535)) | (1L << (STD - 535)) | (1L << (STDDEV - 535)) | (1L << (STDDEV_POP - 535)) | (1L << (STDDEV_SAMP - 535)) | (1L << (STR_TO_DATE - 535)) | (1L << (STRCMP - 535)) | (1L << (SUBSTRING - 535)) | (1L << (SUBSTRING_INDEX - 535)) | (1L << (SUBTIME - 535)) | (1L << (SUM - 535)))) != 0) || ((((_la - 599)) & ~0x3f) == 0 && ((1L << (_la - 599)) & ((1L << (SYSDATE - 599)) | (1L << (SYSTEM_USER - 599)) | (1L << (TAN - 599)) | (1L << (TIME_FORMAT - 599)) | (1L << (TIME_SYM - 599)) | (1L << (TIME_TO_SEC - 599)) | (1L << (TIMEDIFF - 599)) | (1L << (TIMESTAMP - 599)) | (1L << (TIMESTAMPADD - 599)) | (1L << (TIMESTAMPDIFF - 599)) | (1L << (TO_BASE64 - 599)) | (1L << (TO_DAYS - 599)) | (1L << (TO_SECONDS - 599)) | (1L << (TRIM - 599)) | (1L << (TRUE_SYM - 599)) | (1L << (TRUNCATE - 599)) | (1L << (UNHEX - 599)) | (1L << (UNIX_TIMESTAMP - 599)) | (1L << (UPPER - 599)) | (1L << (USER - 599)))) != 0) || ((((_la - 664)) & ~0x3f) == 0 && ((1L << (_la - 664)) & ((1L << (UTC_DATE - 664)) | (1L << (UTC_TIME - 664)) | (1L << (UTC_TIMESTAMP - 664)) | (1L << (UUID - 664)) | (1L << (VALUES - 664)) | (1L << (VAR_POP - 664)) | (1L << (VAR_SAMP - 664)) | (1L << (VARIANCE - 664)) | (1L << (VERSION_SYM - 664)) | (1L << (WEEK - 664)) | (1L << (WEEKDAY - 664)) | (1L << (WEEKOFYEAR - 664)) | (1L << (WEIGHT_STRING - 664)) | (1L << (YEAR - 664)) | (1L << (YEARWEEK - 664)) | (1L << (LPAREN - 664)) | (1L << (PLUS - 664)) | (1L << (MINUS - 664)))) != 0) || ((((_la - 728)) & ~0x3f) == 0 && ((1L << (_la - 728)) & ((1L << (NEGATION - 728)) | (1L << (INTEGER_NUM - 728)) | (1L << (HEX_DIGIT - 728)) | (1L << (BIT_NUM - 728)) | (1L << (REAL_NUMBER - 728)) | (1L << (TEXT_STRING - 728)) | (1L << (ID - 728)) | (1L << (USER_VAR - 728)))) != 0)) {
					{
					setState(1381); bit_expr();
					setState(1386);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1382); match(COMMA);
						setState(1383); bit_expr();
						}
						}
						setState(1388);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1391); match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_statementContext extends ParserRuleContext {
		public List<Root_statementContext> root_statement() {
			return getRuleContexts(Root_statementContext.class);
		}
		public Root_statementContext root_statement(int i) {
			return getRuleContext(Root_statementContext.class,i);
		}
		public TerminalNode DO_SYM() { return getToken(IndsqlParser.DO_SYM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Do_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterDo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitDo_statement(this);
		}
	}

	public final Do_statementContext do_statement() throws RecognitionException {
		Do_statementContext _localctx = new Do_statementContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_do_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1394); match(DO_SYM);
			setState(1395); root_statement();
			setState(1400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1396); match(COMMA);
					setState(1397); root_statement();
					}
					} 
				}
				setState(1402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Handler_statementsContext extends ParserRuleContext {
		public Handler_statement1Context handler_statement1() {
			return getRuleContext(Handler_statement1Context.class,0);
		}
		public Handler_statement2Context handler_statement2() {
			return getRuleContext(Handler_statement2Context.class,0);
		}
		public Handler_statement3Context handler_statement3() {
			return getRuleContext(Handler_statement3Context.class,0);
		}
		public Open_handler_statementContext open_handler_statement() {
			return getRuleContext(Open_handler_statementContext.class,0);
		}
		public Close_handler_statementContext close_handler_statement() {
			return getRuleContext(Close_handler_statementContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode HANDLER_SYM() { return getToken(IndsqlParser.HANDLER_SYM, 0); }
		public Handler_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterHandler_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitHandler_statements(this);
		}
	}

	public final Handler_statementsContext handler_statements() throws RecognitionException {
		Handler_statementsContext _localctx = new Handler_statementsContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_handler_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403); match(HANDLER_SYM);
			setState(1404); table_name();
			setState(1410);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1405); open_handler_statement();
				}
				break;

			case 2:
				{
				setState(1406); handler_statement1();
				}
				break;

			case 3:
				{
				setState(1407); handler_statement2();
				}
				break;

			case 4:
				{
				setState(1408); handler_statement3();
				}
				break;

			case 5:
				{
				setState(1409); close_handler_statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Open_handler_statementContext extends ParserRuleContext {
		public TerminalNode OPEN_SYM() { return getToken(IndsqlParser.OPEN_SYM, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Open_handler_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_handler_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterOpen_handler_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitOpen_handler_statement(this);
		}
	}

	public final Open_handler_statementContext open_handler_statement() throws RecognitionException {
		Open_handler_statementContext _localctx = new Open_handler_statementContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_open_handler_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412); match(OPEN_SYM);
			setState(1414);
			_la = _input.LA(1);
			if (_la==AS_SYM || _la==ID) {
				{
				setState(1413); alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Handler_statement1Context extends ParserRuleContext {
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public TerminalNode READ_SYM() { return getToken(IndsqlParser.READ_SYM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Handler_statement1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler_statement1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterHandler_statement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitHandler_statement1(this);
		}
	}

	public final Handler_statement1Context handler_statement1() throws RecognitionException {
		Handler_statement1Context _localctx = new Handler_statement1Context(_ctx, getState());
		enterRule(_localctx, 232, RULE_handler_statement1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416); match(READ_SYM);
			setState(1417); index_name();
			setState(1418); relational_op();
			setState(1419); match(LPAREN);
			setState(1420); bit_expr();
			setState(1425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1421); match(COMMA);
				setState(1422); bit_expr();
				}
				}
				setState(1427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1428); match(RPAREN);
			setState(1430);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1429); where_clause();
				}
			}

			setState(1433);
			_la = _input.LA(1);
			if (_la==LIMIT || _la==INTEGER_NUM) {
				{
				setState(1432); limit_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Handler_statement2Context extends ParserRuleContext {
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode LAST_SYM() { return getToken(IndsqlParser.LAST_SYM, 0); }
		public TerminalNode PREV_SYM() { return getToken(IndsqlParser.PREV_SYM, 0); }
		public TerminalNode READ_SYM() { return getToken(IndsqlParser.READ_SYM, 0); }
		public TerminalNode FIRST_SYM() { return getToken(IndsqlParser.FIRST_SYM, 0); }
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode NEXT_SYM() { return getToken(IndsqlParser.NEXT_SYM, 0); }
		public Handler_statement2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler_statement2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterHandler_statement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitHandler_statement2(this);
		}
	}

	public final Handler_statement2Context handler_statement2() throws RecognitionException {
		Handler_statement2Context _localctx = new Handler_statement2Context(_ctx, getState());
		enterRule(_localctx, 234, RULE_handler_statement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435); match(READ_SYM);
			setState(1436); index_name();
			setState(1437);
			_la = _input.LA(1);
			if ( !(_la==FIRST_SYM || _la==LAST_SYM || _la==NEXT_SYM || _la==PREV_SYM) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1439);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1438); where_clause();
				}
			}

			setState(1442);
			_la = _input.LA(1);
			if (_la==LIMIT || _la==INTEGER_NUM) {
				{
				setState(1441); limit_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Handler_statement3Context extends ParserRuleContext {
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode READ_SYM() { return getToken(IndsqlParser.READ_SYM, 0); }
		public TerminalNode FIRST_SYM() { return getToken(IndsqlParser.FIRST_SYM, 0); }
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public TerminalNode NEXT_SYM() { return getToken(IndsqlParser.NEXT_SYM, 0); }
		public Handler_statement3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler_statement3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterHandler_statement3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitHandler_statement3(this);
		}
	}

	public final Handler_statement3Context handler_statement3() throws RecognitionException {
		Handler_statement3Context _localctx = new Handler_statement3Context(_ctx, getState());
		enterRule(_localctx, 236, RULE_handler_statement3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444); match(READ_SYM);
			setState(1445);
			_la = _input.LA(1);
			if ( !(_la==FIRST_SYM || _la==NEXT_SYM) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1447);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1446); where_clause();
				}
			}

			setState(1450);
			_la = _input.LA(1);
			if (_la==LIMIT || _la==INTEGER_NUM) {
				{
				setState(1449); limit_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Close_handler_statementContext extends ParserRuleContext {
		public TerminalNode CLOSE_SYM() { return getToken(IndsqlParser.CLOSE_SYM, 0); }
		public Close_handler_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_handler_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterClose_handler_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitClose_handler_statement(this);
		}
	}

	public final Close_handler_statementContext close_handler_statement() throws RecognitionException {
		Close_handler_statementContext _localctx = new Close_handler_statementContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_close_handler_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452); match(CLOSE_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Load_data_statementContext extends ParserRuleContext {
		public List<TerminalNode> TERMINATED() { return getTokens(IndsqlParser.TERMINATED); }
		public TerminalNode FIELDS_SYM() { return getToken(IndsqlParser.FIELDS_SYM, 0); }
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public TerminalNode COLUMNS_SYM() { return getToken(IndsqlParser.COLUMNS_SYM, 0); }
		public TerminalNode SET_SYM() { return getToken(IndsqlParser.SET_SYM, 0); }
		public List<TerminalNode> BY_SYM() { return getTokens(IndsqlParser.BY_SYM); }
		public TerminalNode INTO() { return getToken(IndsqlParser.INTO, 0); }
		public List<TerminalNode> USER_VAR() { return getTokens(IndsqlParser.USER_VAR); }
		public TerminalNode LOAD() { return getToken(IndsqlParser.LOAD, 0); }
		public TerminalNode STARTING() { return getToken(IndsqlParser.STARTING, 0); }
		public List<Column_specContext> column_spec() {
			return getRuleContexts(Column_specContext.class);
		}
		public Partition_clauseContext partition_clause() {
			return getRuleContext(Partition_clauseContext.class,0);
		}
		public TerminalNode LINES(int i) {
			return getToken(IndsqlParser.LINES, i);
		}
		public TerminalNode OPTIONALLY() { return getToken(IndsqlParser.OPTIONALLY, 0); }
		public TerminalNode TABLE() { return getToken(IndsqlParser.TABLE, 0); }
		public List<TerminalNode> IGNORE_SYM() { return getTokens(IndsqlParser.IGNORE_SYM); }
		public TerminalNode LOCAL_SYM() { return getToken(IndsqlParser.LOCAL_SYM, 0); }
		public TerminalNode TERMINATED(int i) {
			return getToken(IndsqlParser.TERMINATED, i);
		}
		public TerminalNode ENCLOSED() { return getToken(IndsqlParser.ENCLOSED, 0); }
		public TerminalNode ESCAPED() { return getToken(IndsqlParser.ESCAPED, 0); }
		public TerminalNode BY_SYM(int i) {
			return getToken(IndsqlParser.BY_SYM, i);
		}
		public Column_specContext column_spec(int i) {
			return getRuleContext(Column_specContext.class,i);
		}
		public TerminalNode INFILE() { return getToken(IndsqlParser.INFILE, 0); }
		public TerminalNode TEXT_STRING(int i) {
			return getToken(IndsqlParser.TEXT_STRING, i);
		}
		public Set_columns_cluaseContext set_columns_cluase() {
			return getRuleContext(Set_columns_cluaseContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public List<TerminalNode> LINES() { return getTokens(IndsqlParser.LINES); }
		public List<TerminalNode> TEXT_STRING() { return getTokens(IndsqlParser.TEXT_STRING); }
		public TerminalNode INTEGER_NUM() { return getToken(IndsqlParser.INTEGER_NUM, 0); }
		public TerminalNode LOW_PRIORITY() { return getToken(IndsqlParser.LOW_PRIORITY, 0); }
		public TerminalNode ROWS_SYM() { return getToken(IndsqlParser.ROWS_SYM, 0); }
		public TerminalNode CHARACTER_SYM() { return getToken(IndsqlParser.CHARACTER_SYM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public TerminalNode USER_VAR(int i) {
			return getToken(IndsqlParser.USER_VAR, i);
		}
		public TerminalNode REPLACE() { return getToken(IndsqlParser.REPLACE, 0); }
		public TerminalNode IGNORE_SYM(int i) {
			return getToken(IndsqlParser.IGNORE_SYM, i);
		}
		public TerminalNode DATA_SYM() { return getToken(IndsqlParser.DATA_SYM, 0); }
		public TerminalNode CONCURRENT() { return getToken(IndsqlParser.CONCURRENT, 0); }
		public Load_data_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load_data_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterLoad_data_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitLoad_data_statement(this);
		}
	}

	public final Load_data_statementContext load_data_statement() throws RecognitionException {
		Load_data_statementContext _localctx = new Load_data_statementContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_load_data_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454); match(LOAD);
			setState(1455); match(DATA_SYM);
			setState(1457);
			_la = _input.LA(1);
			if (_la==CONCURRENT || _la==LOW_PRIORITY) {
				{
				setState(1456);
				_la = _input.LA(1);
				if ( !(_la==CONCURRENT || _la==LOW_PRIORITY) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1460);
			_la = _input.LA(1);
			if (_la==LOCAL_SYM) {
				{
				setState(1459); match(LOCAL_SYM);
				}
			}

			setState(1462); match(INFILE);
			setState(1463); match(TEXT_STRING);
			setState(1465);
			_la = _input.LA(1);
			if (_la==IGNORE_SYM || _la==REPLACE) {
				{
				setState(1464);
				_la = _input.LA(1);
				if ( !(_la==IGNORE_SYM || _la==REPLACE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1467); match(INTO);
			setState(1468); match(TABLE);
			setState(1469); table_spec();
			setState(1471);
			_la = _input.LA(1);
			if (_la==PARTITION_SYM) {
				{
				setState(1470); partition_clause();
				}
			}

			setState(1476);
			_la = _input.LA(1);
			if (_la==CHARACTER_SYM) {
				{
				setState(1473); match(CHARACTER_SYM);
				setState(1474); match(SET_SYM);
				setState(1475); charset_name();
				}
			}

			setState(1497);
			_la = _input.LA(1);
			if (_la==COLUMNS_SYM || _la==FIELDS_SYM) {
				{
				setState(1478);
				_la = _input.LA(1);
				if ( !(_la==COLUMNS_SYM || _la==FIELDS_SYM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1482);
				_la = _input.LA(1);
				if (_la==TERMINATED) {
					{
					setState(1479); match(TERMINATED);
					setState(1480); match(BY_SYM);
					setState(1481); match(TEXT_STRING);
					}
				}

				setState(1490);
				_la = _input.LA(1);
				if (_la==ENCLOSED || _la==OPTIONALLY) {
					{
					setState(1485);
					_la = _input.LA(1);
					if (_la==OPTIONALLY) {
						{
						setState(1484); match(OPTIONALLY);
						}
					}

					setState(1487); match(ENCLOSED);
					setState(1488); match(BY_SYM);
					setState(1489); match(TEXT_STRING);
					}
				}

				setState(1495);
				_la = _input.LA(1);
				if (_la==ESCAPED) {
					{
					setState(1492); match(ESCAPED);
					setState(1493); match(BY_SYM);
					setState(1494); match(TEXT_STRING);
					}
				}

				}
			}

			setState(1510);
			_la = _input.LA(1);
			if (_la==LINES) {
				{
				setState(1499); match(LINES);
				setState(1503);
				_la = _input.LA(1);
				if (_la==STARTING) {
					{
					setState(1500); match(STARTING);
					setState(1501); match(BY_SYM);
					setState(1502); match(TEXT_STRING);
					}
				}

				setState(1508);
				_la = _input.LA(1);
				if (_la==TERMINATED) {
					{
					setState(1505); match(TERMINATED);
					setState(1506); match(BY_SYM);
					setState(1507); match(TEXT_STRING);
					}
				}

				}
			}

			setState(1515);
			_la = _input.LA(1);
			if (_la==IGNORE_SYM) {
				{
				setState(1512); match(IGNORE_SYM);
				setState(1513); match(INTEGER_NUM);
				setState(1514);
				_la = _input.LA(1);
				if ( !(_la==LINES || _la==ROWS_SYM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1533);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1517); match(LPAREN);
				setState(1520);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(1518); column_spec();
					}
					break;
				case USER_VAR:
					{
					setState(1519); match(USER_VAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1522); match(COMMA);
					setState(1525);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(1523); column_spec();
						}
						break;
					case USER_VAR:
						{
						setState(1524); match(USER_VAR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(1531);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1532); match(RPAREN);
				}
			}

			setState(1536);
			_la = _input.LA(1);
			if (_la==SET_SYM) {
				{
				setState(1535); set_columns_cluase();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Load_xml_statementContext extends ParserRuleContext {
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public TerminalNode SET_SYM() { return getToken(IndsqlParser.SET_SYM, 0); }
		public TerminalNode INTO() { return getToken(IndsqlParser.INTO, 0); }
		public TerminalNode ROWS_SYM(int i) {
			return getToken(IndsqlParser.ROWS_SYM, i);
		}
		public TerminalNode BY_SYM() { return getToken(IndsqlParser.BY_SYM, 0); }
		public List<TerminalNode> USER_VAR() { return getTokens(IndsqlParser.USER_VAR); }
		public TerminalNode LOAD() { return getToken(IndsqlParser.LOAD, 0); }
		public List<Column_specContext> column_spec() {
			return getRuleContexts(Column_specContext.class);
		}
		public Partition_clauseContext partition_clause() {
			return getRuleContext(Partition_clauseContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(IndsqlParser.TABLE, 0); }
		public List<TerminalNode> IGNORE_SYM() { return getTokens(IndsqlParser.IGNORE_SYM); }
		public TerminalNode LOCAL_SYM() { return getToken(IndsqlParser.LOCAL_SYM, 0); }
		public Column_specContext column_spec(int i) {
			return getRuleContext(Column_specContext.class,i);
		}
		public TerminalNode INFILE() { return getToken(IndsqlParser.INFILE, 0); }
		public TerminalNode TEXT_STRING(int i) {
			return getToken(IndsqlParser.TEXT_STRING, i);
		}
		public Set_columns_cluaseContext set_columns_cluase() {
			return getRuleContext(Set_columns_cluaseContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public TerminalNode LINES() { return getToken(IndsqlParser.LINES, 0); }
		public List<TerminalNode> TEXT_STRING() { return getTokens(IndsqlParser.TEXT_STRING); }
		public TerminalNode XML_SYM() { return getToken(IndsqlParser.XML_SYM, 0); }
		public TerminalNode INTEGER_NUM() { return getToken(IndsqlParser.INTEGER_NUM, 0); }
		public TerminalNode LOW_PRIORITY() { return getToken(IndsqlParser.LOW_PRIORITY, 0); }
		public List<TerminalNode> ROWS_SYM() { return getTokens(IndsqlParser.ROWS_SYM); }
		public TerminalNode CHARACTER_SYM() { return getToken(IndsqlParser.CHARACTER_SYM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public TerminalNode USER_VAR(int i) {
			return getToken(IndsqlParser.USER_VAR, i);
		}
		public TerminalNode REPLACE() { return getToken(IndsqlParser.REPLACE, 0); }
		public TerminalNode IDENTIFIED_SYM() { return getToken(IndsqlParser.IDENTIFIED_SYM, 0); }
		public TerminalNode IGNORE_SYM(int i) {
			return getToken(IndsqlParser.IGNORE_SYM, i);
		}
		public TerminalNode CONCURRENT() { return getToken(IndsqlParser.CONCURRENT, 0); }
		public Load_xml_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load_xml_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterLoad_xml_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitLoad_xml_statement(this);
		}
	}

	public final Load_xml_statementContext load_xml_statement() throws RecognitionException {
		Load_xml_statementContext _localctx = new Load_xml_statementContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_load_xml_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1538); match(LOAD);
			setState(1539); match(XML_SYM);
			setState(1541);
			_la = _input.LA(1);
			if (_la==CONCURRENT || _la==LOW_PRIORITY) {
				{
				setState(1540);
				_la = _input.LA(1);
				if ( !(_la==CONCURRENT || _la==LOW_PRIORITY) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1544);
			_la = _input.LA(1);
			if (_la==LOCAL_SYM) {
				{
				setState(1543); match(LOCAL_SYM);
				}
			}

			setState(1546); match(INFILE);
			setState(1547); match(TEXT_STRING);
			setState(1549);
			_la = _input.LA(1);
			if (_la==IGNORE_SYM || _la==REPLACE) {
				{
				setState(1548);
				_la = _input.LA(1);
				if ( !(_la==IGNORE_SYM || _la==REPLACE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1551); match(INTO);
			setState(1552); match(TABLE);
			setState(1553); table_spec();
			setState(1555);
			_la = _input.LA(1);
			if (_la==PARTITION_SYM) {
				{
				setState(1554); partition_clause();
				}
			}

			setState(1560);
			_la = _input.LA(1);
			if (_la==CHARACTER_SYM) {
				{
				setState(1557); match(CHARACTER_SYM);
				setState(1558); match(SET_SYM);
				setState(1559); charset_name();
				}
			}

			setState(1566);
			_la = _input.LA(1);
			if (_la==ROWS_SYM) {
				{
				setState(1562); match(ROWS_SYM);
				setState(1563); match(IDENTIFIED_SYM);
				setState(1564); match(BY_SYM);
				setState(1565); match(TEXT_STRING);
				}
			}

			setState(1571);
			_la = _input.LA(1);
			if (_la==IGNORE_SYM) {
				{
				setState(1568); match(IGNORE_SYM);
				setState(1569); match(INTEGER_NUM);
				setState(1570);
				_la = _input.LA(1);
				if ( !(_la==LINES || _la==ROWS_SYM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1589);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1573); match(LPAREN);
				setState(1576);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(1574); column_spec();
					}
					break;
				case USER_VAR:
					{
					setState(1575); match(USER_VAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1578); match(COMMA);
					setState(1581);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(1579); column_spec();
						}
						break;
					case USER_VAR:
						{
						setState(1580); match(USER_VAR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(1587);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1588); match(RPAREN);
				}
			}

			setState(1592);
			_la = _input.LA(1);
			if (_la==SET_SYM) {
				{
				setState(1591); set_columns_cluase();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Replace_statementContext extends ParserRuleContext {
		public Replace_statement1Context replace_statement1() {
			return getRuleContext(Replace_statement1Context.class,0);
		}
		public Replace_statement3Context replace_statement3() {
			return getRuleContext(Replace_statement3Context.class,0);
		}
		public Replace_statement2Context replace_statement2() {
			return getRuleContext(Replace_statement2Context.class,0);
		}
		public Replace_statement_headerContext replace_statement_header() {
			return getRuleContext(Replace_statement_headerContext.class,0);
		}
		public Replace_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replace_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterReplace_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitReplace_statement(this);
		}
	}

	public final Replace_statementContext replace_statement() throws RecognitionException {
		Replace_statementContext _localctx = new Replace_statementContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_replace_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594); replace_statement_header();
			setState(1598);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1595); replace_statement1();
				}
				break;

			case 2:
				{
				setState(1596); replace_statement2();
				}
				break;

			case 3:
				{
				setState(1597); replace_statement3();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Replace_statement_headerContext extends ParserRuleContext {
		public TerminalNode LOW_PRIORITY() { return getToken(IndsqlParser.LOW_PRIORITY, 0); }
		public Partition_clauseContext partition_clause() {
			return getRuleContext(Partition_clauseContext.class,0);
		}
		public TerminalNode INTO() { return getToken(IndsqlParser.INTO, 0); }
		public TerminalNode REPLACE() { return getToken(IndsqlParser.REPLACE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DELAYED_SYM() { return getToken(IndsqlParser.DELAYED_SYM, 0); }
		public Replace_statement_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replace_statement_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterReplace_statement_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitReplace_statement_header(this);
		}
	}

	public final Replace_statement_headerContext replace_statement_header() throws RecognitionException {
		Replace_statement_headerContext _localctx = new Replace_statement_headerContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_replace_statement_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600); match(REPLACE);
			setState(1602);
			_la = _input.LA(1);
			if (_la==DELAYED_SYM || _la==LOW_PRIORITY) {
				{
				setState(1601);
				_la = _input.LA(1);
				if ( !(_la==DELAYED_SYM || _la==LOW_PRIORITY) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1605);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1604); match(INTO);
				}
			}

			setState(1607); table_name();
			setState(1609);
			_la = _input.LA(1);
			if (_la==PARTITION_SYM) {
				{
				setState(1608); partition_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Replace_statement1Context extends ParserRuleContext {
		public Value_list_clauseContext value_list_clause() {
			return getRuleContext(Value_list_clauseContext.class,0);
		}
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Replace_statement1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replace_statement1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterReplace_statement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitReplace_statement1(this);
		}
	}

	public final Replace_statement1Context replace_statement1() throws RecognitionException {
		Replace_statement1Context _localctx = new Replace_statement1Context(_ctx, getState());
		enterRule(_localctx, 248, RULE_replace_statement1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1611); column_list();
				}
			}

			setState(1614); value_list_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Replace_statement2Context extends ParserRuleContext {
		public Set_columns_cluaseContext set_columns_cluase() {
			return getRuleContext(Set_columns_cluaseContext.class,0);
		}
		public Replace_statement2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replace_statement2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterReplace_statement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitReplace_statement2(this);
		}
	}

	public final Replace_statement2Context replace_statement2() throws RecognitionException {
		Replace_statement2Context _localctx = new Replace_statement2Context(_ctx, getState());
		enterRule(_localctx, 250, RULE_replace_statement2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616); set_columns_cluase();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Replace_statement3Context extends ParserRuleContext {
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Replace_statement3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replace_statement3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterReplace_statement3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitReplace_statement3(this);
		}
	}

	public final Replace_statement3Context replace_statement3() throws RecognitionException {
		Replace_statement3Context _localctx = new Replace_statement3Context(_ctx, getState());
		enterRule(_localctx, 252, RULE_replace_statement3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1619);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1618); column_list();
				}
			}

			setState(1621); select_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_statementContext extends ParserRuleContext {
		public TerminalNode NOT_SYM() { return getToken(IndsqlParser.NOT_SYM, 0); }
		public TerminalNode IF() { return getToken(IndsqlParser.IF, 0); }
		public TerminalNode DATABASE() { return getToken(IndsqlParser.DATABASE, 0); }
		public TerminalNode CREATE() { return getToken(IndsqlParser.CREATE, 0); }
		public TerminalNode EXISTS() { return getToken(IndsqlParser.EXISTS, 0); }
		public TerminalNode SCHEMA() { return getToken(IndsqlParser.SCHEMA, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public List<Create_specificationContext> create_specification() {
			return getRuleContexts(Create_specificationContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Create_specificationContext create_specification(int i) {
			return getRuleContext(Create_specificationContext.class,i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Create_database_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCreate_database_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCreate_database_statement(this);
		}
	}

	public final Create_database_statementContext create_database_statement() throws RecognitionException {
		Create_database_statementContext _localctx = new Create_database_statementContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_create_database_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1623); match(CREATE);
			setState(1624);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1628);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1625); match(IF);
				setState(1626); match(NOT_SYM);
				setState(1627); match(EXISTS);
				}
			}

			setState(1630); schema_name();
			setState(1641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHARACTER_SYM || _la==COLLATE_SYM || _la==DEFAULT) {
				{
				{
				setState(1631); create_specification();
				setState(1636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1632); match(COMMA);
						setState(1633); create_specification();
						}
						} 
					}
					setState(1638);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				}
				}
				}
				setState(1643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_specificationContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(IndsqlParser.DEFAULT, 0); }
		public TerminalNode CHARACTER_SYM() { return getToken(IndsqlParser.CHARACTER_SYM, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public TerminalNode SET_SYM() { return getToken(IndsqlParser.SET_SYM, 0); }
		public TerminalNode COLLATE_SYM() { return getToken(IndsqlParser.COLLATE_SYM, 0); }
		public TerminalNode EQ_SYM() { return getToken(IndsqlParser.EQ_SYM, 0); }
		public Create_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCreate_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCreate_specification(this);
		}
	}

	public final Create_specificationContext create_specification() throws RecognitionException {
		Create_specificationContext _localctx = new Create_specificationContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_create_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1645);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1644); match(DEFAULT);
				}
			}

			setState(1658);
			switch (_input.LA(1)) {
			case CHARACTER_SYM:
				{
				{
				setState(1647); match(CHARACTER_SYM);
				setState(1648); match(SET_SYM);
				setState(1650);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(1649); match(EQ_SYM);
					}
				}

				setState(1652); charset_name();
				}
				}
				break;
			case COLLATE_SYM:
				{
				{
				setState(1653); match(COLLATE_SYM);
				setState(1655);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(1654); match(EQ_SYM);
					}
				}

				setState(1657); collation_name();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_database_statementsContext extends ParserRuleContext {
		public Alter_database_statement1Context alter_database_statement1() {
			return getRuleContext(Alter_database_statement1Context.class,0);
		}
		public Alter_database_statement2Context alter_database_statement2() {
			return getRuleContext(Alter_database_statement2Context.class,0);
		}
		public Alter_database_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_database_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterAlter_database_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitAlter_database_statements(this);
		}
	}

	public final Alter_database_statementsContext alter_database_statements() throws RecognitionException {
		Alter_database_statementsContext _localctx = new Alter_database_statementsContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_alter_database_statements);
		try {
			setState(1662);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1660); alter_database_statement1();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1661); alter_database_statement2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_database_statement1Context extends ParserRuleContext {
		public TerminalNode DATABASE() { return getToken(IndsqlParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(IndsqlParser.SCHEMA, 0); }
		public TerminalNode ALTER() { return getToken(IndsqlParser.ALTER, 0); }
		public Alter_database_specificationContext alter_database_specification() {
			return getRuleContext(Alter_database_specificationContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Alter_database_statement1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_database_statement1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterAlter_database_statement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitAlter_database_statement1(this);
		}
	}

	public final Alter_database_statement1Context alter_database_statement1() throws RecognitionException {
		Alter_database_statement1Context _localctx = new Alter_database_statement1Context(_ctx, getState());
		enterRule(_localctx, 260, RULE_alter_database_statement1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664); match(ALTER);
			setState(1665);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1667);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(1666); schema_name();
				}
			}

			setState(1669); alter_database_specification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_database_statement2Context extends ParserRuleContext {
		public TerminalNode DATABASE() { return getToken(IndsqlParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(IndsqlParser.SCHEMA, 0); }
		public TerminalNode ALTER() { return getToken(IndsqlParser.ALTER, 0); }
		public TerminalNode UPGRADE_SYM() { return getToken(IndsqlParser.UPGRADE_SYM, 0); }
		public TerminalNode NAME_SYM() { return getToken(IndsqlParser.NAME_SYM, 0); }
		public TerminalNode DIRECTORY_SYM() { return getToken(IndsqlParser.DIRECTORY_SYM, 0); }
		public TerminalNode DATA_SYM() { return getToken(IndsqlParser.DATA_SYM, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Alter_database_statement2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_database_statement2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterAlter_database_statement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitAlter_database_statement2(this);
		}
	}

	public final Alter_database_statement2Context alter_database_statement2() throws RecognitionException {
		Alter_database_statement2Context _localctx = new Alter_database_statement2Context(_ctx, getState());
		enterRule(_localctx, 262, RULE_alter_database_statement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1671); match(ALTER);
			setState(1672);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1673); schema_name();
			setState(1674); match(UPGRADE_SYM);
			setState(1675); match(DATA_SYM);
			setState(1676); match(DIRECTORY_SYM);
			setState(1677); match(NAME_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_database_specificationContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(IndsqlParser.DEFAULT, 0); }
		public Collation_namesContext collation_names() {
			return getRuleContext(Collation_namesContext.class,0);
		}
		public TerminalNode CHARACTER_SYM() { return getToken(IndsqlParser.CHARACTER_SYM, 0); }
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public TerminalNode SET_SYM() { return getToken(IndsqlParser.SET_SYM, 0); }
		public TerminalNode COLLATE_SYM() { return getToken(IndsqlParser.COLLATE_SYM, 0); }
		public TerminalNode EQ_SYM() { return getToken(IndsqlParser.EQ_SYM, 0); }
		public Alter_database_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_database_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterAlter_database_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitAlter_database_specification(this);
		}
	}

	public final Alter_database_specificationContext alter_database_specification() throws RecognitionException {
		Alter_database_specificationContext _localctx = new Alter_database_specificationContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_alter_database_specification);
		int _la;
		try {
			setState(1696);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1680);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1679); match(DEFAULT);
					}
				}

				setState(1682); match(CHARACTER_SYM);
				setState(1683); match(SET_SYM);
				setState(1685);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(1684); match(EQ_SYM);
					}
				}

				setState(1687); charset_name();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1689);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1688); match(DEFAULT);
					}
				}

				setState(1691); match(COLLATE_SYM);
				setState(1693);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(1692); match(EQ_SYM);
					}
				}

				setState(1695); collation_names();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_database_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(IndsqlParser.IF, 0); }
		public TerminalNode DATABASE() { return getToken(IndsqlParser.DATABASE, 0); }
		public TerminalNode EXISTS() { return getToken(IndsqlParser.EXISTS, 0); }
		public TerminalNode SCHEMA() { return getToken(IndsqlParser.SCHEMA, 0); }
		public TerminalNode DROP() { return getToken(IndsqlParser.DROP, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Drop_database_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_database_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterDrop_database_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitDrop_database_statement(this);
		}
	}

	public final Drop_database_statementContext drop_database_statement() throws RecognitionException {
		Drop_database_statementContext _localctx = new Drop_database_statementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_drop_database_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698); match(DROP);
			setState(1699);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1702);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1700); match(IF);
				setState(1701); match(EXISTS);
				}
			}

			setState(1704); schema_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_event_statementContext extends ParserRuleContext {
		public User_nameContext user_name() {
			return getRuleContext(User_nameContext.class,0);
		}
		public List<TerminalNode> NOT_SYM() { return getTokens(IndsqlParser.NOT_SYM); }
		public TerminalNode ENABLE_SYM() { return getToken(IndsqlParser.ENABLE_SYM, 0); }
		public TerminalNode CREATE() { return getToken(IndsqlParser.CREATE, 0); }
		public TerminalNode DEFINER() { return getToken(IndsqlParser.DEFINER, 0); }
		public TerminalNode EXISTS() { return getToken(IndsqlParser.EXISTS, 0); }
		public TerminalNode NOT_SYM(int i) {
			return getToken(IndsqlParser.NOT_SYM, i);
		}
		public TerminalNode PRESERVE_SYM() { return getToken(IndsqlParser.PRESERVE_SYM, 0); }
		public TerminalNode ON(int i) {
			return getToken(IndsqlParser.ON, i);
		}
		public TerminalNode COMPLETION_SYM() { return getToken(IndsqlParser.COMPLETION_SYM, 0); }
		public TerminalNode TEXT_STRING() { return getToken(IndsqlParser.TEXT_STRING, 0); }
		public TerminalNode IF() { return getToken(IndsqlParser.IF, 0); }
		public List<TerminalNode> ON() { return getTokens(IndsqlParser.ON); }
		public TerminalNode EVENT_SYM() { return getToken(IndsqlParser.EVENT_SYM, 0); }
		public TerminalNode COMMENT_SYM() { return getToken(IndsqlParser.COMMENT_SYM, 0); }
		public Event_nameContext event_name() {
			return getRuleContext(Event_nameContext.class,0);
		}
		public TerminalNode SLAVE() { return getToken(IndsqlParser.SLAVE, 0); }
		public TerminalNode DISABLE_SYM() { return getToken(IndsqlParser.DISABLE_SYM, 0); }
		public TerminalNode SCHEDULE_SYM() { return getToken(IndsqlParser.SCHEDULE_SYM, 0); }
		public TerminalNode CURRENT_USER() { return getToken(IndsqlParser.CURRENT_USER, 0); }
		public Schedule_definitionContext schedule_definition() {
			return getRuleContext(Schedule_definitionContext.class,0);
		}
		public Do_statementContext do_statement() {
			return getRuleContext(Do_statementContext.class,0);
		}
		public TerminalNode EQ_SYM() { return getToken(IndsqlParser.EQ_SYM, 0); }
		public Create_event_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_event_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCreate_event_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCreate_event_statement(this);
		}
	}

	public final Create_event_statementContext create_event_statement() throws RecognitionException {
		Create_event_statementContext _localctx = new Create_event_statementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_create_event_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706); match(CREATE);
			setState(1713);
			_la = _input.LA(1);
			if (_la==DEFINER) {
				{
				setState(1707); match(DEFINER);
				setState(1708); match(EQ_SYM);
				setState(1711);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(1709); user_name();
					}
					break;
				case CURRENT_USER:
					{
					setState(1710); match(CURRENT_USER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(1715); match(EVENT_SYM);
			setState(1719);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1716); match(IF);
				setState(1717); match(NOT_SYM);
				setState(1718); match(EXISTS);
				}
			}

			setState(1721); event_name();
			setState(1722); match(ON);
			setState(1723); match(SCHEDULE_SYM);
			setState(1724); schedule_definition();
			setState(1731);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1725); match(ON);
				setState(1726); match(COMPLETION_SYM);
				setState(1728);
				_la = _input.LA(1);
				if (_la==NOT_SYM) {
					{
					setState(1727); match(NOT_SYM);
					}
				}

				setState(1730); match(PRESERVE_SYM);
				}
			}

			setState(1738);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1733); match(ENABLE_SYM);
				}
				break;

			case 2:
				{
				setState(1734); match(DISABLE_SYM);
				}
				break;

			case 3:
				{
				{
				setState(1735); match(DISABLE_SYM);
				setState(1736); match(ON);
				setState(1737); match(SLAVE);
				}
				}
				break;
			}
			setState(1742);
			_la = _input.LA(1);
			if (_la==COMMENT_SYM) {
				{
				setState(1740); match(COMMENT_SYM);
				setState(1741); match(TEXT_STRING);
				}
			}

			setState(1744); do_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Schedule_definitionContext extends ParserRuleContext {
		public TerminalNode STARTS_SYM() { return getToken(IndsqlParser.STARTS_SYM, 0); }
		public IntervalContext interval(int i) {
			return getRuleContext(IntervalContext.class,i);
		}
		public TerminalNode INTERVAL_SYM(int i) {
			return getToken(IndsqlParser.INTERVAL_SYM, i);
		}
		public TerminalNode ENDS_SYM() { return getToken(IndsqlParser.ENDS_SYM, 0); }
		public TerminalNode EVERY_SYM() { return getToken(IndsqlParser.EVERY_SYM, 0); }
		public List<TerminalNode> PLUS() { return getTokens(IndsqlParser.PLUS); }
		public TimestampContext timestamp(int i) {
			return getRuleContext(TimestampContext.class,i);
		}
		public List<TimestampContext> timestamp() {
			return getRuleContexts(TimestampContext.class);
		}
		public List<IntervalContext> interval() {
			return getRuleContexts(IntervalContext.class);
		}
		public List<TerminalNode> INTERVAL_SYM() { return getTokens(IndsqlParser.INTERVAL_SYM); }
		public TerminalNode AT_SYM() { return getToken(IndsqlParser.AT_SYM, 0); }
		public TerminalNode PLUS(int i) {
			return getToken(IndsqlParser.PLUS, i);
		}
		public Schedule_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schedule_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterSchedule_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitSchedule_definition(this);
		}
	}

	public final Schedule_definitionContext schedule_definition() throws RecognitionException {
		Schedule_definitionContext _localctx = new Schedule_definitionContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_schedule_definition);
		int _la;
		try {
			setState(1783);
			switch (_input.LA(1)) {
			case AT_SYM:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1746); match(AT_SYM);
				setState(1747); timestamp();
				setState(1753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(1748); match(PLUS);
					setState(1749); match(INTERVAL_SYM);
					setState(1750); interval();
					}
					}
					setState(1755);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case EVERY_SYM:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1756); match(EVERY_SYM);
				setState(1757); interval();
				}
				setState(1769);
				_la = _input.LA(1);
				if (_la==STARTS_SYM) {
					{
					setState(1759); match(STARTS_SYM);
					setState(1760); timestamp();
					setState(1766);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==PLUS) {
						{
						{
						setState(1761); match(PLUS);
						setState(1762); match(INTERVAL_SYM);
						setState(1763); interval();
						}
						}
						setState(1768);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1781);
				_la = _input.LA(1);
				if (_la==ENDS_SYM) {
					{
					setState(1771); match(ENDS_SYM);
					setState(1772); timestamp();
					setState(1778);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==PLUS) {
						{
						{
						setState(1773); match(PLUS);
						setState(1774); match(INTERVAL_SYM);
						setState(1775); interval();
						}
						}
						setState(1780);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode HOUR_SECOND() { return getToken(IndsqlParser.HOUR_SECOND, 0); }
		public TerminalNode QUARTER() { return getToken(IndsqlParser.QUARTER, 0); }
		public TerminalNode MONTH() { return getToken(IndsqlParser.MONTH, 0); }
		public TerminalNode MINUTE_SECOND() { return getToken(IndsqlParser.MINUTE_SECOND, 0); }
		public TerminalNode DAY_SECOND() { return getToken(IndsqlParser.DAY_SECOND, 0); }
		public TerminalNode SECOND() { return getToken(IndsqlParser.SECOND, 0); }
		public TerminalNode HOUR_MINUTE() { return getToken(IndsqlParser.HOUR_MINUTE, 0); }
		public TerminalNode MINUTE() { return getToken(IndsqlParser.MINUTE, 0); }
		public TerminalNode INTEGER_NUM() { return getToken(IndsqlParser.INTEGER_NUM, 0); }
		public TerminalNode YEAR() { return getToken(IndsqlParser.YEAR, 0); }
		public TerminalNode DAY_HOUR() { return getToken(IndsqlParser.DAY_HOUR, 0); }
		public TerminalNode DAY_SYM() { return getToken(IndsqlParser.DAY_SYM, 0); }
		public TerminalNode YEAR_MONTH() { return getToken(IndsqlParser.YEAR_MONTH, 0); }
		public TerminalNode HOUR() { return getToken(IndsqlParser.HOUR, 0); }
		public TerminalNode DAY_MINUTE() { return getToken(IndsqlParser.DAY_MINUTE, 0); }
		public TerminalNode WEEK() { return getToken(IndsqlParser.WEEK, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitInterval(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1785); match(INTEGER_NUM);
			setState(1786);
			_la = _input.LA(1);
			if ( !(((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (DAY_SYM - 137)) | (1L << (DAY_HOUR - 137)) | (1L << (DAY_MINUTE - 137)) | (1L << (DAY_SECOND - 137)))) != 0) || ((((_la - 255)) & ~0x3f) == 0 && ((1L << (_la - 255)) & ((1L << (HOUR - 255)) | (1L << (HOUR_MINUTE - 255)) | (1L << (HOUR_SECOND - 255)))) != 0) || ((((_la - 387)) & ~0x3f) == 0 && ((1L << (_la - 387)) & ((1L << (MINUTE - 387)) | (1L << (MINUTE_SECOND - 387)) | (1L << (MONTH - 387)))) != 0) || _la==QUARTER || _la==SECOND || ((((_la - 685)) & ~0x3f) == 0 && ((1L << (_la - 685)) & ((1L << (WEEK - 685)) | (1L << (YEAR - 685)) | (1L << (YEAR_MONTH - 685)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimestampContext extends ParserRuleContext {
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(IndsqlParser.CURRENT_TIMESTAMP, 0); }
		public TimestampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterTimestamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitTimestamp(this);
		}
	}

	public final TimestampContext timestamp() throws RecognitionException {
		TimestampContext _localctx = new TimestampContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_timestamp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788); match(CURRENT_TIMESTAMP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_event_statementContext extends ParserRuleContext {
		public TerminalNode NOT_SYM() { return getToken(IndsqlParser.NOT_SYM, 0); }
		public User_nameContext user_name() {
			return getRuleContext(User_nameContext.class,0);
		}
		public TerminalNode ENABLE_SYM() { return getToken(IndsqlParser.ENABLE_SYM, 0); }
		public TerminalNode DEFINER() { return getToken(IndsqlParser.DEFINER, 0); }
		public TerminalNode ALTER() { return getToken(IndsqlParser.ALTER, 0); }
		public TerminalNode ON(int i) {
			return getToken(IndsqlParser.ON, i);
		}
		public TerminalNode PRESERVE_SYM() { return getToken(IndsqlParser.PRESERVE_SYM, 0); }
		public Event_nameContext event_name(int i) {
			return getRuleContext(Event_nameContext.class,i);
		}
		public TerminalNode COMPLETION_SYM() { return getToken(IndsqlParser.COMPLETION_SYM, 0); }
		public TerminalNode RENAME() { return getToken(IndsqlParser.RENAME, 0); }
		public TerminalNode TEXT_STRING() { return getToken(IndsqlParser.TEXT_STRING, 0); }
		public List<TerminalNode> ON() { return getTokens(IndsqlParser.ON); }
		public TerminalNode TO_SYM() { return getToken(IndsqlParser.TO_SYM, 0); }
		public TerminalNode EVENT_SYM() { return getToken(IndsqlParser.EVENT_SYM, 0); }
		public TerminalNode COMMENT_SYM() { return getToken(IndsqlParser.COMMENT_SYM, 0); }
		public List<Event_nameContext> event_name() {
			return getRuleContexts(Event_nameContext.class);
		}
		public TerminalNode SLAVE() { return getToken(IndsqlParser.SLAVE, 0); }
		public TerminalNode DISABLE_SYM() { return getToken(IndsqlParser.DISABLE_SYM, 0); }
		public TerminalNode SCHEDULE_SYM() { return getToken(IndsqlParser.SCHEDULE_SYM, 0); }
		public TerminalNode CURRENT_USER() { return getToken(IndsqlParser.CURRENT_USER, 0); }
		public Do_statementContext do_statement() {
			return getRuleContext(Do_statementContext.class,0);
		}
		public Schedule_definitionContext schedule_definition() {
			return getRuleContext(Schedule_definitionContext.class,0);
		}
		public TerminalNode EQ_SYM() { return getToken(IndsqlParser.EQ_SYM, 0); }
		public Alter_event_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_event_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterAlter_event_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitAlter_event_statement(this);
		}
	}

	public final Alter_event_statementContext alter_event_statement() throws RecognitionException {
		Alter_event_statementContext _localctx = new Alter_event_statementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_alter_event_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790); match(ALTER);
			setState(1797);
			_la = _input.LA(1);
			if (_la==DEFINER) {
				{
				setState(1791); match(DEFINER);
				setState(1792); match(EQ_SYM);
				setState(1795);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(1793); user_name();
					}
					break;
				case CURRENT_USER:
					{
					setState(1794); match(CURRENT_USER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(1799); match(EVENT_SYM);
			setState(1800); event_name();
			setState(1804);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(1801); match(ON);
				setState(1802); match(SCHEDULE_SYM);
				setState(1803); schedule_definition();
				}
				break;
			}
			setState(1812);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1806); match(ON);
				setState(1807); match(COMPLETION_SYM);
				setState(1809);
				_la = _input.LA(1);
				if (_la==NOT_SYM) {
					{
					setState(1808); match(NOT_SYM);
					}
				}

				setState(1811); match(PRESERVE_SYM);
				}
			}

			setState(1817);
			_la = _input.LA(1);
			if (_la==RENAME) {
				{
				setState(1814); match(RENAME);
				setState(1815); match(TO_SYM);
				setState(1816); event_name();
				}
			}

			setState(1824);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(1819); match(ENABLE_SYM);
				}
				break;

			case 2:
				{
				setState(1820); match(DISABLE_SYM);
				}
				break;

			case 3:
				{
				{
				setState(1821); match(DISABLE_SYM);
				setState(1822); match(ON);
				setState(1823); match(SLAVE);
				}
				}
				break;
			}
			setState(1828);
			_la = _input.LA(1);
			if (_la==COMMENT_SYM) {
				{
				setState(1826); match(COMMENT_SYM);
				setState(1827); match(TEXT_STRING);
				}
			}

			setState(1831);
			_la = _input.LA(1);
			if (_la==DO_SYM) {
				{
				setState(1830); do_statement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_event_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(IndsqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(IndsqlParser.EXISTS, 0); }
		public TerminalNode EVENT_SYM() { return getToken(IndsqlParser.EVENT_SYM, 0); }
		public Event_nameContext event_name() {
			return getRuleContext(Event_nameContext.class,0);
		}
		public TerminalNode DROP() { return getToken(IndsqlParser.DROP, 0); }
		public Drop_event_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_event_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterDrop_event_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitDrop_event_statement(this);
		}
	}

	public final Drop_event_statementContext drop_event_statement() throws RecognitionException {
		Drop_event_statementContext _localctx = new Drop_event_statementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_drop_event_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1833); match(DROP);
			setState(1834); match(EVENT_SYM);
			setState(1837);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1835); match(IF);
				setState(1836); match(EXISTS);
				}
			}

			setState(1839); event_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_statementContext extends ParserRuleContext {
		public TerminalNode FULLTEXT_SYM() { return getToken(IndsqlParser.FULLTEXT_SYM, 0); }
		public List<Algorithm_optionContext> algorithm_option() {
			return getRuleContexts(Algorithm_optionContext.class);
		}
		public TerminalNode CREATE() { return getToken(IndsqlParser.CREATE, 0); }
		public Lock_optionContext lock_option(int i) {
			return getRuleContext(Lock_optionContext.class,i);
		}
		public TerminalNode INDEX_SYM() { return getToken(IndsqlParser.INDEX_SYM, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public Index_column_nameContext index_column_name(int i) {
			return getRuleContext(Index_column_nameContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public List<Lock_optionContext> lock_option() {
			return getRuleContexts(Lock_optionContext.class);
		}
		public TerminalNode ON() { return getToken(IndsqlParser.ON, 0); }
		public Algorithm_optionContext algorithm_option(int i) {
			return getRuleContext(Algorithm_optionContext.class,i);
		}
		public List<Index_column_nameContext> index_column_name() {
			return getRuleContexts(Index_column_nameContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public TerminalNode SPATIAL_SYM() { return getToken(IndsqlParser.SPATIAL_SYM, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode UNIQUE_SYM() { return getToken(IndsqlParser.UNIQUE_SYM, 0); }
		public Create_index_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCreate_index_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCreate_index_statement(this);
		}
	}

	public final Create_index_statementContext create_index_statement() throws RecognitionException {
		Create_index_statementContext _localctx = new Create_index_statementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_create_index_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1841); match(CREATE);
			setState(1843);
			_la = _input.LA(1);
			if (_la==FULLTEXT_SYM || _la==SPATIAL_SYM || _la==UNIQUE_SYM) {
				{
				setState(1842);
				_la = _input.LA(1);
				if ( !(_la==FULLTEXT_SYM || _la==SPATIAL_SYM || _la==UNIQUE_SYM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1845); match(INDEX_SYM);
			setState(1846); index_name();
			setState(1848);
			_la = _input.LA(1);
			if (_la==USING_SYM) {
				{
				setState(1847); index_type();
				}
			}

			setState(1850); match(ON);
			setState(1851); table_name();
			setState(1852); match(LPAREN);
			setState(1853); index_column_name();
			setState(1858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1854); match(COMMA);
				setState(1855); index_column_name();
				}
				}
				setState(1860);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1861); match(RPAREN);
			setState(1866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALGORITHM_SYM || _la==LOCK) {
				{
				setState(1864);
				switch (_input.LA(1)) {
				case ALGORITHM_SYM:
					{
					setState(1862); algorithm_option();
					}
					break;
				case LOCK:
					{
					setState(1863); lock_option();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1868);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Algorithm_optionContext extends ParserRuleContext {
		public TerminalNode COPY_SYM() { return getToken(IndsqlParser.COPY_SYM, 0); }
		public TerminalNode DEFAULT() { return getToken(IndsqlParser.DEFAULT, 0); }
		public TerminalNode ALGORITHM_SYM() { return getToken(IndsqlParser.ALGORITHM_SYM, 0); }
		public TerminalNode EQ_SYM() { return getToken(IndsqlParser.EQ_SYM, 0); }
		public TerminalNode INPLACE_SYM() { return getToken(IndsqlParser.INPLACE_SYM, 0); }
		public Algorithm_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithm_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterAlgorithm_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitAlgorithm_option(this);
		}
	}

	public final Algorithm_optionContext algorithm_option() throws RecognitionException {
		Algorithm_optionContext _localctx = new Algorithm_optionContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_algorithm_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1869); match(ALGORITHM_SYM);
			setState(1871);
			_la = _input.LA(1);
			if (_la==EQ_SYM) {
				{
				setState(1870); match(EQ_SYM);
				}
			}

			setState(1873);
			_la = _input.LA(1);
			if ( !(_la==COPY_SYM || _la==DEFAULT || _la==INPLACE_SYM) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lock_optionContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(IndsqlParser.DEFAULT, 0); }
		public TerminalNode LOCK() { return getToken(IndsqlParser.LOCK, 0); }
		public TerminalNode NONE_SYM() { return getToken(IndsqlParser.NONE_SYM, 0); }
		public TerminalNode SHARED_SYM() { return getToken(IndsqlParser.SHARED_SYM, 0); }
		public TerminalNode EXCLUSIVE_SYM() { return getToken(IndsqlParser.EXCLUSIVE_SYM, 0); }
		public TerminalNode EQ_SYM() { return getToken(IndsqlParser.EQ_SYM, 0); }
		public Lock_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lock_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterLock_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitLock_option(this);
		}
	}

	public final Lock_optionContext lock_option() throws RecognitionException {
		Lock_optionContext _localctx = new Lock_optionContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_lock_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1875); match(LOCK);
			setState(1877);
			_la = _input.LA(1);
			if (_la==EQ_SYM) {
				{
				setState(1876); match(EQ_SYM);
				}
			}

			setState(1879);
			_la = _input.LA(1);
			if ( !(_la==DEFAULT || _la==EXCLUSIVE_SYM || _la==NONE_SYM || _la==SHARED_SYM) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_index_statementContext extends ParserRuleContext {
		public List<Algorithm_optionContext> algorithm_option() {
			return getRuleContexts(Algorithm_optionContext.class);
		}
		public List<Lock_optionContext> lock_option() {
			return getRuleContexts(Lock_optionContext.class);
		}
		public TerminalNode ON() { return getToken(IndsqlParser.ON, 0); }
		public Algorithm_optionContext algorithm_option(int i) {
			return getRuleContext(Algorithm_optionContext.class,i);
		}
		public Lock_optionContext lock_option(int i) {
			return getRuleContext(Lock_optionContext.class,i);
		}
		public TerminalNode INDEX_SYM() { return getToken(IndsqlParser.INDEX_SYM, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DROP() { return getToken(IndsqlParser.DROP, 0); }
		public Drop_index_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterDrop_index_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitDrop_index_statement(this);
		}
	}

	public final Drop_index_statementContext drop_index_statement() throws RecognitionException {
		Drop_index_statementContext _localctx = new Drop_index_statementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_drop_index_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1881); match(DROP);
			setState(1882); match(INDEX_SYM);
			setState(1883); index_name();
			setState(1884); match(ON);
			setState(1885); table_name();
			setState(1890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALGORITHM_SYM || _la==LOCK) {
				{
				setState(1888);
				switch (_input.LA(1)) {
				case ALGORITHM_SYM:
					{
					setState(1886); algorithm_option();
					}
					break;
				case LOCK:
					{
					setState(1887); lock_option();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1892);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_server_statementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(IndsqlParser.CREATE, 0); }
		public TerminalNode WRAPPER_SYM() { return getToken(IndsqlParser.WRAPPER_SYM, 0); }
		public List<Create_server_optionContext> create_server_option() {
			return getRuleContexts(Create_server_optionContext.class);
		}
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public TerminalNode SERVER_SYM() { return getToken(IndsqlParser.SERVER_SYM, 0); }
		public TerminalNode OPTIONS_SYM() { return getToken(IndsqlParser.OPTIONS_SYM, 0); }
		public Wrapper_nameContext wrapper_name() {
			return getRuleContext(Wrapper_nameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public Create_server_optionContext create_server_option(int i) {
			return getRuleContext(Create_server_optionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public Server_nameContext server_name() {
			return getRuleContext(Server_nameContext.class,0);
		}
		public TerminalNode DATA_SYM() { return getToken(IndsqlParser.DATA_SYM, 0); }
		public TerminalNode FOREIGN() { return getToken(IndsqlParser.FOREIGN, 0); }
		public Create_server_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_server_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCreate_server_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCreate_server_statement(this);
		}
	}

	public final Create_server_statementContext create_server_statement() throws RecognitionException {
		Create_server_statementContext _localctx = new Create_server_statementContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_create_server_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1893); match(CREATE);
			setState(1894); match(SERVER_SYM);
			setState(1895); server_name();
			setState(1896); match(FOREIGN);
			setState(1897); match(DATA_SYM);
			setState(1898); match(WRAPPER_SYM);
			setState(1899); wrapper_name();
			setState(1900); match(OPTIONS_SYM);
			setState(1901); match(LPAREN);
			setState(1902); create_server_option();
			setState(1907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1903); match(COMMA);
				setState(1904); create_server_option();
				}
				}
				setState(1909);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1910); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_server_optionContext extends ParserRuleContext {
		public TerminalNode PORT_SYM() { return getToken(IndsqlParser.PORT_SYM, 0); }
		public TerminalNode DATABASE() { return getToken(IndsqlParser.DATABASE, 0); }
		public TerminalNode HOST_SYM() { return getToken(IndsqlParser.HOST_SYM, 0); }
		public TerminalNode USER() { return getToken(IndsqlParser.USER, 0); }
		public TerminalNode PASSWORD() { return getToken(IndsqlParser.PASSWORD, 0); }
		public TerminalNode OWNER_SYM() { return getToken(IndsqlParser.OWNER_SYM, 0); }
		public Number_literalContext number_literal() {
			return getRuleContext(Number_literalContext.class,0);
		}
		public TerminalNode SOCKET_SYM() { return getToken(IndsqlParser.SOCKET_SYM, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Create_server_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_server_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCreate_server_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCreate_server_option(this);
		}
	}

	public final Create_server_optionContext create_server_option() throws RecognitionException {
		Create_server_optionContext _localctx = new Create_server_optionContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_create_server_option);
		try {
			setState(1927);
			switch (_input.LA(1)) {
			case COMMA:
			case RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case HOST_SYM:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1913); match(HOST_SYM);
				setState(1914); string_literal();
				}
				}
				break;
			case DATABASE:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1915); match(DATABASE);
				setState(1916); string_literal();
				}
				}
				break;
			case USER:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1917); match(USER);
				setState(1918); string_literal();
				}
				}
				break;
			case PASSWORD:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1919); match(PASSWORD);
				setState(1920); string_literal();
				}
				}
				break;
			case SOCKET_SYM:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1921); match(SOCKET_SYM);
				setState(1922); string_literal();
				}
				}
				break;
			case OWNER_SYM:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(1923); match(OWNER_SYM);
				setState(1924); string_literal();
				}
				}
				break;
			case PORT_SYM:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(1925); match(PORT_SYM);
				setState(1926); number_literal();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_server_statementContext extends ParserRuleContext {
		public TerminalNode OPTIONS_SYM() { return getToken(IndsqlParser.OPTIONS_SYM, 0); }
		public TerminalNode SERVER_SYM() { return getToken(IndsqlParser.SERVER_SYM, 0); }
		public List<Alter_server_optionContext> alter_server_option() {
			return getRuleContexts(Alter_server_optionContext.class);
		}
		public TerminalNode ALTER() { return getToken(IndsqlParser.ALTER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public Alter_server_optionContext alter_server_option(int i) {
			return getRuleContext(Alter_server_optionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public Server_nameContext server_name() {
			return getRuleContext(Server_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Alter_server_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_server_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterAlter_server_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitAlter_server_statement(this);
		}
	}

	public final Alter_server_statementContext alter_server_statement() throws RecognitionException {
		Alter_server_statementContext _localctx = new Alter_server_statementContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_alter_server_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1929); match(ALTER);
			setState(1930); match(SERVER_SYM);
			setState(1931); server_name();
			setState(1932); match(OPTIONS_SYM);
			setState(1933); match(LPAREN);
			setState(1934); alter_server_option();
			setState(1939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1935); match(COMMA);
				setState(1936); alter_server_option();
				}
				}
				setState(1941);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1942); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_server_optionContext extends ParserRuleContext {
		public TerminalNode USER() { return getToken(IndsqlParser.USER, 0); }
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public TerminalNode TEXT_STRING() { return getToken(IndsqlParser.TEXT_STRING, 0); }
		public Alter_server_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_server_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterAlter_server_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitAlter_server_option(this);
		}
	}

	public final Alter_server_optionContext alter_server_option() throws RecognitionException {
		Alter_server_optionContext _localctx = new Alter_server_optionContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_alter_server_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1944); match(USER);
			}
			setState(1945);
			_la = _input.LA(1);
			if ( !(_la==TEXT_STRING || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_server_statementContext extends ParserRuleContext {
		public TerminalNode SERVER_SYM() { return getToken(IndsqlParser.SERVER_SYM, 0); }
		public TerminalNode IF() { return getToken(IndsqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(IndsqlParser.EXISTS, 0); }
		public Server_nameContext server_name() {
			return getRuleContext(Server_nameContext.class,0);
		}
		public TerminalNode DROP() { return getToken(IndsqlParser.DROP, 0); }
		public Drop_server_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_server_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterDrop_server_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitDrop_server_statement(this);
		}
	}

	public final Drop_server_statementContext drop_server_statement() throws RecognitionException {
		Drop_server_statementContext _localctx = new Drop_server_statementContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_drop_server_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1947); match(DROP);
			setState(1948); match(SERVER_SYM);
			setState(1951);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1949); match(IF);
				setState(1950); match(EXISTS);
				}
			}

			setState(1953); server_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_statementContext extends ParserRuleContext {
		public Create_table_statement3Context create_table_statement3() {
			return getRuleContext(Create_table_statement3Context.class,0);
		}
		public Create_table_statement2Context create_table_statement2() {
			return getRuleContext(Create_table_statement2Context.class,0);
		}
		public Create_table_statement1Context create_table_statement1() {
			return getRuleContext(Create_table_statement1Context.class,0);
		}
		public Create_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCreate_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCreate_table_statement(this);
		}
	}

	public final Create_table_statementContext create_table_statement() throws RecognitionException {
		Create_table_statementContext _localctx = new Create_table_statementContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_create_table_statement);
		try {
			setState(1958);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1955); create_table_statement1();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1956); create_table_statement2();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1957); create_table_statement3();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_statement1Context extends ParserRuleContext {
		public TerminalNode NOT_SYM() { return getToken(IndsqlParser.NOT_SYM, 0); }
		public TerminalNode CREATE() { return getToken(IndsqlParser.CREATE, 0); }
		public Create_definitionContext create_definition(int i) {
			return getRuleContext(Create_definitionContext.class,i);
		}
		public TerminalNode EXISTS() { return getToken(IndsqlParser.EXISTS, 0); }
		public Partition_optionsContext partition_options() {
			return getRuleContext(Partition_optionsContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(IndsqlParser.TEMPORARY, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Table_optionsContext table_options() {
			return getRuleContext(Table_optionsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public TerminalNode IF() { return getToken(IndsqlParser.IF, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public TerminalNode TABLE() { return getToken(IndsqlParser.TABLE, 0); }
		public List<Create_definitionContext> create_definition() {
			return getRuleContexts(Create_definitionContext.class);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_statement1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCreate_table_statement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCreate_table_statement1(this);
		}
	}

	public final Create_table_statement1Context create_table_statement1() throws RecognitionException {
		Create_table_statement1Context _localctx = new Create_table_statement1Context(_ctx, getState());
		enterRule(_localctx, 300, RULE_create_table_statement1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1960); match(CREATE);
			setState(1962);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1961); match(TEMPORARY);
				}
			}

			setState(1964); match(TABLE);
			setState(1968);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1965); match(IF);
				setState(1966); match(NOT_SYM);
				setState(1967); match(EXISTS);
				}
			}

			setState(1970); table_name();
			setState(1971); match(LPAREN);
			setState(1972); create_definition();
			setState(1977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1973); match(COMMA);
				setState(1974); create_definition();
				}
				}
				setState(1979);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1980); match(RPAREN);
			setState(1982);
			_la = _input.LA(1);
			if (_la==AUTO_INCREMENT || _la==AVG_ROW_LENGTH || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (CHARACTER_SYM - 68)) | (1L << (CHECKSUM_SYM - 68)) | (1L << (COLLATE_SYM - 68)) | (1L << (COMMENT_SYM - 68)) | (1L << (CONNECTION_SYM - 68)) | (1L << (DATA_SYM - 68)))) != 0) || ((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (DEFAULT - 151)) | (1L << (DELAY_KEY_WRITE_SYM - 151)) | (1L << (ENGINE_SYM - 151)))) != 0) || ((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & ((1L << (INDEX_SYM - 266)) | (1L << (INSERT_METHOD - 266)) | (1L << (KEY_BLOCK_SIZE - 266)))) != 0) || _la==MAX_ROWS || _la==MIN_ROWS || _la==PACK_KEYS_SYM || _la==PASSWORD || ((((_la - 515)) & ~0x3f) == 0 && ((1L << (_la - 515)) & ((1L << (ROW_FORMAT_SYM - 515)) | (1L << (STATS_AUTO_RECALC - 515)) | (1L << (STATS_PERSISTENT - 515)))) != 0) || _la==UNION_SYM) {
				{
				setState(1981); table_options();
				}
			}

			setState(1985);
			_la = _input.LA(1);
			if (_la==PARTITION_SYM) {
				{
				setState(1984); partition_options();
				}
			}

			setState(1988);
			_la = _input.LA(1);
			if (_la==SELECT) {
				{
				setState(1987); select_statement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_statement2Context extends ParserRuleContext {
		public TerminalNode NOT_SYM() { return getToken(IndsqlParser.NOT_SYM, 0); }
		public TerminalNode IF() { return getToken(IndsqlParser.IF, 0); }
		public TerminalNode CREATE() { return getToken(IndsqlParser.CREATE, 0); }
		public TerminalNode EXISTS() { return getToken(IndsqlParser.EXISTS, 0); }
		public Partition_optionsContext partition_options() {
			return getRuleContext(Partition_optionsContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(IndsqlParser.TEMPORARY, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Table_optionsContext table_options() {
			return getRuleContext(Table_optionsContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(IndsqlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_statement2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCreate_table_statement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCreate_table_statement2(this);
		}
	}

	public final Create_table_statement2Context create_table_statement2() throws RecognitionException {
		Create_table_statement2Context _localctx = new Create_table_statement2Context(_ctx, getState());
		enterRule(_localctx, 302, RULE_create_table_statement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1990); match(CREATE);
			setState(1992);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1991); match(TEMPORARY);
				}
			}

			setState(1994); match(TABLE);
			setState(1998);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1995); match(IF);
				setState(1996); match(NOT_SYM);
				setState(1997); match(EXISTS);
				}
			}

			setState(2000); table_name();
			setState(2002);
			_la = _input.LA(1);
			if (_la==AUTO_INCREMENT || _la==AVG_ROW_LENGTH || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (CHARACTER_SYM - 68)) | (1L << (CHECKSUM_SYM - 68)) | (1L << (COLLATE_SYM - 68)) | (1L << (COMMENT_SYM - 68)) | (1L << (CONNECTION_SYM - 68)) | (1L << (DATA_SYM - 68)))) != 0) || ((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (DEFAULT - 151)) | (1L << (DELAY_KEY_WRITE_SYM - 151)) | (1L << (ENGINE_SYM - 151)))) != 0) || ((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & ((1L << (INDEX_SYM - 266)) | (1L << (INSERT_METHOD - 266)) | (1L << (KEY_BLOCK_SIZE - 266)))) != 0) || _la==MAX_ROWS || _la==MIN_ROWS || _la==PACK_KEYS_SYM || _la==PASSWORD || ((((_la - 515)) & ~0x3f) == 0 && ((1L << (_la - 515)) & ((1L << (ROW_FORMAT_SYM - 515)) | (1L << (STATS_AUTO_RECALC - 515)) | (1L << (STATS_PERSISTENT - 515)))) != 0) || _la==UNION_SYM) {
				{
				setState(2001); table_options();
				}
			}

			setState(2005);
			_la = _input.LA(1);
			if (_la==PARTITION_SYM) {
				{
				setState(2004); partition_options();
				}
			}

			setState(2007); select_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_statement3Context extends ParserRuleContext {
		public TerminalNode NOT_SYM() { return getToken(IndsqlParser.NOT_SYM, 0); }
		public TerminalNode IF() { return getToken(IndsqlParser.IF, 0); }
		public TerminalNode CREATE() { return getToken(IndsqlParser.CREATE, 0); }
		public TerminalNode EXISTS() { return getToken(IndsqlParser.EXISTS, 0); }
		public TerminalNode TEMPORARY() { return getToken(IndsqlParser.TEMPORARY, 0); }
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public TerminalNode TABLE() { return getToken(IndsqlParser.TABLE, 0); }
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public TerminalNode LIKE_SYM() { return getToken(IndsqlParser.LIKE_SYM, 0); }
		public Create_table_statement3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCreate_table_statement3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCreate_table_statement3(this);
		}
	}

	public final Create_table_statement3Context create_table_statement3() throws RecognitionException {
		Create_table_statement3Context _localctx = new Create_table_statement3Context(_ctx, getState());
		enterRule(_localctx, 304, RULE_create_table_statement3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2009); match(CREATE);
			setState(2011);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(2010); match(TEMPORARY);
				}
			}

			setState(2013); match(TABLE);
			setState(2017);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2014); match(IF);
				setState(2015); match(NOT_SYM);
				setState(2016); match(EXISTS);
				}
			}

			setState(2019); table_name();
			setState(2027);
			switch (_input.LA(1)) {
			case LIKE_SYM:
				{
				{
				setState(2020); match(LIKE_SYM);
				setState(2021); table_name();
				}
				}
				break;
			case LPAREN:
				{
				{
				setState(2022); match(LPAREN);
				setState(2023); match(LIKE_SYM);
				setState(2024); table_name();
				setState(2025); match(RPAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_definitionContext extends ParserRuleContext {
		public TerminalNode FULLTEXT_SYM() { return getToken(IndsqlParser.FULLTEXT_SYM, 0); }
		public Index_optionContext index_option(int i) {
			return getRuleContext(Index_optionContext.class,i);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode INDEX_SYM() { return getToken(IndsqlParser.INDEX_SYM, 0); }
		public Constraint_symbol_nameContext constraint_symbol_name() {
			return getRuleContext(Constraint_symbol_nameContext.class,0);
		}
		public List<Index_optionContext> index_option() {
			return getRuleContexts(Index_optionContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public Index_column_nameContext index_column_name(int i) {
			return getRuleContext(Index_column_nameContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public TerminalNode PRIMARY_SYM() { return getToken(IndsqlParser.PRIMARY_SYM, 0); }
		public List<Index_column_nameContext> index_column_name() {
			return getRuleContexts(Index_column_nameContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public TerminalNode KEY_SYM() { return getToken(IndsqlParser.KEY_SYM, 0); }
		public TerminalNode CHECK_SYM() { return getToken(IndsqlParser.CHECK_SYM, 0); }
		public TerminalNode SPATIAL_SYM() { return getToken(IndsqlParser.SPATIAL_SYM, 0); }
		public TerminalNode CONSTRAINT() { return getToken(IndsqlParser.CONSTRAINT, 0); }
		public TerminalNode UNIQUE_SYM() { return getToken(IndsqlParser.UNIQUE_SYM, 0); }
		public Reference_definitionContext reference_definition() {
			return getRuleContext(Reference_definitionContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(IndsqlParser.FOREIGN, 0); }
		public Create_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCreate_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCreate_definition(this);
		}
	}

	public final Create_definitionContext create_definition() throws RecognitionException {
		Create_definitionContext _localctx = new Create_definitionContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_create_definition);
		int _la;
		try {
			setState(2165);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2029); column_name();
				setState(2030); column_definition();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2036);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(2032); match(CONSTRAINT);
					setState(2034);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(2033); constraint_symbol_name();
						}
					}

					}
				}

				setState(2038); match(PRIMARY_SYM);
				setState(2039); match(KEY_SYM);
				setState(2041);
				_la = _input.LA(1);
				if (_la==USING_SYM) {
					{
					setState(2040); index_type();
					}
				}

				setState(2043); match(LPAREN);
				setState(2044); index_column_name();
				setState(2049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2045); match(COMMA);
					setState(2046); index_column_name();
					}
					}
					setState(2051);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2052); match(RPAREN);
				setState(2056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT_SYM || _la==KEY_BLOCK_SIZE || _la==USING_SYM || _la==WITH) {
					{
					{
					setState(2053); index_option();
					}
					}
					setState(2058);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(2059);
				_la = _input.LA(1);
				if ( !(_la==INDEX_SYM || _la==KEY_SYM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(2061);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(2060); index_name();
					}
				}

				setState(2064);
				_la = _input.LA(1);
				if (_la==USING_SYM) {
					{
					setState(2063); index_type();
					}
				}

				setState(2066); match(LPAREN);
				setState(2067); index_column_name();
				setState(2072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2068); match(COMMA);
					setState(2069); index_column_name();
					}
					}
					setState(2074);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2075); match(RPAREN);
				setState(2079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT_SYM || _la==KEY_BLOCK_SIZE || _la==USING_SYM || _la==WITH) {
					{
					{
					setState(2076); index_option();
					}
					}
					setState(2081);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(2086);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(2082); match(CONSTRAINT);
					setState(2084);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(2083); constraint_symbol_name();
						}
					}

					}
				}

				setState(2088); match(UNIQUE_SYM);
				setState(2090);
				_la = _input.LA(1);
				if (_la==INDEX_SYM || _la==KEY_SYM) {
					{
					setState(2089);
					_la = _input.LA(1);
					if ( !(_la==INDEX_SYM || _la==KEY_SYM) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(2093);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(2092); index_name();
					}
				}

				setState(2096);
				_la = _input.LA(1);
				if (_la==USING_SYM) {
					{
					setState(2095); index_type();
					}
				}

				setState(2098); match(LPAREN);
				setState(2099); index_column_name();
				setState(2104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2100); match(COMMA);
					setState(2101); index_column_name();
					}
					}
					setState(2106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2107); match(RPAREN);
				setState(2111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT_SYM || _la==KEY_BLOCK_SIZE || _la==USING_SYM || _la==WITH) {
					{
					{
					setState(2108); index_option();
					}
					}
					setState(2113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(2114);
				_la = _input.LA(1);
				if ( !(_la==FULLTEXT_SYM || _la==SPATIAL_SYM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(2116);
				_la = _input.LA(1);
				if (_la==INDEX_SYM || _la==KEY_SYM) {
					{
					setState(2115);
					_la = _input.LA(1);
					if ( !(_la==INDEX_SYM || _la==KEY_SYM) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(2119);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(2118); index_name();
					}
				}

				setState(2121); match(LPAREN);
				setState(2122); index_column_name();
				setState(2127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2123); match(COMMA);
					setState(2124); index_column_name();
					}
					}
					setState(2129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2130); match(RPAREN);
				setState(2134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT_SYM || _la==KEY_BLOCK_SIZE || _la==USING_SYM || _la==WITH) {
					{
					{
					setState(2131); index_option();
					}
					}
					setState(2136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(2141);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(2137); match(CONSTRAINT);
					setState(2139);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(2138); constraint_symbol_name();
						}
					}

					}
				}

				setState(2143); match(FOREIGN);
				setState(2144); match(KEY_SYM);
				setState(2146);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(2145); index_name();
					}
				}

				setState(2148); match(LPAREN);
				setState(2149); index_column_name();
				setState(2154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2150); match(COMMA);
					setState(2151); index_column_name();
					}
					}
					setState(2156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2157); match(RPAREN);
				setState(2158); reference_definition();
				}
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(2160); match(CHECK_SYM);
				setState(2161); match(LPAREN);
				setState(2162); expression();
				setState(2163); match(RPAREN);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definitionContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(IndsqlParser.DEFAULT, 0); }
		public TerminalNode FIXED_SYM() { return getToken(IndsqlParser.FIXED_SYM, 0); }
		public TerminalNode AUTO_INCREMENT() { return getToken(IndsqlParser.AUTO_INCREMENT, 0); }
		public TerminalNode COMMENT_SYM() { return getToken(IndsqlParser.COMMENT_SYM, 0); }
		public TerminalNode PRIMARY_SYM() { return getToken(IndsqlParser.PRIMARY_SYM, 0); }
		public TerminalNode KEY_SYM() { return getToken(IndsqlParser.KEY_SYM, 0); }
		public TerminalNode DYNAMIC_SYM() { return getToken(IndsqlParser.DYNAMIC_SYM, 0); }
		public TerminalNode COLUMN_FORMAT() { return getToken(IndsqlParser.COLUMN_FORMAT, 0); }
		public TerminalNode UNIQUE_SYM() { return getToken(IndsqlParser.UNIQUE_SYM, 0); }
		public Column_data_type_headerContext column_data_type_header() {
			return getRuleContext(Column_data_type_headerContext.class,0);
		}
		public Reference_definitionContext reference_definition() {
			return getRuleContext(Reference_definitionContext.class,0);
		}
		public TerminalNode TEXT_STRING() { return getToken(IndsqlParser.TEXT_STRING, 0); }
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterColumn_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitColumn_definition(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_column_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2167); column_data_type_header();
			setState(2169);
			_la = _input.LA(1);
			if (_la==AUTO_INCREMENT) {
				{
				setState(2168); match(AUTO_INCREMENT);
				}
			}

			setState(2179);
			switch (_input.LA(1)) {
			case UNIQUE_SYM:
				{
				{
				setState(2171); match(UNIQUE_SYM);
				setState(2173);
				_la = _input.LA(1);
				if (_la==KEY_SYM) {
					{
					setState(2172); match(KEY_SYM);
					}
				}

				}
				}
				break;
			case PRIMARY_SYM:
				{
				{
				setState(2175); match(PRIMARY_SYM);
				setState(2177);
				_la = _input.LA(1);
				if (_la==KEY_SYM) {
					{
					setState(2176); match(KEY_SYM);
					}
				}

				}
				}
				break;
			case AFTER_SYM:
			case COLUMN_FORMAT:
			case COMMENT_SYM:
			case FIRST_SYM:
			case PARTITION_SYM:
			case REFERENCES:
			case SEMI:
			case COMMA:
			case RPAREN:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2183);
			_la = _input.LA(1);
			if (_la==COMMENT_SYM) {
				{
				setState(2181); match(COMMENT_SYM);
				setState(2182); match(TEXT_STRING);
				}
			}

			setState(2187);
			_la = _input.LA(1);
			if (_la==COLUMN_FORMAT) {
				{
				setState(2185); match(COLUMN_FORMAT);
				setState(2186);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==DYNAMIC_SYM || _la==FIXED_SYM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(2190);
			_la = _input.LA(1);
			if (_la==REFERENCES) {
				{
				setState(2189); reference_definition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_or_notnullContext extends ParserRuleContext {
		public TerminalNode NOT_SYM() { return getToken(IndsqlParser.NOT_SYM, 0); }
		public TerminalNode NULL_SYM() { return getToken(IndsqlParser.NULL_SYM, 0); }
		public Null_or_notnullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_or_notnull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterNull_or_notnull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitNull_or_notnull(this);
		}
	}

	public final Null_or_notnullContext null_or_notnull() throws RecognitionException {
		Null_or_notnullContext _localctx = new Null_or_notnullContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_null_or_notnull);
		try {
			setState(2195);
			switch (_input.LA(1)) {
			case NOT_SYM:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2192); match(NOT_SYM);
				setState(2193); match(NULL_SYM);
				}
				}
				break;
			case NULL_SYM:
				enterOuterAlt(_localctx, 2);
				{
				setState(2194); match(NULL_SYM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_data_type_headerContext extends ParserRuleContext {
		public TerminalNode TIMESTAMP() { return getToken(IndsqlParser.TIMESTAMP, 0); }
		public TerminalNode ENUM() { return getToken(IndsqlParser.ENUM, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(IndsqlParser.CURRENT_TIMESTAMP, 0); }
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public TerminalNode TINYTEXT() { return getToken(IndsqlParser.TINYTEXT, 0); }
		public List<TerminalNode> SET_SYM() { return getTokens(IndsqlParser.SET_SYM); }
		public TerminalNode DATE_SYM() { return getToken(IndsqlParser.DATE_SYM, 0); }
		public TerminalNode YEAR() { return getToken(IndsqlParser.YEAR, 0); }
		public TerminalNode DEFAULT() { return getToken(IndsqlParser.DEFAULT, 0); }
		public Bit_literalContext bit_literal() {
			return getRuleContext(Bit_literalContext.class,0);
		}
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode DECIMAL_SYM() { return getToken(IndsqlParser.DECIMAL_SYM, 0); }
		public TerminalNode CHAR() { return getToken(IndsqlParser.CHAR, 0); }
		public List<Number_literalContext> number_literal() {
			return getRuleContexts(Number_literalContext.class);
		}
		public TerminalNode SMALLINT() { return getToken(IndsqlParser.SMALLINT, 0); }
		public TerminalNode VARBINARY() { return getToken(IndsqlParser.VARBINARY, 0); }
		public TerminalNode FLOAT_SYM() { return getToken(IndsqlParser.FLOAT_SYM, 0); }
		public TerminalNode UNSIGNED_SYM() { return getToken(IndsqlParser.UNSIGNED_SYM, 0); }
		public Number_literalContext number_literal(int i) {
			return getRuleContext(Number_literalContext.class,i);
		}
		public TerminalNode TEXT_STRING(int i) {
			return getToken(IndsqlParser.TEXT_STRING, i);
		}
		public TerminalNode INTEGER_SYM() { return getToken(IndsqlParser.INTEGER_SYM, 0); }
		public TerminalNode VARCHAR() { return getToken(IndsqlParser.VARCHAR, 0); }
		public TerminalNode DOUBLE_SYM() { return getToken(IndsqlParser.DOUBLE_SYM, 0); }
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public TerminalNode INTEGER_NUM() { return getToken(IndsqlParser.INTEGER_NUM, 0); }
		public TerminalNode TINYBLOB() { return getToken(IndsqlParser.TINYBLOB, 0); }
		public TerminalNode LONGTEXT() { return getToken(IndsqlParser.LONGTEXT, 0); }
		public TerminalNode SET_SYM(int i) {
			return getToken(IndsqlParser.SET_SYM, i);
		}
		public TerminalNode CHARACTER_SYM() { return getToken(IndsqlParser.CHARACTER_SYM, 0); }
		public TerminalNode BLOB_SYM() { return getToken(IndsqlParser.BLOB_SYM, 0); }
		public TerminalNode DATETIME() { return getToken(IndsqlParser.DATETIME, 0); }
		public TerminalNode MEDIUMTEXT() { return getToken(IndsqlParser.MEDIUMTEXT, 0); }
		public TerminalNode COLLATE_SYM() { return getToken(IndsqlParser.COLLATE_SYM, 0); }
		public TerminalNode TIME_SYM() { return getToken(IndsqlParser.TIME_SYM, 0); }
		public TerminalNode INT_SYM() { return getToken(IndsqlParser.INT_SYM, 0); }
		public TerminalNode REAL() { return getToken(IndsqlParser.REAL, 0); }
		public TerminalNode BINARY() { return getToken(IndsqlParser.BINARY, 0); }
		public TerminalNode BIGINT() { return getToken(IndsqlParser.BIGINT, 0); }
		public Null_or_notnullContext null_or_notnull() {
			return getRuleContext(Null_or_notnullContext.class,0);
		}
		public TerminalNode NUMERIC_SYM() { return getToken(IndsqlParser.NUMERIC_SYM, 0); }
		public TerminalNode TINYINT() { return getToken(IndsqlParser.TINYINT, 0); }
		public TerminalNode TEXT_SYM() { return getToken(IndsqlParser.TEXT_SYM, 0); }
		public TerminalNode MEDIUMINT() { return getToken(IndsqlParser.MEDIUMINT, 0); }
		public TerminalNode BIT_SYM() { return getToken(IndsqlParser.BIT_SYM, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public List<TerminalNode> TEXT_STRING() { return getTokens(IndsqlParser.TEXT_STRING); }
		public TerminalNode LONGBLOB() { return getToken(IndsqlParser.LONGBLOB, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public TerminalNode MEDIUMBLOB() { return getToken(IndsqlParser.MEDIUMBLOB, 0); }
		public TerminalNode ZEROFILL() { return getToken(IndsqlParser.ZEROFILL, 0); }
		public Column_data_type_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_data_type_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterColumn_data_type_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitColumn_data_type_header(this);
		}
	}

	public final Column_data_type_headerContext column_data_type_header() throws RecognitionException {
		Column_data_type_headerContext _localctx = new Column_data_type_headerContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_column_data_type_header);
		int _la;
		try {
			setState(2687);
			switch (_input.LA(1)) {
			case BIT_SYM:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2197); match(BIT_SYM);
				setState(2202);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2198); match(LPAREN);
					setState(2199); length();
					setState(2200); match(RPAREN);
					}
				}

				setState(2205);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2204); null_or_notnull();
					}
				}

				setState(2209);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2207); match(DEFAULT);
					setState(2208); bit_literal();
					}
				}

				}
				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2211); match(TINYINT);
				setState(2216);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2212); match(LPAREN);
					setState(2213); length();
					setState(2214); match(RPAREN);
					}
				}

				setState(2219);
				_la = _input.LA(1);
				if (_la==UNSIGNED_SYM) {
					{
					setState(2218); match(UNSIGNED_SYM);
					}
				}

				setState(2222);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(2221); match(ZEROFILL);
					}
				}

				setState(2225);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2224); null_or_notnull();
					}
				}

				setState(2229);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2227); match(DEFAULT);
					setState(2228); number_literal();
					}
				}

				}
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(2231); match(SMALLINT);
				setState(2236);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2232); match(LPAREN);
					setState(2233); length();
					setState(2234); match(RPAREN);
					}
				}

				setState(2239);
				_la = _input.LA(1);
				if (_la==UNSIGNED_SYM) {
					{
					setState(2238); match(UNSIGNED_SYM);
					}
				}

				setState(2242);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(2241); match(ZEROFILL);
					}
				}

				setState(2245);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2244); null_or_notnull();
					}
				}

				setState(2249);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2247); match(DEFAULT);
					setState(2248); number_literal();
					}
				}

				}
				}
				break;
			case MEDIUMINT:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(2251); match(MEDIUMINT);
				setState(2256);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2252); match(LPAREN);
					setState(2253); length();
					setState(2254); match(RPAREN);
					}
				}

				setState(2259);
				_la = _input.LA(1);
				if (_la==UNSIGNED_SYM) {
					{
					setState(2258); match(UNSIGNED_SYM);
					}
				}

				setState(2262);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(2261); match(ZEROFILL);
					}
				}

				setState(2265);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2264); null_or_notnull();
					}
				}

				setState(2269);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2267); match(DEFAULT);
					setState(2268); number_literal();
					}
				}

				}
				}
				break;
			case INT_SYM:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(2271); match(INT_SYM);
				setState(2276);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2272); match(LPAREN);
					setState(2273); length();
					setState(2274); match(RPAREN);
					}
				}

				setState(2279);
				_la = _input.LA(1);
				if (_la==UNSIGNED_SYM) {
					{
					setState(2278); match(UNSIGNED_SYM);
					}
				}

				setState(2282);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(2281); match(ZEROFILL);
					}
				}

				setState(2285);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2284); null_or_notnull();
					}
				}

				setState(2289);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2287); match(DEFAULT);
					setState(2288); number_literal();
					}
				}

				}
				}
				break;
			case INTEGER_SYM:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(2291); match(INTEGER_SYM);
				setState(2296);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2292); match(LPAREN);
					setState(2293); length();
					setState(2294); match(RPAREN);
					}
				}

				setState(2299);
				_la = _input.LA(1);
				if (_la==UNSIGNED_SYM) {
					{
					setState(2298); match(UNSIGNED_SYM);
					}
				}

				setState(2302);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(2301); match(ZEROFILL);
					}
				}

				setState(2305);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2304); null_or_notnull();
					}
				}

				setState(2309);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2307); match(DEFAULT);
					setState(2308); number_literal();
					}
				}

				}
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(2311); match(BIGINT);
				setState(2316);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2312); match(LPAREN);
					setState(2313); length();
					setState(2314); match(RPAREN);
					}
				}

				setState(2319);
				_la = _input.LA(1);
				if (_la==UNSIGNED_SYM) {
					{
					setState(2318); match(UNSIGNED_SYM);
					}
				}

				setState(2322);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(2321); match(ZEROFILL);
					}
				}

				setState(2325);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2324); null_or_notnull();
					}
				}

				setState(2329);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2327); match(DEFAULT);
					setState(2328); number_literal();
					}
				}

				}
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(2331); match(REAL);
				setState(2338);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2332); match(LPAREN);
					setState(2333); length();
					setState(2334); match(COMMA);
					setState(2335); number_literal();
					setState(2336); match(RPAREN);
					}
				}

				setState(2341);
				_la = _input.LA(1);
				if (_la==UNSIGNED_SYM) {
					{
					setState(2340); match(UNSIGNED_SYM);
					}
				}

				setState(2344);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(2343); match(ZEROFILL);
					}
				}

				setState(2347);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2346); null_or_notnull();
					}
				}

				setState(2351);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2349); match(DEFAULT);
					setState(2350); number_literal();
					}
				}

				}
				}
				break;
			case DOUBLE_SYM:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(2353); match(DOUBLE_SYM);
				setState(2360);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2354); match(LPAREN);
					setState(2355); length();
					setState(2356); match(COMMA);
					setState(2357); number_literal();
					setState(2358); match(RPAREN);
					}
				}

				setState(2363);
				_la = _input.LA(1);
				if (_la==UNSIGNED_SYM) {
					{
					setState(2362); match(UNSIGNED_SYM);
					}
				}

				setState(2366);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(2365); match(ZEROFILL);
					}
				}

				setState(2369);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2368); null_or_notnull();
					}
				}

				setState(2373);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2371); match(DEFAULT);
					setState(2372); number_literal();
					}
				}

				}
				}
				break;
			case FLOAT_SYM:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(2375); match(FLOAT_SYM);
				setState(2382);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2376); match(LPAREN);
					setState(2377); length();
					setState(2378); match(COMMA);
					setState(2379); number_literal();
					setState(2380); match(RPAREN);
					}
				}

				setState(2385);
				_la = _input.LA(1);
				if (_la==UNSIGNED_SYM) {
					{
					setState(2384); match(UNSIGNED_SYM);
					}
				}

				setState(2388);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(2387); match(ZEROFILL);
					}
				}

				setState(2391);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2390); null_or_notnull();
					}
				}

				setState(2395);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2393); match(DEFAULT);
					setState(2394); number_literal();
					}
				}

				}
				}
				break;
			case DECIMAL_SYM:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(2397); match(DECIMAL_SYM);
				setState(2406);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2398); match(LPAREN);
					setState(2399); length();
					setState(2402);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(2400); match(COMMA);
						setState(2401); number_literal();
						}
					}

					setState(2404); match(RPAREN);
					}
				}

				setState(2409);
				_la = _input.LA(1);
				if (_la==UNSIGNED_SYM) {
					{
					setState(2408); match(UNSIGNED_SYM);
					}
				}

				setState(2412);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(2411); match(ZEROFILL);
					}
				}

				setState(2415);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2414); null_or_notnull();
					}
				}

				setState(2419);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2417); match(DEFAULT);
					setState(2418); number_literal();
					}
				}

				}
				}
				break;
			case NUMERIC_SYM:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(2421); match(NUMERIC_SYM);
				setState(2430);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2422); match(LPAREN);
					setState(2423); length();
					setState(2426);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(2424); match(COMMA);
						setState(2425); number_literal();
						}
					}

					setState(2428); match(RPAREN);
					}
				}

				setState(2433);
				_la = _input.LA(1);
				if (_la==UNSIGNED_SYM) {
					{
					setState(2432); match(UNSIGNED_SYM);
					}
				}

				setState(2436);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(2435); match(ZEROFILL);
					}
				}

				setState(2439);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2438); null_or_notnull();
					}
				}

				setState(2443);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2441); match(DEFAULT);
					setState(2442); number_literal();
					}
				}

				}
				}
				break;
			case DATE_SYM:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(2445); match(DATE_SYM);
				setState(2447);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2446); null_or_notnull();
					}
				}

				setState(2451);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2449); match(DEFAULT);
					setState(2450); match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case TIME_SYM:
				enterOuterAlt(_localctx, 14);
				{
				{
				setState(2453); match(TIME_SYM);
				setState(2455);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2454); null_or_notnull();
					}
				}

				setState(2459);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2457); match(DEFAULT);
					setState(2458); match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 15);
				{
				{
				setState(2461); match(TIMESTAMP);
				setState(2463);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2462); null_or_notnull();
					}
				}

				setState(2467);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2465); match(DEFAULT);
					setState(2466);
					_la = _input.LA(1);
					if ( !(_la==CURRENT_TIMESTAMP || _la==TEXT_STRING) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				}
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 16);
				{
				{
				setState(2469); match(DATETIME);
				setState(2471);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2470); null_or_notnull();
					}
				}

				setState(2475);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2473); match(DEFAULT);
					setState(2474);
					_la = _input.LA(1);
					if ( !(_la==CURRENT_TIMESTAMP || _la==TEXT_STRING) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				}
				}
				break;
			case YEAR:
				enterOuterAlt(_localctx, 17);
				{
				{
				setState(2477); match(YEAR);
				setState(2479);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2478); null_or_notnull();
					}
				}

				setState(2483);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2481); match(DEFAULT);
					setState(2482); match(INTEGER_NUM);
					}
				}

				}
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 18);
				{
				{
				setState(2485); match(CHAR);
				setState(2490);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2486); match(LPAREN);
					setState(2487); length();
					setState(2488); match(RPAREN);
					}
				}

				setState(2495);
				_la = _input.LA(1);
				if (_la==CHARACTER_SYM) {
					{
					setState(2492); match(CHARACTER_SYM);
					setState(2493); match(SET_SYM);
					setState(2494); charset_name();
					}
				}

				setState(2499);
				_la = _input.LA(1);
				if (_la==COLLATE_SYM) {
					{
					setState(2497); match(COLLATE_SYM);
					setState(2498); collation_name();
					}
				}

				setState(2502);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2501); null_or_notnull();
					}
				}

				setState(2506);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2504); match(DEFAULT);
					setState(2505); match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 19);
				{
				{
				setState(2508); match(VARCHAR);
				setState(2509); match(LPAREN);
				setState(2510); length();
				setState(2511); match(RPAREN);
				setState(2515);
				_la = _input.LA(1);
				if (_la==CHARACTER_SYM) {
					{
					setState(2512); match(CHARACTER_SYM);
					setState(2513); match(SET_SYM);
					setState(2514); charset_name();
					}
				}

				setState(2519);
				_la = _input.LA(1);
				if (_la==COLLATE_SYM) {
					{
					setState(2517); match(COLLATE_SYM);
					setState(2518); collation_name();
					}
				}

				setState(2522);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2521); null_or_notnull();
					}
				}

				setState(2526);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2524); match(DEFAULT);
					setState(2525); match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 20);
				{
				{
				setState(2528); match(BINARY);
				setState(2533);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2529); match(LPAREN);
					setState(2530); length();
					setState(2531); match(RPAREN);
					}
				}

				setState(2536);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2535); null_or_notnull();
					}
				}

				setState(2540);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2538); match(DEFAULT);
					setState(2539); match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case VARBINARY:
				enterOuterAlt(_localctx, 21);
				{
				{
				setState(2542); match(VARBINARY);
				setState(2543); match(LPAREN);
				setState(2544); length();
				setState(2545); match(RPAREN);
				setState(2547);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2546); null_or_notnull();
					}
				}

				setState(2551);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2549); match(DEFAULT);
					setState(2550); match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case TINYBLOB:
				enterOuterAlt(_localctx, 22);
				{
				{
				setState(2553); match(TINYBLOB);
				setState(2555);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2554); null_or_notnull();
					}
				}

				}
				}
				break;
			case BLOB_SYM:
				enterOuterAlt(_localctx, 23);
				{
				{
				setState(2557); match(BLOB_SYM);
				setState(2559);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2558); null_or_notnull();
					}
				}

				}
				}
				break;
			case MEDIUMBLOB:
				enterOuterAlt(_localctx, 24);
				{
				{
				setState(2561); match(MEDIUMBLOB);
				setState(2563);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2562); null_or_notnull();
					}
				}

				}
				}
				break;
			case LONGBLOB:
				enterOuterAlt(_localctx, 25);
				{
				{
				setState(2565); match(LONGBLOB);
				setState(2567);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2566); null_or_notnull();
					}
				}

				}
				}
				break;
			case TINYTEXT:
				enterOuterAlt(_localctx, 26);
				{
				{
				setState(2569); match(TINYTEXT);
				setState(2571);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(2570); match(BINARY);
					}
				}

				setState(2576);
				_la = _input.LA(1);
				if (_la==CHARACTER_SYM) {
					{
					setState(2573); match(CHARACTER_SYM);
					setState(2574); match(SET_SYM);
					setState(2575); charset_name();
					}
				}

				setState(2580);
				_la = _input.LA(1);
				if (_la==COLLATE_SYM) {
					{
					setState(2578); match(COLLATE_SYM);
					setState(2579); collation_name();
					}
				}

				setState(2583);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2582); null_or_notnull();
					}
				}

				}
				}
				break;
			case TEXT_SYM:
				enterOuterAlt(_localctx, 27);
				{
				{
				setState(2585); match(TEXT_SYM);
				setState(2587);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(2586); match(BINARY);
					}
				}

				setState(2592);
				_la = _input.LA(1);
				if (_la==CHARACTER_SYM) {
					{
					setState(2589); match(CHARACTER_SYM);
					setState(2590); match(SET_SYM);
					setState(2591); charset_name();
					}
				}

				setState(2596);
				_la = _input.LA(1);
				if (_la==COLLATE_SYM) {
					{
					setState(2594); match(COLLATE_SYM);
					setState(2595); collation_name();
					}
				}

				setState(2599);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2598); null_or_notnull();
					}
				}

				}
				}
				break;
			case MEDIUMTEXT:
				enterOuterAlt(_localctx, 28);
				{
				{
				setState(2601); match(MEDIUMTEXT);
				setState(2603);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(2602); match(BINARY);
					}
				}

				setState(2608);
				_la = _input.LA(1);
				if (_la==CHARACTER_SYM) {
					{
					setState(2605); match(CHARACTER_SYM);
					setState(2606); match(SET_SYM);
					setState(2607); charset_name();
					}
				}

				setState(2612);
				_la = _input.LA(1);
				if (_la==COLLATE_SYM) {
					{
					setState(2610); match(COLLATE_SYM);
					setState(2611); collation_name();
					}
				}

				setState(2615);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2614); null_or_notnull();
					}
				}

				}
				}
				break;
			case LONGTEXT:
				enterOuterAlt(_localctx, 29);
				{
				{
				setState(2617); match(LONGTEXT);
				setState(2619);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(2618); match(BINARY);
					}
				}

				setState(2624);
				_la = _input.LA(1);
				if (_la==CHARACTER_SYM) {
					{
					setState(2621); match(CHARACTER_SYM);
					setState(2622); match(SET_SYM);
					setState(2623); charset_name();
					}
				}

				setState(2628);
				_la = _input.LA(1);
				if (_la==COLLATE_SYM) {
					{
					setState(2626); match(COLLATE_SYM);
					setState(2627); collation_name();
					}
				}

				setState(2631);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2630); null_or_notnull();
					}
				}

				}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 30);
				{
				{
				setState(2633); match(ENUM);
				setState(2634); match(LPAREN);
				setState(2635); match(TEXT_STRING);
				setState(2640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2636); match(COMMA);
					setState(2637); match(TEXT_STRING);
					}
					}
					setState(2642);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2643); match(RPAREN);
				setState(2647);
				_la = _input.LA(1);
				if (_la==CHARACTER_SYM) {
					{
					setState(2644); match(CHARACTER_SYM);
					setState(2645); match(SET_SYM);
					setState(2646); charset_name();
					}
				}

				setState(2651);
				_la = _input.LA(1);
				if (_la==COLLATE_SYM) {
					{
					setState(2649); match(COLLATE_SYM);
					setState(2650); collation_name();
					}
				}

				setState(2654);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2653); null_or_notnull();
					}
				}

				setState(2658);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2656); match(DEFAULT);
					setState(2657); match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case SET_SYM:
				enterOuterAlt(_localctx, 31);
				{
				{
				setState(2660); match(SET_SYM);
				setState(2661); match(LPAREN);
				setState(2662); match(TEXT_STRING);
				setState(2667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2663); match(COMMA);
					setState(2664); match(TEXT_STRING);
					}
					}
					setState(2669);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2670); match(RPAREN);
				setState(2674);
				_la = _input.LA(1);
				if (_la==CHARACTER_SYM) {
					{
					setState(2671); match(CHARACTER_SYM);
					setState(2672); match(SET_SYM);
					setState(2673); charset_name();
					}
				}

				setState(2678);
				_la = _input.LA(1);
				if (_la==COLLATE_SYM) {
					{
					setState(2676); match(COLLATE_SYM);
					setState(2677); collation_name();
					}
				}

				setState(2681);
				_la = _input.LA(1);
				if (_la==NOT_SYM || _la==NULL_SYM) {
					{
					setState(2680); null_or_notnull();
					}
				}

				setState(2685);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2683); match(DEFAULT);
					setState(2684); match(TEXT_STRING);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_column_nameContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(IndsqlParser.INTEGER_NUM, 0); }
		public TerminalNode DESC() { return getToken(IndsqlParser.DESC, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public TerminalNode ASC() { return getToken(IndsqlParser.ASC, 0); }
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public Index_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterIndex_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitIndex_column_name(this);
		}
	}

	public final Index_column_nameContext index_column_name() throws RecognitionException {
		Index_column_nameContext _localctx = new Index_column_nameContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_index_column_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2689); column_name();
			setState(2693);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2690); match(LPAREN);
				setState(2691); match(INTEGER_NUM);
				setState(2692); match(RPAREN);
				}
			}

			setState(2696);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2695);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_definitionContext extends ParserRuleContext {
		public Reference_optionContext reference_option(int i) {
			return getRuleContext(Reference_optionContext.class,i);
		}
		public TerminalNode FULL() { return getToken(IndsqlParser.FULL, 0); }
		public TerminalNode ON(int i) {
			return getToken(IndsqlParser.ON, i);
		}
		public TerminalNode PARTIAL() { return getToken(IndsqlParser.PARTIAL, 0); }
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public TerminalNode SIMPLE_SYM() { return getToken(IndsqlParser.SIMPLE_SYM, 0); }
		public Index_column_nameContext index_column_name(int i) {
			return getRuleContext(Index_column_nameContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public TerminalNode REFERENCES() { return getToken(IndsqlParser.REFERENCES, 0); }
		public TerminalNode MATCH() { return getToken(IndsqlParser.MATCH, 0); }
		public List<TerminalNode> ON() { return getTokens(IndsqlParser.ON); }
		public List<Reference_optionContext> reference_option() {
			return getRuleContexts(Reference_optionContext.class);
		}
		public List<Index_column_nameContext> index_column_name() {
			return getRuleContexts(Index_column_nameContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public TerminalNode DELETE_SYM() { return getToken(IndsqlParser.DELETE_SYM, 0); }
		public TerminalNode UPDATE() { return getToken(IndsqlParser.UPDATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Reference_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterReference_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitReference_definition(this);
		}
	}

	public final Reference_definitionContext reference_definition() throws RecognitionException {
		Reference_definitionContext _localctx = new Reference_definitionContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_reference_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2698); match(REFERENCES);
			setState(2699); table_name();
			setState(2700); match(LPAREN);
			setState(2701); index_column_name();
			setState(2706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2702); match(COMMA);
				setState(2703); index_column_name();
				}
				}
				setState(2708);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2709); match(RPAREN);
			setState(2716);
			switch ( getInterpreter().adaptivePredict(_input,422,_ctx) ) {
			case 1:
				{
				{
				setState(2710); match(MATCH);
				setState(2711); match(FULL);
				}
				}
				break;

			case 2:
				{
				{
				setState(2712); match(MATCH);
				setState(2713); match(PARTIAL);
				}
				}
				break;

			case 3:
				{
				{
				setState(2714); match(MATCH);
				setState(2715); match(SIMPLE_SYM);
				}
				}
				break;
			}
			setState(2721);
			switch ( getInterpreter().adaptivePredict(_input,423,_ctx) ) {
			case 1:
				{
				setState(2718); match(ON);
				setState(2719); match(DELETE_SYM);
				setState(2720); reference_option();
				}
				break;
			}
			setState(2726);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2723); match(ON);
				setState(2724); match(UPDATE);
				setState(2725); reference_option();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_optionContext extends ParserRuleContext {
		public TerminalNode CASCADE() { return getToken(IndsqlParser.CASCADE, 0); }
		public TerminalNode ACTION() { return getToken(IndsqlParser.ACTION, 0); }
		public TerminalNode NULL_SYM() { return getToken(IndsqlParser.NULL_SYM, 0); }
		public TerminalNode SET_SYM() { return getToken(IndsqlParser.SET_SYM, 0); }
		public TerminalNode RESTRICT() { return getToken(IndsqlParser.RESTRICT, 0); }
		public TerminalNode NO_SYM() { return getToken(IndsqlParser.NO_SYM, 0); }
		public Reference_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterReference_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitReference_option(this);
		}
	}

	public final Reference_optionContext reference_option() throws RecognitionException {
		Reference_optionContext _localctx = new Reference_optionContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_reference_option);
		try {
			setState(2734);
			switch (_input.LA(1)) {
			case RESTRICT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2728); match(RESTRICT);
				}
				}
				break;
			case CASCADE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2729); match(CASCADE);
				}
				}
				break;
			case SET_SYM:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(2730); match(SET_SYM);
				setState(2731); match(NULL_SYM);
				}
				}
				break;
			case NO_SYM:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(2732); match(NO_SYM);
				setState(2733); match(ACTION);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_optionsContext extends ParserRuleContext {
		public List<Table_optionContext> table_option() {
			return getRuleContexts(Table_optionContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public Table_optionContext table_option(int i) {
			return getRuleContext(Table_optionContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterTable_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitTable_options(this);
		}
	}

	public final Table_optionsContext table_options() throws RecognitionException {
		Table_optionsContext _localctx = new Table_optionsContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_table_options);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2736); table_option();
			setState(2743);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,427,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(2738);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(2737); match(COMMA);
						}
					}

					setState(2740); table_option();
					}
					} 
				}
				setState(2745);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,427,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_optionContext extends ParserRuleContext {
		public TerminalNode STATS_AUTO_RECALC() { return getToken(IndsqlParser.STATS_AUTO_RECALC, 0); }
		public TerminalNode ROW_FORMAT_SYM() { return getToken(IndsqlParser.ROW_FORMAT_SYM, 0); }
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public TerminalNode SET_SYM() { return getToken(IndsqlParser.SET_SYM, 0); }
		public Engine_nameContext engine_name() {
			return getRuleContext(Engine_nameContext.class,0);
		}
		public TerminalNode DIRECTORY_SYM() { return getToken(IndsqlParser.DIRECTORY_SYM, 0); }
		public TerminalNode COLLATE_SYM() { return getToken(IndsqlParser.COLLATE_SYM, 0); }
		public TerminalNode NO_SYM() { return getToken(IndsqlParser.NO_SYM, 0); }
		public TerminalNode UNION_SYM() { return getToken(IndsqlParser.UNION_SYM, 0); }
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(IndsqlParser.KEY_BLOCK_SIZE, 0); }
		public TerminalNode DEFAULT() { return getToken(IndsqlParser.DEFAULT, 0); }
		public TerminalNode CHECKSUM_SYM() { return getToken(IndsqlParser.CHECKSUM_SYM, 0); }
		public TerminalNode CONNECTION_SYM() { return getToken(IndsqlParser.CONNECTION_SYM, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode STATS_PERSISTENT() { return getToken(IndsqlParser.STATS_PERSISTENT, 0); }
		public TerminalNode FIRST_SYM() { return getToken(IndsqlParser.FIRST_SYM, 0); }
		public TerminalNode DELAY_KEY_WRITE_SYM() { return getToken(IndsqlParser.DELAY_KEY_WRITE_SYM, 0); }
		public TerminalNode REDUNDANT_SYM() { return getToken(IndsqlParser.REDUNDANT_SYM, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public TerminalNode MIN_ROWS() { return getToken(IndsqlParser.MIN_ROWS, 0); }
		public TerminalNode EQ_SYM() { return getToken(IndsqlParser.EQ_SYM, 0); }
		public TerminalNode LAST_SYM() { return getToken(IndsqlParser.LAST_SYM, 0); }
		public TerminalNode AVG_ROW_LENGTH() { return getToken(IndsqlParser.AVG_ROW_LENGTH, 0); }
		public TerminalNode COMPACT_SYM() { return getToken(IndsqlParser.COMPACT_SYM, 0); }
		public TerminalNode AUTO_INCREMENT() { return getToken(IndsqlParser.AUTO_INCREMENT, 0); }
		public TerminalNode COMPRESSED_SYM() { return getToken(IndsqlParser.COMPRESSED_SYM, 0); }
		public TerminalNode INDEX_SYM() { return getToken(IndsqlParser.INDEX_SYM, 0); }
		public TerminalNode PASSWORD() { return getToken(IndsqlParser.PASSWORD, 0); }
		public TerminalNode INSERT_METHOD() { return getToken(IndsqlParser.INSERT_METHOD, 0); }
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public TerminalNode TEXT_STRING() { return getToken(IndsqlParser.TEXT_STRING, 0); }
		public TerminalNode INTEGER_NUM() { return getToken(IndsqlParser.INTEGER_NUM, 0); }
		public TerminalNode FIXED_SYM() { return getToken(IndsqlParser.FIXED_SYM, 0); }
		public TerminalNode ENGINE_SYM() { return getToken(IndsqlParser.ENGINE_SYM, 0); }
		public TerminalNode CHARACTER_SYM() { return getToken(IndsqlParser.CHARACTER_SYM, 0); }
		public TerminalNode COMMENT_SYM() { return getToken(IndsqlParser.COMMENT_SYM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public TerminalNode MAX_ROWS() { return getToken(IndsqlParser.MAX_ROWS, 0); }
		public TerminalNode DYNAMIC_SYM() { return getToken(IndsqlParser.DYNAMIC_SYM, 0); }
		public TerminalNode PACK_KEYS_SYM() { return getToken(IndsqlParser.PACK_KEYS_SYM, 0); }
		public TerminalNode DATA_SYM() { return getToken(IndsqlParser.DATA_SYM, 0); }
		public Table_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterTable_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitTable_option(this);
		}
	}

	public final Table_optionContext table_option() throws RecognitionException {
		Table_optionContext _localctx = new Table_optionContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_table_option);
		int _la;
		try {
			setState(2870);
			switch ( getInterpreter().adaptivePredict(_input,452,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2746); match(ENGINE_SYM);
				setState(2748);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2747); match(EQ_SYM);
					}
				}

				setState(2750); engine_name();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2751); match(AUTO_INCREMENT);
				setState(2753);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2752); match(EQ_SYM);
					}
				}

				setState(2755); match(INTEGER_NUM);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(2756); match(AVG_ROW_LENGTH);
				setState(2758);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2757); match(EQ_SYM);
					}
				}

				setState(2760); match(INTEGER_NUM);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(2762);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2761); match(DEFAULT);
					}
				}

				setState(2764); match(CHARACTER_SYM);
				setState(2765); match(SET_SYM);
				setState(2767);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2766); match(EQ_SYM);
					}
				}

				setState(2769); charset_name();
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(2770); match(CHECKSUM_SYM);
				setState(2772);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2771); match(EQ_SYM);
					}
				}

				setState(2774); match(INTEGER_NUM);
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(2776);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2775); match(DEFAULT);
					}
				}

				setState(2778); match(COLLATE_SYM);
				setState(2780);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2779); match(EQ_SYM);
					}
				}

				setState(2782); collation_name();
				}
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(2783); match(COMMENT_SYM);
				setState(2785);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2784); match(EQ_SYM);
					}
				}

				setState(2787); match(TEXT_STRING);
				}
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(2788); match(CONNECTION_SYM);
				setState(2790);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2789); match(EQ_SYM);
					}
				}

				setState(2792); match(TEXT_STRING);
				}
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(2793); match(DATA_SYM);
				setState(2794); match(DIRECTORY_SYM);
				setState(2796);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2795); match(EQ_SYM);
					}
				}

				setState(2798); match(TEXT_STRING);
				}
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(2799); match(DELAY_KEY_WRITE_SYM);
				setState(2801);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2800); match(EQ_SYM);
					}
				}

				setState(2803); match(INTEGER_NUM);
				}
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(2804); match(INDEX_SYM);
				setState(2805); match(DIRECTORY_SYM);
				setState(2807);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2806); match(EQ_SYM);
					}
				}

				setState(2809); match(TEXT_STRING);
				}
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(2810); match(INSERT_METHOD);
				setState(2812);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2811); match(EQ_SYM);
					}
				}

				setState(2814);
				_la = _input.LA(1);
				if ( !(_la==FIRST_SYM || _la==LAST_SYM || _la==NO_SYM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(2815); match(KEY_BLOCK_SIZE);
				setState(2817);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2816); match(EQ_SYM);
					}
				}

				setState(2819); match(INTEGER_NUM);
				}
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				{
				setState(2820); match(MAX_ROWS);
				setState(2822);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2821); match(EQ_SYM);
					}
				}

				setState(2824); match(INTEGER_NUM);
				}
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				{
				setState(2825); match(MIN_ROWS);
				setState(2827);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2826); match(EQ_SYM);
					}
				}

				setState(2829); match(INTEGER_NUM);
				}
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				{
				setState(2830); match(PACK_KEYS_SYM);
				setState(2832);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2831); match(EQ_SYM);
					}
				}

				setState(2834);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==INTEGER_NUM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				{
				setState(2835); match(PASSWORD);
				setState(2837);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2836); match(EQ_SYM);
					}
				}

				setState(2839); match(TEXT_STRING);
				}
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				{
				setState(2840); match(ROW_FORMAT_SYM);
				setState(2842);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2841); match(EQ_SYM);
					}
				}

				setState(2844);
				_la = _input.LA(1);
				if ( !(_la==COMPACT_SYM || _la==COMPRESSED_SYM || _la==DEFAULT || _la==DYNAMIC_SYM || _la==FIXED_SYM || _la==REDUNDANT_SYM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				{
				setState(2845); match(STATS_AUTO_RECALC);
				setState(2847);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2846); match(EQ_SYM);
					}
				}

				setState(2849);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==INTEGER_NUM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				break;

			case 20:
				enterOuterAlt(_localctx, 20);
				{
				{
				setState(2850); match(STATS_PERSISTENT);
				setState(2852);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2851); match(EQ_SYM);
					}
				}

				setState(2854);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==INTEGER_NUM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				break;

			case 21:
				enterOuterAlt(_localctx, 21);
				{
				{
				setState(2855); match(UNION_SYM);
				setState(2857);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2856); match(EQ_SYM);
					}
				}

				setState(2859); match(LPAREN);
				setState(2860); table_name();
				setState(2865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2861); match(COMMA);
					setState(2862); table_name();
					}
					}
					setState(2867);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2868); match(RPAREN);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_optionsContext extends ParserRuleContext {
		public List<Partition_definitionContext> partition_definition() {
			return getRuleContexts(Partition_definitionContext.class);
		}
		public TerminalNode COLUMNS_SYM() { return getToken(IndsqlParser.COLUMNS_SYM, 0); }
		public List<TerminalNode> BY_SYM() { return getTokens(IndsqlParser.BY_SYM); }
		public TerminalNode RANGE_SYM() { return getToken(IndsqlParser.RANGE_SYM, 0); }
		public TerminalNode KEY_SYM(int i) {
			return getToken(IndsqlParser.KEY_SYM, i);
		}
		public List<Column_listContext> column_list() {
			return getRuleContexts(Column_listContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode HASH_SYM(int i) {
			return getToken(IndsqlParser.HASH_SYM, i);
		}
		public Partition_definitionContext partition_definition(int i) {
			return getRuleContext(Partition_definitionContext.class,i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> HASH_SYM() { return getTokens(IndsqlParser.HASH_SYM); }
		public Column_listContext column_list(int i) {
			return getRuleContext(Column_listContext.class,i);
		}
		public TerminalNode PARTITIONS_SYM() { return getToken(IndsqlParser.PARTITIONS_SYM, 0); }
		public TerminalNode INTEGER_NUM(int i) {
			return getToken(IndsqlParser.INTEGER_NUM, i);
		}
		public TerminalNode BY_SYM(int i) {
			return getToken(IndsqlParser.BY_SYM, i);
		}
		public TerminalNode RPAREN(int i) {
			return getToken(IndsqlParser.RPAREN, i);
		}
		public TerminalNode SUBPARTITION_SYM() { return getToken(IndsqlParser.SUBPARTITION_SYM, 0); }
		public TerminalNode PARTITION_SYM() { return getToken(IndsqlParser.PARTITION_SYM, 0); }
		public TerminalNode LIST_SYM() { return getToken(IndsqlParser.LIST_SYM, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(IndsqlParser.LPAREN); }
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public List<TerminalNode> INTEGER_NUM() { return getTokens(IndsqlParser.INTEGER_NUM); }
		public TerminalNode LINEAR_SYM(int i) {
			return getToken(IndsqlParser.LINEAR_SYM, i);
		}
		public TerminalNode LPAREN(int i) {
			return getToken(IndsqlParser.LPAREN, i);
		}
		public List<TerminalNode> LINEAR_SYM() { return getTokens(IndsqlParser.LINEAR_SYM); }
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public List<TerminalNode> RPAREN() { return getTokens(IndsqlParser.RPAREN); }
		public List<TerminalNode> KEY_SYM() { return getTokens(IndsqlParser.KEY_SYM); }
		public TerminalNode SUBPARTITIONS_SYM() { return getToken(IndsqlParser.SUBPARTITIONS_SYM, 0); }
		public Partition_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterPartition_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitPartition_options(this);
		}
	}

	public final Partition_optionsContext partition_options() throws RecognitionException {
		Partition_optionsContext _localctx = new Partition_optionsContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_partition_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2872); match(PARTITION_SYM);
			setState(2873); match(BY_SYM);
			setState(2914);
			switch ( getInterpreter().adaptivePredict(_input,457,_ctx) ) {
			case 1:
				{
				{
				setState(2875);
				_la = _input.LA(1);
				if (_la==LINEAR_SYM) {
					{
					setState(2874); match(LINEAR_SYM);
					}
				}

				setState(2877); match(HASH_SYM);
				setState(2878); match(LPAREN);
				setState(2879); expression();
				setState(2880); match(RPAREN);
				}
				}
				break;

			case 2:
				{
				{
				setState(2883);
				_la = _input.LA(1);
				if (_la==LINEAR_SYM) {
					{
					setState(2882); match(LINEAR_SYM);
					}
				}

				setState(2885); match(KEY_SYM);
				setState(2886); match(LPAREN);
				setState(2887); column_list();
				setState(2888); match(RPAREN);
				}
				}
				break;

			case 3:
				{
				{
				setState(2890); match(RANGE_SYM);
				setState(2900);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					setState(2891); match(LPAREN);
					setState(2892); expression();
					setState(2893); match(RPAREN);
					}
					break;
				case COLUMNS_SYM:
					{
					setState(2895); match(COLUMNS_SYM);
					setState(2896); match(LPAREN);
					setState(2897); column_list();
					setState(2898); match(RPAREN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;

			case 4:
				{
				{
				setState(2902); match(LIST_SYM);
				setState(2912);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					setState(2903); match(LPAREN);
					setState(2904); expression();
					setState(2905); match(RPAREN);
					}
					break;
				case COLUMNS_SYM:
					{
					setState(2907); match(COLUMNS_SYM);
					setState(2908); match(LPAREN);
					setState(2909); column_list();
					setState(2910); match(RPAREN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			}
			setState(2918);
			_la = _input.LA(1);
			if (_la==PARTITIONS_SYM) {
				{
				setState(2916); match(PARTITIONS_SYM);
				setState(2917); match(INTEGER_NUM);
				}
			}

			setState(2944);
			_la = _input.LA(1);
			if (_la==SUBPARTITION_SYM) {
				{
				setState(2920); match(SUBPARTITION_SYM);
				setState(2921); match(BY_SYM);
				setState(2938);
				switch ( getInterpreter().adaptivePredict(_input,461,_ctx) ) {
				case 1:
					{
					{
					setState(2923);
					_la = _input.LA(1);
					if (_la==LINEAR_SYM) {
						{
						setState(2922); match(LINEAR_SYM);
						}
					}

					setState(2925); match(HASH_SYM);
					setState(2926); match(LPAREN);
					setState(2927); expression();
					setState(2928); match(RPAREN);
					}
					}
					break;

				case 2:
					{
					{
					setState(2931);
					_la = _input.LA(1);
					if (_la==LINEAR_SYM) {
						{
						setState(2930); match(LINEAR_SYM);
						}
					}

					setState(2933); match(KEY_SYM);
					setState(2934); match(LPAREN);
					setState(2935); column_list();
					setState(2936); match(RPAREN);
					}
					}
					break;
				}
				setState(2942);
				_la = _input.LA(1);
				if (_la==SUBPARTITIONS_SYM) {
					{
					setState(2940); match(SUBPARTITIONS_SYM);
					setState(2941); match(INTEGER_NUM);
					}
				}

				}
			}

			setState(2957);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2946); match(LPAREN);
				setState(2947); partition_definition();
				setState(2952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2948); match(COMMA);
					setState(2949); partition_definition();
					}
					}
					setState(2954);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2955); match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_definitionContext extends ParserRuleContext {
		public TerminalNode MAXVALUE_SYM() { return getToken(IndsqlParser.MAXVALUE_SYM, 0); }
		public Engine_nameContext engine_name() {
			return getRuleContext(Engine_nameContext.class,0);
		}
		public List<TerminalNode> DIRECTORY_SYM() { return getTokens(IndsqlParser.DIRECTORY_SYM); }
		public Subpartition_definitionContext subpartition_definition(int i) {
			return getRuleContext(Subpartition_definitionContext.class,i);
		}
		public List<Subpartition_definitionContext> subpartition_definition() {
			return getRuleContexts(Subpartition_definitionContext.class);
		}
		public TerminalNode VALUES() { return getToken(IndsqlParser.VALUES, 0); }
		public TerminalNode MIN_ROWS() { return getToken(IndsqlParser.MIN_ROWS, 0); }
		public TerminalNode EQ_SYM(int i) {
			return getToken(IndsqlParser.EQ_SYM, i);
		}
		public List<TerminalNode> EQ_SYM() { return getTokens(IndsqlParser.EQ_SYM); }
		public TerminalNode DIRECTORY_SYM(int i) {
			return getToken(IndsqlParser.DIRECTORY_SYM, i);
		}
		public TerminalNode INTEGER_NUM(int i) {
			return getToken(IndsqlParser.INTEGER_NUM, i);
		}
		public TerminalNode RPAREN(int i) {
			return getToken(IndsqlParser.RPAREN, i);
		}
		public TerminalNode INDEX_SYM() { return getToken(IndsqlParser.INDEX_SYM, 0); }
		public TerminalNode TEXT_STRING(int i) {
			return getToken(IndsqlParser.TEXT_STRING, i);
		}
		public TerminalNode PARTITION_SYM() { return getToken(IndsqlParser.PARTITION_SYM, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(IndsqlParser.LPAREN); }
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public TerminalNode IN_SYM() { return getToken(IndsqlParser.IN_SYM, 0); }
		public List<TerminalNode> TEXT_STRING() { return getTokens(IndsqlParser.TEXT_STRING); }
		public List<TerminalNode> INTEGER_NUM() { return getTokens(IndsqlParser.INTEGER_NUM); }
		public TerminalNode LESS_SYM() { return getToken(IndsqlParser.LESS_SYM, 0); }
		public TerminalNode LPAREN(int i) {
			return getToken(IndsqlParser.LPAREN, i);
		}
		public TerminalNode ENGINE_SYM() { return getToken(IndsqlParser.ENGINE_SYM, 0); }
		public TerminalNode COMMENT_SYM() { return getToken(IndsqlParser.COMMENT_SYM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public Partition_nameContext partition_name() {
			return getRuleContext(Partition_nameContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(IndsqlParser.RPAREN); }
		public TerminalNode STORAGE_SYM() { return getToken(IndsqlParser.STORAGE_SYM, 0); }
		public TerminalNode MAX_ROWS() { return getToken(IndsqlParser.MAX_ROWS, 0); }
		public TerminalNode DATA_SYM() { return getToken(IndsqlParser.DATA_SYM, 0); }
		public TerminalNode THAN_SYM() { return getToken(IndsqlParser.THAN_SYM, 0); }
		public Partition_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterPartition_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitPartition_definition(this);
		}
	}

	public final Partition_definitionContext partition_definition() throws RecognitionException {
		Partition_definitionContext _localctx = new Partition_definitionContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_partition_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2959); match(PARTITION_SYM);
			setState(2960); partition_name();
			setState(2978);
			_la = _input.LA(1);
			if (_la==VALUES) {
				{
				setState(2961); match(VALUES);
				setState(2976);
				switch (_input.LA(1)) {
				case LESS_SYM:
					{
					{
					setState(2962); match(LESS_SYM);
					setState(2963); match(THAN_SYM);
					setState(2969);
					switch (_input.LA(1)) {
					case LPAREN:
						{
						{
						setState(2964); match(LPAREN);
						setState(2965); expression_list();
						setState(2966); match(RPAREN);
						}
						}
						break;
					case MAXVALUE_SYM:
						{
						setState(2968); match(MAXVALUE_SYM);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				case IN_SYM:
					{
					{
					setState(2971); match(IN_SYM);
					setState(2972); match(LPAREN);
					setState(2973); expression_list();
					setState(2974); match(RPAREN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(2988);
			_la = _input.LA(1);
			if (_la==ENGINE_SYM || _la==STORAGE_SYM) {
				{
				setState(2981);
				_la = _input.LA(1);
				if (_la==STORAGE_SYM) {
					{
					setState(2980); match(STORAGE_SYM);
					}
				}

				setState(2983); match(ENGINE_SYM);
				setState(2985);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2984); match(EQ_SYM);
					}
				}

				setState(2987); engine_name();
				}
			}

			setState(2995);
			_la = _input.LA(1);
			if (_la==COMMENT_SYM) {
				{
				setState(2990); match(COMMENT_SYM);
				setState(2992);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2991); match(EQ_SYM);
					}
				}

				setState(2994); match(TEXT_STRING);
				}
			}

			setState(3003);
			_la = _input.LA(1);
			if (_la==DATA_SYM) {
				{
				setState(2997); match(DATA_SYM);
				setState(2998); match(DIRECTORY_SYM);
				setState(3000);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(2999); match(EQ_SYM);
					}
				}

				setState(3002); match(TEXT_STRING);
				}
			}

			setState(3011);
			_la = _input.LA(1);
			if (_la==INDEX_SYM) {
				{
				setState(3005); match(INDEX_SYM);
				setState(3006); match(DIRECTORY_SYM);
				setState(3008);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(3007); match(EQ_SYM);
					}
				}

				setState(3010); match(TEXT_STRING);
				}
			}

			setState(3018);
			_la = _input.LA(1);
			if (_la==MAX_ROWS) {
				{
				setState(3013); match(MAX_ROWS);
				setState(3015);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(3014); match(EQ_SYM);
					}
				}

				setState(3017); match(INTEGER_NUM);
				}
			}

			setState(3025);
			_la = _input.LA(1);
			if (_la==MIN_ROWS) {
				{
				setState(3020); match(MIN_ROWS);
				setState(3022);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(3021); match(EQ_SYM);
					}
				}

				setState(3024); match(INTEGER_NUM);
				}
			}

			setState(3038);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(3027); match(LPAREN);
				setState(3028); subpartition_definition();
				setState(3033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3029); match(COMMA);
					setState(3030); subpartition_definition();
					}
					}
					setState(3035);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3036); match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subpartition_definitionContext extends ParserRuleContext {
		public Partition_logical_nameContext partition_logical_name() {
			return getRuleContext(Partition_logical_nameContext.class,0);
		}
		public Engine_nameContext engine_name() {
			return getRuleContext(Engine_nameContext.class,0);
		}
		public TerminalNode SUBPARTITION_SYM() { return getToken(IndsqlParser.SUBPARTITION_SYM, 0); }
		public TerminalNode TEXT_STRING(int i) {
			return getToken(IndsqlParser.TEXT_STRING, i);
		}
		public TerminalNode INDEX_SYM() { return getToken(IndsqlParser.INDEX_SYM, 0); }
		public List<TerminalNode> DIRECTORY_SYM() { return getTokens(IndsqlParser.DIRECTORY_SYM); }
		public List<TerminalNode> TEXT_STRING() { return getTokens(IndsqlParser.TEXT_STRING); }
		public List<TerminalNode> INTEGER_NUM() { return getTokens(IndsqlParser.INTEGER_NUM); }
		public TerminalNode ENGINE_SYM() { return getToken(IndsqlParser.ENGINE_SYM, 0); }
		public TerminalNode COMMENT_SYM() { return getToken(IndsqlParser.COMMENT_SYM, 0); }
		public TerminalNode STORAGE_SYM() { return getToken(IndsqlParser.STORAGE_SYM, 0); }
		public TerminalNode MAX_ROWS() { return getToken(IndsqlParser.MAX_ROWS, 0); }
		public TerminalNode EQ_SYM(int i) {
			return getToken(IndsqlParser.EQ_SYM, i);
		}
		public TerminalNode MIN_ROWS() { return getToken(IndsqlParser.MIN_ROWS, 0); }
		public List<TerminalNode> EQ_SYM() { return getTokens(IndsqlParser.EQ_SYM); }
		public TerminalNode DATA_SYM() { return getToken(IndsqlParser.DATA_SYM, 0); }
		public TerminalNode INTEGER_NUM(int i) {
			return getToken(IndsqlParser.INTEGER_NUM, i);
		}
		public TerminalNode DIRECTORY_SYM(int i) {
			return getToken(IndsqlParser.DIRECTORY_SYM, i);
		}
		public Subpartition_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpartition_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterSubpartition_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitSubpartition_definition(this);
		}
	}

	public final Subpartition_definitionContext subpartition_definition() throws RecognitionException {
		Subpartition_definitionContext _localctx = new Subpartition_definitionContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_subpartition_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3040); match(SUBPARTITION_SYM);
			setState(3041); partition_logical_name();
			setState(3050);
			_la = _input.LA(1);
			if (_la==ENGINE_SYM || _la==STORAGE_SYM) {
				{
				setState(3043);
				_la = _input.LA(1);
				if (_la==STORAGE_SYM) {
					{
					setState(3042); match(STORAGE_SYM);
					}
				}

				setState(3045); match(ENGINE_SYM);
				setState(3047);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(3046); match(EQ_SYM);
					}
				}

				setState(3049); engine_name();
				}
			}

			setState(3057);
			_la = _input.LA(1);
			if (_la==COMMENT_SYM) {
				{
				setState(3052); match(COMMENT_SYM);
				setState(3054);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(3053); match(EQ_SYM);
					}
				}

				setState(3056); match(TEXT_STRING);
				}
			}

			setState(3065);
			_la = _input.LA(1);
			if (_la==DATA_SYM) {
				{
				setState(3059); match(DATA_SYM);
				setState(3060); match(DIRECTORY_SYM);
				setState(3062);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(3061); match(EQ_SYM);
					}
				}

				setState(3064); match(TEXT_STRING);
				}
			}

			setState(3073);
			_la = _input.LA(1);
			if (_la==INDEX_SYM) {
				{
				setState(3067); match(INDEX_SYM);
				setState(3068); match(DIRECTORY_SYM);
				setState(3070);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(3069); match(EQ_SYM);
					}
				}

				setState(3072); match(TEXT_STRING);
				}
			}

			setState(3080);
			_la = _input.LA(1);
			if (_la==MAX_ROWS) {
				{
				setState(3075); match(MAX_ROWS);
				setState(3077);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(3076); match(EQ_SYM);
					}
				}

				setState(3079); match(INTEGER_NUM);
				}
			}

			setState(3087);
			_la = _input.LA(1);
			if (_la==MIN_ROWS) {
				{
				setState(3082); match(MIN_ROWS);
				setState(3084);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(3083); match(EQ_SYM);
					}
				}

				setState(3086); match(INTEGER_NUM);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(IndsqlParser.INTEGER_NUM, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitLength(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3089); match(INTEGER_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_statementContext extends ParserRuleContext {
		public Partition_optionsContext partition_options() {
			return getRuleContext(Partition_optionsContext.class,0);
		}
		public Alter_table_specificationContext alter_table_specification(int i) {
			return getRuleContext(Alter_table_specificationContext.class,i);
		}
		public TerminalNode ALTER() { return getToken(IndsqlParser.ALTER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public List<Alter_table_specificationContext> alter_table_specification() {
			return getRuleContexts(Alter_table_specificationContext.class);
		}
		public TerminalNode TABLE() { return getToken(IndsqlParser.TABLE, 0); }
		public TerminalNode IGNORE_SYM() { return getToken(IndsqlParser.IGNORE_SYM, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Alter_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterAlter_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitAlter_table_statement(this);
		}
	}

	public final Alter_table_statementContext alter_table_statement() throws RecognitionException {
		Alter_table_statementContext _localctx = new Alter_table_statementContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_alter_table_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3091); match(ALTER);
			setState(3093);
			_la = _input.LA(1);
			if (_la==IGNORE_SYM) {
				{
				setState(3092); match(IGNORE_SYM);
				}
			}

			setState(3095); match(TABLE);
			setState(3096); table_name();
			setState(3105);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (ADD_SYM - 5)) | (1L << (ALGORITHM_SYM - 5)) | (1L << (ALTER - 5)) | (1L << (ANALYZE_SYM - 5)) | (1L << (AUTO_INCREMENT - 5)) | (1L << (AVG_ROW_LENGTH - 5)) | (1L << (CHANGE - 5)) | (1L << (CHARACTER_SYM - 5)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (CHECK_SYM - 70)) | (1L << (CHECKSUM_SYM - 70)) | (1L << (COALESCE - 70)) | (1L << (COLLATE_SYM - 70)) | (1L << (COMMENT_SYM - 70)) | (1L << (CONNECTION_SYM - 70)) | (1L << (CONVERT_SYM - 70)) | (1L << (DATA_SYM - 70)))) != 0) || ((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (DEFAULT - 151)) | (1L << (DELAY_KEY_WRITE_SYM - 151)) | (1L << (DISABLE_SYM - 151)) | (1L << (DISCARD - 151)) | (1L << (DROP - 151)) | (1L << (ENABLE_SYM - 151)) | (1L << (ENGINE_SYM - 151)) | (1L << (EXCHANGE_SYM - 151)))) != 0) || ((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (FORCE_SYM - 221)) | (1L << (IMPORT - 221)) | (1L << (INDEX_SYM - 221)) | (1L << (INSERT_METHOD - 221)))) != 0) || _la==KEY_BLOCK_SIZE || _la==LOCK || ((((_la - 370)) & ~0x3f) == 0 && ((1L << (_la - 370)) & ((1L << (MAX_ROWS - 370)) | (1L << (MIN_ROWS - 370)) | (1L << (MODIFY_SYM - 370)) | (1L << (OPTIMIZE - 370)) | (1L << (ORDER_SYM - 370)))) != 0) || ((((_la - 436)) & ~0x3f) == 0 && ((1L << (_la - 436)) & ((1L << (PACK_KEYS_SYM - 436)) | (1L << (PASSWORD - 436)) | (1L << (REBUILD_SYM - 436)) | (1L << (REMOVE_SYM - 436)) | (1L << (RENAME - 436)) | (1L << (REORGANIZE_SYM - 436)) | (1L << (REPAIR - 436)))) != 0) || ((((_la - 515)) & ~0x3f) == 0 && ((1L << (_la - 515)) & ((1L << (ROW_FORMAT_SYM - 515)) | (1L << (STATS_AUTO_RECALC - 515)) | (1L << (STATS_PERSISTENT - 515)))) != 0) || _la==TRUNCATE || _la==UNION_SYM) {
				{
				setState(3097); alter_table_specification();
				setState(3102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,498,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(3098); match(COMMA);
						setState(3099); alter_table_specification();
						}
						} 
					}
					setState(3104);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,498,_ctx);
				}
				}
			}

			setState(3108);
			_la = _input.LA(1);
			if (_la==PARTITION_SYM) {
				{
				setState(3107); partition_options();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_specificationContext extends ParserRuleContext {
		public TerminalNode COALESCE() { return getToken(IndsqlParser.COALESCE, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode REORGANIZE_SYM() { return getToken(IndsqlParser.REORGANIZE_SYM, 0); }
		public TerminalNode LOCK() { return getToken(IndsqlParser.LOCK, 0); }
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public TerminalNode SET_SYM() { return getToken(IndsqlParser.SET_SYM, 0); }
		public TerminalNode SHARED_SYM() { return getToken(IndsqlParser.SHARED_SYM, 0); }
		public TerminalNode FORCE_SYM() { return getToken(IndsqlParser.FORCE_SYM, 0); }
		public TerminalNode RENAME() { return getToken(IndsqlParser.RENAME, 0); }
		public TerminalNode COLUMN_SYM() { return getToken(IndsqlParser.COLUMN_SYM, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode TRUNCATE() { return getToken(IndsqlParser.TRUNCATE, 0); }
		public Partition_definitionContext partition_definition(int i) {
			return getRuleContext(Partition_definitionContext.class,i);
		}
		public TerminalNode REPAIR() { return getToken(IndsqlParser.REPAIR, 0); }
		public TerminalNode EXCHANGE_SYM() { return getToken(IndsqlParser.EXCHANGE_SYM, 0); }
		public TerminalNode DEFAULT() { return getToken(IndsqlParser.DEFAULT, 0); }
		public TerminalNode TO_SYM() { return getToken(IndsqlParser.TO_SYM, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode ORDER_SYM() { return getToken(IndsqlParser.ORDER_SYM, 0); }
		public TerminalNode AFTER_SYM() { return getToken(IndsqlParser.AFTER_SYM, 0); }
		public TerminalNode FIRST_SYM() { return getToken(IndsqlParser.FIRST_SYM, 0); }
		public List<Index_column_nameContext> index_column_name() {
			return getRuleContexts(Index_column_nameContext.class);
		}
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public Partition_namesContext partition_names() {
			return getRuleContext(Partition_namesContext.class,0);
		}
		public TerminalNode CHECK_SYM() { return getToken(IndsqlParser.CHECK_SYM, 0); }
		public TerminalNode TABLE() { return getToken(IndsqlParser.TABLE, 0); }
		public TerminalNode ALGORITHM_SYM() { return getToken(IndsqlParser.ALGORITHM_SYM, 0); }
		public TerminalNode EQ_SYM(int i) {
			return getToken(IndsqlParser.EQ_SYM, i);
		}
		public List<TerminalNode> EQ_SYM() { return getTokens(IndsqlParser.EQ_SYM); }
		public Index_optionContext index_option(int i) {
			return getRuleContext(Index_optionContext.class,i);
		}
		public TerminalNode FULLTEXT_SYM() { return getToken(IndsqlParser.FULLTEXT_SYM, 0); }
		public TerminalNode ALL() { return getToken(IndsqlParser.ALL, 0); }
		public Foreign_key_symbol_nameContext foreign_key_symbol_name() {
			return getRuleContext(Foreign_key_symbol_nameContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(IndsqlParser.ALTER, 0); }
		public TerminalNode PARTITIONING_SYM() { return getToken(IndsqlParser.PARTITIONING_SYM, 0); }
		public TerminalNode REMOVE_SYM() { return getToken(IndsqlParser.REMOVE_SYM, 0); }
		public TerminalNode WITH() { return getToken(IndsqlParser.WITH, 0); }
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public TerminalNode DROP() { return getToken(IndsqlParser.DROP, 0); }
		public TerminalNode INTEGER_NUM() { return getToken(IndsqlParser.INTEGER_NUM, 0); }
		public TerminalNode MODIFY_SYM() { return getToken(IndsqlParser.MODIFY_SYM, 0); }
		public TerminalNode CHARACTER_SYM() { return getToken(IndsqlParser.CHARACTER_SYM, 0); }
		public TerminalNode IMPORT() { return getToken(IndsqlParser.IMPORT, 0); }
		public Index_column_namesContext index_column_names() {
			return getRuleContext(Index_column_namesContext.class,0);
		}
		public Partition_nameContext partition_name() {
			return getRuleContext(Partition_nameContext.class,0);
		}
		public TerminalNode EXCLUSIVE_SYM() { return getToken(IndsqlParser.EXCLUSIVE_SYM, 0); }
		public TerminalNode UNIQUE_SYM() { return getToken(IndsqlParser.UNIQUE_SYM, 0); }
		public TerminalNode FOREIGN() { return getToken(IndsqlParser.FOREIGN, 0); }
		public TerminalNode ADD_SYM() { return getToken(IndsqlParser.ADD_SYM, 0); }
		public List<Partition_definitionContext> partition_definition() {
			return getRuleContexts(Partition_definitionContext.class);
		}
		public TerminalNode TABLESPACE() { return getToken(IndsqlParser.TABLESPACE, 0); }
		public TerminalNode ANALYZE_SYM() { return getToken(IndsqlParser.ANALYZE_SYM, 0); }
		public TerminalNode INTO() { return getToken(IndsqlParser.INTO, 0); }
		public TerminalNode BY_SYM() { return getToken(IndsqlParser.BY_SYM, 0); }
		public Constraint_symbol_nameContext constraint_symbol_name() {
			return getRuleContext(Constraint_symbol_nameContext.class,0);
		}
		public List<Index_optionContext> index_option() {
			return getRuleContexts(Index_optionContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Table_optionsContext table_options() {
			return getRuleContext(Table_optionsContext.class,0);
		}
		public TerminalNode COLLATE_SYM() { return getToken(IndsqlParser.COLLATE_SYM, 0); }
		public Column_definitionsContext column_definitions() {
			return getRuleContext(Column_definitionsContext.class,0);
		}
		public TerminalNode INPLACE_SYM() { return getToken(IndsqlParser.INPLACE_SYM, 0); }
		public TerminalNode CHANGE() { return getToken(IndsqlParser.CHANGE, 0); }
		public TerminalNode CONSTRAINT() { return getToken(IndsqlParser.CONSTRAINT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Reference_definitionContext reference_definition() {
			return getRuleContext(Reference_definitionContext.class,0);
		}
		public TerminalNode ENABLE_SYM() { return getToken(IndsqlParser.ENABLE_SYM, 0); }
		public TerminalNode KEYS() { return getToken(IndsqlParser.KEYS, 0); }
		public TerminalNode INDEX_SYM() { return getToken(IndsqlParser.INDEX_SYM, 0); }
		public TerminalNode OPTIMIZE() { return getToken(IndsqlParser.OPTIMIZE, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode PARTITION_SYM() { return getToken(IndsqlParser.PARTITION_SYM, 0); }
		public Index_column_nameContext index_column_name(int i) {
			return getRuleContext(Index_column_nameContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public TerminalNode DISCARD() { return getToken(IndsqlParser.DISCARD, 0); }
		public TerminalNode COPY_SYM() { return getToken(IndsqlParser.COPY_SYM, 0); }
		public TerminalNode AS_SYM() { return getToken(IndsqlParser.AS_SYM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public TerminalNode PRIMARY_SYM() { return getToken(IndsqlParser.PRIMARY_SYM, 0); }
		public TerminalNode NONE_SYM() { return getToken(IndsqlParser.NONE_SYM, 0); }
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public TerminalNode KEY_SYM() { return getToken(IndsqlParser.KEY_SYM, 0); }
		public TerminalNode DISABLE_SYM() { return getToken(IndsqlParser.DISABLE_SYM, 0); }
		public TerminalNode CONVERT_SYM() { return getToken(IndsqlParser.CONVERT_SYM, 0); }
		public TerminalNode SPATIAL_SYM() { return getToken(IndsqlParser.SPATIAL_SYM, 0); }
		public TerminalNode REBUILD_SYM() { return getToken(IndsqlParser.REBUILD_SYM, 0); }
		public Alter_table_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterAlter_table_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitAlter_table_specification(this);
		}
	}

	public final Alter_table_specificationContext alter_table_specification() throws RecognitionException {
		Alter_table_specificationContext _localctx = new Alter_table_specificationContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_alter_table_specification);
		int _la;
		try {
			int _alt;
			setState(3432);
			switch ( getInterpreter().adaptivePredict(_input,550,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3110); table_options();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(3111); match(ADD_SYM);
				setState(3113);
				_la = _input.LA(1);
				if (_la==COLUMN_SYM) {
					{
					setState(3112); match(COLUMN_SYM);
					}
				}

				setState(3115); column_name();
				setState(3116); column_definition();
				setState(3119);
				_la = _input.LA(1);
				if (_la==AFTER_SYM || _la==FIRST_SYM) {
					{
					setState(3117);
					_la = _input.LA(1);
					if ( !(_la==AFTER_SYM || _la==FIRST_SYM) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(3118); column_name();
					}
				}

				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(3121); match(ADD_SYM);
				setState(3123);
				_la = _input.LA(1);
				if (_la==COLUMN_SYM) {
					{
					setState(3122); match(COLUMN_SYM);
					}
				}

				setState(3125); match(LPAREN);
				setState(3126); column_definitions();
				setState(3127); match(RPAREN);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(3129); match(ADD_SYM);
				setState(3130);
				_la = _input.LA(1);
				if ( !(_la==INDEX_SYM || _la==KEY_SYM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(3132);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(3131); index_name();
					}
				}

				setState(3135);
				_la = _input.LA(1);
				if (_la==USING_SYM) {
					{
					setState(3134); index_type();
					}
				}

				setState(3137); match(LPAREN);
				setState(3138); index_column_names();
				setState(3139); match(RPAREN);
				setState(3143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT_SYM || _la==KEY_BLOCK_SIZE || _la==USING_SYM || _la==WITH) {
					{
					{
					setState(3140); index_option();
					}
					}
					setState(3145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(3146); match(ADD_SYM);
				setState(3151);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(3147); match(CONSTRAINT);
					setState(3149);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(3148); constraint_symbol_name();
						}
					}

					}
				}

				setState(3153); match(PRIMARY_SYM);
				setState(3154); match(KEY_SYM);
				setState(3156);
				_la = _input.LA(1);
				if (_la==USING_SYM) {
					{
					setState(3155); index_type();
					}
				}

				setState(3158); match(LPAREN);
				setState(3159); index_column_names();
				setState(3160); match(RPAREN);
				setState(3164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT_SYM || _la==KEY_BLOCK_SIZE || _la==USING_SYM || _la==WITH) {
					{
					{
					setState(3161); index_option();
					}
					}
					setState(3166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(3167); match(ADD_SYM);
				setState(3172);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(3168); match(CONSTRAINT);
					setState(3170);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(3169); constraint_symbol_name();
						}
					}

					}
				}

				setState(3174); match(UNIQUE_SYM);
				setState(3176);
				_la = _input.LA(1);
				if (_la==INDEX_SYM || _la==KEY_SYM) {
					{
					setState(3175);
					_la = _input.LA(1);
					if ( !(_la==INDEX_SYM || _la==KEY_SYM) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(3179);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(3178); index_name();
					}
				}

				setState(3182);
				_la = _input.LA(1);
				if (_la==USING_SYM) {
					{
					setState(3181); index_type();
					}
				}

				setState(3184); match(LPAREN);
				setState(3185); index_column_name();
				setState(3190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3186); match(COMMA);
					setState(3187); index_column_name();
					}
					}
					setState(3192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3193); match(RPAREN);
				setState(3197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT_SYM || _la==KEY_BLOCK_SIZE || _la==USING_SYM || _la==WITH) {
					{
					{
					setState(3194); index_option();
					}
					}
					setState(3199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(3200); match(ADD_SYM);
				setState(3201); match(FULLTEXT_SYM);
				setState(3203);
				_la = _input.LA(1);
				if (_la==INDEX_SYM || _la==KEY_SYM) {
					{
					setState(3202);
					_la = _input.LA(1);
					if ( !(_la==INDEX_SYM || _la==KEY_SYM) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(3206);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(3205); index_name();
					}
				}

				setState(3208); match(LPAREN);
				setState(3209); index_column_names();
				setState(3210); match(RPAREN);
				setState(3214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT_SYM || _la==KEY_BLOCK_SIZE || _la==USING_SYM || _la==WITH) {
					{
					{
					setState(3211); index_option();
					}
					}
					setState(3216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(3217); match(ADD_SYM);
				setState(3218); match(SPATIAL_SYM);
				setState(3220);
				_la = _input.LA(1);
				if (_la==INDEX_SYM || _la==KEY_SYM) {
					{
					setState(3219);
					_la = _input.LA(1);
					if ( !(_la==INDEX_SYM || _la==KEY_SYM) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(3223);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(3222); index_name();
					}
				}

				setState(3225); match(LPAREN);
				setState(3226); index_column_names();
				setState(3227); match(RPAREN);
				setState(3231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT_SYM || _la==KEY_BLOCK_SIZE || _la==USING_SYM || _la==WITH) {
					{
					{
					setState(3228); index_option();
					}
					}
					setState(3233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(3234); match(ADD_SYM);
				setState(3239);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(3235); match(CONSTRAINT);
					setState(3237);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(3236); constraint_symbol_name();
						}
					}

					}
				}

				setState(3241); match(FOREIGN);
				setState(3242); match(KEY_SYM);
				setState(3244);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(3243); index_name();
					}
				}

				setState(3246); match(LPAREN);
				setState(3247); index_column_names();
				setState(3248); match(RPAREN);
				setState(3249); reference_definition();
				}
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(3251); match(ALGORITHM_SYM);
				setState(3253);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(3252); match(EQ_SYM);
					}
				}

				setState(3255);
				_la = _input.LA(1);
				if ( !(_la==COPY_SYM || _la==DEFAULT || _la==INPLACE_SYM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(3256); match(ALTER);
				setState(3258);
				_la = _input.LA(1);
				if (_la==COLUMN_SYM) {
					{
					setState(3257); match(COLUMN_SYM);
					}
				}

				setState(3260); column_name();
				setState(3266);
				switch (_input.LA(1)) {
				case SET_SYM:
					{
					{
					setState(3261); match(SET_SYM);
					setState(3262); match(DEFAULT);
					setState(3263); literal_value();
					}
					}
					break;
				case DROP:
					{
					{
					setState(3264); match(DROP);
					setState(3265); match(DEFAULT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(3268); match(CHANGE);
				setState(3270);
				_la = _input.LA(1);
				if (_la==COLUMN_SYM) {
					{
					setState(3269); match(COLUMN_SYM);
					}
				}

				setState(3272); column_name();
				setState(3273); column_name();
				setState(3274); column_definition();
				setState(3278);
				switch (_input.LA(1)) {
				case FIRST_SYM:
					{
					setState(3275); match(FIRST_SYM);
					}
					break;
				case AFTER_SYM:
					{
					setState(3276); match(AFTER_SYM);
					setState(3277); column_name();
					}
					break;
				case PARTITION_SYM:
				case SEMI:
				case COMMA:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(3280); match(LOCK);
				setState(3282);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(3281); match(EQ_SYM);
					}
				}

				setState(3284);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==EXCLUSIVE_SYM || _la==NONE_SYM || _la==SHARED_SYM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				{
				setState(3285); match(MODIFY_SYM);
				setState(3287);
				_la = _input.LA(1);
				if (_la==COLUMN_SYM) {
					{
					setState(3286); match(COLUMN_SYM);
					}
				}

				setState(3289); column_name();
				setState(3290); column_definition();
				setState(3294);
				switch (_input.LA(1)) {
				case FIRST_SYM:
					{
					setState(3291); match(FIRST_SYM);
					}
					break;
				case AFTER_SYM:
					{
					setState(3292); match(AFTER_SYM);
					setState(3293); column_name();
					}
					break;
				case PARTITION_SYM:
				case SEMI:
				case COMMA:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				{
				setState(3296); match(DROP);
				setState(3298);
				_la = _input.LA(1);
				if (_la==COLUMN_SYM) {
					{
					setState(3297); match(COLUMN_SYM);
					}
				}

				setState(3300); column_name();
				}
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				{
				setState(3301); match(DROP);
				setState(3302); match(PRIMARY_SYM);
				setState(3303); match(KEY_SYM);
				}
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				{
				setState(3304); match(DROP);
				setState(3305);
				_la = _input.LA(1);
				if ( !(_la==INDEX_SYM || _la==KEY_SYM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(3306); index_name();
				}
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				{
				setState(3307); match(DROP);
				setState(3308); match(FOREIGN);
				setState(3309); match(KEY_SYM);
				setState(3310); foreign_key_symbol_name();
				}
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				{
				setState(3311); match(DISABLE_SYM);
				setState(3312); match(KEYS);
				}
				}
				break;

			case 20:
				enterOuterAlt(_localctx, 20);
				{
				{
				setState(3313); match(ENABLE_SYM);
				setState(3314); match(KEYS);
				}
				}
				break;

			case 21:
				enterOuterAlt(_localctx, 21);
				{
				{
				setState(3315); match(RENAME);
				setState(3317);
				_la = _input.LA(1);
				if (_la==AS_SYM || _la==TO_SYM) {
					{
					setState(3316);
					_la = _input.LA(1);
					if ( !(_la==AS_SYM || _la==TO_SYM) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(3319); table_name();
				}
				}
				break;

			case 22:
				enterOuterAlt(_localctx, 22);
				{
				{
				setState(3320); match(ORDER_SYM);
				setState(3321); match(BY_SYM);
				setState(3322); column_name();
				setState(3327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,537,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(3323); match(COMMA);
						setState(3324); column_name();
						}
						} 
					}
					setState(3329);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,537,_ctx);
				}
				}
				}
				break;

			case 23:
				enterOuterAlt(_localctx, 23);
				{
				{
				setState(3330); match(CONVERT_SYM);
				setState(3331); match(TO_SYM);
				setState(3332); match(CHARACTER_SYM);
				setState(3333); match(SET_SYM);
				setState(3334); charset_name();
				setState(3337);
				_la = _input.LA(1);
				if (_la==COLLATE_SYM) {
					{
					setState(3335); match(COLLATE_SYM);
					setState(3336); collation_name();
					}
				}

				}
				}
				break;

			case 24:
				enterOuterAlt(_localctx, 24);
				{
				{
				setState(3340);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(3339); match(DEFAULT);
					}
				}

				setState(3342); match(CHARACTER_SYM);
				setState(3343); match(SET_SYM);
				setState(3345);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(3344); match(EQ_SYM);
					}
				}

				setState(3347); charset_name();
				setState(3353);
				_la = _input.LA(1);
				if (_la==COLLATE_SYM) {
					{
					setState(3348); match(COLLATE_SYM);
					setState(3350);
					_la = _input.LA(1);
					if (_la==EQ_SYM) {
						{
						setState(3349); match(EQ_SYM);
						}
					}

					setState(3352); collation_name();
					}
				}

				}
				}
				break;

			case 25:
				enterOuterAlt(_localctx, 25);
				{
				{
				setState(3355); match(DISCARD);
				setState(3356); match(TABLESPACE);
				}
				}
				break;

			case 26:
				enterOuterAlt(_localctx, 26);
				{
				{
				setState(3357); match(IMPORT);
				setState(3358); match(TABLESPACE);
				}
				}
				break;

			case 27:
				enterOuterAlt(_localctx, 27);
				{
				{
				setState(3359); match(FORCE_SYM);
				}
				}
				break;

			case 28:
				enterOuterAlt(_localctx, 28);
				{
				{
				setState(3360); match(ADD_SYM);
				setState(3361); match(PARTITION_SYM);
				setState(3362); match(LPAREN);
				setState(3363); partition_definition();
				setState(3364); match(RPAREN);
				}
				}
				break;

			case 29:
				enterOuterAlt(_localctx, 29);
				{
				{
				setState(3366); match(DROP);
				setState(3367); match(PARTITION_SYM);
				setState(3368); partition_names();
				}
				}
				break;

			case 30:
				enterOuterAlt(_localctx, 30);
				{
				{
				setState(3369); match(TRUNCATE);
				setState(3370); match(PARTITION_SYM);
				setState(3373);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(3371); partition_names();
					}
					break;
				case ALL:
					{
					setState(3372); match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;

			case 31:
				enterOuterAlt(_localctx, 31);
				{
				{
				setState(3375); match(COALESCE);
				setState(3376); match(PARTITION_SYM);
				setState(3377); match(INTEGER_NUM);
				}
				}
				break;

			case 32:
				enterOuterAlt(_localctx, 32);
				{
				{
				setState(3378); match(REORGANIZE_SYM);
				setState(3379); match(PARTITION_SYM);
				setState(3380); partition_names();
				setState(3381); match(INTO);
				setState(3382); match(LPAREN);
				setState(3383); partition_definition();
				setState(3388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3384); match(COMMA);
					setState(3385); partition_definition();
					}
					}
					setState(3390);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3391); match(RPAREN);
				}
				}
				break;

			case 33:
				enterOuterAlt(_localctx, 33);
				{
				{
				setState(3393); match(EXCHANGE_SYM);
				setState(3394); match(PARTITION_SYM);
				setState(3395); partition_name();
				setState(3396); match(WITH);
				setState(3397); match(TABLE);
				setState(3398); table_name();
				}
				}
				break;

			case 34:
				enterOuterAlt(_localctx, 34);
				{
				{
				setState(3400); match(ANALYZE_SYM);
				setState(3401); match(PARTITION_SYM);
				setState(3404);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(3402); partition_names();
					}
					break;
				case ALL:
					{
					setState(3403); match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;

			case 35:
				enterOuterAlt(_localctx, 35);
				{
				{
				setState(3406); match(CHECK_SYM);
				setState(3407); match(PARTITION_SYM);
				setState(3410);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(3408); partition_names();
					}
					break;
				case ALL:
					{
					setState(3409); match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;

			case 36:
				enterOuterAlt(_localctx, 36);
				{
				{
				setState(3412); match(OPTIMIZE);
				setState(3413); match(PARTITION_SYM);
				setState(3416);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(3414); partition_names();
					}
					break;
				case ALL:
					{
					setState(3415); match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;

			case 37:
				enterOuterAlt(_localctx, 37);
				{
				{
				setState(3418); match(REBUILD_SYM);
				setState(3419); match(PARTITION_SYM);
				setState(3422);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(3420); partition_names();
					}
					break;
				case ALL:
					{
					setState(3421); match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;

			case 38:
				enterOuterAlt(_localctx, 38);
				{
				{
				setState(3424); match(REPAIR);
				setState(3425); match(PARTITION_SYM);
				setState(3428);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(3426); partition_names();
					}
					break;
				case ALL:
					{
					setState(3427); match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;

			case 39:
				enterOuterAlt(_localctx, 39);
				{
				{
				setState(3430); match(REMOVE_SYM);
				setState(3431); match(PARTITIONING_SYM);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_column_namesContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public List<Index_column_nameContext> index_column_name() {
			return getRuleContexts(Index_column_nameContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Index_column_nameContext index_column_name(int i) {
			return getRuleContext(Index_column_nameContext.class,i);
		}
		public Index_column_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterIndex_column_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitIndex_column_names(this);
		}
	}

	public final Index_column_namesContext index_column_names() throws RecognitionException {
		Index_column_namesContext _localctx = new Index_column_namesContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_index_column_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3434); index_column_name();
			setState(3439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3435); match(COMMA);
				setState(3436); index_column_name();
				}
				}
				setState(3441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_typeContext extends ParserRuleContext {
		public TerminalNode USING_SYM() { return getToken(IndsqlParser.USING_SYM, 0); }
		public TerminalNode BTREE_SYM() { return getToken(IndsqlParser.BTREE_SYM, 0); }
		public TerminalNode HASH_SYM() { return getToken(IndsqlParser.HASH_SYM, 0); }
		public Index_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterIndex_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitIndex_type(this);
		}
	}

	public final Index_typeContext index_type() throws RecognitionException {
		Index_typeContext _localctx = new Index_typeContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_index_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3442); match(USING_SYM);
			setState(3443);
			_la = _input.LA(1);
			if ( !(_la==BTREE_SYM || _la==HASH_SYM) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_optionContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(IndsqlParser.INTEGER_NUM, 0); }
		public TerminalNode COMMENT_SYM() { return getToken(IndsqlParser.COMMENT_SYM, 0); }
		public TerminalNode WITH() { return getToken(IndsqlParser.WITH, 0); }
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public TerminalNode EQ_SYM() { return getToken(IndsqlParser.EQ_SYM, 0); }
		public TerminalNode PARSER_SYM() { return getToken(IndsqlParser.PARSER_SYM, 0); }
		public TerminalNode TEXT_STRING() { return getToken(IndsqlParser.TEXT_STRING, 0); }
		public Parser_nameContext parser_name() {
			return getRuleContext(Parser_nameContext.class,0);
		}
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(IndsqlParser.KEY_BLOCK_SIZE, 0); }
		public Index_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterIndex_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitIndex_option(this);
		}
	}

	public final Index_optionContext index_option() throws RecognitionException {
		Index_optionContext _localctx = new Index_optionContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_index_option);
		int _la;
		try {
			setState(3456);
			switch (_input.LA(1)) {
			case KEY_BLOCK_SIZE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(3445); match(KEY_BLOCK_SIZE);
				setState(3447);
				_la = _input.LA(1);
				if (_la==EQ_SYM) {
					{
					setState(3446); match(EQ_SYM);
					}
				}

				setState(3449); match(INTEGER_NUM);
				}
				}
				break;
			case USING_SYM:
				enterOuterAlt(_localctx, 2);
				{
				setState(3450); index_type();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(3451); match(WITH);
				setState(3452); match(PARSER_SYM);
				setState(3453); parser_name();
				}
				}
				break;
			case COMMENT_SYM:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(3454); match(COMMENT_SYM);
				setState(3455); match(TEXT_STRING);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definitionsContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public List<Column_definitionContext> column_definition() {
			return getRuleContexts(Column_definitionContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Column_definitionContext column_definition(int i) {
			return getRuleContext(Column_definitionContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Column_definitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterColumn_definitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitColumn_definitions(this);
		}
	}

	public final Column_definitionsContext column_definitions() throws RecognitionException {
		Column_definitionsContext _localctx = new Column_definitionsContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_column_definitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3458); column_name();
			setState(3459); column_definition();
			setState(3466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3460); match(COMMA);
				setState(3461); column_name();
				setState(3462); column_definition();
				}
				}
				setState(3468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rename_table_statementContext extends ParserRuleContext {
		public TerminalNode TO_SYM(int i) {
			return getToken(IndsqlParser.TO_SYM, i);
		}
		public List<TerminalNode> TO_SYM() { return getTokens(IndsqlParser.TO_SYM); }
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(IndsqlParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(IndsqlParser.RENAME, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Rename_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterRename_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitRename_table_statement(this);
		}
	}

	public final Rename_table_statementContext rename_table_statement() throws RecognitionException {
		Rename_table_statementContext _localctx = new Rename_table_statementContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_rename_table_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3469); match(RENAME);
			setState(3470); match(TABLE);
			setState(3471); table_name();
			setState(3472); match(TO_SYM);
			setState(3473); table_name();
			setState(3481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,555,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(3474); match(COMMA);
					setState(3475); table_name();
					setState(3476); match(TO_SYM);
					setState(3477); table_name();
					}
					} 
				}
				setState(3483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,555,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(IndsqlParser.IF, 0); }
		public TerminalNode CASCADE() { return getToken(IndsqlParser.CASCADE, 0); }
		public TerminalNode EXISTS() { return getToken(IndsqlParser.EXISTS, 0); }
		public TerminalNode TEMPORARY() { return getToken(IndsqlParser.TEMPORARY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(IndsqlParser.TABLE, 0); }
		public TerminalNode RESTRICT() { return getToken(IndsqlParser.RESTRICT, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public TerminalNode DROP() { return getToken(IndsqlParser.DROP, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Drop_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterDrop_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitDrop_table_statement(this);
		}
	}

	public final Drop_table_statementContext drop_table_statement() throws RecognitionException {
		Drop_table_statementContext _localctx = new Drop_table_statementContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_drop_table_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3484); match(DROP);
			setState(3486);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(3485); match(TEMPORARY);
				}
			}

			setState(3488); match(TABLE);
			setState(3491);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(3489); match(IF);
				setState(3490); match(EXISTS);
				}
			}

			setState(3493); table_name();
			setState(3498);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,558,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(3494); match(COMMA);
					setState(3495); table_name();
					}
					} 
				}
				setState(3500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,558,_ctx);
			}
			setState(3502);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(3501);
				_la = _input.LA(1);
				if ( !(_la==CASCADE || _la==RESTRICT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Truncate_table_statementContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(IndsqlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode TRUNCATE() { return getToken(IndsqlParser.TRUNCATE, 0); }
		public Truncate_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncate_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterTruncate_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitTruncate_table_statement(this);
		}
	}

	public final Truncate_table_statementContext truncate_table_statement() throws RecognitionException {
		Truncate_table_statementContext _localctx = new Truncate_table_statementContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_truncate_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3504); match(TRUNCATE);
			setState(3506);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(3505); match(TABLE);
				}
			}

			setState(3508); table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_view_statementContext extends ParserRuleContext {
		public Create_view_bodyContext create_view_body() {
			return getRuleContext(Create_view_bodyContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(IndsqlParser.CREATE, 0); }
		public TerminalNode REPLACE() { return getToken(IndsqlParser.REPLACE, 0); }
		public TerminalNode OR_SYM() { return getToken(IndsqlParser.OR_SYM, 0); }
		public Create_view_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCreate_view_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCreate_view_statement(this);
		}
	}

	public final Create_view_statementContext create_view_statement() throws RecognitionException {
		Create_view_statementContext _localctx = new Create_view_statementContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_create_view_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3510); match(CREATE);
			setState(3513);
			_la = _input.LA(1);
			if (_la==OR_SYM) {
				{
				setState(3511); match(OR_SYM);
				setState(3512); match(REPLACE);
				}
			}

			setState(3515); create_view_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_view_bodyContext extends ParserRuleContext {
		public TerminalNode MERGE_SYM() { return getToken(IndsqlParser.MERGE_SYM, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode SECURITY_SYM() { return getToken(IndsqlParser.SECURITY_SYM, 0); }
		public TerminalNode ALGORITHM_SYM() { return getToken(IndsqlParser.ALGORITHM_SYM, 0); }
		public TerminalNode CHECK_SYM() { return getToken(IndsqlParser.CHECK_SYM, 0); }
		public TerminalNode EQ_SYM(int i) {
			return getToken(IndsqlParser.EQ_SYM, i);
		}
		public TerminalNode OPTION() { return getToken(IndsqlParser.OPTION, 0); }
		public List<TerminalNode> EQ_SYM() { return getTokens(IndsqlParser.EQ_SYM); }
		public TerminalNode LOCAL_SYM() { return getToken(IndsqlParser.LOCAL_SYM, 0); }
		public User_nameContext user_name() {
			return getRuleContext(User_nameContext.class,0);
		}
		public List<TerminalNode> DEFINER() { return getTokens(IndsqlParser.DEFINER); }
		public TerminalNode WITH() { return getToken(IndsqlParser.WITH, 0); }
		public TerminalNode LPAREN() { return getToken(IndsqlParser.LPAREN, 0); }
		public TerminalNode SQL_SYM() { return getToken(IndsqlParser.SQL_SYM, 0); }
		public TerminalNode VIEW_SYM() { return getToken(IndsqlParser.VIEW_SYM, 0); }
		public TerminalNode UNDEFINED_SYM() { return getToken(IndsqlParser.UNDEFINED_SYM, 0); }
		public TerminalNode TEMPTABLE_SYM() { return getToken(IndsqlParser.TEMPTABLE_SYM, 0); }
		public TerminalNode AS_SYM() { return getToken(IndsqlParser.AS_SYM, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode INVOKER_SYM() { return getToken(IndsqlParser.INVOKER_SYM, 0); }
		public TerminalNode RPAREN() { return getToken(IndsqlParser.RPAREN, 0); }
		public TerminalNode CURRENT_USER() { return getToken(IndsqlParser.CURRENT_USER, 0); }
		public TerminalNode CASCADED() { return getToken(IndsqlParser.CASCADED, 0); }
		public TerminalNode DEFINER(int i) {
			return getToken(IndsqlParser.DEFINER, i);
		}
		public Create_view_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterCreate_view_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitCreate_view_body(this);
		}
	}

	public final Create_view_bodyContext create_view_body() throws RecognitionException {
		Create_view_bodyContext _localctx = new Create_view_bodyContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_create_view_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3520);
			_la = _input.LA(1);
			if (_la==ALGORITHM_SYM) {
				{
				setState(3517); match(ALGORITHM_SYM);
				setState(3518); match(EQ_SYM);
				setState(3519);
				_la = _input.LA(1);
				if ( !(_la==MERGE_SYM || _la==TEMPTABLE_SYM || _la==UNDEFINED_SYM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(3528);
			_la = _input.LA(1);
			if (_la==DEFINER) {
				{
				setState(3522); match(DEFINER);
				setState(3523); match(EQ_SYM);
				setState(3526);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(3524); user_name();
					}
					break;
				case CURRENT_USER:
					{
					setState(3525); match(CURRENT_USER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(3533);
			_la = _input.LA(1);
			if (_la==SQL_SYM) {
				{
				setState(3530); match(SQL_SYM);
				setState(3531); match(SECURITY_SYM);
				setState(3532);
				_la = _input.LA(1);
				if ( !(_la==DEFINER || _la==INVOKER_SYM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(3535); match(VIEW_SYM);
			setState(3536); view_name();
			setState(3541);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(3537); match(LPAREN);
				setState(3538); column_list();
				setState(3539); match(RPAREN);
				}
			}

			setState(3543); match(AS_SYM);
			setState(3544); select_statement();
			setState(3551);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(3545); match(WITH);
				setState(3547);
				_la = _input.LA(1);
				if (_la==CASCADED || _la==LOCAL_SYM) {
					{
					setState(3546);
					_la = _input.LA(1);
					if ( !(_la==CASCADED || _la==LOCAL_SYM) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(3549); match(CHECK_SYM);
				setState(3550); match(OPTION);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_view_statementContext extends ParserRuleContext {
		public Create_view_bodyContext create_view_body() {
			return getRuleContext(Create_view_bodyContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(IndsqlParser.ALTER, 0); }
		public Alter_view_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_view_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterAlter_view_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitAlter_view_statement(this);
		}
	}

	public final Alter_view_statementContext alter_view_statement() throws RecognitionException {
		Alter_view_statementContext _localctx = new Alter_view_statementContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_alter_view_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3553); match(ALTER);
			setState(3554); create_view_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_view_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(IndsqlParser.IF, 0); }
		public TerminalNode CASCADE() { return getToken(IndsqlParser.CASCADE, 0); }
		public TerminalNode EXISTS() { return getToken(IndsqlParser.EXISTS, 0); }
		public View_nameContext view_name(int i) {
			return getRuleContext(View_nameContext.class,i);
		}
		public List<View_nameContext> view_name() {
			return getRuleContexts(View_nameContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public TerminalNode RESTRICT() { return getToken(IndsqlParser.RESTRICT, 0); }
		public TerminalNode DROP() { return getToken(IndsqlParser.DROP, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public TerminalNode VIEW_SYM() { return getToken(IndsqlParser.VIEW_SYM, 0); }
		public Drop_view_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterDrop_view_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitDrop_view_statement(this);
		}
	}

	public final Drop_view_statementContext drop_view_statement() throws RecognitionException {
		Drop_view_statementContext _localctx = new Drop_view_statementContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_drop_view_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3556); match(DROP);
			setState(3557); match(VIEW_SYM);
			setState(3560);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(3558); match(IF);
				setState(3559); match(EXISTS);
				}
			}

			setState(3562); view_name();
			setState(3567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,570,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(3563); match(COMMA);
					setState(3564); view_name();
					}
					} 
				}
				setState(3569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,570,_ctx);
			}
			setState(3571);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(3570);
				_la = _input.LA(1);
				if ( !(_la==CASCADE || _la==RESTRICT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19: return schema_name_sempred((Schema_nameContext)_localctx, predIndex);

		case 20: return table_name_sempred((Table_nameContext)_localctx, predIndex);

		case 21: return engine_name_sempred((Engine_nameContext)_localctx, predIndex);

		case 22: return column_name_sempred((Column_nameContext)_localctx, predIndex);

		case 23: return view_name_sempred((View_nameContext)_localctx, predIndex);

		case 24: return parser_name_sempred((Parser_nameContext)_localctx, predIndex);

		case 25: return index_name_sempred((Index_nameContext)_localctx, predIndex);

		case 26: return partition_name_sempred((Partition_nameContext)_localctx, predIndex);

		case 27: return partition_logical_name_sempred((Partition_logical_nameContext)_localctx, predIndex);

		case 28: return constraint_symbol_name_sempred((Constraint_symbol_nameContext)_localctx, predIndex);

		case 29: return foreign_key_symbol_name_sempred((Foreign_key_symbol_nameContext)_localctx, predIndex);

		case 30: return collation_name_sempred((Collation_nameContext)_localctx, predIndex);

		case 31: return event_name_sempred((Event_nameContext)_localctx, predIndex);

		case 32: return user_name_sempred((User_nameContext)_localctx, predIndex);

		case 33: return function_name_sempred((Function_nameContext)_localctx, predIndex);

		case 34: return procedure_name_sempred((Procedure_nameContext)_localctx, predIndex);

		case 35: return server_name_sempred((Server_nameContext)_localctx, predIndex);

		case 36: return wrapper_name_sempred((Wrapper_nameContext)_localctx, predIndex);

		case 37: return alias_sempred((AliasContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean schema_name_sempred(Schema_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return strlen((const char *)(((Schema_nameContext)_localctx).tmpName!=null?((Schema_nameContext)_localctx).tmpName.getText():null)->chars) <= 64;
		}
		return true;
	}
	private boolean foreign_key_symbol_name_sempred(Foreign_key_symbol_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10: return strlen((const char *)(((Foreign_key_symbol_nameContext)_localctx).tmpName!=null?((Foreign_key_symbol_nameContext)_localctx).tmpName.getText():null)->chars) <= 64;
		}
		return true;
	}
	private boolean alias_sempred(AliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18: return strlen((const char *)(((AliasContext)_localctx).tmpName!=null?((AliasContext)_localctx).tmpName.getText():null)->chars) <= 256;
		}
		return true;
	}
	private boolean partition_logical_name_sempred(Partition_logical_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return strlen((const char *)(((Partition_logical_nameContext)_localctx).tmpName!=null?((Partition_logical_nameContext)_localctx).tmpName.getText():null)->chars) <= 64;
		}
		return true;
	}
	private boolean column_name_sempred(Column_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return strlen((const char *)(((Column_nameContext)_localctx).tmpName!=null?((Column_nameContext)_localctx).tmpName.getText():null)->chars) <= 64;
		}
		return true;
	}
	private boolean server_name_sempred(Server_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16: return strlen((const char *)(((Server_nameContext)_localctx).tmpName!=null?((Server_nameContext)_localctx).tmpName.getText():null)->chars) <= 64;
		}
		return true;
	}
	private boolean user_name_sempred(User_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13: return strlen((const char *)(((User_nameContext)_localctx).tmpName!=null?((User_nameContext)_localctx).tmpName.getText():null)->chars) <= 64;
		}
		return true;
	}
	private boolean view_name_sempred(View_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return strlen((const char *)(((View_nameContext)_localctx).tmpName!=null?((View_nameContext)_localctx).tmpName.getText():null)->chars) <= 64;
		}
		return true;
	}
	private boolean index_name_sempred(Index_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return strlen((const char *)(((Index_nameContext)_localctx).tmpName!=null?((Index_nameContext)_localctx).tmpName.getText():null)->chars) <= 64;
		}
		return true;
	}
	private boolean wrapper_name_sempred(Wrapper_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17: return strlen((const char *)(((Wrapper_nameContext)_localctx).tmpName!=null?((Wrapper_nameContext)_localctx).tmpName.getText():null)->chars) <= 64;
		}
		return true;
	}
	private boolean parser_name_sempred(Parser_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return strlen((const char *)(((Parser_nameContext)_localctx).tmpName!=null?((Parser_nameContext)_localctx).tmpName.getText():null)->chars) <= 64;
		}
		return true;
	}
	private boolean procedure_name_sempred(Procedure_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15: return strlen((const char *)(((Procedure_nameContext)_localctx).tmpName!=null?((Procedure_nameContext)_localctx).tmpName.getText():null)->chars) <= 64;
		}
		return true;
	}
	private boolean table_name_sempred(Table_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return strlen((const char *)(((Table_nameContext)_localctx).tmpName!=null?((Table_nameContext)_localctx).tmpName.getText():null)->chars) <= 64;
		}
		return true;
	}
	private boolean constraint_symbol_name_sempred(Constraint_symbol_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9: return strlen((const char *)(((Constraint_symbol_nameContext)_localctx).tmpName!=null?((Constraint_symbol_nameContext)_localctx).tmpName.getText():null)->chars) <= 64;
		}
		return true;
	}
	private boolean function_name_sempred(Function_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14: return strlen((const char *)(((Function_nameContext)_localctx).tmpName!=null?((Function_nameContext)_localctx).tmpName.getText():null)->chars) <= 64;
		}
		return true;
	}
	private boolean collation_name_sempred(Collation_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11: return strlen((const char *)(((Collation_nameContext)_localctx).tmpName!=null?((Collation_nameContext)_localctx).tmpName.getText():null)->chars) <= 64;
		}
		return true;
	}
	private boolean partition_name_sempred(Partition_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return strlen((const char *)(((Partition_nameContext)_localctx).tmpName!=null?((Partition_nameContext)_localctx).tmpName.getText():null)->chars) <= 64;
		}
		return true;
	}
	private boolean event_name_sempred(Event_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12: return strlen((const char *)(((Event_nameContext)_localctx).tmpName!=null?((Event_nameContext)_localctx).tmpName.getText():null)->chars) <= 64;
		}
		return true;
	}
	private boolean engine_name_sempred(Engine_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return strlen((const char *)(((Engine_nameContext)_localctx).tmpName!=null?((Engine_nameContext)_localctx).tmpName.getText():null)->chars) <= 64;
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\u02e9\u0df8\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\3\2\3\2\3\3\3\3\3\4\3\4\5\4\u016f"+
		"\n\4\3\4\3\4\5\4\u0173\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u017b\n\4\5\4\u017d"+
		"\n\4\3\4\3\4\5\4\u0181\n\4\3\4\3\4\3\4\5\4\u0186\n\4\5\4\u0188\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u019b"+
		"\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\5\n\u01a6\n\n\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01b6\n\16\3\17"+
		"\3\17\3\17\3\17\5\17\u01bc\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#"+
		"\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\5\'\u0211\n\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\7(\u021a\n(\f(\16(\u021d\13(\3)\3)\3)\7)\u0222\n)\f)\16"+
		")\u0225\13)\3*\3*\3*\7*\u022a\n*\f*\16*\u022d\13*\3+\5+\u0230\n+\3+\3"+
		"+\3,\3,\3,\5,\u0237\n,\3,\3,\5,\u023b\n,\5,\u023d\n,\3-\3-\3-\3-\3-\3"+
		"-\3-\5-\u0246\n-\3-\3-\3-\5-\u024b\n-\3-\3-\3-\5-\u0250\n-\3.\3.\5.\u0254"+
		"\n.\3.\3.\3.\5.\u0259\n.\3.\3.\5.\u025d\n.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\5.\u026b\n.\3.\3.\3.\3.\5.\u0271\n.\3.\3.\5.\u0275\n.\3.\3."+
		"\3.\3.\5.\u027b\n.\3/\3/\3/\5/\u0280\n/\3\60\3\60\3\60\5\60\u0285\n\60"+
		"\3\61\3\61\3\61\5\61\u028a\n\61\3\62\3\62\3\62\5\62\u028f\n\62\3\63\3"+
		"\63\3\63\5\63\u0294\n\63\3\64\3\64\3\64\5\64\u0299\n\64\3\65\3\65\3\65"+
		"\5\65\u029e\n\65\3\66\3\66\3\66\5\66\u02a3\n\66\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u02b2\n\67\38\38\38\3"+
		"8\38\78\u02b9\n8\f8\168\u02bc\138\58\u02be\n8\38\58\u02c1\n8\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u02db"+
		"\n8\38\38\38\58\u02e0\n8\39\39\59\u02e4\n9\3:\3:\3:\3:\3:\3:\6:\u02ec"+
		"\n:\r:\16:\u02ed\3:\3:\5:\u02f2\n:\3:\3:\3;\3;\3;\3;\3;\3;\3;\6;\u02fd"+
		"\n;\r;\16;\u02fe\3;\3;\5;\u0303\n;\3;\3;\3<\3<\3<\3<\7<\u030b\n<\f<\16"+
		"<\u030e\13<\3<\3<\3<\5<\u0313\n<\3=\3=\3=\5=\u0318\n=\3=\3=\3=\5=\u031d"+
		"\n=\3=\3=\3>\3>\3>\3>\7>\u0325\n>\f>\16>\u0328\13>\3>\3>\3?\3?\3?\3?\3"+
		"@\3@\3@\7@\u0333\n@\f@\16@\u0336\13@\3A\3A\5A\u033a\nA\3B\3B\5B\u033e"+
		"\nB\3B\3B\3B\5B\u0343\nB\5B\u0345\nB\3C\3C\3C\3C\3C\5C\u034c\nC\5C\u034e"+
		"\nC\3D\3D\3D\5D\u0353\nD\3D\3D\3D\3D\5D\u0359\nD\3E\3E\3E\3E\5E\u035f"+
		"\nE\5E\u0361\nE\3E\3E\5E\u0365\nE\3F\3F\5F\u0369\nF\3F\5F\u036c\nF\3F"+
		"\5F\u036f\nF\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0381"+
		"\nF\3G\3G\3G\3G\5G\u0387\nG\3H\3H\3H\7H\u038c\nH\fH\16H\u038f\13H\3I\3"+
		"I\3I\3I\3I\3I\3I\5I\u0398\nI\5I\u039a\nI\3J\3J\3J\3J\5J\u03a0\nJ\3J\3"+
		"J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u03b0\nJ\3K\3K\3K\7K\u03b5\n"+
		"K\fK\16K\u03b8\13K\3L\3L\3L\3L\3L\3M\3M\3M\7M\u03c2\nM\fM\16M\u03c5\13"+
		"M\3N\3N\5N\u03c9\nN\3N\3N\5N\u03cd\nN\3N\5N\u03d0\nN\3O\3O\3O\3O\3O\3"+
		"O\3O\3O\3O\3O\5O\u03dc\nO\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\3P\5P\u03f1\nP\3Q\3Q\3Q\5Q\u03f6\nQ\3Q\7Q\u03f9\nQ\fQ\16Q\u03fc"+
		"\13Q\3R\3R\5R\u0400\nR\3R\5R\u0403\nR\3R\5R\u0406\nR\3R\5R\u0409\nR\3"+
		"R\5R\u040c\nR\3R\5R\u040f\nR\3R\5R\u0412\nR\3R\5R\u0415\nR\3R\3R\3R\3"+
		"R\5R\u041b\nR\3R\5R\u041e\nR\3R\5R\u0421\nR\3R\5R\u0424\nR\5R\u0426\n"+
		"R\3R\5R\u0429\nR\3R\5R\u042c\nR\3R\3R\3R\3R\3R\3R\5R\u0434\nR\3S\3S\3"+
		"S\3T\3T\3T\3T\3T\7T\u043e\nT\fT\16T\u0441\13T\3T\3T\5T\u0445\nT\3U\3U"+
		"\3U\5U\u044a\nU\3V\3V\3V\3W\3W\3W\3W\3W\7W\u0454\nW\fW\16W\u0457\13W\3"+
		"X\3X\5X\u045b\nX\3Y\3Y\3Y\3Y\5Y\u0461\nY\3Y\3Y\3Y\3Y\3Y\5Y\u0468\nY\3"+
		"Z\3Z\3[\3[\3\\\3\\\3\\\7\\\u0471\n\\\f\\\16\\\u0474\13\\\3\\\5\\\u0477"+
		"\n\\\3]\3]\3]\3]\7]\u047d\n]\f]\16]\u0480\13]\3]\3]\3^\3^\3^\3^\3_\3_"+
		"\3_\5_\u048b\n_\3_\3_\3`\3`\3`\3`\3`\3`\5`\u0495\n`\3`\3`\5`\u0499\n`"+
		"\5`\u049b\n`\3a\3a\5a\u049f\na\3a\5a\u04a2\na\3a\5a\u04a5\na\3a\3a\3a"+
		"\5a\u04aa\na\3b\3b\3b\5b\u04af\nb\3b\5b\u04b2\nb\3b\5b\u04b5\nb\3b\5b"+
		"\u04b8\nb\3c\3c\5c\u04bc\nc\3c\3c\3c\5c\u04c1\nc\7c\u04c3\nc\fc\16c\u04c6"+
		"\13c\3c\3c\3c\5c\u04cb\nc\3d\3d\3d\5d\u04d0\nd\3d\3d\3d\5d\u04d5\nd\7"+
		"d\u04d7\nd\fd\16d\u04da\13d\3d\3d\3d\5d\u04df\nd\3e\3e\3e\5e\u04e4\ne"+
		"\3f\3f\5f\u04e8\nf\3f\5f\u04eb\nf\3f\5f\u04ee\nf\3f\3f\5f\u04f2\nf\3g"+
		"\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\7g\u0500\ng\fg\16g\u0503\13g\3h\3h\5"+
		"h\u0507\nh\3h\3h\5h\u050b\nh\3i\3i\3i\3i\7i\u0511\ni\fi\16i\u0514\13i"+
		"\3j\3j\3j\5j\u0519\nj\3j\3j\3j\5j\u051e\nj\7j\u0520\nj\fj\16j\u0523\13"+
		"j\3j\3j\3k\3k\3k\5k\u052a\nk\3l\3l\3l\3l\7l\u0530\nl\fl\16l\u0533\13l"+
		"\3m\3m\3m\3m\5m\u0539\nm\3n\3n\5n\u053d\nn\3n\3n\5n\u0541\nn\3o\3o\5o"+
		"\u0545\no\3p\3p\5p\u0549\np\3p\5p\u054c\np\3p\3p\3p\5p\u0551\np\3p\5p"+
		"\u0554\np\3p\5p\u0557\np\3q\3q\5q\u055b\nq\3q\5q\u055e\nq\3q\3q\3q\5q"+
		"\u0563\nq\3r\3r\3r\3r\3r\3r\7r\u056b\nr\fr\16r\u056e\13r\5r\u0570\nr\3"+
		"r\5r\u0573\nr\3s\3s\3s\3s\7s\u0579\ns\fs\16s\u057c\13s\3t\3t\3t\3t\3t"+
		"\3t\3t\5t\u0585\nt\3u\3u\5u\u0589\nu\3v\3v\3v\3v\3v\3v\3v\7v\u0592\nv"+
		"\fv\16v\u0595\13v\3v\3v\5v\u0599\nv\3v\5v\u059c\nv\3w\3w\3w\3w\5w\u05a2"+
		"\nw\3w\5w\u05a5\nw\3x\3x\3x\5x\u05aa\nx\3x\5x\u05ad\nx\3y\3y\3z\3z\3z"+
		"\5z\u05b4\nz\3z\5z\u05b7\nz\3z\3z\3z\5z\u05bc\nz\3z\3z\3z\3z\5z\u05c2"+
		"\nz\3z\3z\3z\5z\u05c7\nz\3z\3z\3z\3z\5z\u05cd\nz\3z\5z\u05d0\nz\3z\3z"+
		"\3z\5z\u05d5\nz\3z\3z\3z\5z\u05da\nz\5z\u05dc\nz\3z\3z\3z\3z\5z\u05e2"+
		"\nz\3z\3z\3z\5z\u05e7\nz\5z\u05e9\nz\3z\3z\3z\5z\u05ee\nz\3z\3z\3z\5z"+
		"\u05f3\nz\3z\3z\3z\5z\u05f8\nz\7z\u05fa\nz\fz\16z\u05fd\13z\3z\5z\u0600"+
		"\nz\3z\5z\u0603\nz\3{\3{\3{\5{\u0608\n{\3{\5{\u060b\n{\3{\3{\3{\5{\u0610"+
		"\n{\3{\3{\3{\3{\5{\u0616\n{\3{\3{\3{\5{\u061b\n{\3{\3{\3{\3{\5{\u0621"+
		"\n{\3{\3{\3{\5{\u0626\n{\3{\3{\3{\5{\u062b\n{\3{\3{\3{\5{\u0630\n{\7{"+
		"\u0632\n{\f{\16{\u0635\13{\3{\5{\u0638\n{\3{\5{\u063b\n{\3|\3|\3|\3|\5"+
		"|\u0641\n|\3}\3}\5}\u0645\n}\3}\5}\u0648\n}\3}\3}\5}\u064c\n}\3~\5~\u064f"+
		"\n~\3~\3~\3\177\3\177\3\u0080\5\u0080\u0656\n\u0080\3\u0080\3\u0080\3"+
		"\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u065f\n\u0081\3\u0081\3"+
		"\u0081\3\u0081\3\u0081\7\u0081\u0665\n\u0081\f\u0081\16\u0081\u0668\13"+
		"\u0081\7\u0081\u066a\n\u0081\f\u0081\16\u0081\u066d\13\u0081\3\u0082\5"+
		"\u0082\u0670\n\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u0675\n\u0082\3\u0082"+
		"\3\u0082\3\u0082\5\u0082\u067a\n\u0082\3\u0082\5\u0082\u067d\n\u0082\3"+
		"\u0083\3\u0083\5\u0083\u0681\n\u0083\3\u0084\3\u0084\3\u0084\5\u0084\u0686"+
		"\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0086\5\u0086\u0693\n\u0086\3\u0086\3\u0086\3\u0086"+
		"\5\u0086\u0698\n\u0086\3\u0086\3\u0086\5\u0086\u069c\n\u0086\3\u0086\3"+
		"\u0086\5\u0086\u06a0\n\u0086\3\u0086\5\u0086\u06a3\n\u0086\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\5\u0087\u06a9\n\u0087\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\5\u0088\u06b2\n\u0088\5\u0088\u06b4\n\u0088\3"+
		"\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u06ba\n\u0088\3\u0088\3\u0088\3"+
		"\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u06c3\n\u0088\3\u0088\5"+
		"\u0088\u06c6\n\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u06cd"+
		"\n\u0088\3\u0088\3\u0088\5\u0088\u06d1\n\u0088\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\7\u0089\u06da\n\u0089\f\u0089\16\u0089"+
		"\u06dd\13\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\7\u0089\u06e7\n\u0089\f\u0089\16\u0089\u06ea\13\u0089\5\u0089"+
		"\u06ec\n\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\7\u0089\u06f3\n"+
		"\u0089\f\u0089\16\u0089\u06f6\13\u0089\5\u0089\u06f8\n\u0089\5\u0089\u06fa"+
		"\n\u0089\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\5\u008c\u0706\n\u008c\5\u008c\u0708\n\u008c\3\u008c\3"+
		"\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u070f\n\u008c\3\u008c\3\u008c\3"+
		"\u008c\5\u008c\u0714\n\u008c\3\u008c\5\u008c\u0717\n\u008c\3\u008c\3\u008c"+
		"\3\u008c\5\u008c\u071c\n\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\5\u008c\u0723\n\u008c\3\u008c\3\u008c\5\u008c\u0727\n\u008c\3\u008c\5"+
		"\u008c\u072a\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0730\n\u008d"+
		"\3\u008d\3\u008d\3\u008e\3\u008e\5\u008e\u0736\n\u008e\3\u008e\3\u008e"+
		"\3\u008e\5\u008e\u073b\n\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\7\u008e\u0743\n\u008e\f\u008e\16\u008e\u0746\13\u008e\3\u008e"+
		"\3\u008e\3\u008e\7\u008e\u074b\n\u008e\f\u008e\16\u008e\u074e\13\u008e"+
		"\3\u008f\3\u008f\5\u008f\u0752\n\u008f\3\u008f\3\u008f\3\u0090\3\u0090"+
		"\5\u0090\u0758\n\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\7\u0091\u0763\n\u0091\f\u0091\16\u0091\u0766"+
		"\13\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\7\u0092\u0774\n\u0092\f\u0092\16\u0092"+
		"\u0777\13\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\5\u0093\u078a\n\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\7\u0094\u0794\n\u0094\f\u0094\16\u0094\u0797"+
		"\13\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\5\u0096\u07a2\n\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097"+
		"\5\u0097\u07a9\n\u0097\3\u0098\3\u0098\5\u0098\u07ad\n\u0098\3\u0098\3"+
		"\u0098\3\u0098\3\u0098\5\u0098\u07b3\n\u0098\3\u0098\3\u0098\3\u0098\3"+
		"\u0098\3\u0098\7\u0098\u07ba\n\u0098\f\u0098\16\u0098\u07bd\13\u0098\3"+
		"\u0098\3\u0098\5\u0098\u07c1\n\u0098\3\u0098\5\u0098\u07c4\n\u0098\3\u0098"+
		"\5\u0098\u07c7\n\u0098\3\u0099\3\u0099\5\u0099\u07cb\n\u0099\3\u0099\3"+
		"\u0099\3\u0099\3\u0099\5\u0099\u07d1\n\u0099\3\u0099\3\u0099\5\u0099\u07d5"+
		"\n\u0099\3\u0099\5\u0099\u07d8\n\u0099\3\u0099\3\u0099\3\u009a\3\u009a"+
		"\5\u009a\u07de\n\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u07e4\n"+
		"\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\5\u009a\u07ee\n\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b"+
		"\u07f5\n\u009b\5\u009b\u07f7\n\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u07fc"+
		"\n\u009b\3\u009b\3\u009b\3\u009b\3\u009b\7\u009b\u0802\n\u009b\f\u009b"+
		"\16\u009b\u0805\13\u009b\3\u009b\3\u009b\7\u009b\u0809\n\u009b\f\u009b"+
		"\16\u009b\u080c\13\u009b\3\u009b\3\u009b\5\u009b\u0810\n\u009b\3\u009b"+
		"\5\u009b\u0813\n\u009b\3\u009b\3\u009b\3\u009b\3\u009b\7\u009b\u0819\n"+
		"\u009b\f\u009b\16\u009b\u081c\13\u009b\3\u009b\3\u009b\7\u009b\u0820\n"+
		"\u009b\f\u009b\16\u009b\u0823\13\u009b\3\u009b\3\u009b\5\u009b\u0827\n"+
		"\u009b\5\u009b\u0829\n\u009b\3\u009b\3\u009b\5\u009b\u082d\n\u009b\3\u009b"+
		"\5\u009b\u0830\n\u009b\3\u009b\5\u009b\u0833\n\u009b\3\u009b\3\u009b\3"+
		"\u009b\3\u009b\7\u009b\u0839\n\u009b\f\u009b\16\u009b\u083c\13\u009b\3"+
		"\u009b\3\u009b\7\u009b\u0840\n\u009b\f\u009b\16\u009b\u0843\13\u009b\3"+
		"\u009b\3\u009b\5\u009b\u0847\n\u009b\3\u009b\5\u009b\u084a\n\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\7\u009b\u0850\n\u009b\f\u009b\16\u009b\u0853"+
		"\13\u009b\3\u009b\3\u009b\7\u009b\u0857\n\u009b\f\u009b\16\u009b\u085a"+
		"\13\u009b\3\u009b\3\u009b\5\u009b\u085e\n\u009b\5\u009b\u0860\n\u009b"+
		"\3\u009b\3\u009b\3\u009b\5\u009b\u0865\n\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\7\u009b\u086b\n\u009b\f\u009b\16\u009b\u086e\13\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u0878"+
		"\n\u009b\3\u009c\3\u009c\5\u009c\u087c\n\u009c\3\u009c\3\u009c\5\u009c"+
		"\u0880\n\u009c\3\u009c\3\u009c\5\u009c\u0884\n\u009c\5\u009c\u0886\n\u009c"+
		"\3\u009c\3\u009c\5\u009c\u088a\n\u009c\3\u009c\3\u009c\5\u009c\u088e\n"+
		"\u009c\3\u009c\5\u009c\u0891\n\u009c\3\u009d\3\u009d\3\u009d\5\u009d\u0896"+
		"\n\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u089d\n\u009e"+
		"\3\u009e\5\u009e\u08a0\n\u009e\3\u009e\3\u009e\5\u009e\u08a4\n\u009e\3"+
		"\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u08ab\n\u009e\3\u009e\5"+
		"\u009e\u08ae\n\u009e\3\u009e\5\u009e\u08b1\n\u009e\3\u009e\5\u009e\u08b4"+
		"\n\u009e\3\u009e\3\u009e\5\u009e\u08b8\n\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\5\u009e\u08bf\n\u009e\3\u009e\5\u009e\u08c2\n\u009e\3"+
		"\u009e\5\u009e\u08c5\n\u009e\3\u009e\5\u009e\u08c8\n\u009e\3\u009e\3\u009e"+
		"\5\u009e\u08cc\n\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e"+
		"\u08d3\n\u009e\3\u009e\5\u009e\u08d6\n\u009e\3\u009e\5\u009e\u08d9\n\u009e"+
		"\3\u009e\5\u009e\u08dc\n\u009e\3\u009e\3\u009e\5\u009e\u08e0\n\u009e\3"+
		"\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u08e7\n\u009e\3\u009e\5"+
		"\u009e\u08ea\n\u009e\3\u009e\5\u009e\u08ed\n\u009e\3\u009e\5\u009e\u08f0"+
		"\n\u009e\3\u009e\3\u009e\5\u009e\u08f4\n\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\5\u009e\u08fb\n\u009e\3\u009e\5\u009e\u08fe\n\u009e\3"+
		"\u009e\5\u009e\u0901\n\u009e\3\u009e\5\u009e\u0904\n\u009e\3\u009e\3\u009e"+
		"\5\u009e\u0908\n\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e"+
		"\u090f\n\u009e\3\u009e\5\u009e\u0912\n\u009e\3\u009e\5\u009e\u0915\n\u009e"+
		"\3\u009e\5\u009e\u0918\n\u009e\3\u009e\3\u009e\5\u009e\u091c\n\u009e\3"+
		"\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u0925\n"+
		"\u009e\3\u009e\5\u009e\u0928\n\u009e\3\u009e\5\u009e\u092b\n\u009e\3\u009e"+
		"\5\u009e\u092e\n\u009e\3\u009e\3\u009e\5\u009e\u0932\n\u009e\3\u009e\3"+
		"\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u093b\n\u009e\3"+
		"\u009e\5\u009e\u093e\n\u009e\3\u009e\5\u009e\u0941\n\u009e\3\u009e\5\u009e"+
		"\u0944\n\u009e\3\u009e\3\u009e\5\u009e\u0948\n\u009e\3\u009e\3\u009e\3"+
		"\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u0951\n\u009e\3\u009e\5"+
		"\u009e\u0954\n\u009e\3\u009e\5\u009e\u0957\n\u009e\3\u009e\5\u009e\u095a"+
		"\n\u009e\3\u009e\3\u009e\5\u009e\u095e\n\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\5\u009e\u0965\n\u009e\3\u009e\3\u009e\5\u009e\u0969\n"+
		"\u009e\3\u009e\5\u009e\u096c\n\u009e\3\u009e\5\u009e\u096f\n\u009e\3\u009e"+
		"\5\u009e\u0972\n\u009e\3\u009e\3\u009e\5\u009e\u0976\n\u009e\3\u009e\3"+
		"\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u097d\n\u009e\3\u009e\3\u009e\5"+
		"\u009e\u0981\n\u009e\3\u009e\5\u009e\u0984\n\u009e\3\u009e\5\u009e\u0987"+
		"\n\u009e\3\u009e\5\u009e\u098a\n\u009e\3\u009e\3\u009e\5\u009e\u098e\n"+
		"\u009e\3\u009e\3\u009e\5\u009e\u0992\n\u009e\3\u009e\3\u009e\5\u009e\u0996"+
		"\n\u009e\3\u009e\3\u009e\5\u009e\u099a\n\u009e\3\u009e\3\u009e\5\u009e"+
		"\u099e\n\u009e\3\u009e\3\u009e\5\u009e\u09a2\n\u009e\3\u009e\3\u009e\5"+
		"\u009e\u09a6\n\u009e\3\u009e\3\u009e\5\u009e\u09aa\n\u009e\3\u009e\3\u009e"+
		"\5\u009e\u09ae\n\u009e\3\u009e\3\u009e\5\u009e\u09b2\n\u009e\3\u009e\3"+
		"\u009e\5\u009e\u09b6\n\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5"+
		"\u009e\u09bd\n\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u09c2\n\u009e\3\u009e"+
		"\3\u009e\5\u009e\u09c6\n\u009e\3\u009e\5\u009e\u09c9\n\u009e\3\u009e\3"+
		"\u009e\5\u009e\u09cd\n\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3"+
		"\u009e\3\u009e\5\u009e\u09d6\n\u009e\3\u009e\3\u009e\5\u009e\u09da\n\u009e"+
		"\3\u009e\5\u009e\u09dd\n\u009e\3\u009e\3\u009e\5\u009e\u09e1\n\u009e\3"+
		"\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u09e8\n\u009e\3\u009e\5"+
		"\u009e\u09eb\n\u009e\3\u009e\3\u009e\5\u009e\u09ef\n\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\5\u009e\u09f6\n\u009e\3\u009e\3\u009e\5\u009e"+
		"\u09fa\n\u009e\3\u009e\3\u009e\5\u009e\u09fe\n\u009e\3\u009e\3\u009e\5"+
		"\u009e\u0a02\n\u009e\3\u009e\3\u009e\5\u009e\u0a06\n\u009e\3\u009e\3\u009e"+
		"\5\u009e\u0a0a\n\u009e\3\u009e\3\u009e\5\u009e\u0a0e\n\u009e\3\u009e\3"+
		"\u009e\3\u009e\5\u009e\u0a13\n\u009e\3\u009e\3\u009e\5\u009e\u0a17\n\u009e"+
		"\3\u009e\5\u009e\u0a1a\n\u009e\3\u009e\3\u009e\5\u009e\u0a1e\n\u009e\3"+
		"\u009e\3\u009e\3\u009e\5\u009e\u0a23\n\u009e\3\u009e\3\u009e\5\u009e\u0a27"+
		"\n\u009e\3\u009e\5\u009e\u0a2a\n\u009e\3\u009e\3\u009e\5\u009e\u0a2e\n"+
		"\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u0a33\n\u009e\3\u009e\3\u009e\5"+
		"\u009e\u0a37\n\u009e\3\u009e\5\u009e\u0a3a\n\u009e\3\u009e\3\u009e\5\u009e"+
		"\u0a3e\n\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u0a43\n\u009e\3\u009e\3"+
		"\u009e\5\u009e\u0a47\n\u009e\3\u009e\5\u009e\u0a4a\n\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\7\u009e\u0a51\n\u009e\f\u009e\16\u009e\u0a54"+
		"\13\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u0a5a\n\u009e\3\u009e"+
		"\3\u009e\5\u009e\u0a5e\n\u009e\3\u009e\5\u009e\u0a61\n\u009e\3\u009e\3"+
		"\u009e\5\u009e\u0a65\n\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\7"+
		"\u009e\u0a6c\n\u009e\f\u009e\16\u009e\u0a6f\13\u009e\3\u009e\3\u009e\3"+
		"\u009e\3\u009e\5\u009e\u0a75\n\u009e\3\u009e\3\u009e\5\u009e\u0a79\n\u009e"+
		"\3\u009e\5\u009e\u0a7c\n\u009e\3\u009e\3\u009e\5\u009e\u0a80\n\u009e\5"+
		"\u009e\u0a82\n\u009e\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0a88\n\u009f"+
		"\3\u009f\5\u009f\u0a8b\n\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\7\u00a0\u0a93\n\u00a0\f\u00a0\16\u00a0\u0a96\13\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u0a9f\n\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u0aa4\n\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\5\u00a0\u0aa9\n\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\5\u00a1\u0ab1\n\u00a1\3\u00a2\3\u00a2\5\u00a2\u0ab5\n\u00a2\3\u00a2\7"+
		"\u00a2\u0ab8\n\u00a2\f\u00a2\16\u00a2\u0abb\13\u00a2\3\u00a3\3\u00a3\5"+
		"\u00a3\u0abf\n\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0ac4\n\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\5\u00a3\u0ac9\n\u00a3\3\u00a3\3\u00a3\5\u00a3\u0acd\n"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0ad2\n\u00a3\3\u00a3\3\u00a3\3"+
		"\u00a3\5\u00a3\u0ad7\n\u00a3\3\u00a3\3\u00a3\5\u00a3\u0adb\n\u00a3\3\u00a3"+
		"\3\u00a3\5\u00a3\u0adf\n\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0ae4\n"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0ae9\n\u00a3\3\u00a3\3\u00a3\3"+
		"\u00a3\3\u00a3\5\u00a3\u0aef\n\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0af4"+
		"\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0afa\n\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\5\u00a3\u0aff\n\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3"+
		"\u0b04\n\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0b09\n\u00a3\3\u00a3\3"+
		"\u00a3\3\u00a3\5\u00a3\u0b0e\n\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0b13"+
		"\n\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0b18\n\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\5\u00a3\u0b1d\n\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0b22\n"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0b27\n\u00a3\3\u00a3\3\u00a3\3"+
		"\u00a3\5\u00a3\u0b2c\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u0b32"+
		"\n\u00a3\f\u00a3\16\u00a3\u0b35\13\u00a3\3\u00a3\3\u00a3\5\u00a3\u0b39"+
		"\n\u00a3\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u0b3e\n\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u0b46\n\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u0b57\n\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\5\u00a4"+
		"\u0b63\n\u00a4\5\u00a4\u0b65\n\u00a4\3\u00a4\3\u00a4\5\u00a4\u0b69\n\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u0b6e\n\u00a4\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u0b76\n\u00a4\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\5\u00a4\u0b7d\n\u00a4\3\u00a4\3\u00a4\5\u00a4\u0b81\n"+
		"\u00a4\5\u00a4\u0b83\n\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\7\u00a4\u0b89"+
		"\n\u00a4\f\u00a4\16\u00a4\u0b8c\13\u00a4\3\u00a4\3\u00a4\5\u00a4\u0b90"+
		"\n\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\5\u00a5\u0b9c\n\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\5\u00a5\u0ba3\n\u00a5\5\u00a5\u0ba5\n\u00a5\3\u00a5\5\u00a5\u0ba8"+
		"\n\u00a5\3\u00a5\3\u00a5\5\u00a5\u0bac\n\u00a5\3\u00a5\5\u00a5\u0baf\n"+
		"\u00a5\3\u00a5\3\u00a5\5\u00a5\u0bb3\n\u00a5\3\u00a5\5\u00a5\u0bb6\n\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u0bbb\n\u00a5\3\u00a5\5\u00a5\u0bbe\n"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u0bc3\n\u00a5\3\u00a5\5\u00a5\u0bc6"+
		"\n\u00a5\3\u00a5\3\u00a5\5\u00a5\u0bca\n\u00a5\3\u00a5\5\u00a5\u0bcd\n"+
		"\u00a5\3\u00a5\3\u00a5\5\u00a5\u0bd1\n\u00a5\3\u00a5\5\u00a5\u0bd4\n\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\7\u00a5\u0bda\n\u00a5\f\u00a5\16\u00a5"+
		"\u0bdd\13\u00a5\3\u00a5\3\u00a5\5\u00a5\u0be1\n\u00a5\3\u00a6\3\u00a6"+
		"\3\u00a6\5\u00a6\u0be6\n\u00a6\3\u00a6\3\u00a6\5\u00a6\u0bea\n\u00a6\3"+
		"\u00a6\5\u00a6\u0bed\n\u00a6\3\u00a6\3\u00a6\5\u00a6\u0bf1\n\u00a6\3\u00a6"+
		"\5\u00a6\u0bf4\n\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u0bf9\n\u00a6\3"+
		"\u00a6\5\u00a6\u0bfc\n\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u0c01\n\u00a6"+
		"\3\u00a6\5\u00a6\u0c04\n\u00a6\3\u00a6\3\u00a6\5\u00a6\u0c08\n\u00a6\3"+
		"\u00a6\5\u00a6\u0c0b\n\u00a6\3\u00a6\3\u00a6\5\u00a6\u0c0f\n\u00a6\3\u00a6"+
		"\5\u00a6\u0c12\n\u00a6\3\u00a7\3\u00a7\3\u00a8\3\u00a8\5\u00a8\u0c18\n"+
		"\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\7\u00a8\u0c1f\n\u00a8\f"+
		"\u00a8\16\u00a8\u0c22\13\u00a8\5\u00a8\u0c24\n\u00a8\3\u00a8\5\u00a8\u0c27"+
		"\n\u00a8\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0c2c\n\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\5\u00a9\u0c32\n\u00a9\3\u00a9\3\u00a9\5\u00a9\u0c36\n"+
		"\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u0c3f\n\u00a9\3\u00a9\5\u00a9\u0c42\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3"+
		"\u00a9\7\u00a9\u0c48\n\u00a9\f\u00a9\16\u00a9\u0c4b\13\u00a9\3\u00a9\3"+
		"\u00a9\3\u00a9\5\u00a9\u0c50\n\u00a9\5\u00a9\u0c52\n\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\5\u00a9\u0c57\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\7\u00a9"+
		"\u0c5d\n\u00a9\f\u00a9\16\u00a9\u0c60\13\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\5\u00a9\u0c65\n\u00a9\5\u00a9\u0c67\n\u00a9\3\u00a9\3\u00a9\5\u00a9\u0c6b"+
		"\n\u00a9\3\u00a9\5\u00a9\u0c6e\n\u00a9\3\u00a9\5\u00a9\u0c71\n\u00a9\3"+
		"\u00a9\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u0c77\n\u00a9\f\u00a9\16\u00a9"+
		"\u0c7a\13\u00a9\3\u00a9\3\u00a9\7\u00a9\u0c7e\n\u00a9\f\u00a9\16\u00a9"+
		"\u0c81\13\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0c86\n\u00a9\3\u00a9"+
		"\5\u00a9\u0c89\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u0c8f\n"+
		"\u00a9\f\u00a9\16\u00a9\u0c92\13\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u0c97\n\u00a9\3\u00a9\5\u00a9\u0c9a\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3"+
		"\u00a9\7\u00a9\u0ca0\n\u00a9\f\u00a9\16\u00a9\u0ca3\13\u00a9\3\u00a9\3"+
		"\u00a9\3\u00a9\5\u00a9\u0ca8\n\u00a9\5\u00a9\u0caa\n\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\5\u00a9\u0caf\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\5\u00a9\u0cb8\n\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u0cbd\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u0cc5\n\u00a9\3\u00a9\3\u00a9\5\u00a9\u0cc9\n\u00a9\3\u00a9\3\u00a9\3"+
		"\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0cd1\n\u00a9\3\u00a9\3\u00a9\5"+
		"\u00a9\u0cd5\n\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0cda\n\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0ce1\n\u00a9\3\u00a9\3\u00a9"+
		"\5\u00a9\u0ce5\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\5\u00a9\u0cf8\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\7\u00a9\u0d00\n\u00a9\f\u00a9\16\u00a9\u0d03\13\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0d0c"+
		"\n\u00a9\3\u00a9\5\u00a9\u0d0f\n\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u0d14\n\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0d19\n\u00a9\3\u00a9\5"+
		"\u00a9\u0d1c\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3"+
		"\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0d30\n\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\7\u00a9"+
		"\u0d3d\n\u00a9\f\u00a9\16\u00a9\u0d40\13\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\5\u00a9\u0d4f\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u0d55\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0d5b\n\u00a9\3"+
		"\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0d61\n\u00a9\3\u00a9\3\u00a9\3"+
		"\u00a9\3\u00a9\5\u00a9\u0d67\n\u00a9\3\u00a9\3\u00a9\5\u00a9\u0d6b\n\u00a9"+
		"\3\u00aa\3\u00aa\3\u00aa\7\u00aa\u0d70\n\u00aa\f\u00aa\16\u00aa\u0d73"+
		"\13\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\5\u00ac\u0d7a\n\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0d83"+
		"\n\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\7\u00ad\u0d8b"+
		"\n\u00ad\f\u00ad\16\u00ad\u0d8e\13\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\7\u00ae\u0d9a\n\u00ae"+
		"\f\u00ae\16\u00ae\u0d9d\13\u00ae\3\u00af\3\u00af\5\u00af\u0da1\n\u00af"+
		"\3\u00af\3\u00af\3\u00af\5\u00af\u0da6\n\u00af\3\u00af\3\u00af\3\u00af"+
		"\7\u00af\u0dab\n\u00af\f\u00af\16\u00af\u0dae\13\u00af\3\u00af\5\u00af"+
		"\u0db1\n\u00af\3\u00b0\3\u00b0\5\u00b0\u0db5\n\u00b0\3\u00b0\3\u00b0\3"+
		"\u00b1\3\u00b1\3\u00b1\5\u00b1\u0dbc\n\u00b1\3\u00b1\3\u00b1\3\u00b2\3"+
		"\u00b2\3\u00b2\5\u00b2\u0dc3\n\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5"+
		"\u00b2\u0dc9\n\u00b2\5\u00b2\u0dcb\n\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2"+
		"\u0dd0\n\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2"+
		"\u0dd8\n\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0dde\n\u00b2\3"+
		"\u00b2\3\u00b2\5\u00b2\u0de2\n\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b4\3"+
		"\u00b4\3\u00b4\3\u00b4\5\u00b4\u0deb\n\u00b4\3\u00b4\3\u00b4\3\u00b4\7"+
		"\u00b4\u0df0\n\u00b4\f\u00b4\16\u00b4\u0df3\13\u00b4\3\u00b4\5\u00b4\u0df6"+
		"\n\u00b4\3\u00b4\2\u00b5\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\2\66\4\2\u02c7\u02ca\u02de\u02df\27\2\24"+
		"\24\27\27\'\'**ov\u0095\u0095\u00c1\u00c2\u00eb\u00ec\u00ef\u00ef\u00f5"+
		"\u00f5\u00fb\u00fb\u0105\u0105\u012a\u012a\u012d\u012e\u0135\u0138\u015a"+
		"\u015b\u0223\u0223\u0257\u0257\u0270\u0270\u027f\u0280\u02a0\u02a0\4\2"+
		"\u0135\u0135\u02a0\u02a0\n\2\u008b\u008f\u0101\u0104\u0185\u0187\u018c"+
		"\u018c\u01d6\u01d6\u020f\u0210\u02af\u02af\u02be\u02bf\3\2\u0133\u0134"+
		"\3\2\u02d8\u02d9\4\2\u02e0\u02e0\u02e3\u02e3\4\2\u00d1\u00d1\u027b\u027b"+
		"\31\2\3\3\5\5\31\31\33\34?@hhlmxx\u009b\u009b\u00cb\u00cb\u00dc\u00dc"+
		"\u0146\u0146\u014d\u014f\u0188\u0188\u01c2\u01c2\u01c8\u01c9\u01da\u01db"+
		"\u0203\u0203\u021f\u021f\u0222\u0222\u023b\u023b\u025f\u025f\u027c\u027c"+
		"(\2\27\27))--DE\\]\u00b4\u00b4\u00cd\u00cd\u00d6\u00d6\u00d8\u00d8\u00e1"+
		"\u00e1\u00e5\u00e5\u00fd\u00fd\u0116\u0116\u0119\u0119\u013c\u013d\u0148"+
		"\u0148\u014a\u014a\u0157\u0159\u015c\u015c\u0181\u0181\u01a4\u01a4\u01b0"+
		"\u01b0\u01d9\u01d9\u01f2\u01f2\u01f4\u01f4\u01fe\u01fe\u0200\u0200\u0208"+
		"\u0208\u020a\u020a\u022a\u022a\u022d\u022d\u024b\u024b\u0250\u0251\u0271"+
		"\u0271\u027a\u027a\u0288\u0288\u0294\u0294\u02b2\u02b2\37\2\b\tjj}}\u0081"+
		"\u0081\u0085\u0089\u0090\u0093\u00d0\u00d0\u00e6\u00e7\u00f0\u00f0\u0101"+
		"\u0101\u0130\u0130\u015d\u015e\u0180\u0180\u0185\u0185\u018c\u018d\u01a0"+
		"\u01a0\u01bf\u01c0\u01d6\u01d6\u020e\u020f\u0249\u0249\u0252\u0252\u0259"+
		"\u0259\u0266\u026c\u0272\u0273\u028d\u028d\u029a\u029c\u02af\u02b1\u02be"+
		"\u02be\u02c0\u02c0$\2\n\13%%GGOOQQ``\177\177\u0082\u0082\u0098\u0099\u009f"+
		"\u00a0\u00b7\u00b8\u00e2\u00e2\u00f1\u00f1\u0107\u0108\u010e\u010f\u0121"+
		"\u0121\u0123\u0123\u0131\u0131\u0148\u0148\u015c\u015c\u0165\u0165\u0179"+
		"\u0179\u0192\u0192\u01a7\u01a7\u01be\u01be\u01eb\u01eb\u020d\u020d\u0219"+
		"\u0219\u0225\u0225\u025a\u025a\u0298\u0298\u02a1\u02a1\u02a3\u02a3\u02ab"+
		"\u02ab\16\2  ,,..\60\60nn\u00f6\u00f6\u0171\u0171\u0183\u0183\u0243\u0246"+
		"\u0253\u0253\u02a4\u02a5\u02a9\u02a9\4\2\20\20\23\23\3\2\u02cc\u02cd\5"+
		"\2\u02c2\u02c3\u02d3\u02d3\u02dd\u02dd\4\2**\u02d8\u02da\5\2\20\20\u00a8"+
		"\u00a8\u02d3\u02d3\4\2{{\u0112\u0112\4\2\u013c\u013c\u0200\u0200\4\2\u010c"+
		"\u010c\u0129\u0129\4\2\20\20\u00a8\u00a9\4\2\u0232\u0232\u0234\u0234\4"+
		"\2\26\26\u00a2\u00a2\4\2\u00fe\u00fe\u0156\u0156\3\2\u02a2\u02a3\6\2\u00d9"+
		"\u00d9\u0132\u0132\u0199\u0199\u01cd\u01cd\4\2\u00d9\u00d9\u0199\u0199"+
		"\4\2^^\u0156\u0156\4\2\u0109\u0109\u01f4\u01f4\4\2TT\u00d4\u00d4\4\2\u0143"+
		"\u0143\u0207\u0207\4\2\u009d\u009d\u0156\u0156\4\2\u0082\u0082\u020d\u020d"+
		"\r\2\u008b\u008c\u008e\u008f\u0101\u0101\u0103\u0104\u0185\u0185\u0187"+
		"\u0187\u018c\u018c\u01d6\u01d6\u020f\u020f\u02af\u02af\u02be\u02bf\5\2"+
		"\u00e9\u00e9\u022e\u022e\u028c\u028c\5\2kk\u0099\u0099\u0114\u0114\6\2"+
		"\u0099\u0099\u00c8\u00c8\u019e\u019e\u021b\u021b\3\2\u02e4\u02e5\4\2\u00e9"+
		"\u00e9\u022e\u022e\5\2\u0099\u0099\u00b0\u00b0\u00da\u00da\4\2~~\u02e4"+
		"\u02e4\5\2\u00d9\u00d9\u0132\u0132\u019a\u019a\4\2\u0099\u0099\u02e0\u02e0"+
		"\b\2XX[[\u0099\u0099\u00b0\u00b0\u00da\u00da\u01e6\u01e6\4\2\f\f\u00d9"+
		"\u00d9\4\2\25\25\u0274\u0274\4\2\66\66\u00f9\u00f9\4\2;;\u01fa\u01fa\5"+
		"\2\u017f\u017f\u0261\u0261\u0284\u0284\4\2\u009a\u009a\u011e\u011e\4\2"+
		"<<\u0149\u0149\u1036\2\u0168\3\2\2\2\4\u016a\3\2\2\2\6\u0187\3\2\2\2\b"+
		"\u019a\3\2\2\2\n\u019c\3\2\2\2\f\u019e\3\2\2\2\16\u01a0\3\2\2\2\20\u01a2"+
		"\3\2\2\2\22\u01a5\3\2\2\2\24\u01a9\3\2\2\2\26\u01ab\3\2\2\2\30\u01ad\3"+
		"\2\2\2\32\u01b5\3\2\2\2\34\u01bb\3\2\2\2\36\u01bd\3\2\2\2 \u01bf\3\2\2"+
		"\2\"\u01c1\3\2\2\2$\u01c3\3\2\2\2&\u01c5\3\2\2\2(\u01c7\3\2\2\2*\u01cb"+
		"\3\2\2\2,\u01cf\3\2\2\2.\u01d3\3\2\2\2\60\u01d7\3\2\2\2\62\u01db\3\2\2"+
		"\2\64\u01df\3\2\2\2\66\u01e3\3\2\2\28\u01e7\3\2\2\2:\u01eb\3\2\2\2<\u01ef"+
		"\3\2\2\2>\u01f3\3\2\2\2@\u01f7\3\2\2\2B\u01fb\3\2\2\2D\u01ff\3\2\2\2F"+
		"\u0203\3\2\2\2H\u0207\3\2\2\2J\u020b\3\2\2\2L\u0210\3\2\2\2N\u0216\3\2"+
		"\2\2P\u021e\3\2\2\2R\u0226\3\2\2\2T\u022f\3\2\2\2V\u0233\3\2\2\2X\u024f"+
		"\3\2\2\2Z\u027a\3\2\2\2\\\u027c\3\2\2\2^\u0281\3\2\2\2`\u0286\3\2\2\2"+
		"b\u028b\3\2\2\2d\u0290\3\2\2\2f\u0295\3\2\2\2h\u029d\3\2\2\2j\u029f\3"+
		"\2\2\2l\u02b1\3\2\2\2n\u02df\3\2\2\2p\u02e3\3\2\2\2r\u02e5\3\2\2\2t\u02f5"+
		"\3\2\2\2v\u0306\3\2\2\2x\u031c\3\2\2\2z\u0320\3\2\2\2|\u032b\3\2\2\2~"+
		"\u032f\3\2\2\2\u0080\u0339\3\2\2\2\u0082\u033b\3\2\2\2\u0084\u0346\3\2"+
		"\2\2\u0086\u034f\3\2\2\2\u0088\u035a\3\2\2\2\u008a\u0380\3\2\2\2\u008c"+
		"\u0386\3\2\2\2\u008e\u0388\3\2\2\2\u0090\u0390\3\2\2\2\u0092\u03af\3\2"+
		"\2\2\u0094\u03b1\3\2\2\2\u0096\u03b9\3\2\2\2\u0098\u03be\3\2\2\2\u009a"+
		"\u03c8\3\2\2\2\u009c\u03db\3\2\2\2\u009e\u03f0\3\2\2\2\u00a0\u03f2\3\2"+
		"\2\2\u00a2\u03fd\3\2\2\2\u00a4\u0435\3\2\2\2\u00a6\u0438\3\2\2\2\u00a8"+
		"\u0449\3\2\2\2\u00aa\u044b\3\2\2\2\u00ac\u044e\3\2\2\2\u00ae\u0458\3\2"+
		"\2\2\u00b0\u0467\3\2\2\2\u00b2\u0469\3\2\2\2\u00b4\u046b\3\2\2\2\u00b6"+
		"\u0476\3\2\2\2\u00b8\u0478\3\2\2\2\u00ba\u0483\3\2\2\2\u00bc\u048a\3\2"+
		"\2\2\u00be\u049a\3\2\2\2\u00c0\u049c\3\2\2\2\u00c2\u04ab\3\2\2\2\u00c4"+
		"\u04b9\3\2\2\2\u00c6\u04cc\3\2\2\2\u00c8\u04e3\3\2\2\2\u00ca\u04e5\3\2"+
		"\2\2\u00cc\u04f3\3\2\2\2\u00ce\u0504\3\2\2\2\u00d0\u050c\3\2\2\2\u00d2"+
		"\u0515\3\2\2\2\u00d4\u0526\3\2\2\2\u00d6\u052b\3\2\2\2\u00d8\u0534\3\2"+
		"\2\2\u00da\u053a\3\2\2\2\u00dc\u0544\3\2\2\2\u00de\u0546\3\2\2\2\u00e0"+
		"\u0558\3\2\2\2\u00e2\u0564\3\2\2\2\u00e4\u0574\3\2\2\2\u00e6\u057d\3\2"+
		"\2\2\u00e8\u0586\3\2\2\2\u00ea\u058a\3\2\2\2\u00ec\u059d\3\2\2\2\u00ee"+
		"\u05a6\3\2\2\2\u00f0\u05ae\3\2\2\2\u00f2\u05b0\3\2\2\2\u00f4\u0604\3\2"+
		"\2\2\u00f6\u063c\3\2\2\2\u00f8\u0642\3\2\2\2\u00fa\u064e\3\2\2\2\u00fc"+
		"\u0652\3\2\2\2\u00fe\u0655\3\2\2\2\u0100\u0659\3\2\2\2\u0102\u066f\3\2"+
		"\2\2\u0104\u0680\3\2\2\2\u0106\u0682\3\2\2\2\u0108\u0689\3\2\2\2\u010a"+
		"\u06a2\3\2\2\2\u010c\u06a4\3\2\2\2\u010e\u06ac\3\2\2\2\u0110\u06f9\3\2"+
		"\2\2\u0112\u06fb\3\2\2\2\u0114\u06fe\3\2\2\2\u0116\u0700\3\2\2\2\u0118"+
		"\u072b\3\2\2\2\u011a\u0733\3\2\2\2\u011c\u074f\3\2\2\2\u011e\u0755\3\2"+
		"\2\2\u0120\u075b\3\2\2\2\u0122\u0767\3\2\2\2\u0124\u0789\3\2\2\2\u0126"+
		"\u078b\3\2\2\2\u0128\u079a\3\2\2\2\u012a\u079d\3\2\2\2\u012c\u07a8\3\2"+
		"\2\2\u012e\u07aa\3\2\2\2\u0130\u07c8\3\2\2\2\u0132\u07db\3\2\2\2\u0134"+
		"\u0877\3\2\2\2\u0136\u0879\3\2\2\2\u0138\u0895\3\2\2\2\u013a\u0a81\3\2"+
		"\2\2\u013c\u0a83\3\2\2\2\u013e\u0a8c\3\2\2\2\u0140\u0ab0\3\2\2\2\u0142"+
		"\u0ab2\3\2\2\2\u0144\u0b38\3\2\2\2\u0146\u0b3a\3\2\2\2\u0148\u0b91\3\2"+
		"\2\2\u014a\u0be2\3\2\2\2\u014c\u0c13\3\2\2\2\u014e\u0c15\3\2\2\2\u0150"+
		"\u0d6a\3\2\2\2\u0152\u0d6c\3\2\2\2\u0154\u0d74\3\2\2\2\u0156\u0d82\3\2"+
		"\2\2\u0158\u0d84\3\2\2\2\u015a\u0d8f\3\2\2\2\u015c\u0d9e\3\2\2\2\u015e"+
		"\u0db2\3\2\2\2\u0160\u0db8\3\2\2\2\u0162\u0dc2\3\2\2\2\u0164\u0de3\3\2"+
		"\2\2\u0166\u0de6\3\2\2\2\u0168\u0169\t\2\2\2\u0169\3\3\2\2\2\u016a\u016b"+
		"\t\3\2\2\u016b\5\3\2\2\2\u016c\u016e\7*\2\2\u016d\u016f\7\u02e0\2\2\u016e"+
		"\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0188\3\2\2\2\u0170\u0172\7D"+
		"\2\2\u0171\u0173\7\u02e0\2\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0188\3\2\2\2\u0174\u0188\7\u0088\2\2\u0175\u0188\7\u008a\2\2\u0176\u017c"+
		"\7\u0096\2\2\u0177\u017a\7\u02e0\2\2\u0178\u0179\7\u02d2\2\2\u0179\u017b"+
		"\7\u02e0\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2"+
		"\2\u017c\u0177\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0188\3\2\2\2\u017e\u0180"+
		"\7\u0220\2\2\u017f\u0181\7\u011b\2\2\u0180\u017f\3\2\2\2\u0180\u0181\3"+
		"\2\2\2\u0181\u0188\3\2\2\2\u0182\u0188\7\u0267\2\2\u0183\u0185\7\u0290"+
		"\2\2\u0184\u0186\7\u011b\2\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0188\3\2\2\2\u0187\u016c\3\2\2\2\u0187\u0170\3\2\2\2\u0187\u0174\3\2"+
		"\2\2\u0187\u0175\3\2\2\2\u0187\u0176\3\2\2\2\u0187\u017e\3\2\2\2\u0187"+
		"\u0182\3\2\2\2\u0187\u0183\3\2\2\2\u0188\7\3\2\2\2\u0189\u018a\7\u010b"+
		"\2\2\u018a\u018b\7\u0196\2\2\u018b\u018c\7\u012f\2\2\u018c\u019b\7\u0189"+
		"\2\2\u018d\u018e\7\u010b\2\2\u018e\u018f\7\u0196\2\2\u018f\u0190\7\u012f"+
		"\2\2\u0190\u0191\7\u0189\2\2\u0191\u0192\7\u02b6\2\2\u0192\u0193\7\u01d7"+
		"\2\2\u0193\u019b\7\u00cc\2\2\u0194\u0195\7\u010b\2\2\u0195\u0196\7\64"+
		"\2\2\u0196\u019b\7\u0189\2\2\u0197\u0198\7\u02b6\2\2\u0198\u0199\7\u01d7"+
		"\2\2\u0199\u019b\7\u00cc\2\2\u019a\u0189\3\2\2\2\u019a\u018d\3\2\2\2\u019a"+
		"\u0194\3\2\2\2\u019a\u0197\3\2\2\2\u019b\t\3\2\2\2\u019c\u019d\t\4\2\2"+
		"\u019d\13\3\2\2\2\u019e\u019f\t\5\2\2\u019f\r\3\2\2\2\u01a0\u01a1\t\6"+
		"\2\2\u01a1\17\3\2\2\2\u01a2\u01a3\7\u02e4\2\2\u01a3\21\3\2\2\2\u01a4\u01a6"+
		"\t\7\2\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a8\t\b\2\2\u01a8\23\3\2\2\2\u01a9\u01aa\7\u02e1\2\2\u01aa\25\3\2\2"+
		"\2\u01ab\u01ac\t\t\2\2\u01ac\27\3\2\2\2\u01ad\u01ae\7\u02e2\2\2\u01ae"+
		"\31\3\2\2\2\u01af\u01b6\5\20\t\2\u01b0\u01b6\5\22\n\2\u01b1\u01b6\5\24"+
		"\13\2\u01b2\u01b6\5\26\f\2\u01b3\u01b6\5\30\r\2\u01b4\u01b6\7\u01a1\2"+
		"\2\u01b5\u01af\3\2\2\2\u01b5\u01b0\3\2\2\2\u01b5\u01b1\3\2\2\2\u01b5\u01b2"+
		"\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6\33\3\2\2\2\u01b7"+
		"\u01bc\5\36\20\2\u01b8\u01bc\5 \21\2\u01b9\u01bc\5\"\22\2\u01ba\u01bc"+
		"\5$\23\2\u01bb\u01b7\3\2\2\2\u01bb\u01b8\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb"+
		"\u01ba\3\2\2\2\u01bc\35\3\2\2\2\u01bd\u01be\t\n\2\2\u01be\37\3\2\2\2\u01bf"+
		"\u01c0\t\13\2\2\u01c0!\3\2\2\2\u01c1\u01c2\t\f\2\2\u01c2#\3\2\2\2\u01c3"+
		"\u01c4\t\r\2\2\u01c4%\3\2\2\2\u01c5\u01c6\t\16\2\2\u01c6\'\3\2\2\2\u01c7"+
		"\u01c8\7\u02e5\2\2\u01c8\u01c9\6\25\2\3\u01c9\u01ca\b\25\1\2\u01ca)\3"+
		"\2\2\2\u01cb\u01cc\7\u02e5\2\2\u01cc\u01cd\6\26\3\3\u01cd\u01ce\b\26\1"+
		"\2\u01ce+\3\2\2\2\u01cf\u01d0\7\u02e5\2\2\u01d0\u01d1\6\27\4\3\u01d1\u01d2"+
		"\b\27\1\2\u01d2-\3\2\2\2\u01d3\u01d4\7\u02e5\2\2\u01d4\u01d5\6\30\5\3"+
		"\u01d5\u01d6\b\30\1\2\u01d6/\3\2\2\2\u01d7\u01d8\7\u02e5\2\2\u01d8\u01d9"+
		"\6\31\6\3\u01d9\u01da\b\31\1\2\u01da\61\3\2\2\2\u01db\u01dc\7\u02e5\2"+
		"\2\u01dc\u01dd\6\32\7\3\u01dd\u01de\b\32\1\2\u01de\63\3\2\2\2\u01df\u01e0"+
		"\7\u02e5\2\2\u01e0\u01e1\6\33\b\3\u01e1\u01e2\b\33\1\2\u01e2\65\3\2\2"+
		"\2\u01e3\u01e4\7\u02e5\2\2\u01e4\u01e5\6\34\t\3\u01e5\u01e6\b\34\1\2\u01e6"+
		"\67\3\2\2\2\u01e7\u01e8\7\u02e5\2\2\u01e8\u01e9\6\35\n\3\u01e9\u01ea\b"+
		"\35\1\2\u01ea9\3\2\2\2\u01eb\u01ec\7\u02e5\2\2\u01ec\u01ed\6\36\13\3\u01ed"+
		"\u01ee\b\36\1\2\u01ee;\3\2\2\2\u01ef\u01f0\7\u02e5\2\2\u01f0\u01f1\6\37"+
		"\f\3\u01f1\u01f2\b\37\1\2\u01f2=\3\2\2\2\u01f3\u01f4\7\u02e5\2\2\u01f4"+
		"\u01f5\6 \r\3\u01f5\u01f6\b \1\2\u01f6?\3\2\2\2\u01f7\u01f8\7\u02e5\2"+
		"\2\u01f8\u01f9\6!\16\3\u01f9\u01fa\b!\1\2\u01faA\3\2\2\2\u01fb\u01fc\7"+
		"\u02e5\2\2\u01fc\u01fd\6\"\17\3\u01fd\u01fe\b\"\1\2\u01feC\3\2\2\2\u01ff"+
		"\u0200\7\u02e5\2\2\u0200\u0201\6#\20\3\u0201\u0202\b#\1\2\u0202E\3\2\2"+
		"\2\u0203\u0204\7\u02e5\2\2\u0204\u0205\6$\21\3\u0205\u0206\b$\1\2\u0206"+
		"G\3\2\2\2\u0207\u0208\7\u02e5\2\2\u0208\u0209\6%\22\3\u0209\u020a\b%\1"+
		"\2\u020aI\3\2\2\2\u020b\u020c\7\u02e5\2\2\u020c\u020d\6&\23\3\u020d\u020e"+
		"\b&\1\2\u020eK\3\2\2\2\u020f\u0211\7\25\2\2\u0210\u020f\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\7\u02e5\2\2\u0213\u0214"+
		"\6\'\24\3\u0214\u0215\b\'\1\2\u0215M\3\2\2\2\u0216\u021b\5P)\2\u0217\u0218"+
		"\7\u02c4\2\2\u0218\u021a\5P)\2\u0219\u0217\3\2\2\2\u021a\u021d\3\2\2\2"+
		"\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021cO\3\2\2\2\u021d\u021b\3"+
		"\2\2\2\u021e\u0223\5R*\2\u021f\u0220\7\u02bd\2\2\u0220\u0222\5R*\2\u0221"+
		"\u021f\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224Q\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u022b\5T+\2\u0227\u0228"+
		"\7\u02c5\2\2\u0228\u022a\5T+\2\u0229\u0227\3\2\2\2\u022a\u022d\3\2\2\2"+
		"\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022cS\3\2\2\2\u022d\u022b\3"+
		"\2\2\2\u022e\u0230\7\u019f\2\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2"+
		"\u0230\u0231\3\2\2\2\u0231\u0232\5V,\2\u0232U\3\2\2\2\u0233\u023c\5X-"+
		"\2\u0234\u0236\7\u0122\2\2\u0235\u0237\7\u019f\2\2\u0236\u0235\3\2\2\2"+
		"\u0236\u0237\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u023b\5\26\f\2\u0239\u023b"+
		"\7\u01a1\2\2\u023a\u0238\3\2\2\2\u023a\u0239\3\2\2\2\u023b\u023d\3\2\2"+
		"\2\u023c\u0234\3\2\2\2\u023c\u023d\3\2\2\2\u023dW\3\2\2\2\u023e\u023f"+
		"\5Z.\2\u023f\u0240\5\2\2\2\u0240\u0241\5Z.\2\u0241\u0250\3\2\2\2\u0242"+
		"\u0243\5Z.\2\u0243\u0245\5\2\2\2\u0244\u0246\t\17\2\2\u0245\u0244\3\2"+
		"\2\2\u0245\u0246\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\5\u00ba^\2\u0248"+
		"\u0250\3\2\2\2\u0249\u024b\7\u019f\2\2\u024a\u0249\3\2\2\2\u024a\u024b"+
		"\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\7\u00c9\2\2\u024d\u0250\5\u00ba"+
		"^\2\u024e\u0250\5Z.\2\u024f\u023e\3\2\2\2\u024f\u0242\3\2\2\2\u024f\u024a"+
		"\3\2\2\2\u024f\u024e\3\2\2\2\u0250Y\3\2\2\2\u0251\u0253\5\\/\2\u0252\u0254"+
		"\7\u019f\2\2\u0253\u0252\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\3\2\2"+
		"\2\u0255\u0258\7\u010b\2\2\u0256\u0259\5\u00ba^\2\u0257\u0259\5z>\2\u0258"+
		"\u0256\3\2\2\2\u0258\u0257\3\2\2\2\u0259\u027b\3\2\2\2\u025a\u025c\5\\"+
		"/\2\u025b\u025d\7\u019f\2\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"\u025e\3\2\2\2\u025e\u025f\7&\2\2\u025f\u0260\5\\/\2\u0260\u0261\7\u02c5"+
		"\2\2\u0261\u0262\5Z.\2\u0262\u027b\3\2\2\2\u0263\u0264\5\\/\2\u0264\u0265"+
		"\7\u022b\2\2\u0265\u0266\7\u0140\2\2\u0266\u0267\5\\/\2\u0267\u027b\3"+
		"\2\2\2\u0268\u026a\5\\/\2\u0269\u026b\7\u019f\2\2\u026a\u0269\3\2\2\2"+
		"\u026a\u026b\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\7\u0140\2\2\u026d"+
		"\u0270\5l\67\2\u026e\u026f\7\u00bf\2\2\u026f\u0271\5l\67\2\u0270\u026e"+
		"\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u027b\3\2\2\2\u0272\u0274\5\\/\2\u0273"+
		"\u0275\7\u019f\2\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276"+
		"\3\2\2\2\u0276\u0277\7\u01e8\2\2\u0277\u0278\5\\/\2\u0278\u027b\3\2\2"+
		"\2\u0279\u027b\5\\/\2\u027a\u0251\3\2\2\2\u027a\u025a\3\2\2\2\u027a\u0263"+
		"\3\2\2\2\u027a\u0268\3\2\2\2\u027a\u0272\3\2\2\2\u027a\u0279\3\2\2\2\u027b"+
		"[\3\2\2\2\u027c\u027f\5^\60\2\u027d\u027e\7\u02db\2\2\u027e\u0280\5^\60"+
		"\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280]\3\2\2\2\u0281\u0284"+
		"\5`\61\2\u0282\u0283\7\u02dc\2\2\u0283\u0285\5`\61\2\u0284\u0282\3\2\2"+
		"\2\u0284\u0285\3\2\2\2\u0285_\3\2\2\2\u0286\u0289\5b\62\2\u0287\u0288"+
		"\t\20\2\2\u0288\u028a\5b\62\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2"+
		"\u028aa\3\2\2\2\u028b\u028e\5d\63\2\u028c\u028d\t\7\2\2\u028d\u028f\5"+
		"d\63\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028fc\3\2\2\2\u0290\u0293"+
		"\5f\64\2\u0291\u0292\t\21\2\2\u0292\u0294\5f\64\2\u0293\u0291\3\2\2\2"+
		"\u0293\u0294\3\2\2\2\u0294e\3\2\2\2\u0295\u0298\5h\65\2\u0296\u0297\t"+
		"\7\2\2\u0297\u0299\5|?\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"g\3\2\2\2\u029a\u029b\t\22\2\2\u029b\u029e\5l\67\2\u029c\u029e\5l\67\2"+
		"\u029d\u029a\3\2\2\2\u029d\u029c\3\2\2\2\u029ei\3\2\2\2\u029f\u02a2\5"+
		"l\67\2\u02a0\u02a1\7P\2\2\u02a1\u02a3\5\16\b\2\u02a2\u02a0\3\2\2\2\u02a2"+
		"\u02a3\3\2\2\2\u02a3k\3\2\2\2\u02a4\u02b2\5\32\16\2\u02a5\u02b2\5x=\2"+
		"\u02a6\u02b2\5n8\2\u02a7\u02b2\7\u02e6\2\2\u02a8\u02b2\5z>\2\u02a9\u02aa"+
		"\7\u0206\2\2\u02aa\u02b2\5z>\2\u02ab\u02b2\5\u00ba^\2\u02ac\u02ad\7\u00c9"+
		"\2\2\u02ad\u02b2\5\u00ba^\2\u02ae\u02b2\5v<\2\u02af\u02b2\5p9\2\u02b0"+
		"\u02b2\5|?\2\u02b1\u02a4\3\2\2\2\u02b1\u02a5\3\2\2\2\u02b1\u02a6\3\2\2"+
		"\2\u02b1\u02a7\3\2\2\2\u02b1\u02a8\3\2\2\2\u02b1\u02a9\3\2\2\2\u02b1\u02ab"+
		"\3\2\2\2\u02b1\u02ac\3\2\2\2\u02b1\u02ae\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1"+
		"\u02b0\3\2\2\2\u02b2m\3\2\2\2\u02b3\u02c0\5\34\17\2\u02b4\u02bd\7\u02d5"+
		"\2\2\u02b5\u02ba\5N(\2\u02b6\u02b7\7\u02d2\2\2\u02b7\u02b9\5N(\2\u02b8"+
		"\u02b6\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2"+
		"\2\2\u02bb\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02b5\3\2\2\2\u02bd"+
		"\u02be\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1\7\u02d4\2\2\u02c0\u02b4"+
		"\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02e0\3\2\2\2\u02c2\u02c3\7>\2\2\u02c3"+
		"\u02c4\7\u02d5\2\2\u02c4\u02c5\5N(\2\u02c5\u02c6\7\25\2\2\u02c6\u02c7"+
		"\5\6\4\2\u02c7\u02c8\7\u02d4\2\2\u02c8\u02e0\3\2\2\2\u02c9\u02ca\7i\2"+
		"\2\u02ca\u02cb\7\u02d5\2\2\u02cb\u02cc\5N(\2\u02cc\u02cd\7\u02d2\2\2\u02cd"+
		"\u02ce\5\6\4\2\u02ce\u02cf\7\u02d4\2\2\u02cf\u02e0\3\2\2\2\u02d0\u02d1"+
		"\7i\2\2\u02d1\u02d2\7\u02d5\2\2\u02d2\u02d3\5N(\2\u02d3\u02d4\7\u0299"+
		"\2\2\u02d4\u02d5\5\n\6\2\u02d5\u02d6\7\u02d4\2\2\u02d6\u02e0\3\2\2\2\u02d7"+
		"\u02d8\5&\24\2\u02d8\u02da\7\u02d5\2\2\u02d9\u02db\t\23\2\2\u02da\u02d9"+
		"\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\5\\/\2\u02dd"+
		"\u02de\7\u02d4\2\2\u02de\u02e0\3\2\2\2\u02df\u02b3\3\2\2\2\u02df\u02c2"+
		"\3\2\2\2\u02df\u02c9\3\2\2\2\u02df\u02d0\3\2\2\2\u02df\u02d7\3\2\2\2\u02e0"+
		"o\3\2\2\2\u02e1\u02e4\5r:\2\u02e2\u02e4\5t;\2\u02e3\u02e1\3\2\2\2\u02e3"+
		"\u02e2\3\2\2\2\u02e4q\3\2\2\2\u02e5\u02eb\7=\2\2\u02e6\u02e7\7\u02b3\2"+
		"\2\u02e7\u02e8\5N(\2\u02e8\u02e9\7\u0265\2\2\u02e9\u02ea\5\\/\2\u02ea"+
		"\u02ec\3\2\2\2\u02eb\u02e6\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02eb\3\2"+
		"\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02f0\7\u00b2\2\2\u02f0"+
		"\u02f2\5\\/\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\3\2"+
		"\2\2\u02f3\u02f4\7\u00b9\2\2\u02f4s\3\2\2\2\u02f5\u02f6\7=\2\2\u02f6\u02fc"+
		"\5\\/\2\u02f7\u02f8\7\u02b3\2\2\u02f8\u02f9\5\\/\2\u02f9\u02fa\7\u0265"+
		"\2\2\u02fa\u02fb\5\\/\2\u02fb\u02fd\3\2\2\2\u02fc\u02f7\3\2\2\2\u02fd"+
		"\u02fe\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0302\3\2"+
		"\2\2\u0300\u0301\7\u00b2\2\2\u0301\u0303\5\\/\2\u0302\u0300\3\2\2\2\u0302"+
		"\u0303\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0305\7\u00b9\2\2\u0305u\3\2"+
		"\2\2\u0306\u0307\7\u0170\2\2\u0307\u030c\5x=\2\u0308\u0309\7\u02d2\2\2"+
		"\u0309\u030b\5x=\2\u030a\u0308\3\2\2\2\u030b\u030e\3\2\2\2\u030c\u030a"+
		"\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030f\3\2\2\2\u030e\u030c\3\2\2\2\u030f"+
		"\u0310\7\r\2\2\u0310\u0312\5N(\2\u0311\u0313\5\b\5\2\u0312\u0311\3\2\2"+
		"\2\u0312\u0313\3\2\2\2\u0313w\3\2\2\2\u0314\u0315\5(\25\2\u0315\u0316"+
		"\7\u02d1\2\2\u0316\u0318\3\2\2\2\u0317\u0314\3\2\2\2\u0317\u0318\3\2\2"+
		"\2\u0318\u0319\3\2\2\2\u0319\u031a\5*\26\2\u031a\u031b\7\u02d1\2\2\u031b"+
		"\u031d\3\2\2\2\u031c\u0317\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031e\3\2"+
		"\2\2\u031e\u031f\5.\30\2\u031fy\3\2\2\2\u0320\u0321\7\u02d5\2\2\u0321"+
		"\u0326\5N(\2\u0322\u0323\7\u02d2\2\2\u0323\u0325\5N(\2\u0324\u0322\3\2"+
		"\2\2\u0325\u0328\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327"+
		"\u0329\3\2\2\2\u0328\u0326\3\2\2\2\u0329\u032a\7\u02d4\2\2\u032a{\3\2"+
		"\2\2\u032b\u032c\7\u011c\2\2\u032c\u032d\5N(\2\u032d\u032e\5\f\7\2\u032e"+
		"}\3\2\2\2\u032f\u0334\5\u0080A\2\u0330\u0331\7\u02d2\2\2\u0331\u0333\5"+
		"\u0080A\2\u0332\u0330\3\2\2\2\u0333\u0336\3\2\2\2\u0334\u0332\3\2\2\2"+
		"\u0334\u0335\3\2\2\2\u0335\177\3\2\2\2\u0336\u0334\3\2\2\2\u0337\u033a"+
		"\5\u0082B\2\u0338\u033a\5\u008aF\2\u0339\u0337\3\2\2\2\u0339\u0338\3\2"+
		"\2\2\u033a\u0081\3\2\2\2\u033b\u0344\5\u0084C\2\u033c\u033e\t\24\2\2\u033d"+
		"\u033c\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0340\7\u0127"+
		"\2\2\u0340\u0342\5\u008aF\2\u0341\u0343\5\u008cG\2\u0342\u0341\3\2\2\2"+
		"\u0342\u0343\3\2\2\2\u0343\u0345\3\2\2\2\u0344\u033d\3\2\2\2\u0344\u0345"+
		"\3\2\2\2\u0345\u0083\3\2\2\2\u0346\u034d\5\u0086D\2\u0347\u0348\7\u024a"+
		"\2\2\u0348\u034b\5\u008aF\2\u0349\u034a\7\u01a8\2\2\u034a\u034c\5N(\2"+
		"\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034e\3\2\2\2\u034d\u0347"+
		"\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0085\3\2\2\2\u034f\u0358\5\u0088E"+
		"\2\u0350\u0352\t\25\2\2\u0351\u0353\7\u01b3\2\2\u0352\u0351\3\2\2\2\u0352"+
		"\u0353\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\7\u0127\2\2\u0355\u0356"+
		"\5\u0088E\2\u0356\u0357\5\u008cG\2\u0357\u0359\3\2\2\2\u0358\u0350\3\2"+
		"\2\2\u0358\u0359\3\2\2\2\u0359\u0087\3\2\2\2\u035a\u0364\5\u008aF\2\u035b"+
		"\u0360\7\u0196\2\2\u035c\u035e\t\25\2\2\u035d\u035f\7\u01b3\2\2\u035e"+
		"\u035d\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0361\3\2\2\2\u0360\u035c\3\2"+
		"\2\2\u0360\u0361\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0363\7\u0127\2\2\u0363"+
		"\u0365\5\u008aF\2\u0364\u035b\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0089"+
		"\3\2\2\2\u0366\u0368\5\u00bc_\2\u0367\u0369\5\u0096L\2\u0368\u0367\3\2"+
		"\2\2\u0368\u0369\3\2\2\2\u0369\u036b\3\2\2\2\u036a\u036c\5L\'\2\u036b"+
		"\u036a\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036e\3\2\2\2\u036d\u036f\5\u008e"+
		"H\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0381\3\2\2\2\u0370"+
		"\u0371\5\u00ba^\2\u0371\u0372\5L\'\2\u0372\u0381\3\2\2\2\u0373\u0374\7"+
		"\u02d5\2\2\u0374\u0375\5~@\2\u0375\u0376\7\u02d4\2\2\u0376\u0381\3\2\2"+
		"\2\u0377\u0378\7\u01a6\2\2\u0378\u0379\5\u0080A\2\u0379\u037a\7\u013c"+
		"\2\2\u037a\u037b\7\u01b3\2\2\u037b\u037c\7\u0127\2\2\u037c\u037d\5\u0080"+
		"A\2\u037d\u037e\7\u01a8\2\2\u037e\u037f\5N(\2\u037f\u0381\3\2\2\2\u0380"+
		"\u0366\3\2\2\2\u0380\u0370\3\2\2\2\u0380\u0373\3\2\2\2\u0380\u0377\3\2"+
		"\2\2\u0381\u008b\3\2\2\2\u0382\u0383\7\u01a8\2\2\u0383\u0387\5N(\2\u0384"+
		"\u0385\7\u0299\2\2\u0385\u0387\5\u00b8]\2\u0386\u0382\3\2\2\2\u0386\u0384"+
		"\3\2\2\2\u0387\u008d\3\2\2\2\u0388\u038d\5\u0092J\2\u0389\u038a\7\u02d2"+
		"\2\2\u038a\u038c\5\u0092J\2\u038b\u0389\3\2\2\2\u038c\u038f\3\2\2\2\u038d"+
		"\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u008f\3\2\2\2\u038f\u038d\3\2"+
		"\2\2\u0390\u0399\t\26\2\2\u0391\u0397\7\u00de\2\2\u0392\u0398\7\u0127"+
		"\2\2\u0393\u0394\7\u01b1\2\2\u0394\u0398\7\67\2\2\u0395\u0396\7\u00f7"+
		"\2\2\u0396\u0398\7\67\2\2\u0397\u0392\3\2\2\2\u0397\u0393\3\2\2\2\u0397"+
		"\u0395\3\2\2\2\u0398\u039a\3\2\2\2\u0399\u0391\3\2\2\2\u0399\u039a\3\2"+
		"\2\2\u039a\u0091\3\2\2\2\u039b\u039c\7\u0297\2\2\u039c\u039d\5\u0090I"+
		"\2\u039d\u039f\7\u02d5\2\2\u039e\u03a0\5\u0094K\2\u039f\u039e\3\2\2\2"+
		"\u039f\u03a0\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a2\7\u02d4\2\2\u03a2"+
		"\u03b0\3\2\2\2\u03a3\u03a4\7\u0109\2\2\u03a4\u03a5\5\u0090I\2\u03a5\u03a6"+
		"\7\u02d5\2\2\u03a6\u03a7\5\u0094K\2\u03a7\u03a8\7\u02d4\2\2\u03a8\u03b0"+
		"\3\2\2\2\u03a9\u03aa\7\u00df\2\2\u03aa\u03ab\5\u0090I\2\u03ab\u03ac\7"+
		"\u02d5\2\2\u03ac\u03ad\5\u0094K\2\u03ad\u03ae\7\u02d4\2\2\u03ae\u03b0"+
		"\3\2\2\2\u03af\u039b\3\2\2\2\u03af\u03a3\3\2\2\2\u03af\u03a9\3\2\2\2\u03b0"+
		"\u0093\3\2\2\2\u03b1\u03b6\5\64\33\2\u03b2\u03b3\7\u02d2\2\2\u03b3\u03b5"+
		"\5\64\33\2\u03b4\u03b2\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b4\3\2\2\2"+
		"\u03b6\u03b7\3\2\2\2\u03b7\u0095\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9\u03ba"+
		"\7\u01bb\2\2\u03ba\u03bb\7\u02d5\2\2\u03bb\u03bc\5\u0098M\2\u03bc\u03bd"+
		"\7\u02d4\2\2\u03bd\u0097\3\2\2\2\u03be\u03c3\5\66\34\2\u03bf\u03c0\7\u02d2"+
		"\2\2\u03c0\u03c2\5\66\34\2\u03c1\u03bf\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3"+
		"\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u0099\3\2\2\2\u03c5\u03c3\3\2"+
		"\2\2\u03c6\u03c7\7\u02cc\2\2\u03c7\u03c9\7\u02cd\2\2\u03c8\u03c6\3\2\2"+
		"\2\u03c8\u03c9\3\2\2\2\u03c9\u03cc\3\2\2\2\u03ca\u03cd\5\u009cO\2\u03cb"+
		"\u03cd\5\u009eP\2\u03cc\u03ca\3\2\2\2\u03cc\u03cb\3\2\2\2\u03cd\u03cf"+
		"\3\2\2\2\u03ce\u03d0\7\u02cf\2\2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3\2\2"+
		"\2\u03d0\u009b\3\2\2\2\u03d1\u03dc\5\u00a0Q\2\u03d2\u03dc\5\u00c0a\2\u03d3"+
		"\u03dc\5\u00c8e\2\u03d4\u03dc\5\u00dco\2\u03d5\u03dc\5\u00e2r\2\u03d6"+
		"\u03dc\5\u00e4s\2\u03d7\u03dc\5\u00e6t\2\u03d8\u03dc\5\u00f2z\2\u03d9"+
		"\u03dc\5\u00f4{\2\u03da\u03dc\5\u00f6|\2\u03db\u03d1\3\2\2\2\u03db\u03d2"+
		"\3\2\2\2\u03db\u03d3\3\2\2\2\u03db\u03d4\3\2\2\2\u03db\u03d5\3\2\2\2\u03db"+
		"\u03d6\3\2\2\2\u03db\u03d7\3\2\2\2\u03db\u03d8\3\2\2\2\u03db\u03d9\3\2"+
		"\2\2\u03db\u03da\3\2\2\2\u03dc\u009d\3\2\2\2\u03dd\u03f1\5\u0100\u0081"+
		"\2\u03de\u03f1\5\u0104\u0083\2\u03df\u03f1\5\u010c\u0087\2\u03e0\u03f1"+
		"\5\u010e\u0088\2\u03e1\u03f1\5\u0116\u008c\2\u03e2\u03f1\5\u0118\u008d"+
		"\2\u03e3\u03f1\5\u0122\u0092\2\u03e4\u03f1\5\u0126\u0094\2\u03e5\u03f1"+
		"\5\u012a\u0096\2\u03e6\u03f1\5\u012c\u0097\2\u03e7\u03f1\5\u014e\u00a8"+
		"\2\u03e8\u03f1\5\u015c\u00af\2\u03e9\u03f1\5\u0160\u00b1\2\u03ea\u03f1"+
		"\5\u0164\u00b3\2\u03eb\u03f1\5\u015a\u00ae\2\u03ec\u03f1\5\u0166\u00b4"+
		"\2\u03ed\u03f1\5\u015e\u00b0\2\u03ee\u03f1\5\u011a\u008e\2\u03ef\u03f1"+
		"\5\u0120\u0091\2\u03f0\u03dd\3\2\2\2\u03f0\u03de\3\2\2\2\u03f0\u03df\3"+
		"\2\2\2\u03f0\u03e0\3\2\2\2\u03f0\u03e1\3\2\2\2\u03f0\u03e2\3\2\2\2\u03f0"+
		"\u03e3\3\2\2\2\u03f0\u03e4\3\2\2\2\u03f0\u03e5\3\2\2\2\u03f0\u03e6\3\2"+
		"\2\2\u03f0\u03e7\3\2\2\2\u03f0\u03e8\3\2\2\2\u03f0\u03e9\3\2\2\2\u03f0"+
		"\u03ea\3\2\2\2\u03f0\u03eb\3\2\2\2\u03f0\u03ec\3\2\2\2\u03f0\u03ed\3\2"+
		"\2\2\u03f0\u03ee\3\2\2\2\u03f0\u03ef\3\2\2\2\u03f1\u009f\3\2\2\2\u03f2"+
		"\u03fa\5\u00a2R\2\u03f3\u03f5\7\u028b\2\2\u03f4\u03f6\7\20\2\2\u03f5\u03f4"+
		"\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f9\5\u00a2R"+
		"\2\u03f8\u03f3\3\2\2\2\u03f9\u03fc\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03fb"+
		"\3\2\2\2\u03fb\u00a1\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fd\u03ff\7\u0212\2"+
		"\2\u03fe\u0400\t\27\2\2\u03ff\u03fe\3\2\2\2\u03ff\u0400\3\2\2\2\u0400"+
		"\u0402\3\2\2\2\u0401\u0403\7\u00fe\2\2\u0402\u0401\3\2\2\2\u0402\u0403"+
		"\3\2\2\2\u0403\u0405\3\2\2\2\u0404\u0406\7\u024a\2\2\u0405\u0404\3\2\2"+
		"\2\u0405\u0406\3\2\2\2\u0406\u0408\3\2\2\2\u0407\u0409\7\u0235\2\2\u0408"+
		"\u0407\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040b\3\2\2\2\u040a\u040c\7\u0230"+
		"\2\2\u040b\u040a\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040e\3\2\2\2\u040d"+
		"\u040f\7\u0231\2\2\u040e\u040d\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0411"+
		"\3\2\2\2\u0410\u0412\t\30\2\2\u0411\u0410\3\2\2\2\u0411\u0412\3\2\2\2"+
		"\u0412\u0414\3\2\2\2\u0413\u0415\7\u0233\2\2\u0414\u0413\3\2\2\2\u0414"+
		"\u0415\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0425\5\u00b6\\\2\u0417\u0418"+
		"\7\u00e4\2\2\u0418\u041a\5~@\2\u0419\u041b\5\u0096L\2\u041a\u0419\3\2"+
		"\2\2\u041a\u041b\3\2\2\2\u041b\u041d\3\2\2\2\u041c\u041e\5\u00a4S\2\u041d"+
		"\u041c\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u0420\3\2\2\2\u041f\u0421\5\u00a6"+
		"T\2\u0420\u041f\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0423\3\2\2\2\u0422"+
		"\u0424\5\u00aaV\2\u0423\u0422\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0426"+
		"\3\2\2\2\u0425\u0417\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0428\3\2\2\2\u0427"+
		"\u0429\5\u00acW\2\u0428\u0427\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042b"+
		"\3\2\2\2\u042a\u042c\5\u00b0Y\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2\2"+
		"\2\u042c\u0433\3\2\2\2\u042d\u042e\7\u00de\2\2\u042e\u0434\7\u0292\2\2"+
		"\u042f\u0430\7\u014b\2\2\u0430\u0431\7\u010b\2\2\u0431\u0432\7\u021c\2"+
		"\2\u0432\u0434\7\u0189\2\2\u0433\u042d\3\2\2\2\u0433\u042f\3\2\2\2\u0433"+
		"\u0434\3\2\2\2\u0434\u00a3\3\2\2\2\u0435\u0436\7\u02b4\2\2\u0436\u0437"+
		"\5N(\2\u0437\u00a5\3\2\2\2\u0438\u0439\7\u00f7\2\2\u0439\u043a\7\67\2"+
		"\2\u043a\u043f\5\u00a8U\2\u043b\u043c\7\u02d2\2\2\u043c\u043e\5\u00a8"+
		"U\2\u043d\u043b\3\2\2\2\u043e\u0441\3\2\2\2\u043f\u043d\3\2\2\2\u043f"+
		"\u0440\3\2\2\2\u0440\u0444\3\2\2\2\u0441\u043f\3\2\2\2\u0442\u0443\7\u02b6"+
		"\2\2\u0443\u0445\7\u0202\2\2\u0444\u0442\3\2\2\2\u0444\u0445\3\2\2\2\u0445"+
		"\u00a7\3\2\2\2\u0446\u044a\5x=\2\u0447\u044a\7\u02e0\2\2\u0448\u044a\5"+
		"\\/\2\u0449\u0446\3\2\2\2\u0449\u0447\3\2\2\2\u0449\u0448\3\2\2\2\u044a"+
		"\u00a9\3\2\2\2\u044b\u044c\7\u00fa\2\2\u044c\u044d\5N(\2\u044d\u00ab\3"+
		"\2\2\2\u044e\u044f\7\u01b1\2\2\u044f\u0450\7\67\2\2\u0450\u0455\5\u00ae"+
		"X\2\u0451\u0452\7\u02d2\2\2\u0452\u0454\5\u00aeX\2\u0453\u0451\3\2\2\2"+
		"\u0454\u0457\3\2\2\2\u0455\u0453\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u00ad"+
		"\3\2\2\2\u0457\u0455\3\2\2\2\u0458\u045a\5\u00a8U\2\u0459\u045b\t\31\2"+
		"\2\u045a\u0459\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u00af\3\2\2\2\u045c\u0460"+
		"\7\u0141\2\2\u045d\u045e\5\u00b2Z\2\u045e\u045f\7\u02d2\2\2\u045f\u0461"+
		"\3\2\2\2\u0460\u045d\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0462\3\2\2\2\u0462"+
		"\u0468\5\u00b4[\2\u0463\u0464\5\u00b4[\2\u0464\u0465\7\u01a5\2\2\u0465"+
		"\u0466\5\u00b2Z\2\u0466\u0468\3\2\2\2\u0467\u045c\3\2\2\2\u0467\u0463"+
		"\3\2\2\2\u0468\u00b1\3\2\2\2\u0469\u046a\7\u02e0\2\2\u046a\u00b3\3\2\2"+
		"\2\u046b\u046c\7\u02e0\2\2\u046c\u00b5\3\2\2\2\u046d\u0472\5\u00be`\2"+
		"\u046e\u046f\7\u02d2\2\2\u046f\u0471\5\u00be`\2\u0470\u046e\3\2\2\2\u0471"+
		"\u0474\3\2\2\2\u0472\u0470\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0477\3\2"+
		"\2\2\u0474\u0472\3\2\2\2\u0475\u0477\7\u02d3\2\2\u0476\u046d\3\2\2\2\u0476"+
		"\u0475\3\2\2\2\u0477\u00b7\3\2\2\2\u0478\u0479\7\u02d5\2\2\u0479\u047e"+
		"\5x=\2\u047a\u047b\7\u02d2\2\2\u047b\u047d\5x=\2\u047c\u047a\3\2\2\2\u047d"+
		"\u0480\3\2\2\2\u047e\u047c\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0481\3\2"+
		"\2\2\u0480\u047e\3\2\2\2\u0481\u0482\7\u02d4\2\2\u0482\u00b9\3\2\2\2\u0483"+
		"\u0484\7\u02d5\2\2\u0484\u0485\5\u00a0Q\2\u0485\u0486\7\u02d4\2\2\u0486"+
		"\u00bb\3\2\2\2\u0487\u0488\5(\25\2\u0488\u0489\7\u02d1\2\2\u0489\u048b"+
		"\3\2\2\2\u048a\u0487\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048c\3\2\2\2\u048c"+
		"\u048d\5*\26\2\u048d\u00bd\3\2\2\2\u048e\u048f\5\u00bc_\2\u048f\u0490"+
		"\7\u02d1\2\2\u0490\u0491\7\u02d3\2\2\u0491\u049b\3\2\2\2\u0492\u0494\5"+
		"x=\2\u0493\u0495\5L\'\2\u0494\u0493\3\2\2\2\u0494\u0495\3\2\2\2\u0495"+
		"\u049b\3\2\2\2\u0496\u0498\5\\/\2\u0497\u0499\5L\'\2\u0498\u0497\3\2\2"+
		"\2\u0498\u0499\3\2\2\2\u0499\u049b\3\2\2\2\u049a\u048e\3\2\2\2\u049a\u0492"+
		"\3\2\2\2\u049a\u0496\3\2\2\2\u049b\u00bf\3\2\2\2\u049c\u049e\7\u009e\2"+
		"\2\u049d\u049f\7\u0156\2\2\u049e\u049d\3\2\2\2\u049e\u049f\3\2\2\2\u049f"+
		"\u04a1\3\2\2\2\u04a0\u04a2\7\u01d8\2\2\u04a1\u04a0\3\2\2\2\u04a1\u04a2"+
		"\3\2\2\2\u04a2\u04a4\3\2\2\2\u04a3\u04a5\7\u0109\2\2\u04a4\u04a3\3\2\2"+
		"\2\u04a4\u04a5\3\2\2\2\u04a5\u04a9\3\2\2\2\u04a6\u04aa\5\u00c2b\2\u04a7"+
		"\u04aa\5\u00c4c\2\u04a8\u04aa\5\u00c6d\2\u04a9\u04a6\3\2\2\2\u04a9\u04a7"+
		"\3\2\2\2\u04a9\u04a8\3\2\2\2\u04aa\u00c1\3\2\2\2\u04ab\u04ac\7\u00e4\2"+
		"\2\u04ac\u04ae\5\u00bc_\2\u04ad\u04af\5\u0096L\2\u04ae\u04ad\3\2\2\2\u04ae"+
		"\u04af\3\2\2\2\u04af\u04b1\3\2\2\2\u04b0\u04b2\5\u00a4S\2\u04b1\u04b0"+
		"\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b4\3\2\2\2\u04b3\u04b5\5\u00acW"+
		"\2\u04b4\u04b3\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b7\3\2\2\2\u04b6\u04b8"+
		"\5\u00b0Y\2\u04b7\u04b6\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u00c3\3\2\2"+
		"\2\u04b9\u04bb\5\u00bc_\2\u04ba\u04bc\7\u02ce\2\2\u04bb\u04ba\3\2\2\2"+
		"\u04bb\u04bc\3\2\2\2\u04bc\u04c4\3\2\2\2\u04bd\u04be\7\u02d2\2\2\u04be"+
		"\u04c0\5\u00bc_\2\u04bf\u04c1\7\u02ce\2\2\u04c0\u04bf\3\2\2\2\u04c0\u04c1"+
		"\3\2\2\2\u04c1\u04c3\3\2\2\2\u04c2\u04bd\3\2\2\2\u04c3\u04c6\3\2\2\2\u04c4"+
		"\u04c2\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c7\3\2\2\2\u04c6\u04c4\3\2"+
		"\2\2\u04c7\u04c8\7\u00e4\2\2\u04c8\u04ca\5~@\2\u04c9\u04cb\5\u00a4S\2"+
		"\u04ca\u04c9\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u00c5\3\2\2\2\u04cc\u04cd"+
		"\7\u00e4\2\2\u04cd\u04cf\5\u00bc_\2\u04ce\u04d0\7\u02ce\2\2\u04cf\u04ce"+
		"\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d8\3\2\2\2\u04d1\u04d2\7\u02d2\2"+
		"\2\u04d2\u04d4\5\u00bc_\2\u04d3\u04d5\7\u02ce\2\2\u04d4\u04d3\3\2\2\2"+
		"\u04d4\u04d5\3\2\2\2\u04d5\u04d7\3\2\2\2\u04d6\u04d1\3\2\2\2\u04d7\u04da"+
		"\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04db\3\2\2\2\u04da"+
		"\u04d8\3\2\2\2\u04db\u04dc\7\u0299\2\2\u04dc\u04de\5~@\2\u04dd\u04df\5"+
		"\u00a4S\2\u04de\u04dd\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u00c7\3\2\2\2"+
		"\u04e0\u04e4\5\u00ceh\2\u04e1\u04e4\5\u00d4k\2\u04e2\u04e4\5\u00dan\2"+
		"\u04e3\u04e0\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e3\u04e2\3\2\2\2\u04e4\u00c9"+
		"\3\2\2\2\u04e5\u04e7\7\u0116\2\2\u04e6\u04e8\t\32\2\2\u04e7\u04e6\3\2"+
		"\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04ea\3\2\2\2\u04e9\u04eb\7\u0109\2\2\u04ea"+
		"\u04e9\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ed\3\2\2\2\u04ec\u04ee\7\u011d"+
		"\2\2\u04ed\u04ec\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef"+
		"\u04f1\5\u00bc_\2\u04f0\u04f2\5\u0096L\2\u04f1\u04f0\3\2\2\2\u04f1\u04f2"+
		"\3\2\2\2\u04f2\u00cb\3\2\2\2\u04f3\u04f4\7\u01a8\2\2\u04f4\u04f5\7\u00af"+
		"\2\2\u04f5\u04f6\7\u0129\2\2\u04f6\u04f7\7\u0292\2\2\u04f7\u04f8\5x=\2"+
		"\u04f8\u04f9\7\u02c7\2\2\u04f9\u0501\5N(\2\u04fa\u04fb\7\u02d2\2\2\u04fb"+
		"\u04fc\5x=\2\u04fc\u04fd\7\u02c7\2\2\u04fd\u04fe\5N(\2\u04fe\u0500\3\2"+
		"\2\2\u04ff\u04fa\3\2\2\2\u0500\u0503\3\2\2\2\u0501\u04ff\3\2\2\2\u0501"+
		"\u0502\3\2\2\2\u0502\u00cd\3\2\2\2\u0503\u0501\3\2\2\2\u0504\u0506\5\u00ca"+
		"f\2\u0505\u0507\5\u00b8]\2\u0506\u0505\3\2\2\2\u0506\u0507\3\2\2\2\u0507"+
		"\u0508\3\2\2\2\u0508\u050a\5\u00d0i\2\u0509\u050b\5\u00ccg\2\u050a\u0509"+
		"\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u00cf\3\2\2\2\u050c\u050d\t\33\2\2"+
		"\u050d\u0512\5\u00d2j\2\u050e\u050f\7\u02d2\2\2\u050f\u0511\5\u00d2j\2"+
		"\u0510\u050e\3\2\2\2\u0511\u0514\3\2\2\2\u0512\u0510\3\2\2\2\u0512\u0513"+
		"\3\2\2\2\u0513\u00d1\3\2\2\2\u0514\u0512\3\2\2\2\u0515\u0518\7\u02d5\2"+
		"\2\u0516\u0519\5\\/\2\u0517\u0519\7\u0099\2\2\u0518\u0516\3\2\2\2\u0518"+
		"\u0517\3\2\2\2\u0519\u0521\3\2\2\2\u051a\u051d\7\u02d2\2\2\u051b\u051e"+
		"\5\\/\2\u051c\u051e\7\u0099\2\2\u051d\u051b\3\2\2\2\u051d\u051c\3\2\2"+
		"\2\u051e\u0520\3\2\2\2\u051f\u051a\3\2\2\2\u0520\u0523\3\2\2\2\u0521\u051f"+
		"\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0524\3\2\2\2\u0523\u0521\3\2\2\2\u0524"+
		"\u0525\7\u02d4\2\2\u0525\u00d3\3\2\2\2\u0526\u0527\5\u00caf\2\u0527\u0529"+
		"\5\u00d6l\2\u0528\u052a\5\u00ccg\2\u0529\u0528\3\2\2\2\u0529\u052a\3\2"+
		"\2\2\u052a\u00d5\3\2\2\2\u052b\u052c\7\u021a\2\2\u052c\u0531\5\u00d8m"+
		"\2\u052d\u052e\7\u02d2\2\2\u052e\u0530\5\u00d8m\2\u052f\u052d\3\2\2\2"+
		"\u0530\u0533\3\2\2\2\u0531\u052f\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u00d7"+
		"\3\2\2\2\u0533\u0531\3\2\2\2\u0534\u0535\5x=\2\u0535\u0538\7\u02c7\2\2"+
		"\u0536\u0539\5N(\2\u0537\u0539\7\u0099\2\2\u0538\u0536\3\2\2\2\u0538\u0537"+
		"\3\2\2\2\u0539\u00d9\3\2\2\2\u053a\u053c\5\u00caf\2\u053b\u053d\5\u00b8"+
		"]\2\u053c\u053b\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053e\3\2\2\2\u053e"+
		"\u0540\5\u00a2R\2\u053f\u0541\5\u00ccg\2\u0540\u053f\3\2\2\2\u0540\u0541"+
		"\3\2\2\2\u0541\u00db\3\2\2\2\u0542\u0545\5\u00dep\2\u0543\u0545\5\u00e0"+
		"q\2\u0544\u0542\3\2\2\2\u0544\u0543\3\2\2\2\u0545\u00dd\3\2\2\2\u0546"+
		"\u0548\7\u0292\2\2\u0547\u0549\7\u0156\2\2\u0548\u0547\3\2\2\2\u0548\u0549"+
		"\3\2\2\2\u0549\u054b\3\2\2\2\u054a\u054c\7\u0109\2\2\u054b\u054a\3\2\2"+
		"\2\u054b\u054c\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054e\5\u0080A\2\u054e"+
		"\u0550\5\u00d6l\2\u054f\u0551\5\u00a4S\2\u0550\u054f\3\2\2\2\u0550\u0551"+
		"\3\2\2\2\u0551\u0553\3\2\2\2\u0552\u0554\5\u00acW\2\u0553\u0552\3\2\2"+
		"\2\u0553\u0554\3\2\2\2\u0554\u0556\3\2\2\2\u0555\u0557\5\u00b0Y\2\u0556"+
		"\u0555\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u00df\3\2\2\2\u0558\u055a\7\u0292"+
		"\2\2\u0559\u055b\7\u0156\2\2\u055a\u0559\3\2\2\2\u055a\u055b\3\2\2\2\u055b"+
		"\u055d\3\2\2\2\u055c\u055e\7\u0109\2\2\u055d\u055c\3\2\2\2\u055d\u055e"+
		"\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0560\5~@\2\u0560\u0562\5\u00d6l\2"+
		"\u0561\u0563\5\u00a4S\2\u0562\u0561\3\2\2\2\u0562\u0563\3\2\2\2\u0563"+
		"\u00e1\3\2\2\2\u0564\u0565\7:\2\2\u0565\u0572\5F$\2\u0566\u056f\7\u02d5"+
		"\2\2\u0567\u056c\5\\/\2\u0568\u0569\7\u02d2\2\2\u0569\u056b\5\\/\2\u056a"+
		"\u0568\3\2\2\2\u056b\u056e\3\2\2\2\u056c\u056a\3\2\2\2\u056c\u056d\3\2"+
		"\2\2\u056d\u0570\3\2\2\2\u056e\u056c\3\2\2\2\u056f\u0567\3\2\2\2\u056f"+
		"\u0570\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0573\7\u02d4\2\2\u0572\u0566"+
		"\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u00e3\3\2\2\2\u0574\u0575\7\u00aa\2"+
		"\2\u0575\u057a\5\u009aN\2\u0576\u0577\7\u02d2\2\2\u0577\u0579\5\u009a"+
		"N\2\u0578\u0576\3\2\2\2\u0579\u057c\3\2\2\2\u057a\u0578\3\2\2\2\u057a"+
		"\u057b\3\2\2\2\u057b\u00e5\3\2\2\2\u057c\u057a\3\2\2\2\u057d\u057e\7\u00f8"+
		"\2\2\u057e\u0584\5*\26\2\u057f\u0585\5\u00e8u\2\u0580\u0585\5\u00eav\2"+
		"\u0581\u0585\5\u00ecw\2\u0582\u0585\5\u00eex\2\u0583\u0585\5\u00f0y\2"+
		"\u0584\u057f\3\2\2\2\u0584\u0580\3\2\2\2\u0584\u0581\3\2\2\2\u0584\u0582"+
		"\3\2\2\2\u0584\u0583\3\2\2\2\u0585\u00e7\3\2\2\2\u0586\u0588\7\u01ab\2"+
		"\2\u0587\u0589\5L\'\2\u0588\u0587\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u00e9"+
		"\3\2\2\2\u058a\u058b\7\u01de\2\2\u058b\u058c\5\64\33\2\u058c\u058d\5\2"+
		"\2\2\u058d\u058e\7\u02d5\2\2\u058e\u0593\5\\/\2\u058f\u0590\7\u02d2\2"+
		"\2\u0590\u0592\5\\/\2\u0591\u058f\3\2\2\2\u0592\u0595\3\2\2\2\u0593\u0591"+
		"\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0596\3\2\2\2\u0595\u0593\3\2\2\2\u0596"+
		"\u0598\7\u02d4\2\2\u0597\u0599\5\u00a4S\2\u0598\u0597\3\2\2\2\u0598\u0599"+
		"\3\2\2\2\u0599\u059b\3\2\2\2\u059a\u059c\5\u00b0Y\2\u059b\u059a\3\2\2"+
		"\2\u059b\u059c\3\2\2\2\u059c\u00eb\3\2\2\2\u059d\u059e\7\u01de\2\2\u059e"+
		"\u059f\5\64\33\2\u059f\u05a1\t\34\2\2\u05a0\u05a2\5\u00a4S\2\u05a1\u05a0"+
		"\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a4\3\2\2\2\u05a3\u05a5\5\u00b0Y"+
		"\2\u05a4\u05a3\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u00ed\3\2\2\2\u05a6\u05a7"+
		"\7\u01de\2\2\u05a7\u05a9\t\35\2\2\u05a8\u05aa\5\u00a4S\2\u05a9\u05a8\3"+
		"\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ac\3\2\2\2\u05ab\u05ad\5\u00b0Y\2"+
		"\u05ac\u05ab\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u00ef\3\2\2\2\u05ae\u05af"+
		"\7L\2\2\u05af\u00f1\3\2\2\2\u05b0\u05b1\7\u0147\2\2\u05b1\u05b3\7\u0084"+
		"\2\2\u05b2\u05b4\t\36\2\2\u05b3\u05b2\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4"+
		"\u05b6\3\2\2\2\u05b5\u05b7\7\u0149\2\2\u05b6\u05b5\3\2\2\2\u05b6\u05b7"+
		"\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05b9\7\u0110\2\2\u05b9\u05bb\7\u02e4"+
		"\2\2\u05ba\u05bc\t\37\2\2\u05bb\u05ba\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc"+
		"\u05bd\3\2\2\2\u05bd\u05be\7\u011d\2\2\u05be\u05bf\7\u025b\2\2\u05bf\u05c1"+
		"\5\u00bc_\2\u05c0\u05c2\5\u0096L\2\u05c1\u05c0\3\2\2\2\u05c1\u05c2\3\2"+
		"\2\2\u05c2\u05c6\3\2\2\2\u05c3\u05c4\7F\2\2\u05c4\u05c5\7\u021a\2\2\u05c5"+
		"\u05c7\5\4\3\2\u05c6\u05c3\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05db\3\2"+
		"\2\2\u05c8\u05cc\t \2\2\u05c9\u05ca\7\u0262\2\2\u05ca\u05cb\7\67\2\2\u05cb"+
		"\u05cd\7\u02e4\2\2\u05cc\u05c9\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05d4"+
		"\3\2\2\2\u05ce\u05d0\7\u01ae\2\2\u05cf\u05ce\3\2\2\2\u05cf\u05d0\3\2\2"+
		"\2\u05d0\u05d1\3\2\2\2\u05d1\u05d2\7\u00b6\2\2\u05d2\u05d3\7\67\2\2\u05d3"+
		"\u05d5\7\u02e4\2\2\u05d4\u05cf\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d9"+
		"\3\2\2\2\u05d6\u05d7\7\u00c0\2\2\u05d7\u05d8\7\67\2\2\u05d8\u05da\7\u02e4"+
		"\2\2\u05d9\u05d6\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05dc\3\2\2\2\u05db"+
		"\u05c8\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc\u05e8\3\2\2\2\u05dd\u05e1\7\u0143"+
		"\2\2\u05de\u05df\7\u023e\2\2\u05df\u05e0\7\67\2\2\u05e0\u05e2\7\u02e4"+
		"\2\2\u05e1\u05de\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e6\3\2\2\2\u05e3"+
		"\u05e4\7\u0262\2\2\u05e4\u05e5\7\67\2\2\u05e5\u05e7\7\u02e4\2\2\u05e6"+
		"\u05e3\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e9\3\2\2\2\u05e8\u05dd\3\2"+
		"\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05ed\3\2\2\2\u05ea\u05eb\7\u0109\2\2\u05eb"+
		"\u05ec\7\u02e0\2\2\u05ec\u05ee\t!\2\2\u05ed\u05ea\3\2\2\2\u05ed\u05ee"+
		"\3\2\2\2\u05ee\u05ff\3\2\2\2\u05ef\u05f2\7\u02d5\2\2\u05f0\u05f3\5x=\2"+
		"\u05f1\u05f3\7\u02e6\2\2\u05f2\u05f0\3\2\2\2\u05f2\u05f1\3\2\2\2\u05f3"+
		"\u05fb\3\2\2\2\u05f4\u05f7\7\u02d2\2\2\u05f5\u05f8\5x=\2\u05f6\u05f8\7"+
		"\u02e6\2\2\u05f7\u05f5\3\2\2\2\u05f7\u05f6\3\2\2\2\u05f8\u05fa\3\2\2\2"+
		"\u05f9\u05f4\3\2\2\2\u05fa\u05fd\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fb\u05fc"+
		"\3\2\2\2\u05fc\u05fe\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fe\u0600\7\u02d4\2"+
		"\2\u05ff\u05ef\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0602\3\2\2\2\u0601\u0603"+
		"\5\u00d6l\2\u0602\u0601\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u00f3\3\2\2"+
		"\2\u0604\u0605\7\u0147\2\2\u0605\u0607\7\u02bc\2\2\u0606\u0608\t\36\2"+
		"\2\u0607\u0606\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u060a\3\2\2\2\u0609\u060b"+
		"\7\u0149\2\2\u060a\u0609\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\3\2\2"+
		"\2\u060c\u060d\7\u0110\2\2\u060d\u060f\7\u02e4\2\2\u060e\u0610\t\37\2"+
		"\2\u060f\u060e\3\2\2\2\u060f\u0610\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0612"+
		"\7\u011d\2\2\u0612\u0613\7\u025b\2\2\u0613\u0615\5\u00bc_\2\u0614\u0616"+
		"\5\u0096L\2\u0615\u0614\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u061a\3\2\2"+
		"\2\u0617\u0618\7F\2\2\u0618\u0619\7\u021a\2\2\u0619\u061b\5\4\3\2\u061a"+
		"\u0617\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u0620\3\2\2\2\u061c\u061d\7\u0207"+
		"\2\2\u061d\u061e\7\u0106\2\2\u061e\u061f\7\67\2\2\u061f\u0621\7\u02e4"+
		"\2\2\u0620\u061c\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0625\3\2\2\2\u0622"+
		"\u0623\7\u0109\2\2\u0623\u0624\7\u02e0\2\2\u0624\u0626\t!\2\2\u0625\u0622"+
		"\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0637\3\2\2\2\u0627\u062a\7\u02d5\2"+
		"\2\u0628\u062b\5x=\2\u0629\u062b\7\u02e6\2\2\u062a\u0628\3\2\2\2\u062a"+
		"\u0629\3\2\2\2\u062b\u0633\3\2\2\2\u062c\u062f\7\u02d2\2\2\u062d\u0630"+
		"\5x=\2\u062e\u0630\7\u02e6\2\2\u062f\u062d\3\2\2\2\u062f\u062e\3\2\2\2"+
		"\u0630\u0632\3\2\2\2\u0631\u062c\3\2\2\2\u0632\u0635\3\2\2\2\u0633\u0631"+
		"\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0636\3\2\2\2\u0635\u0633\3\2\2\2\u0636"+
		"\u0638\7\u02d4\2\2\u0637\u0627\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u063a"+
		"\3\2\2\2\u0639\u063b\5\u00d6l\2\u063a\u0639\3\2\2\2\u063a\u063b\3\2\2"+
		"\2\u063b\u00f5\3\2\2\2\u063c\u0640\5\u00f8}\2\u063d\u0641\5\u00fa~\2\u063e"+
		"\u0641\5\u00fc\177\2\u063f\u0641\5\u00fe\u0080\2\u0640\u063d\3\2\2\2\u0640"+
		"\u063e\3\2\2\2\u0640\u063f\3\2\2\2\u0641\u00f7\3\2\2\2\u0642\u0644\7\u01f4"+
		"\2\2\u0643\u0645\t\"\2\2\u0644\u0643\3\2\2\2\u0644\u0645\3\2\2\2\u0645"+
		"\u0647\3\2\2\2\u0646\u0648\7\u011d\2\2\u0647\u0646\3\2\2\2\u0647\u0648"+
		"\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u064b\5*\26\2\u064a\u064c\5\u0096L"+
		"\2\u064b\u064a\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u00f9\3\2\2\2\u064d\u064f"+
		"\5\u00b8]\2\u064e\u064d\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0650\3\2\2"+
		"\2\u0650\u0651\5\u00d0i\2\u0651\u00fb\3\2\2\2\u0652\u0653\5\u00d6l\2\u0653"+
		"\u00fd\3\2\2\2\u0654\u0656\5\u00b8]\2\u0655\u0654\3\2\2\2\u0655\u0656"+
		"\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0658\5\u00a0Q\2\u0658\u00ff\3\2\2"+
		"\2\u0659\u065a\7y\2\2\u065a\u065e\t#\2\2\u065b\u065c\7\u0107\2\2\u065c"+
		"\u065d\7\u019f\2\2\u065d\u065f\7\u00c9\2\2\u065e\u065b\3\2\2\2\u065e\u065f"+
		"\3\2\2\2\u065f\u0660\3\2\2\2\u0660\u066b\5(\25\2\u0661\u0666\5\u0102\u0082"+
		"\2\u0662\u0663\7\u02d2\2\2\u0663\u0665\5\u0102\u0082\2\u0664\u0662\3\2"+
		"\2\2\u0665\u0668\3\2\2\2\u0666\u0664\3\2\2\2\u0666\u0667\3\2\2\2\u0667"+
		"\u066a\3\2\2\2\u0668\u0666\3\2\2\2\u0669\u0661\3\2\2\2\u066a\u066d\3\2"+
		"\2\2\u066b\u0669\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u0101\3\2\2\2\u066d"+
		"\u066b\3\2\2\2\u066e\u0670\7\u0099\2\2\u066f\u066e\3\2\2\2\u066f\u0670"+
		"\3\2\2\2\u0670\u067c\3\2\2\2\u0671\u0672\7F\2\2\u0672\u0674\7\u021a\2"+
		"\2\u0673\u0675\7\u02c7\2\2\u0674\u0673\3\2\2\2\u0674\u0675\3\2\2\2\u0675"+
		"\u0676\3\2\2\2\u0676\u067d\5\4\3\2\u0677\u0679\7P\2\2\u0678\u067a\7\u02c7"+
		"\2\2\u0679\u0678\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067b\3\2\2\2\u067b"+
		"\u067d\5> \2\u067c\u0671\3\2\2\2\u067c\u0677\3\2\2\2\u067d\u0103\3\2\2"+
		"\2\u067e\u0681\5\u0106\u0084\2\u067f\u0681\5\u0108\u0085\2\u0680\u067e"+
		"\3\2\2\2\u0680\u067f\3\2\2\2\u0681\u0105\3\2\2\2\u0682\u0683\7\21\2\2"+
		"\u0683\u0685\t#\2\2\u0684\u0686\5(\25\2\u0685\u0684\3\2\2\2\u0685\u0686"+
		"\3\2\2\2\u0686\u0687\3\2\2\2\u0687\u0688\5\u010a\u0086\2\u0688\u0107\3"+
		"\2\2\2\u0689\u068a\7\21\2\2\u068a\u068b\t#\2\2\u068b\u068c\5(\25\2\u068c"+
		"\u068d\7\u0293\2\2\u068d\u068e\7\u0084\2\2\u068e\u068f\7\u00a4\2\2\u068f"+
		"\u0690\7\u0193\2\2\u0690\u0109\3\2\2\2\u0691\u0693\7\u0099\2\2\u0692\u0691"+
		"\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0695\7F\2\2\u0695"+
		"\u0697\7\u021a\2\2\u0696\u0698\7\u02c7\2\2\u0697\u0696\3\2\2\2\u0697\u0698"+
		"\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u06a3\5\4\3\2\u069a\u069c\7\u0099\2"+
		"\2\u069b\u069a\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069f"+
		"\7P\2\2\u069e\u06a0\7\u02c7\2\2\u069f\u069e\3\2\2\2\u069f\u06a0\3\2\2"+
		"\2\u06a0\u06a1\3\2\2\2\u06a1\u06a3\5\16\b\2\u06a2\u0692\3\2\2\2\u06a2"+
		"\u069b\3\2\2\2\u06a3\u010b\3\2\2\2\u06a4\u06a5\7\u00ac\2\2\u06a5\u06a8"+
		"\t#\2\2\u06a6\u06a7\7\u0107\2\2\u06a7\u06a9\7\u00c9\2\2\u06a8\u06a6\3"+
		"\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u06ab\5(\25\2\u06ab"+
		"\u010d\3\2\2\2\u06ac\u06b3\7y\2\2\u06ad\u06ae\7\u009a\2\2\u06ae\u06b1"+
		"\7\u02c7\2\2\u06af\u06b2\5B\"\2\u06b0\u06b2\7\177\2\2\u06b1\u06af\3\2"+
		"\2\2\u06b1\u06b0\3\2\2\2\u06b2\u06b4\3\2\2\2\u06b3\u06ad\3\2\2\2\u06b3"+
		"\u06b4\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b9\7\u00c3\2\2\u06b6\u06b7"+
		"\7\u0107\2\2\u06b7\u06b8\7\u019f\2\2\u06b8\u06ba\7\u00c9\2\2\u06b9\u06b6"+
		"\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06bc\5@!\2\u06bc"+
		"\u06bd\7\u01a8\2\2\u06bd\u06be\7\u020c\2\2\u06be\u06c5\5\u0110\u0089\2"+
		"\u06bf\u06c0\7\u01a8\2\2\u06c0\u06c2\7Y\2\2\u06c1\u06c3\7\u019f\2\2\u06c2"+
		"\u06c1\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c6\7\u01cc"+
		"\2\2\u06c5\u06bf\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06cc\3\2\2\2\u06c7"+
		"\u06cd\7\u00b5\2\2\u06c8\u06cd\7\u00a5\2\2\u06c9\u06ca\7\u00a5\2\2\u06ca"+
		"\u06cb\7\u01a8\2\2\u06cb\u06cd\7\u0224\2\2\u06cc\u06c7\3\2\2\2\u06cc\u06c8"+
		"\3\2\2\2\u06cc\u06c9\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06d0\3\2\2\2\u06ce"+
		"\u06cf\7U\2\2\u06cf\u06d1\7\u02e4\2\2\u06d0\u06ce\3\2\2\2\u06d0\u06d1"+
		"\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d3\5\u00e4s\2\u06d3\u010f\3\2\2"+
		"\2\u06d4\u06d5\7\32\2\2\u06d5\u06db\5\u0114\u008b\2\u06d6\u06d7\7\u02d8"+
		"\2\2\u06d7\u06d8\7\u011c\2\2\u06d8\u06da\5\u0112\u008a\2\u06d9\u06d6\3"+
		"\2\2\2\u06da\u06dd\3\2\2\2\u06db\u06d9\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc"+
		"\u06fa\3\2\2\2\u06dd\u06db\3\2\2\2\u06de\u06df\7\u00c5\2\2\u06df\u06e0"+
		"\5\u0112\u008a\2\u06e0\u06eb\3\2\2\2\u06e1\u06e2\7\u0241\2\2\u06e2\u06e8"+
		"\5\u0114\u008b\2\u06e3\u06e4\7\u02d8\2\2\u06e4\u06e5\7\u011c\2\2\u06e5"+
		"\u06e7\5\u0112\u008a\2\u06e6\u06e3\3\2\2\2\u06e7\u06ea\3\2\2\2\u06e8\u06e6"+
		"\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9\u06ec\3\2\2\2\u06ea\u06e8\3\2\2\2\u06eb"+
		"\u06e1\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06f7\3\2\2\2\u06ed\u06ee\7\u00ba"+
		"\2\2\u06ee\u06f4\5\u0114\u008b\2\u06ef\u06f0\7\u02d8\2\2\u06f0\u06f1\7"+
		"\u011c\2\2\u06f1\u06f3\5\u0112\u008a\2\u06f2\u06ef\3\2\2\2\u06f3\u06f6"+
		"\3\2\2\2\u06f4\u06f2\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u06f8\3\2\2\2\u06f6"+
		"\u06f4\3\2\2\2\u06f7\u06ed\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06fa\3\2"+
		"\2\2\u06f9\u06d4\3\2\2\2\u06f9\u06de\3\2\2\2\u06fa\u0111\3\2\2\2\u06fb"+
		"\u06fc\7\u02e0\2\2\u06fc\u06fd\t$\2\2\u06fd\u0113\3\2\2\2\u06fe\u06ff"+
		"\7~\2\2\u06ff\u0115\3\2\2\2\u0700\u0707\7\21\2\2\u0701\u0702\7\u009a\2"+
		"\2\u0702\u0705\7\u02c7\2\2\u0703\u0706\5B\"\2\u0704\u0706\7\177\2\2\u0705"+
		"\u0703\3\2\2\2\u0705\u0704\3\2\2\2\u0706\u0708\3\2\2\2\u0707\u0701\3\2"+
		"\2\2\u0707\u0708\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u070a\7\u00c3\2\2\u070a"+
		"\u070e\5@!\2\u070b\u070c\7\u01a8\2\2\u070c\u070d\7\u020c\2\2\u070d\u070f"+
		"\5\u0110\u0089\2\u070e\u070b\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0716\3"+
		"\2\2\2\u0710\u0711\7\u01a8\2\2\u0711\u0713\7Y\2\2\u0712\u0714\7\u019f"+
		"\2\2\u0713\u0712\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u0715\3\2\2\2\u0715"+
		"\u0717\7\u01cc\2\2\u0716\u0710\3\2\2\2\u0716\u0717\3\2\2\2\u0717\u071b"+
		"\3\2\2\2\u0718\u0719\7\u01ef\2\2\u0719\u071a\7\u0274\2\2\u071a\u071c\5"+
		"@!\2\u071b\u0718\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u0722\3\2\2\2\u071d"+
		"\u0723\7\u00b5\2\2\u071e\u0723\7\u00a5\2\2\u071f\u0720\7\u00a5\2\2\u0720"+
		"\u0721\7\u01a8\2\2\u0721\u0723\7\u0224\2\2\u0722\u071d\3\2\2\2\u0722\u071e"+
		"\3\2\2\2\u0722\u071f\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u0726\3\2\2\2\u0724"+
		"\u0725\7U\2\2\u0725\u0727\7\u02e4\2\2\u0726\u0724\3\2\2\2\u0726\u0727"+
		"\3\2\2\2\u0727\u0729\3\2\2\2\u0728\u072a\5\u00e4s\2\u0729\u0728\3\2\2"+
		"\2\u0729\u072a\3\2\2\2\u072a\u0117\3\2\2\2\u072b\u072c\7\u00ac\2\2\u072c"+
		"\u072f\7\u00c3\2\2\u072d\u072e\7\u0107\2\2\u072e\u0730\7\u00c9\2\2\u072f"+
		"\u072d\3\2\2\2\u072f\u0730\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0732\5@"+
		"!\2\u0732\u0119\3\2\2\2\u0733\u0735\7y\2\2\u0734\u0736\t%\2\2\u0735\u0734"+
		"\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u0738\7\u010c\2"+
		"\2\u0738\u073a\5\64\33\2\u0739\u073b\5\u0154\u00ab\2\u073a\u0739\3\2\2"+
		"\2\u073a\u073b\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u073d\7\u01a8\2\2\u073d"+
		"\u073e\5*\26\2\u073e\u073f\7\u02d5\2\2\u073f\u0744\5\u013c\u009f\2\u0740"+
		"\u0741\7\u02d2\2\2\u0741\u0743\5\u013c\u009f\2\u0742\u0740\3\2\2\2\u0743"+
		"\u0746\3\2\2\2\u0744\u0742\3\2\2\2\u0744\u0745\3\2\2\2\u0745\u0747\3\2"+
		"\2\2\u0746\u0744\3\2\2\2\u0747\u074c\7\u02d4\2\2\u0748\u074b\5\u011c\u008f"+
		"\2\u0749\u074b\5\u011e\u0090\2\u074a\u0748\3\2\2\2\u074a\u0749\3\2\2\2"+
		"\u074b\u074e\3\2\2\2\u074c\u074a\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u011b"+
		"\3\2\2\2\u074e\u074c\3\2\2\2\u074f\u0751\7\17\2\2\u0750\u0752\7\u02c7"+
		"\2\2\u0751\u0750\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0753\3\2\2\2\u0753"+
		"\u0754\t&\2\2\u0754\u011d\3\2\2\2\u0755\u0757\7\u014b\2\2\u0756\u0758"+
		"\7\u02c7\2\2\u0757\u0756\3\2\2\2\u0757\u0758\3\2\2\2\u0758\u0759\3\2\2"+
		"\2\u0759\u075a\t\'\2\2\u075a\u011f\3\2\2\2\u075b\u075c\7\u00ac\2\2\u075c"+
		"\u075d\7\u010c\2\2\u075d\u075e\5\64\33\2\u075e\u075f\7\u01a8\2\2\u075f"+
		"\u0764\5*\26\2\u0760\u0763\5\u011c\u008f\2\u0761\u0763\5\u011e\u0090\2"+
		"\u0762\u0760\3\2\2\2\u0762\u0761\3\2\2\2\u0763\u0766\3\2\2\2\u0764\u0762"+
		"\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u0121\3\2\2\2\u0766\u0764\3\2\2\2\u0767"+
		"\u0768\7y\2\2\u0768\u0769\7\u0217\2\2\u0769\u076a\5H%\2\u076a\u076b\7"+
		"\u00e0\2\2\u076b\u076c\7\u0084\2\2\u076c\u076d\7\u02b8\2\2\u076d\u076e"+
		"\5J&\2\u076e\u076f\7\u01af\2\2\u076f\u0770\7\u02d5\2\2\u0770\u0775\5\u0124"+
		"\u0093\2\u0771\u0772\7\u02d2\2\2\u0772\u0774\5\u0124\u0093\2\u0773\u0771"+
		"\3\2\2\2\u0774\u0777\3\2\2\2\u0775\u0773\3\2\2\2\u0775\u0776\3\2\2\2\u0776"+
		"\u0778\3\2\2\2\u0777\u0775\3\2\2\2\u0778\u0779\7\u02d4\2\2\u0779\u0123"+
		"\3\2\2\2\u077a\u078a\3\2\2\2\u077b\u077c\7\u00ff\2\2\u077c\u078a\5\20"+
		"\t\2\u077d\u077e\7\u0082\2\2\u077e\u078a\5\20\t\2\u077f\u0780\7\u0298"+
		"\2\2\u0780\u078a\5\20\t\2\u0781\u0782\7\u01be\2\2\u0782\u078a\5\20\t\2"+
		"\u0783\u0784\7\u0228\2\2\u0784\u078a\5\20\t\2\u0785\u0786\7\u01b5\2\2"+
		"\u0786\u078a\5\20\t\2\u0787\u0788\7\u01c7\2\2\u0788\u078a\5\22\n\2\u0789"+
		"\u077a\3\2\2\2\u0789\u077b\3\2\2\2\u0789\u077d\3\2\2\2\u0789\u077f\3\2"+
		"\2\2\u0789\u0781\3\2\2\2\u0789\u0783\3\2\2\2\u0789\u0785\3\2\2\2\u0789"+
		"\u0787\3\2\2\2\u078a\u0125\3\2\2\2\u078b\u078c\7\21\2\2\u078c\u078d\7"+
		"\u0217\2\2\u078d\u078e\5H%\2\u078e\u078f\7\u01af\2\2\u078f\u0790\7\u02d5"+
		"\2\2\u0790\u0795\5\u0128\u0095\2\u0791\u0792\7\u02d2\2\2\u0792\u0794\5"+
		"\u0128\u0095\2\u0793\u0791\3\2\2\2\u0794\u0797\3\2\2\2\u0795\u0793\3\2"+
		"\2\2\u0795\u0796\3\2\2\2\u0796\u0798\3\2\2\2\u0797\u0795\3\2\2\2\u0798"+
		"\u0799\7\u02d4\2\2\u0799\u0127\3\2\2\2\u079a\u079b\7\u0298\2\2\u079b\u079c"+
		"\t(\2\2\u079c\u0129\3\2\2\2\u079d\u079e\7\u00ac\2\2\u079e\u07a1\7\u0217"+
		"\2\2\u079f\u07a0\7\u0107\2\2\u07a0\u07a2\7\u00c9\2\2\u07a1\u079f\3\2\2"+
		"\2\u07a1\u07a2\3\2\2\2\u07a2\u07a3\3\2\2\2\u07a3\u07a4\5H%\2\u07a4\u012b"+
		"\3\2\2\2\u07a5\u07a9\5\u012e\u0098\2\u07a6\u07a9\5\u0130\u0099\2\u07a7"+
		"\u07a9\5\u0132\u009a\2\u07a8\u07a5\3\2\2\2\u07a8\u07a6\3\2\2\2\u07a8\u07a7"+
		"\3\2\2\2\u07a9\u012d\3\2\2\2\u07aa\u07ac\7y\2\2\u07ab\u07ad\7\u0260\2"+
		"\2\u07ac\u07ab\3\2\2\2\u07ac\u07ad\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07b2"+
		"\7\u025b\2\2\u07af\u07b0\7\u0107\2\2\u07b0\u07b1\7\u019f\2\2\u07b1\u07b3"+
		"\7\u00c9\2\2\u07b2\u07af\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b4\3\2\2"+
		"\2\u07b4\u07b5\5*\26\2\u07b5\u07b6\7\u02d5\2\2\u07b6\u07bb\5\u0134\u009b"+
		"\2\u07b7\u07b8\7\u02d2\2\2\u07b8\u07ba\5\u0134\u009b\2\u07b9\u07b7\3\2"+
		"\2\2\u07ba\u07bd\3\2\2\2\u07bb\u07b9\3\2\2\2\u07bb\u07bc\3\2\2\2\u07bc"+
		"\u07be\3\2\2\2\u07bd\u07bb\3\2\2\2\u07be\u07c0\7\u02d4\2\2\u07bf\u07c1"+
		"\5\u0142\u00a2\2\u07c0\u07bf\3\2\2\2\u07c0\u07c1\3\2\2\2\u07c1\u07c3\3"+
		"\2\2\2\u07c2\u07c4\5\u0146\u00a4\2\u07c3\u07c2\3\2\2\2\u07c3\u07c4\3\2"+
		"\2\2\u07c4\u07c6\3\2\2\2\u07c5\u07c7\5\u00a0Q\2\u07c6\u07c5\3\2\2\2\u07c6"+
		"\u07c7\3\2\2\2\u07c7\u012f\3\2\2\2\u07c8\u07ca\7y\2\2\u07c9\u07cb\7\u0260"+
		"\2\2\u07ca\u07c9\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc"+
		"\u07d0\7\u025b\2\2\u07cd\u07ce\7\u0107\2\2\u07ce\u07cf\7\u019f\2\2\u07cf"+
		"\u07d1\7\u00c9\2\2\u07d0\u07cd\3\2\2\2\u07d0\u07d1\3\2\2\2\u07d1\u07d2"+
		"\3\2\2\2\u07d2\u07d4\5*\26\2\u07d3\u07d5\5\u0142\u00a2\2\u07d4\u07d3\3"+
		"\2\2\2\u07d4\u07d5\3\2\2\2\u07d5\u07d7\3\2\2\2\u07d6\u07d8\5\u0146\u00a4"+
		"\2\u07d7\u07d6\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07da"+
		"\5\u00a0Q\2\u07da\u0131\3\2\2\2\u07db\u07dd\7y\2\2\u07dc\u07de\7\u0260"+
		"\2\2\u07dd\u07dc\3\2\2\2\u07dd\u07de\3\2\2\2\u07de\u07df\3\2\2\2\u07df"+
		"\u07e3\7\u025b\2\2\u07e0\u07e1\7\u0107\2\2\u07e1\u07e2\7\u019f\2\2\u07e2"+
		"\u07e4\7\u00c9\2\2\u07e3\u07e0\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4\u07e5"+
		"\3\2\2\2\u07e5\u07ed\5*\26\2\u07e6\u07e7\7\u0140\2\2\u07e7\u07ee\5*\26"+
		"\2\u07e8\u07e9\7\u02d5\2\2\u07e9\u07ea\7\u0140\2\2\u07ea\u07eb\5*\26\2"+
		"\u07eb\u07ec\7\u02d4\2\2\u07ec\u07ee\3\2\2\2\u07ed\u07e6\3\2\2\2\u07ed"+
		"\u07e8\3\2\2\2\u07ee\u0133\3\2";
	private static final String _serializedATNSegment1 =
		"\2\2\u07ef\u07f0\5.\30\2\u07f0\u07f1\5\u0136\u009c\2\u07f1\u0878\3\2\2"+
		"\2\u07f2\u07f4\7c\2\2\u07f3\u07f5\5:\36\2\u07f4\u07f3\3\2\2\2\u07f4\u07f5"+
		"\3\2\2\2\u07f5\u07f7\3\2\2\2\u07f6\u07f2\3\2\2\2\u07f6\u07f7\3\2\2\2\u07f7"+
		"\u07f8\3\2\2\2\u07f8\u07f9\7\u01ce\2\2\u07f9\u07fb\7\u0129\2\2\u07fa\u07fc"+
		"\5\u0154\u00ab\2\u07fb\u07fa\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc\u07fd\3"+
		"\2\2\2\u07fd\u07fe\7\u02d5\2\2\u07fe\u0803\5\u013c\u009f\2\u07ff\u0800"+
		"\7\u02d2\2\2\u0800\u0802\5\u013c\u009f\2\u0801\u07ff\3\2\2\2\u0802\u0805"+
		"\3\2\2\2\u0803\u0801\3\2\2\2\u0803\u0804\3\2\2\2\u0804\u0806\3\2\2\2\u0805"+
		"\u0803\3\2\2\2\u0806\u080a\7\u02d4\2\2\u0807\u0809\5\u0156\u00ac\2\u0808"+
		"\u0807\3\2\2\2\u0809\u080c\3\2\2\2\u080a\u0808\3\2\2\2\u080a\u080b\3\2"+
		"\2\2\u080b\u0878\3\2\2\2\u080c\u080a\3\2\2\2\u080d\u080f\t\26\2\2\u080e"+
		"\u0810\5\64\33\2\u080f\u080e\3\2\2\2\u080f\u0810\3\2\2\2\u0810\u0812\3"+
		"\2\2\2\u0811\u0813\5\u0154\u00ab\2\u0812\u0811\3\2\2\2\u0812\u0813\3\2"+
		"\2\2\u0813\u0814\3\2\2\2\u0814\u0815\7\u02d5\2\2\u0815\u081a\5\u013c\u009f"+
		"\2\u0816\u0817\7\u02d2\2\2\u0817\u0819\5\u013c\u009f\2\u0818\u0816\3\2"+
		"\2\2\u0819\u081c\3\2\2\2\u081a\u0818\3\2\2\2\u081a\u081b\3\2\2\2\u081b"+
		"\u081d\3\2\2\2\u081c\u081a\3\2\2\2\u081d\u0821\7\u02d4\2\2\u081e\u0820"+
		"\5\u0156\u00ac\2\u081f\u081e\3\2\2\2\u0820\u0823\3\2\2\2\u0821\u081f\3"+
		"\2\2\2\u0821\u0822\3\2\2\2\u0822\u0878\3\2\2\2\u0823\u0821\3\2\2\2\u0824"+
		"\u0826\7c\2\2\u0825\u0827\5:\36\2\u0826\u0825\3\2\2\2\u0826\u0827\3\2"+
		"\2\2\u0827\u0829\3\2\2\2\u0828\u0824\3\2\2\2\u0828\u0829\3\2\2\2\u0829"+
		"\u082a\3\2\2\2\u082a\u082c\7\u028c\2\2\u082b\u082d\t\26\2\2\u082c\u082b"+
		"\3\2\2\2\u082c\u082d\3\2\2\2\u082d\u082f\3\2\2\2\u082e\u0830\5\64\33\2"+
		"\u082f\u082e\3\2\2\2\u082f\u0830\3\2\2\2\u0830\u0832\3\2\2\2\u0831\u0833"+
		"\5\u0154\u00ab\2\u0832\u0831\3\2\2\2\u0832\u0833\3\2\2\2\u0833\u0834\3"+
		"\2\2\2\u0834\u0835\7\u02d5\2\2\u0835\u083a\5\u013c\u009f\2\u0836\u0837"+
		"\7\u02d2\2\2\u0837\u0839\5\u013c\u009f\2\u0838\u0836\3\2\2\2\u0839\u083c"+
		"\3\2\2\2\u083a\u0838\3\2\2\2\u083a\u083b\3\2\2\2\u083b\u083d\3\2\2\2\u083c"+
		"\u083a\3\2\2\2\u083d\u0841\7\u02d4\2\2\u083e\u0840\5\u0156\u00ac\2\u083f"+
		"\u083e\3\2\2\2\u0840\u0843\3\2\2\2\u0841\u083f\3\2\2\2\u0841\u0842\3\2"+
		"\2\2\u0842\u0878\3\2\2\2\u0843\u0841\3\2\2\2\u0844\u0846\t)\2\2\u0845"+
		"\u0847\t\26\2\2\u0846\u0845\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0849\3"+
		"\2\2\2\u0848\u084a\5\64\33\2\u0849\u0848\3\2\2\2\u0849\u084a\3\2\2\2\u084a"+
		"\u084b\3\2\2\2\u084b\u084c\7\u02d5\2\2\u084c\u0851\5\u013c\u009f\2\u084d"+
		"\u084e\7\u02d2\2\2\u084e\u0850\5\u013c\u009f\2\u084f\u084d\3\2\2\2\u0850"+
		"\u0853\3\2\2\2\u0851\u084f\3\2\2\2\u0851\u0852\3\2\2\2\u0852\u0854\3\2"+
		"\2\2\u0853\u0851\3\2\2\2\u0854\u0858\7\u02d4\2\2\u0855\u0857\5\u0156\u00ac"+
		"\2\u0856\u0855\3\2\2\2\u0857\u085a\3\2\2\2\u0858\u0856\3\2\2\2\u0858\u0859"+
		"\3\2\2\2\u0859\u0878\3\2\2\2\u085a\u0858\3\2\2\2\u085b\u085d\7c\2\2\u085c"+
		"\u085e\5:\36\2\u085d\u085c\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u0860\3\2"+
		"\2\2\u085f\u085b\3\2\2\2\u085f\u0860\3\2\2\2\u0860\u0861\3\2\2\2\u0861"+
		"\u0862\7\u00e0\2\2\u0862\u0864\7\u0129\2\2\u0863\u0865\5\64\33\2\u0864"+
		"\u0863\3\2\2\2\u0864\u0865\3\2\2\2\u0865\u0866\3\2\2\2\u0866\u0867\7\u02d5"+
		"\2\2\u0867\u086c\5\u013c\u009f\2\u0868\u0869\7\u02d2\2\2\u0869\u086b\5"+
		"\u013c\u009f\2\u086a\u0868\3\2\2\2\u086b\u086e\3\2\2\2\u086c\u086a\3\2"+
		"\2\2\u086c\u086d\3\2\2\2\u086d\u086f\3\2\2\2\u086e\u086c\3\2\2\2\u086f"+
		"\u0870\7\u02d4\2\2\u0870\u0871\5\u013e\u00a0\2\u0871\u0878\3\2\2\2\u0872"+
		"\u0873\7H\2\2\u0873\u0874\7\u02d5\2\2\u0874\u0875\5N(\2\u0875\u0876\7"+
		"\u02d4\2\2\u0876\u0878\3\2\2\2\u0877\u07ef\3\2\2\2\u0877\u07f6\3\2\2\2"+
		"\u0877\u080d\3\2\2\2\u0877\u0828\3\2\2\2\u0877\u0844\3\2\2\2\u0877\u085f"+
		"\3\2\2\2\u0877\u0872\3\2\2\2\u0878\u0135\3\2\2\2\u0879\u087b\5\u013a\u009e"+
		"\2\u087a\u087c\7\36\2\2\u087b\u087a\3\2\2\2\u087b\u087c\3\2\2\2\u087c"+
		"\u0885\3\2\2\2\u087d\u087f\7\u028c\2\2\u087e\u0880\7\u0129\2\2\u087f\u087e"+
		"\3\2\2\2\u087f\u0880\3\2\2\2\u0880\u0886\3\2\2\2\u0881\u0883\7\u01ce\2"+
		"\2\u0882\u0884\7\u0129\2\2\u0883\u0882\3\2\2\2\u0883\u0884\3\2\2\2\u0884"+
		"\u0886\3\2\2\2\u0885\u087d\3\2\2\2\u0885\u0881\3\2\2\2\u0885\u0886\3\2"+
		"\2\2\u0886\u0889\3\2\2\2\u0887\u0888\7U\2\2\u0888\u088a\7\u02e4\2\2\u0889"+
		"\u0887\3\2\2\2\u0889\u088a\3\2\2\2\u088a\u088d\3\2\2\2\u088b\u088c\7R"+
		"\2\2\u088c\u088e\t*\2\2\u088d\u088b\3\2\2\2\u088d\u088e\3\2\2\2\u088e"+
		"\u0890\3\2\2\2\u088f\u0891\5\u013e\u00a0\2\u0890\u088f\3\2\2\2\u0890\u0891"+
		"\3\2\2\2\u0891\u0137\3\2\2\2\u0892\u0893\7\u019f\2\2\u0893\u0896\7\u01a1"+
		"\2\2\u0894\u0896\7\u01a1\2\2\u0895\u0892\3\2\2\2\u0895\u0894\3\2\2\2\u0896"+
		"\u0139\3\2\2\2\u0897\u089c\7/\2\2\u0898\u0899\7\u02d5\2\2\u0899\u089a"+
		"\5\u014c\u00a7\2\u089a\u089b\7\u02d4\2\2\u089b\u089d\3\2\2\2\u089c\u0898"+
		"\3\2\2\2\u089c\u089d\3\2\2\2\u089d\u089f\3\2\2\2\u089e\u08a0\5\u0138\u009d"+
		"\2\u089f\u089e\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0\u08a3\3\2\2\2\u08a1\u08a2"+
		"\7\u0099\2\2\u08a2\u08a4\5\30\r\2\u08a3\u08a1\3\2\2\2\u08a3\u08a4\3\2"+
		"\2\2\u08a4\u0a82\3\2\2\2\u08a5\u08aa\7\u026e\2\2\u08a6\u08a7\7\u02d5\2"+
		"\2\u08a7\u08a8\5\u014c\u00a7\2\u08a8\u08a9\7\u02d4\2\2\u08a9\u08ab\3\2"+
		"\2\2\u08aa\u08a6\3\2\2\2\u08aa\u08ab\3\2\2\2\u08ab\u08ad\3\2\2\2\u08ac"+
		"\u08ae\7\u0290\2\2\u08ad\u08ac\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae\u08b0"+
		"\3\2\2\2\u08af\u08b1\7\u02c1\2\2\u08b0\u08af\3\2\2\2\u08b0\u08b1\3\2\2"+
		"\2\u08b1\u08b3\3\2\2\2\u08b2\u08b4\5\u0138\u009d\2\u08b3\u08b2\3\2\2\2"+
		"\u08b3\u08b4\3\2\2\2\u08b4\u08b7\3\2\2\2\u08b5\u08b6\7\u0099\2\2\u08b6"+
		"\u08b8\5\22\n\2\u08b7\u08b5\3\2\2\2\u08b7\u08b8\3\2\2\2\u08b8\u0a82\3"+
		"\2\2\2\u08b9\u08be\7\u0226\2\2\u08ba\u08bb\7\u02d5\2\2\u08bb\u08bc\5\u014c"+
		"\u00a7\2\u08bc\u08bd\7\u02d4\2\2\u08bd\u08bf\3\2\2\2\u08be\u08ba\3\2\2"+
		"\2\u08be\u08bf\3\2\2\2\u08bf\u08c1\3\2\2\2\u08c0\u08c2\7\u0290\2\2\u08c1"+
		"\u08c0\3\2\2\2\u08c1\u08c2\3\2\2\2\u08c2\u08c4\3\2\2\2\u08c3\u08c5\7\u02c1"+
		"\2\2\u08c4\u08c3\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5\u08c7\3\2\2\2\u08c6"+
		"\u08c8\5\u0138\u009d\2\u08c7\u08c6\3\2\2\2\u08c7\u08c8\3\2\2\2\u08c8\u08cb"+
		"\3\2\2\2\u08c9\u08ca\7\u0099\2\2\u08ca\u08cc\5\22\n\2\u08cb\u08c9\3\2"+
		"\2\2\u08cb\u08cc\3\2\2\2\u08cc\u0a82\3\2\2\2\u08cd\u08d2\7\u017c\2\2\u08ce"+
		"\u08cf\7\u02d5\2\2\u08cf\u08d0\5\u014c\u00a7\2\u08d0\u08d1\7\u02d4\2\2"+
		"\u08d1\u08d3\3\2\2\2\u08d2\u08ce\3\2\2\2\u08d2\u08d3\3\2\2\2\u08d3\u08d5"+
		"\3\2\2\2\u08d4\u08d6\7\u0290\2\2\u08d5\u08d4\3\2\2\2\u08d5\u08d6\3\2\2"+
		"\2\u08d6\u08d8\3\2\2\2\u08d7\u08d9\7\u02c1\2\2\u08d8\u08d7\3\2\2\2\u08d8"+
		"\u08d9\3\2\2\2\u08d9\u08db\3\2\2\2\u08da\u08dc\5\u0138\u009d\2\u08db\u08da"+
		"\3\2\2\2\u08db\u08dc\3\2\2\2\u08dc\u08df\3\2\2\2\u08dd\u08de\7\u0099\2"+
		"\2\u08de\u08e0\5\22\n\2\u08df\u08dd\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0"+
		"\u0a82\3\2\2\2\u08e1\u08e6\7\u011a\2\2\u08e2\u08e3\7\u02d5\2\2\u08e3\u08e4"+
		"\5\u014c\u00a7\2\u08e4\u08e5\7\u02d4\2\2\u08e5\u08e7\3\2\2\2\u08e6\u08e2"+
		"\3\2\2\2\u08e6\u08e7\3\2\2\2\u08e7\u08e9\3\2\2\2\u08e8\u08ea\7\u0290\2"+
		"\2\u08e9\u08e8\3\2\2\2\u08e9\u08ea\3\2\2\2\u08ea\u08ec\3\2\2\2\u08eb\u08ed"+
		"\7\u02c1\2\2\u08ec\u08eb\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed\u08ef\3\2\2"+
		"\2\u08ee\u08f0\5\u0138\u009d\2\u08ef\u08ee\3\2\2\2\u08ef\u08f0\3\2\2\2"+
		"\u08f0\u08f3\3\2\2\2\u08f1\u08f2\7\u0099\2\2\u08f2\u08f4\5\22\n\2\u08f3"+
		"\u08f1\3\2\2\2\u08f3\u08f4\3\2\2\2\u08f4\u0a82\3\2\2\2\u08f5\u08fa\7\u011b"+
		"\2\2\u08f6\u08f7\7\u02d5\2\2\u08f7\u08f8\5\u014c\u00a7\2\u08f8\u08f9\7"+
		"\u02d4\2\2\u08f9\u08fb\3\2\2\2\u08fa\u08f6\3\2\2\2\u08fa\u08fb\3\2\2\2"+
		"\u08fb\u08fd\3\2\2\2\u08fc\u08fe\7\u0290\2\2\u08fd\u08fc\3\2\2\2\u08fd"+
		"\u08fe\3\2\2\2\u08fe\u0900\3\2\2\2\u08ff\u0901\7\u02c1\2\2\u0900\u08ff"+
		"\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u0903\3\2\2\2\u0902\u0904\5\u0138\u009d"+
		"\2\u0903\u0902\3\2\2\2\u0903\u0904\3\2\2\2\u0904\u0907\3\2\2\2\u0905\u0906"+
		"\7\u0099\2\2\u0906\u0908\5\22\n\2\u0907\u0905\3\2\2\2\u0907\u0908\3\2"+
		"\2\2\u0908\u0a82\3\2\2\2\u0909\u090e\7(\2\2\u090a\u090b\7\u02d5\2\2\u090b"+
		"\u090c\5\u014c\u00a7\2\u090c\u090d\7\u02d4\2\2\u090d\u090f\3\2\2\2\u090e"+
		"\u090a\3\2\2\2\u090e\u090f\3\2\2\2\u090f\u0911\3\2\2\2\u0910\u0912\7\u0290"+
		"\2\2\u0911\u0910\3\2\2\2\u0911\u0912\3\2\2\2\u0912\u0914\3\2\2\2\u0913"+
		"\u0915\7\u02c1\2\2\u0914\u0913\3\2\2\2\u0914\u0915\3\2\2\2\u0915\u0917"+
		"\3\2\2\2\u0916\u0918\5\u0138\u009d\2\u0917\u0916\3\2\2\2\u0917\u0918\3"+
		"\2\2\2\u0918\u091b\3\2\2\2\u0919\u091a\7\u0099\2\2\u091a\u091c\5\22\n"+
		"\2\u091b\u0919\3\2\2\2\u091b\u091c\3\2\2\2\u091c\u0a82\3\2\2\2\u091d\u0924"+
		"\7\u01e1\2\2\u091e\u091f\7\u02d5\2\2\u091f\u0920\5\u014c\u00a7\2\u0920"+
		"\u0921\7\u02d2\2\2\u0921\u0922\5\22\n\2\u0922\u0923\7\u02d4\2\2\u0923"+
		"\u0925\3\2\2\2\u0924\u091e\3\2\2\2\u0924\u0925\3\2\2\2\u0925\u0927\3\2"+
		"\2\2\u0926\u0928\7\u0290\2\2\u0927\u0926\3\2\2\2\u0927\u0928\3\2\2\2\u0928"+
		"\u092a\3\2\2\2\u0929\u092b\7\u02c1\2\2\u092a\u0929\3\2\2\2\u092a\u092b"+
		"\3\2\2\2\u092b\u092d\3\2\2\2\u092c\u092e\5\u0138\u009d\2\u092d\u092c\3"+
		"\2\2\2\u092d\u092e\3\2\2\2\u092e\u0931\3\2\2\2\u092f\u0930\7\u0099\2\2"+
		"\u0930\u0932\5\22\n\2\u0931\u092f\3\2\2\2\u0931\u0932\3\2\2\2\u0932\u0a82"+
		"\3\2\2\2\u0933\u093a\7\u00ab\2\2\u0934\u0935\7\u02d5\2\2\u0935\u0936\5"+
		"\u014c\u00a7\2\u0936\u0937\7\u02d2\2\2\u0937\u0938\5\22\n\2\u0938\u0939"+
		"\7\u02d4\2\2\u0939\u093b\3\2\2\2\u093a\u0934\3\2\2\2\u093a\u093b\3\2\2"+
		"\2\u093b\u093d\3\2\2\2\u093c\u093e\7\u0290\2\2\u093d\u093c\3\2\2\2\u093d"+
		"\u093e\3\2\2\2\u093e\u0940\3\2\2\2\u093f\u0941\7\u02c1\2\2\u0940\u093f"+
		"\3\2\2\2\u0940\u0941\3\2\2\2\u0941\u0943\3\2\2\2\u0942\u0944\5\u0138\u009d"+
		"\2\u0943\u0942\3\2\2\2\u0943\u0944\3\2\2\2\u0944\u0947\3\2\2\2\u0945\u0946"+
		"\7\u0099\2\2\u0946\u0948\5\22\n\2\u0947\u0945\3\2\2\2\u0947\u0948\3\2"+
		"\2\2\u0948\u0a82\3\2\2\2\u0949\u0950\7\u00db\2\2\u094a\u094b\7\u02d5\2"+
		"\2\u094b\u094c\5\u014c\u00a7\2\u094c\u094d\7\u02d2\2\2\u094d\u094e\5\22"+
		"\n\2\u094e\u094f\7\u02d4\2\2\u094f\u0951\3\2\2\2\u0950\u094a\3\2\2\2\u0950"+
		"\u0951\3\2\2\2\u0951\u0953\3\2\2\2\u0952\u0954\7\u0290\2\2\u0953\u0952"+
		"\3\2\2\2\u0953\u0954\3\2\2\2\u0954\u0956\3\2\2\2\u0955\u0957\7\u02c1\2"+
		"\2\u0956\u0955\3\2\2\2\u0956\u0957\3\2\2\2\u0957\u0959\3\2\2\2\u0958\u095a"+
		"\5\u0138\u009d\2\u0959\u0958\3\2\2\2\u0959\u095a\3\2\2\2\u095a\u095d\3"+
		"\2\2\2\u095b\u095c\7\u0099\2\2\u095c\u095e\5\22\n\2\u095d\u095b\3\2\2"+
		"\2\u095d\u095e\3\2\2\2\u095e\u0a82\3\2\2\2\u095f\u0968\7\u0096\2\2\u0960"+
		"\u0961\7\u02d5\2\2\u0961\u0964\5\u014c\u00a7\2\u0962\u0963\7\u02d2\2\2"+
		"\u0963\u0965\5\22\n\2\u0964\u0962\3\2\2\2\u0964\u0965\3\2\2\2\u0965\u0966"+
		"\3\2\2\2\u0966\u0967\7\u02d4\2\2\u0967\u0969\3\2\2\2\u0968\u0960\3\2\2"+
		"\2\u0968\u0969\3\2\2\2\u0969\u096b\3\2\2\2\u096a\u096c\7\u0290\2\2\u096b"+
		"\u096a\3\2\2\2\u096b\u096c\3\2\2\2\u096c\u096e\3\2\2\2\u096d\u096f\7\u02c1"+
		"\2\2\u096e\u096d\3\2\2\2\u096e\u096f\3\2\2\2\u096f\u0971\3\2\2\2\u0970"+
		"\u0972\5\u0138\u009d\2\u0971\u0970\3\2\2\2\u0971\u0972\3\2\2\2\u0972\u0975"+
		"\3\2\2\2\u0973\u0974\7\u0099\2\2\u0974\u0976\5\22\n\2\u0975\u0973\3\2"+
		"\2\2\u0975\u0976\3\2\2\2\u0976\u0a82\3\2\2\2\u0977\u0980\7\u01a2\2\2\u0978"+
		"\u0979\7\u02d5\2\2\u0979\u097c\5\u014c\u00a7\2\u097a\u097b\7\u02d2\2\2"+
		"\u097b\u097d\5\22\n\2\u097c\u097a\3\2\2\2\u097c\u097d\3\2\2\2\u097d\u097e"+
		"\3\2\2\2\u097e\u097f\7\u02d4\2\2\u097f\u0981\3\2\2\2\u0980\u0978\3\2\2"+
		"\2\u0980\u0981\3\2\2\2\u0981\u0983\3\2\2\2\u0982\u0984\7\u0290\2\2\u0983"+
		"\u0982\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u0986\3\2\2\2\u0985\u0987\7\u02c1"+
		"\2\2\u0986\u0985\3\2\2\2\u0986\u0987\3\2\2\2\u0987\u0989\3\2\2\2\u0988"+
		"\u098a\5\u0138\u009d\2\u0989\u0988\3\2\2\2\u0989\u098a\3\2\2\2\u098a\u098d"+
		"\3\2\2\2\u098b\u098c\7\u0099\2\2\u098c\u098e\5\22\n\2\u098d\u098b\3\2"+
		"\2\2\u098d\u098e\3\2\2\2\u098e\u0a82\3\2\2\2\u098f\u0991\7\u0088\2\2\u0990"+
		"\u0992\5\u0138\u009d\2\u0991\u0990\3\2\2\2\u0991\u0992\3\2\2\2\u0992\u0995"+
		"\3\2\2\2\u0993\u0994\7\u0099\2\2\u0994\u0996\7\u02e4\2\2\u0995\u0993\3"+
		"\2\2\2\u0995\u0996\3\2\2\2\u0996\u0a82\3\2\2\2\u0997\u0999\7\u0267\2\2"+
		"\u0998\u099a\5\u0138\u009d\2\u0999\u0998\3\2\2\2\u0999\u099a\3\2\2\2\u099a"+
		"\u099d\3\2\2\2\u099b\u099c\7\u0099\2\2\u099c\u099e\7\u02e4\2\2\u099d\u099b"+
		"\3\2\2\2\u099d\u099e\3\2\2\2\u099e\u0a82\3\2\2\2\u099f\u09a1\7\u026a\2"+
		"\2\u09a0\u09a2\5\u0138\u009d\2\u09a1\u09a0\3\2\2\2\u09a1\u09a2\3\2\2\2"+
		"\u09a2\u09a5\3\2\2\2\u09a3\u09a4\7\u0099\2\2\u09a4\u09a6\t+\2\2\u09a5"+
		"\u09a3\3\2\2\2\u09a5\u09a6\3\2\2\2\u09a6\u0a82\3\2\2\2\u09a7\u09a9\7\u008a"+
		"\2\2\u09a8\u09aa\5\u0138\u009d\2\u09a9\u09a8\3\2\2\2\u09a9\u09aa\3\2\2"+
		"\2\u09aa\u09ad\3\2\2\2\u09ab\u09ac\7\u0099\2\2\u09ac\u09ae\t+\2\2\u09ad"+
		"\u09ab\3\2\2\2\u09ad\u09ae\3\2\2\2\u09ae\u0a82\3\2\2\2\u09af\u09b1\7\u02be"+
		"\2\2\u09b0\u09b2\5\u0138\u009d\2\u09b1\u09b0\3\2\2\2\u09b1\u09b2\3\2\2"+
		"\2\u09b2\u09b5\3\2\2\2\u09b3\u09b4\7\u0099\2\2\u09b4\u09b6\7\u02e0\2\2"+
		"\u09b5\u09b3\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u0a82\3\2\2\2\u09b7\u09bc"+
		"\7D\2\2\u09b8\u09b9\7\u02d5\2\2\u09b9\u09ba\5\u014c\u00a7\2\u09ba\u09bb"+
		"\7\u02d4\2\2\u09bb\u09bd\3\2\2\2\u09bc\u09b8\3\2\2\2\u09bc\u09bd\3\2\2"+
		"\2\u09bd\u09c1\3\2\2\2\u09be\u09bf\7F\2\2\u09bf\u09c0\7\u021a\2\2\u09c0"+
		"\u09c2\5\4\3\2\u09c1\u09be\3\2\2\2\u09c1\u09c2\3\2\2\2\u09c2\u09c5\3\2"+
		"\2\2\u09c3\u09c4\7P\2\2\u09c4\u09c6\5> \2\u09c5\u09c3\3\2\2\2\u09c5\u09c6"+
		"\3\2\2\2\u09c6\u09c8\3\2\2\2\u09c7\u09c9\5\u0138\u009d\2\u09c8\u09c7\3"+
		"\2\2\2\u09c8\u09c9\3\2\2\2\u09c9\u09cc\3\2\2\2\u09ca\u09cb\7\u0099\2\2"+
		"\u09cb\u09cd\7\u02e4\2\2\u09cc\u09ca\3\2\2\2\u09cc\u09cd\3\2\2\2\u09cd"+
		"\u0a82\3\2\2\2\u09ce\u09cf\7\u02a7\2\2\u09cf\u09d0\7\u02d5\2\2\u09d0\u09d1"+
		"\5\u014c\u00a7\2\u09d1\u09d5\7\u02d4\2\2\u09d2\u09d3\7F\2\2\u09d3\u09d4"+
		"\7\u021a\2\2\u09d4\u09d6\5\4\3\2\u09d5\u09d2\3\2\2\2\u09d5\u09d6\3\2\2"+
		"\2\u09d6\u09d9\3\2\2\2\u09d7\u09d8\7P\2\2\u09d8\u09da\5> \2\u09d9\u09d7"+
		"\3\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09dc\3\2\2\2\u09db\u09dd\5\u0138\u009d"+
		"\2\u09dc\u09db\3\2\2\2\u09dc\u09dd\3\2\2\2\u09dd\u09e0\3\2\2\2\u09de\u09df"+
		"\7\u0099\2\2\u09df\u09e1\7\u02e4\2\2\u09e0\u09de\3\2\2\2\u09e0\u09e1\3"+
		"\2\2\2\u09e1\u0a82\3\2\2\2\u09e2\u09e7\7*\2\2\u09e3\u09e4\7\u02d5\2\2"+
		"\u09e4\u09e5\5\u014c\u00a7\2\u09e5\u09e6\7\u02d4\2\2\u09e6\u09e8\3\2\2"+
		"\2\u09e7\u09e3\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u09ea\3\2\2\2\u09e9\u09eb"+
		"\5\u0138\u009d\2\u09ea\u09e9\3\2\2\2\u09ea\u09eb\3\2\2\2\u09eb\u09ee\3"+
		"\2\2\2\u09ec\u09ed\7\u0099\2\2\u09ed\u09ef\7\u02e4\2\2\u09ee\u09ec\3\2"+
		"\2\2\u09ee\u09ef\3\2\2\2\u09ef\u0a82\3\2\2\2\u09f0\u09f1\7\u02a6\2\2\u09f1"+
		"\u09f2\7\u02d5\2\2\u09f2\u09f3\5\u014c\u00a7\2\u09f3\u09f5\7\u02d4\2\2"+
		"\u09f4\u09f6\5\u0138\u009d\2\u09f5\u09f4\3\2\2\2\u09f5\u09f6\3\2\2\2\u09f6"+
		"\u09f9\3\2\2\2\u09f7\u09f8\7\u0099\2\2\u09f8\u09fa\7\u02e4\2\2\u09f9\u09f7"+
		"\3\2\2\2\u09f9\u09fa\3\2\2\2\u09fa\u0a82\3\2\2\2\u09fb\u09fd\7\u026d\2"+
		"\2\u09fc\u09fe\5\u0138\u009d\2\u09fd\u09fc\3\2\2\2\u09fd\u09fe\3\2\2\2"+
		"\u09fe\u0a82\3\2\2\2\u09ff\u0a01\7\61\2\2\u0a00\u0a02\5\u0138\u009d\2"+
		"\u0a01\u0a00\3\2\2\2\u0a01\u0a02\3\2\2\2\u0a02\u0a82\3\2\2\2\u0a03\u0a05"+
		"\7\u017b\2\2\u0a04\u0a06\5\u0138\u009d\2\u0a05\u0a04\3\2\2\2\u0a05\u0a06"+
		"\3\2\2\2\u0a06\u0a82\3\2\2\2\u0a07\u0a09\7\u0153\2\2\u0a08\u0a0a\5\u0138"+
		"\u009d\2\u0a09\u0a08\3\2\2\2\u0a09\u0a0a\3\2\2\2\u0a0a\u0a82\3\2\2\2\u0a0b"+
		"\u0a0d\7\u026f\2\2\u0a0c\u0a0e\7*\2\2\u0a0d\u0a0c\3\2\2\2\u0a0d\u0a0e"+
		"\3\2\2\2\u0a0e\u0a12\3\2\2\2\u0a0f\u0a10\7F\2\2\u0a10\u0a11\7\u021a\2"+
		"\2\u0a11\u0a13\5\4\3\2\u0a12\u0a0f\3\2\2\2\u0a12\u0a13\3\2\2\2\u0a13\u0a16"+
		"\3\2\2\2\u0a14\u0a15\7P\2\2\u0a15\u0a17\5> \2\u0a16\u0a14\3\2\2\2\u0a16"+
		"\u0a17\3\2\2\2\u0a17\u0a19\3\2\2\2\u0a18\u0a1a\5\u0138\u009d\2\u0a19\u0a18"+
		"\3\2\2\2\u0a19\u0a1a\3\2\2\2\u0a1a\u0a82\3\2\2\2\u0a1b\u0a1d\7\u0263\2"+
		"\2\u0a1c\u0a1e\7*\2\2\u0a1d\u0a1c\3\2\2\2\u0a1d\u0a1e\3\2\2\2\u0a1e\u0a22"+
		"\3\2\2\2\u0a1f\u0a20\7F\2\2\u0a20\u0a21\7\u021a\2\2\u0a21\u0a23\5\4\3"+
		"\2\u0a22\u0a1f\3\2\2\2\u0a22\u0a23\3\2\2\2\u0a23\u0a26\3\2\2\2\u0a24\u0a25"+
		"\7P\2\2\u0a25\u0a27\5> \2\u0a26\u0a24\3\2\2\2\u0a26\u0a27\3\2\2\2\u0a27"+
		"\u0a29\3\2\2\2\u0a28\u0a2a\5\u0138\u009d\2\u0a29\u0a28\3\2\2\2\u0a29\u0a2a"+
		"\3\2\2\2\u0a2a\u0a82\3\2\2\2\u0a2b\u0a2d\7\u017d\2\2\u0a2c\u0a2e\7*\2"+
		"\2\u0a2d\u0a2c\3\2\2\2\u0a2d\u0a2e\3\2\2\2\u0a2e\u0a32\3\2\2\2\u0a2f\u0a30"+
		"\7F\2\2\u0a30\u0a31\7\u021a\2\2\u0a31\u0a33\5\4\3\2\u0a32\u0a2f\3\2\2"+
		"\2\u0a32\u0a33\3\2\2\2\u0a33\u0a36\3\2\2\2\u0a34\u0a35\7P\2\2\u0a35\u0a37"+
		"\5> \2\u0a36\u0a34\3\2\2\2\u0a36\u0a37\3\2\2\2\u0a37\u0a39\3\2\2\2\u0a38"+
		"\u0a3a\5\u0138\u009d\2\u0a39\u0a38\3\2\2\2\u0a39\u0a3a\3\2\2\2\u0a3a\u0a82"+
		"\3\2\2\2\u0a3b\u0a3d\7\u0154\2\2\u0a3c\u0a3e\7*\2\2\u0a3d\u0a3c\3\2\2"+
		"\2\u0a3d\u0a3e\3\2\2\2\u0a3e\u0a42\3\2\2\2\u0a3f\u0a40\7F\2\2\u0a40\u0a41"+
		"\7\u021a\2\2\u0a41\u0a43\5\4\3\2\u0a42\u0a3f\3\2\2\2\u0a42\u0a43\3\2\2"+
		"\2\u0a43\u0a46\3\2\2\2\u0a44\u0a45\7P\2\2\u0a45\u0a47\5> \2\u0a46\u0a44"+
		"\3\2\2\2\u0a46\u0a47\3\2\2\2\u0a47\u0a49\3\2\2\2\u0a48\u0a4a\5\u0138\u009d"+
		"\2\u0a49\u0a48\3\2\2\2\u0a49\u0a4a\3\2\2\2\u0a4a\u0a82\3\2\2\2\u0a4b\u0a4c"+
		"\7\u00bd\2\2\u0a4c\u0a4d\7\u02d5\2\2\u0a4d\u0a52\7\u02e4\2\2\u0a4e\u0a4f"+
		"\7\u02d2\2\2\u0a4f\u0a51\7\u02e4\2\2\u0a50\u0a4e\3\2\2\2\u0a51\u0a54\3"+
		"\2\2\2\u0a52\u0a50\3\2\2\2\u0a52\u0a53\3\2\2\2\u0a53\u0a55\3\2\2\2\u0a54"+
		"\u0a52\3\2\2\2\u0a55\u0a59\7\u02d4\2\2\u0a56\u0a57\7F\2\2\u0a57\u0a58"+
		"\7\u021a\2\2\u0a58\u0a5a\5\4\3\2\u0a59\u0a56\3\2\2\2\u0a59\u0a5a\3\2\2"+
		"\2\u0a5a\u0a5d\3\2\2\2\u0a5b\u0a5c\7P\2\2\u0a5c\u0a5e\5> \2\u0a5d\u0a5b"+
		"\3\2\2\2\u0a5d\u0a5e\3\2\2\2\u0a5e\u0a60\3\2\2\2\u0a5f\u0a61\5\u0138\u009d"+
		"\2\u0a60\u0a5f\3\2\2\2\u0a60\u0a61\3\2\2\2\u0a61\u0a64\3\2\2\2\u0a62\u0a63"+
		"\7\u0099\2\2\u0a63\u0a65\7\u02e4\2\2\u0a64\u0a62\3\2\2\2\u0a64\u0a65\3"+
		"\2\2\2\u0a65\u0a82\3\2\2\2\u0a66\u0a67\7\u021a\2\2\u0a67\u0a68\7\u02d5"+
		"\2\2\u0a68\u0a6d\7\u02e4\2\2\u0a69\u0a6a\7\u02d2\2\2\u0a6a\u0a6c\7\u02e4"+
		"\2\2\u0a6b\u0a69\3\2\2\2\u0a6c\u0a6f\3\2\2\2\u0a6d\u0a6b\3\2\2\2\u0a6d"+
		"\u0a6e\3\2\2\2\u0a6e\u0a70\3\2\2\2\u0a6f\u0a6d\3\2\2\2\u0a70\u0a74\7\u02d4"+
		"\2\2\u0a71\u0a72\7F\2\2\u0a72\u0a73\7\u021a\2\2\u0a73\u0a75\5\4\3\2\u0a74"+
		"\u0a71\3\2\2\2\u0a74\u0a75\3\2\2\2\u0a75\u0a78\3\2\2\2\u0a76\u0a77\7P"+
		"\2\2\u0a77\u0a79\5> \2\u0a78\u0a76\3\2\2\2\u0a78\u0a79\3\2\2\2\u0a79\u0a7b"+
		"\3\2\2\2\u0a7a\u0a7c\5\u0138\u009d\2\u0a7b\u0a7a\3\2\2\2\u0a7b\u0a7c\3"+
		"\2\2\2\u0a7c\u0a7f\3\2\2\2\u0a7d\u0a7e\7\u0099\2\2\u0a7e\u0a80\7\u02e4"+
		"\2\2\u0a7f\u0a7d\3\2\2\2\u0a7f\u0a80\3\2\2\2\u0a80\u0a82\3\2\2\2\u0a81"+
		"\u0897\3\2\2\2\u0a81\u08a5\3\2\2\2\u0a81\u08b9\3\2\2\2\u0a81\u08cd\3\2"+
		"\2\2\u0a81\u08e1\3\2\2\2\u0a81\u08f5\3\2\2\2\u0a81\u0909\3\2\2\2\u0a81"+
		"\u091d\3\2\2\2\u0a81\u0933\3\2\2\2\u0a81\u0949\3\2\2\2\u0a81\u095f\3\2"+
		"\2\2\u0a81\u0977\3\2\2\2\u0a81\u098f\3\2\2\2\u0a81\u0997\3\2\2\2\u0a81"+
		"\u099f\3\2\2\2\u0a81\u09a7\3\2\2\2\u0a81\u09af\3\2\2\2\u0a81\u09b7\3\2"+
		"\2\2\u0a81\u09ce\3\2\2\2\u0a81\u09e2\3\2\2\2\u0a81\u09f0\3\2\2\2\u0a81"+
		"\u09fb\3\2\2\2\u0a81\u09ff\3\2\2\2\u0a81\u0a03\3\2\2\2\u0a81\u0a07\3\2"+
		"\2\2\u0a81\u0a0b\3\2\2\2\u0a81\u0a1b\3\2\2\2\u0a81\u0a2b\3\2\2\2\u0a81"+
		"\u0a3b\3\2\2\2\u0a81\u0a4b\3\2\2\2\u0a81\u0a66\3\2\2\2\u0a82\u013b\3\2"+
		"\2\2\u0a83\u0a87\5.\30\2\u0a84\u0a85\7\u02d5\2\2\u0a85\u0a86\7\u02e0\2"+
		"\2\u0a86\u0a88\7\u02d4\2\2\u0a87\u0a84\3\2\2\2\u0a87\u0a88\3\2\2\2\u0a88"+
		"\u0a8a\3\2\2\2\u0a89\u0a8b\t\31\2\2\u0a8a\u0a89\3\2\2\2\u0a8a\u0a8b\3"+
		"\2\2\2\u0a8b\u013d\3\2\2\2\u0a8c\u0a8d\7\u01e7\2\2\u0a8d\u0a8e\5*\26\2"+
		"\u0a8e\u0a8f\7\u02d5\2\2\u0a8f\u0a94\5\u013c\u009f\2\u0a90\u0a91\7\u02d2"+
		"\2\2\u0a91\u0a93\5\u013c\u009f\2\u0a92\u0a90\3\2\2\2\u0a93\u0a96\3\2\2"+
		"\2\u0a94\u0a92\3\2\2\2\u0a94\u0a95\3\2\2\2\u0a95\u0a97\3\2\2\2\u0a96\u0a94"+
		"\3\2\2\2\u0a97\u0a9e\7\u02d4\2\2\u0a98\u0a99\7\u0170\2\2\u0a99\u0a9f\7"+
		"\u00e8\2\2\u0a9a\u0a9b\7\u0170\2\2\u0a9b\u0a9f\7\u01ba\2\2\u0a9c\u0a9d"+
		"\7\u0170\2\2\u0a9d\u0a9f\7\u0221\2\2\u0a9e\u0a98\3\2\2\2\u0a9e\u0a9a\3"+
		"\2\2\2\u0a9e\u0a9c\3\2\2\2\u0a9e\u0a9f\3\2\2\2\u0a9f\u0aa3\3\2\2\2\u0aa0"+
		"\u0aa1\7\u01a8\2\2\u0aa1\u0aa2\7\u009e\2\2\u0aa2\u0aa4\5\u0140\u00a1\2"+
		"\u0aa3\u0aa0\3\2\2\2\u0aa3\u0aa4\3\2\2\2\u0aa4\u0aa8\3\2\2\2\u0aa5\u0aa6"+
		"\7\u01a8\2\2\u0aa6\u0aa7\7\u0292\2\2\u0aa7\u0aa9\5\u0140\u00a1\2\u0aa8"+
		"\u0aa5\3\2\2\2\u0aa8\u0aa9\3\2\2\2\u0aa9\u013f\3\2\2\2\u0aaa\u0ab1\7\u01fa"+
		"\2\2\u0aab\u0ab1\7;\2\2\u0aac\u0aad\7\u021a\2\2\u0aad\u0ab1\7\u01a1\2"+
		"\2\u0aae\u0aaf\7\u019a\2\2\u0aaf\u0ab1\7\6\2\2\u0ab0\u0aaa\3\2\2\2\u0ab0"+
		"\u0aab\3\2\2\2\u0ab0\u0aac\3\2\2\2\u0ab0\u0aae\3\2\2\2\u0ab1\u0141\3\2"+
		"\2\2\u0ab2\u0ab9\5\u0144\u00a3\2\u0ab3\u0ab5\7\u02d2\2\2\u0ab4\u0ab3\3"+
		"\2\2\2\u0ab4\u0ab5\3\2\2\2\u0ab5\u0ab6\3\2\2\2\u0ab6\u0ab8\5\u0144\u00a3"+
		"\2\u0ab7\u0ab4\3\2\2\2\u0ab8\u0abb\3\2\2\2\u0ab9\u0ab7\3\2\2\2\u0ab9\u0aba"+
		"\3\2\2\2\u0aba\u0143\3\2\2\2\u0abb\u0ab9\3\2\2\2\u0abc\u0abe\7\u00bb\2"+
		"\2\u0abd\u0abf\7\u02c7\2\2\u0abe\u0abd\3\2\2\2\u0abe\u0abf\3\2\2\2\u0abf"+
		"\u0ac0\3\2\2\2\u0ac0\u0b39\5,\27\2\u0ac1\u0ac3\7\36\2\2\u0ac2\u0ac4\7"+
		"\u02c7\2\2\u0ac3\u0ac2\3\2\2\2\u0ac3\u0ac4\3\2\2\2\u0ac4\u0ac5\3\2\2\2"+
		"\u0ac5\u0b39\7\u02e0\2\2\u0ac6\u0ac8\7!\2\2\u0ac7\u0ac9\7\u02c7\2\2\u0ac8"+
		"\u0ac7\3\2\2\2\u0ac8\u0ac9\3\2\2\2\u0ac9\u0aca\3\2\2\2\u0aca\u0b39\7\u02e0"+
		"\2\2\u0acb\u0acd\7\u0099\2\2\u0acc\u0acb\3\2\2\2\u0acc\u0acd\3\2\2\2\u0acd"+
		"\u0ace\3\2\2\2\u0ace\u0acf\7F\2\2\u0acf\u0ad1\7\u021a\2\2\u0ad0\u0ad2"+
		"\7\u02c7\2\2\u0ad1\u0ad0\3\2\2\2\u0ad1\u0ad2\3\2\2\2\u0ad2\u0ad3\3\2\2"+
		"\2\u0ad3\u0b39\5\4\3\2\u0ad4\u0ad6\7I\2\2\u0ad5\u0ad7\7\u02c7\2\2\u0ad6"+
		"\u0ad5\3\2\2\2\u0ad6\u0ad7\3\2\2\2\u0ad7\u0ad8\3\2\2\2\u0ad8\u0b39\7\u02e0"+
		"\2\2\u0ad9\u0adb\7\u0099\2\2\u0ada\u0ad9\3\2\2\2\u0ada\u0adb\3\2\2\2\u0adb"+
		"\u0adc\3\2\2\2\u0adc\u0ade\7P\2\2\u0add\u0adf\7\u02c7\2\2\u0ade\u0add"+
		"\3\2\2\2\u0ade\u0adf\3\2\2\2\u0adf\u0ae0\3\2\2\2\u0ae0\u0b39\5> \2\u0ae1"+
		"\u0ae3\7U\2\2\u0ae2\u0ae4\7\u02c7\2\2\u0ae3\u0ae2\3\2\2\2\u0ae3\u0ae4"+
		"\3\2\2\2\u0ae4\u0ae5\3\2\2\2\u0ae5\u0b39\7\u02e4\2\2\u0ae6\u0ae8\7a\2"+
		"\2\u0ae7\u0ae9\7\u02c7\2\2\u0ae8\u0ae7\3\2\2\2\u0ae8\u0ae9\3\2\2\2\u0ae9"+
		"\u0aea\3\2\2\2\u0aea\u0b39\7\u02e4\2\2\u0aeb\u0aec\7\u0084\2\2\u0aec\u0aee"+
		"\7\u00a4\2\2\u0aed\u0aef\7\u02c7\2\2\u0aee\u0aed\3\2\2\2\u0aee\u0aef\3"+
		"\2\2\2\u0aef\u0af0\3\2\2\2\u0af0\u0b39\7\u02e4\2\2\u0af1\u0af3\7\u009c"+
		"\2\2\u0af2\u0af4\7\u02c7\2\2\u0af3\u0af2\3\2\2\2\u0af3\u0af4\3\2\2\2\u0af4"+
		"\u0af5\3\2\2\2\u0af5\u0b39\7\u02e0\2\2\u0af6\u0af7\7\u010c\2\2\u0af7\u0af9"+
		"\7\u00a4\2\2\u0af8\u0afa\7\u02c7\2\2\u0af9\u0af8\3\2\2\2\u0af9\u0afa\3"+
		"\2\2\2\u0afa\u0afb\3\2\2\2\u0afb\u0b39\7\u02e4\2\2\u0afc\u0afe\7\u0117"+
		"\2\2\u0afd\u0aff\7\u02c7\2\2\u0afe\u0afd\3\2\2\2\u0afe\u0aff\3\2\2\2\u0aff"+
		"\u0b00\3\2\2\2\u0b00\u0b39\t,\2\2\u0b01\u0b03\7\u0128\2\2\u0b02\u0b04"+
		"\7\u02c7\2\2\u0b03\u0b02\3\2\2\2\u0b03\u0b04\3\2\2\2\u0b04\u0b05\3\2\2"+
		"\2\u0b05\u0b39\7\u02e0\2\2\u0b06\u0b08\7\u0174\2\2\u0b07\u0b09\7\u02c7"+
		"\2\2\u0b08\u0b07\3\2\2\2\u0b08\u0b09\3\2\2\2\u0b09\u0b0a\3\2\2\2\u0b0a"+
		"\u0b39\7\u02e0\2\2\u0b0b\u0b0d\7\u0184\2\2\u0b0c\u0b0e\7\u02c7\2\2\u0b0d"+
		"\u0b0c\3\2\2\2\u0b0d\u0b0e\3\2\2\2\u0b0e\u0b0f\3\2\2\2\u0b0f\u0b39\7\u02e0"+
		"\2\2\u0b10\u0b12\7\u01b6\2\2\u0b11\u0b13\7\u02c7\2\2\u0b12\u0b11\3\2\2"+
		"\2\u0b12\u0b13\3\2\2\2\u0b13\u0b14\3\2\2\2\u0b14\u0b39\t-\2\2\u0b15\u0b17"+
		"\7\u01be\2\2\u0b16\u0b18\7\u02c7\2\2\u0b17\u0b16\3\2\2\2\u0b17\u0b18\3"+
		"\2\2\2\u0b18\u0b19\3\2\2\2\u0b19\u0b39\7\u02e4\2\2\u0b1a\u0b1c\7\u0205"+
		"\2\2\u0b1b\u0b1d\7\u02c7\2\2\u0b1c\u0b1b\3\2\2\2\u0b1c\u0b1d\3\2\2\2\u0b1d"+
		"\u0b1e\3\2\2\2\u0b1e\u0b39\t.\2\2\u0b1f\u0b21\7\u023f\2\2\u0b20\u0b22"+
		"\7\u02c7\2\2\u0b21\u0b20\3\2\2\2\u0b21\u0b22\3\2\2\2\u0b22\u0b23\3\2\2"+
		"\2\u0b23\u0b39\t-\2\2\u0b24\u0b26\7\u0240\2\2\u0b25\u0b27\7\u02c7\2\2"+
		"\u0b26\u0b25\3\2\2\2\u0b26\u0b27\3\2\2\2\u0b27\u0b28\3\2\2\2\u0b28\u0b39"+
		"\t-\2\2\u0b29\u0b2b\7\u028b\2\2\u0b2a\u0b2c\7\u02c7\2\2\u0b2b\u0b2a\3"+
		"\2\2\2\u0b2b\u0b2c\3\2\2\2\u0b2c\u0b2d\3\2\2\2\u0b2d\u0b2e\7\u02d5\2\2"+
		"\u0b2e\u0b33\5*\26\2\u0b2f\u0b30\7\u02d2\2\2\u0b30\u0b32\5*\26\2\u0b31"+
		"\u0b2f\3\2\2\2\u0b32\u0b35\3\2\2\2\u0b33\u0b31\3\2\2\2\u0b33\u0b34\3\2"+
		"\2\2\u0b34\u0b36\3\2\2\2\u0b35\u0b33\3\2\2\2\u0b36\u0b37\7\u02d4\2\2\u0b37"+
		"\u0b39\3\2\2\2\u0b38\u0abc\3\2\2\2\u0b38\u0ac1\3\2\2\2\u0b38\u0ac6\3\2"+
		"\2\2\u0b38\u0acc\3\2\2\2\u0b38\u0ad4\3\2\2\2\u0b38\u0ada\3\2\2\2\u0b38"+
		"\u0ae1\3\2\2\2\u0b38\u0ae6\3\2\2\2\u0b38\u0aeb\3\2\2\2\u0b38\u0af1\3\2"+
		"\2\2\u0b38\u0af6\3\2\2\2\u0b38\u0afc\3\2\2\2\u0b38\u0b01\3\2\2\2\u0b38"+
		"\u0b06\3\2\2\2\u0b38\u0b0b\3\2\2\2\u0b38\u0b10\3\2\2\2\u0b38\u0b15\3\2"+
		"\2\2\u0b38\u0b1a\3\2\2\2\u0b38\u0b1f\3\2\2\2\u0b38\u0b24\3\2\2\2\u0b38"+
		"\u0b29\3\2\2\2\u0b39\u0145\3\2\2\2\u0b3a\u0b3b\7\u01bb\2\2\u0b3b\u0b64"+
		"\7\67\2\2\u0b3c\u0b3e\7\u0142\2\2\u0b3d\u0b3c\3\2\2\2\u0b3d\u0b3e\3\2"+
		"\2\2\u0b3e\u0b3f\3\2\2\2\u0b3f\u0b40\7\u00f9\2\2\u0b40\u0b41\7\u02d5\2"+
		"\2\u0b41\u0b42\5N(\2\u0b42\u0b43\7\u02d4\2\2\u0b43\u0b65\3\2\2\2\u0b44"+
		"\u0b46\7\u0142\2\2\u0b45\u0b44\3\2\2\2\u0b45\u0b46\3\2\2\2\u0b46\u0b47"+
		"\3\2\2\2\u0b47\u0b48\7\u0129\2\2\u0b48\u0b49\7\u02d5\2\2\u0b49\u0b4a\5"+
		"\u00b8]\2\u0b4a\u0b4b\7\u02d4\2\2\u0b4b\u0b65\3\2\2\2\u0b4c\u0b56\7\u01dc"+
		"\2\2\u0b4d\u0b4e\7\u02d5\2\2\u0b4e\u0b4f\5N(\2\u0b4f\u0b50\7\u02d4\2\2"+
		"\u0b50\u0b57\3\2\2\2\u0b51\u0b52\7T\2\2\u0b52\u0b53\7\u02d5\2\2\u0b53"+
		"\u0b54\5\u00b8]\2\u0b54\u0b55\7\u02d4\2\2\u0b55\u0b57\3\2\2\2\u0b56\u0b4d"+
		"\3\2\2\2\u0b56\u0b51\3\2\2\2\u0b57\u0b65\3\2\2\2\u0b58\u0b62\7\u0145\2"+
		"\2\u0b59\u0b5a\7\u02d5\2\2\u0b5a\u0b5b\5N(\2\u0b5b\u0b5c\7\u02d4\2\2\u0b5c"+
		"\u0b63\3\2\2\2\u0b5d\u0b5e\7T\2\2\u0b5e\u0b5f\7\u02d5\2\2\u0b5f\u0b60"+
		"\5\u00b8]\2\u0b60\u0b61\7\u02d4\2\2\u0b61\u0b63\3\2\2\2\u0b62\u0b59\3"+
		"\2\2\2\u0b62\u0b5d\3\2\2\2\u0b63\u0b65\3\2\2\2\u0b64\u0b3d\3\2\2\2\u0b64"+
		"\u0b45\3\2\2\2\u0b64\u0b4c\3\2\2\2\u0b64\u0b58\3\2\2\2\u0b65\u0b68\3\2"+
		"\2\2\u0b66\u0b67\7\u01bd\2\2\u0b67\u0b69\7\u02e0\2\2\u0b68\u0b66\3\2\2"+
		"\2\u0b68\u0b69\3\2\2\2\u0b69\u0b82\3\2\2\2\u0b6a\u0b6b\7\u024e\2\2\u0b6b"+
		"\u0b7c\7\67\2\2\u0b6c\u0b6e\7\u0142\2\2\u0b6d\u0b6c\3\2\2\2\u0b6d\u0b6e"+
		"\3\2\2\2\u0b6e\u0b6f\3\2\2\2\u0b6f\u0b70\7\u00f9\2\2\u0b70\u0b71\7\u02d5"+
		"\2\2\u0b71\u0b72\5N(\2\u0b72\u0b73\7\u02d4\2\2\u0b73\u0b7d\3\2\2\2\u0b74"+
		"\u0b76\7\u0142\2\2\u0b75\u0b74\3\2\2\2\u0b75\u0b76\3\2\2\2\u0b76\u0b77"+
		"\3\2\2\2\u0b77\u0b78\7\u0129\2\2\u0b78\u0b79\7\u02d5\2\2\u0b79\u0b7a\5"+
		"\u00b8]\2\u0b7a\u0b7b\7\u02d4\2\2\u0b7b\u0b7d\3\2\2\2\u0b7c\u0b6d\3\2"+
		"\2\2\u0b7c\u0b75\3\2\2\2\u0b7d\u0b80\3\2\2\2\u0b7e\u0b7f\7\u024f\2\2\u0b7f"+
		"\u0b81\7\u02e0\2\2\u0b80\u0b7e\3\2\2\2\u0b80\u0b81\3\2\2\2\u0b81\u0b83"+
		"\3\2\2\2\u0b82\u0b6a\3\2\2\2\u0b82\u0b83\3\2\2\2\u0b83\u0b8f\3\2\2\2\u0b84"+
		"\u0b85\7\u02d5\2\2\u0b85\u0b8a\5\u0148\u00a5\2\u0b86\u0b87\7\u02d2\2\2"+
		"\u0b87\u0b89\5\u0148\u00a5\2\u0b88\u0b86\3\2\2\2\u0b89\u0b8c\3\2\2\2\u0b8a"+
		"\u0b88\3\2\2\2\u0b8a\u0b8b\3\2\2\2\u0b8b\u0b8d\3\2\2\2\u0b8c\u0b8a\3\2"+
		"\2\2\u0b8d\u0b8e\7\u02d4\2\2\u0b8e\u0b90\3\2\2\2\u0b8f\u0b84\3\2\2\2\u0b8f"+
		"\u0b90\3\2\2\2\u0b90\u0147\3\2\2\2\u0b91\u0b92\7\u01bb\2\2\u0b92\u0ba4"+
		"\5\66\34\2\u0b93\u0ba2\7\u02a3\2\2\u0b94\u0b95\7\u013e\2\2\u0b95\u0b9b"+
		"\7\u0264\2\2\u0b96\u0b97\7\u02d5\2\2\u0b97\u0b98\5z>\2\u0b98\u0b99\7\u02d4"+
		"\2\2\u0b99\u0b9c\3\2\2\2\u0b9a\u0b9c\7\u0178\2\2\u0b9b\u0b96\3\2\2\2\u0b9b"+
		"\u0b9a\3\2\2\2\u0b9c\u0ba3\3\2\2\2\u0b9d\u0b9e\7\u010b\2\2\u0b9e\u0b9f"+
		"\7\u02d5\2\2\u0b9f\u0ba0\5z>\2\u0ba0\u0ba1\7\u02d4\2\2\u0ba1\u0ba3\3\2"+
		"\2\2\u0ba2\u0b94\3\2\2\2\u0ba2\u0b9d\3\2\2\2\u0ba3\u0ba5\3\2\2\2\u0ba4"+
		"\u0b93\3\2\2\2\u0ba4\u0ba5\3\2\2\2\u0ba5\u0bae\3\2\2\2\u0ba6\u0ba8\7\u0248"+
		"\2\2\u0ba7\u0ba6\3\2\2\2\u0ba7\u0ba8\3\2\2\2\u0ba8\u0ba9\3\2\2\2\u0ba9"+
		"\u0bab\7\u00bb\2\2\u0baa\u0bac\7\u02c7\2\2\u0bab\u0baa\3\2\2\2\u0bab\u0bac"+
		"\3\2\2\2\u0bac\u0bad\3\2\2\2\u0bad\u0baf\5,\27\2\u0bae\u0ba7\3\2\2\2\u0bae"+
		"\u0baf\3\2\2\2\u0baf\u0bb5\3\2\2\2\u0bb0\u0bb2\7U\2\2\u0bb1\u0bb3\7\u02c7"+
		"\2\2\u0bb2\u0bb1\3\2\2\2\u0bb2\u0bb3\3\2\2\2\u0bb3\u0bb4\3\2\2\2\u0bb4"+
		"\u0bb6\7\u02e4\2\2\u0bb5\u0bb0\3\2\2\2\u0bb5\u0bb6\3\2\2\2\u0bb6\u0bbd"+
		"\3\2\2\2\u0bb7\u0bb8\7\u0084\2\2\u0bb8\u0bba\7\u00a4\2\2\u0bb9\u0bbb\7"+
		"\u02c7\2\2\u0bba\u0bb9\3\2\2\2\u0bba\u0bbb\3\2\2\2\u0bbb\u0bbc\3\2\2\2"+
		"\u0bbc\u0bbe\7\u02e4\2\2\u0bbd\u0bb7\3\2\2\2\u0bbd\u0bbe\3\2\2\2\u0bbe"+
		"\u0bc5\3\2\2\2\u0bbf\u0bc0\7\u010c\2\2\u0bc0\u0bc2\7\u00a4\2\2\u0bc1\u0bc3"+
		"\7\u02c7\2\2\u0bc2\u0bc1\3\2\2\2\u0bc2\u0bc3\3\2\2\2\u0bc3\u0bc4\3\2\2"+
		"\2\u0bc4\u0bc6\7\u02e4\2\2\u0bc5\u0bbf\3\2\2\2\u0bc5\u0bc6\3\2\2\2\u0bc6"+
		"\u0bcc\3\2\2\2\u0bc7\u0bc9\7\u0174\2\2\u0bc8\u0bca\7\u02c7\2\2\u0bc9\u0bc8"+
		"\3\2\2\2\u0bc9\u0bca\3\2\2\2\u0bca\u0bcb\3\2\2\2\u0bcb\u0bcd\7\u02e0\2"+
		"\2\u0bcc\u0bc7\3\2\2\2\u0bcc\u0bcd\3\2\2\2\u0bcd\u0bd3\3\2\2\2\u0bce\u0bd0"+
		"\7\u0184\2\2\u0bcf\u0bd1\7\u02c7\2\2\u0bd0\u0bcf\3\2\2\2\u0bd0\u0bd1\3"+
		"\2\2\2\u0bd1\u0bd2\3\2\2\2\u0bd2\u0bd4\7\u02e0\2\2\u0bd3\u0bce\3\2\2\2"+
		"\u0bd3\u0bd4\3\2\2\2\u0bd4\u0be0\3\2\2\2\u0bd5\u0bd6\7\u02d5\2\2\u0bd6"+
		"\u0bdb\5\u014a\u00a6\2\u0bd7\u0bd8\7\u02d2\2\2\u0bd8\u0bda\5\u014a\u00a6"+
		"\2\u0bd9\u0bd7\3\2\2\2\u0bda\u0bdd\3\2\2\2\u0bdb\u0bd9\3\2\2\2\u0bdb\u0bdc"+
		"\3\2\2\2\u0bdc\u0bde\3\2\2\2\u0bdd\u0bdb\3\2\2\2\u0bde\u0bdf\7\u02d4\2"+
		"\2\u0bdf\u0be1\3\2\2\2\u0be0\u0bd5\3\2\2\2\u0be0\u0be1\3\2\2\2\u0be1\u0149"+
		"\3\2\2\2\u0be2\u0be3\7\u024e\2\2\u0be3\u0bec\58\35\2\u0be4\u0be6\7\u0248"+
		"\2\2\u0be5\u0be4\3\2\2\2\u0be5\u0be6\3\2\2\2\u0be6\u0be7\3\2\2\2\u0be7"+
		"\u0be9\7\u00bb\2\2\u0be8\u0bea\7\u02c7\2\2\u0be9\u0be8\3\2\2\2\u0be9\u0bea"+
		"\3\2\2\2\u0bea\u0beb\3\2\2\2\u0beb\u0bed\5,\27\2\u0bec\u0be5\3\2\2\2\u0bec"+
		"\u0bed\3\2\2\2\u0bed\u0bf3\3\2\2\2\u0bee\u0bf0\7U\2\2\u0bef\u0bf1\7\u02c7"+
		"\2\2\u0bf0\u0bef\3\2\2\2\u0bf0\u0bf1\3\2\2\2\u0bf1\u0bf2\3\2\2\2\u0bf2"+
		"\u0bf4\7\u02e4\2\2\u0bf3\u0bee\3\2\2\2\u0bf3\u0bf4\3\2\2\2\u0bf4\u0bfb"+
		"\3\2\2\2\u0bf5\u0bf6\7\u0084\2\2\u0bf6\u0bf8\7\u00a4\2\2\u0bf7\u0bf9\7"+
		"\u02c7\2\2\u0bf8\u0bf7\3\2\2\2\u0bf8\u0bf9\3\2\2\2\u0bf9\u0bfa\3\2\2\2"+
		"\u0bfa\u0bfc\7\u02e4\2\2\u0bfb\u0bf5\3\2\2\2\u0bfb\u0bfc\3\2\2\2\u0bfc"+
		"\u0c03\3\2\2\2\u0bfd\u0bfe\7\u010c\2\2\u0bfe\u0c00\7\u00a4\2\2\u0bff\u0c01"+
		"\7\u02c7\2\2\u0c00\u0bff\3\2\2\2\u0c00\u0c01\3\2\2\2\u0c01\u0c02\3\2\2"+
		"\2\u0c02\u0c04\7\u02e4\2\2\u0c03\u0bfd\3\2\2\2\u0c03\u0c04\3\2\2\2\u0c04"+
		"\u0c0a\3\2\2\2\u0c05\u0c07\7\u0174\2\2\u0c06\u0c08\7\u02c7\2\2\u0c07\u0c06"+
		"\3\2\2\2\u0c07\u0c08\3\2\2\2\u0c08\u0c09\3\2\2\2\u0c09\u0c0b\7\u02e0\2"+
		"\2\u0c0a\u0c05\3\2\2\2\u0c0a\u0c0b\3\2\2\2\u0c0b\u0c11\3\2\2\2\u0c0c\u0c0e"+
		"\7\u0184\2\2\u0c0d\u0c0f\7\u02c7\2\2\u0c0e\u0c0d\3\2\2\2\u0c0e\u0c0f\3"+
		"\2\2\2\u0c0f\u0c10\3\2\2\2\u0c10\u0c12\7\u02e0\2\2\u0c11\u0c0c\3\2\2\2"+
		"\u0c11\u0c12\3\2\2\2\u0c12\u014b\3\2\2\2\u0c13\u0c14\7\u02e0\2\2\u0c14"+
		"\u014d\3\2\2\2\u0c15\u0c17\7\21\2\2\u0c16\u0c18\7\u0109\2\2\u0c17\u0c16"+
		"\3\2\2\2\u0c17\u0c18\3\2\2\2\u0c18\u0c19\3\2\2\2\u0c19\u0c1a\7\u025b\2"+
		"\2\u0c1a\u0c23\5*\26\2\u0c1b\u0c20\5\u0150\u00a9\2\u0c1c\u0c1d\7\u02d2"+
		"\2\2\u0c1d\u0c1f\5\u0150\u00a9\2\u0c1e\u0c1c\3\2\2\2\u0c1f\u0c22\3\2\2"+
		"\2\u0c20\u0c1e\3\2\2\2\u0c20\u0c21\3\2\2\2\u0c21\u0c24\3\2\2\2\u0c22\u0c20"+
		"\3\2\2\2\u0c23\u0c1b\3\2\2\2\u0c23\u0c24\3\2\2\2\u0c24\u0c26\3\2\2\2\u0c25"+
		"\u0c27\5\u0146\u00a4\2\u0c26\u0c25\3\2\2\2\u0c26\u0c27\3\2\2\2\u0c27\u014f"+
		"\3\2\2\2\u0c28\u0d6b\5\u0142\u00a2\2\u0c29\u0c2b\7\7\2\2\u0c2a\u0c2c\7"+
		"S\2\2\u0c2b\u0c2a\3\2\2\2\u0c2b\u0c2c\3\2\2\2\u0c2c\u0c2d\3\2\2\2\u0c2d"+
		"\u0c2e\5.\30\2\u0c2e\u0c31\5\u0136\u009c\2\u0c2f\u0c30\t/\2\2\u0c30\u0c32"+
		"\5.\30\2\u0c31\u0c2f\3\2\2\2\u0c31\u0c32\3\2\2\2\u0c32\u0d6b\3\2\2\2\u0c33"+
		"\u0c35\7\7\2\2\u0c34\u0c36\7S\2\2\u0c35\u0c34\3\2\2\2\u0c35\u0c36\3\2"+
		"\2\2\u0c36\u0c37\3\2\2\2\u0c37\u0c38\7\u02d5\2\2\u0c38\u0c39\5\u0158\u00ad"+
		"\2\u0c39\u0c3a\7\u02d4\2\2\u0c3a\u0d6b\3\2\2\2\u0c3b\u0c3c\7\7\2\2\u0c3c"+
		"\u0c3e\t\26\2\2\u0c3d\u0c3f\5\64\33\2\u0c3e\u0c3d\3\2\2\2\u0c3e\u0c3f"+
		"\3\2\2\2\u0c3f\u0c41\3\2\2\2\u0c40\u0c42\5\u0154\u00ab\2\u0c41\u0c40\3"+
		"\2\2\2\u0c41\u0c42\3\2\2\2\u0c42\u0c43\3\2\2\2\u0c43\u0c44\7\u02d5\2\2"+
		"\u0c44\u0c45\5\u0152\u00aa\2\u0c45\u0c49\7\u02d4\2\2\u0c46\u0c48\5\u0156"+
		"\u00ac\2\u0c47\u0c46\3\2\2\2\u0c48\u0c4b\3\2\2\2\u0c49\u0c47\3\2\2\2\u0c49"+
		"\u0c4a\3\2\2\2\u0c4a\u0d6b\3\2\2\2\u0c4b\u0c49\3\2\2\2\u0c4c\u0c51\7\7"+
		"\2\2\u0c4d\u0c4f\7c\2\2\u0c4e\u0c50\5:\36\2\u0c4f\u0c4e\3\2\2\2\u0c4f"+
		"\u0c50\3\2\2\2\u0c50\u0c52\3\2\2\2\u0c51\u0c4d\3\2\2\2\u0c51\u0c52\3\2"+
		"\2\2\u0c52\u0c53\3\2\2\2\u0c53\u0c54\7\u01ce\2\2\u0c54\u0c56\7\u0129\2"+
		"\2\u0c55\u0c57\5\u0154\u00ab\2\u0c56\u0c55\3\2\2\2\u0c56\u0c57\3\2\2\2"+
		"\u0c57\u0c58\3\2\2\2\u0c58\u0c59\7\u02d5\2\2\u0c59\u0c5a\5\u0152\u00aa"+
		"\2\u0c5a\u0c5e\7\u02d4\2\2\u0c5b\u0c5d\5\u0156\u00ac\2\u0c5c\u0c5b\3\2"+
		"\2\2\u0c5d\u0c60\3\2\2\2\u0c5e\u0c5c\3\2\2\2\u0c5e\u0c5f\3\2\2\2\u0c5f"+
		"\u0d6b\3\2\2\2\u0c60\u0c5e\3\2\2\2\u0c61\u0c66\7\7\2\2\u0c62\u0c64\7c"+
		"\2\2\u0c63\u0c65\5:\36\2\u0c64\u0c63\3\2\2\2\u0c64\u0c65\3\2\2\2\u0c65"+
		"\u0c67\3\2\2\2\u0c66\u0c62\3\2\2\2\u0c66\u0c67\3\2\2\2\u0c67\u0c68\3\2"+
		"\2\2\u0c68\u0c6a\7\u028c\2\2\u0c69\u0c6b\t\26\2\2\u0c6a\u0c69\3\2\2\2"+
		"\u0c6a\u0c6b\3\2\2\2\u0c6b\u0c6d\3\2\2\2\u0c6c\u0c6e\5\64\33\2\u0c6d\u0c6c"+
		"\3\2\2\2\u0c6d\u0c6e\3\2\2\2\u0c6e\u0c70\3\2\2\2\u0c6f\u0c71\5\u0154\u00ab"+
		"\2\u0c70\u0c6f\3\2\2\2\u0c70\u0c71\3\2\2\2\u0c71\u0c72\3\2\2\2\u0c72\u0c73"+
		"\7\u02d5\2\2\u0c73\u0c78\5\u013c\u009f\2\u0c74\u0c75\7\u02d2\2\2\u0c75"+
		"\u0c77\5\u013c\u009f\2\u0c76\u0c74\3\2\2\2\u0c77\u0c7a\3\2\2\2\u0c78\u0c76"+
		"\3\2\2\2\u0c78\u0c79\3\2\2\2\u0c79\u0c7b\3\2\2\2\u0c7a\u0c78\3\2\2\2\u0c7b"+
		"\u0c7f\7\u02d4\2\2\u0c7c\u0c7e\5\u0156\u00ac\2\u0c7d\u0c7c\3\2\2\2\u0c7e"+
		"\u0c81\3\2\2\2\u0c7f\u0c7d\3\2\2\2\u0c7f\u0c80\3\2\2\2\u0c80\u0d6b\3\2"+
		"\2\2\u0c81\u0c7f\3\2\2\2\u0c82\u0c83\7\7\2\2\u0c83\u0c85\7\u00e9\2\2\u0c84"+
		"\u0c86\t\26\2\2\u0c85\u0c84\3\2\2\2\u0c85\u0c86\3\2\2\2\u0c86\u0c88\3"+
		"\2\2\2\u0c87\u0c89\5\64\33\2\u0c88\u0c87\3\2\2\2\u0c88\u0c89\3\2\2\2\u0c89"+
		"\u0c8a\3\2\2\2\u0c8a\u0c8b\7\u02d5\2\2\u0c8b\u0c8c\5\u0152\u00aa\2\u0c8c"+
		"\u0c90\7\u02d4\2\2\u0c8d\u0c8f\5\u0156\u00ac\2\u0c8e\u0c8d\3\2\2\2\u0c8f"+
		"\u0c92\3\2\2\2\u0c90\u0c8e\3\2\2\2\u0c90\u0c91\3\2\2\2\u0c91\u0d6b\3\2"+
		"\2\2\u0c92\u0c90\3\2\2\2\u0c93\u0c94\7\7\2\2\u0c94\u0c96\7\u022e\2\2\u0c95"+
		"\u0c97\t\26\2\2\u0c96\u0c95\3\2\2\2\u0c96\u0c97\3\2\2\2\u0c97\u0c99\3"+
		"\2\2\2\u0c98\u0c9a\5\64\33\2\u0c99\u0c98\3\2\2\2\u0c99\u0c9a\3\2\2\2\u0c9a"+
		"\u0c9b\3\2\2\2\u0c9b\u0c9c\7\u02d5\2\2\u0c9c\u0c9d\5\u0152\u00aa\2\u0c9d"+
		"\u0ca1\7\u02d4\2\2\u0c9e\u0ca0\5\u0156\u00ac\2\u0c9f\u0c9e\3\2\2\2\u0ca0"+
		"\u0ca3\3\2\2\2\u0ca1\u0c9f\3\2\2\2\u0ca1\u0ca2\3\2\2\2\u0ca2\u0d6b\3\2"+
		"\2\2\u0ca3\u0ca1\3\2\2\2\u0ca4\u0ca9\7\7\2\2\u0ca5\u0ca7\7c\2\2\u0ca6"+
		"\u0ca8\5:\36\2\u0ca7\u0ca6\3\2\2\2\u0ca7\u0ca8\3\2\2\2\u0ca8\u0caa\3\2"+
		"\2\2\u0ca9\u0ca5\3\2\2\2\u0ca9\u0caa\3\2\2\2\u0caa\u0cab\3\2\2\2\u0cab"+
		"\u0cac\7\u00e0\2\2\u0cac\u0cae\7\u0129\2\2\u0cad\u0caf\5\64\33\2\u0cae"+
		"\u0cad\3\2\2\2\u0cae\u0caf\3\2\2\2\u0caf\u0cb0\3\2\2\2\u0cb0\u0cb1\7\u02d5"+
		"\2\2\u0cb1\u0cb2\5\u0152\u00aa\2\u0cb2\u0cb3\7\u02d4\2\2\u0cb3\u0cb4\5"+
		"\u013e\u00a0\2\u0cb4\u0d6b\3\2\2\2\u0cb5\u0cb7\7\17\2\2\u0cb6\u0cb8\7"+
		"\u02c7\2\2\u0cb7\u0cb6\3\2\2\2\u0cb7\u0cb8\3\2\2\2\u0cb8\u0cb9\3\2\2\2"+
		"\u0cb9\u0d6b\t&\2\2\u0cba\u0cbc\7\21\2\2\u0cbb\u0cbd\7S\2\2\u0cbc\u0cbb"+
		"\3\2\2\2\u0cbc\u0cbd\3\2\2\2\u0cbd\u0cbe\3\2\2\2\u0cbe\u0cc4\5.\30\2\u0cbf"+
		"\u0cc0\7\u021a\2\2\u0cc0\u0cc1\7\u0099\2\2\u0cc1\u0cc5\5\32\16\2\u0cc2"+
		"\u0cc3\7\u00ac\2\2\u0cc3\u0cc5\7\u0099\2\2\u0cc4\u0cbf\3\2\2\2\u0cc4\u0cc2"+
		"\3\2\2\2\u0cc5\u0d6b\3\2\2\2\u0cc6\u0cc8\7B\2\2\u0cc7\u0cc9\7S\2\2\u0cc8"+
		"\u0cc7\3\2\2\2\u0cc8\u0cc9\3\2\2\2\u0cc9\u0cca\3\2\2\2\u0cca\u0ccb\5."+
		"\30\2\u0ccb\u0ccc\5.\30\2\u0ccc\u0cd0\5\u0136\u009c\2\u0ccd\u0cd1\7\u00d9"+
		"\2\2\u0cce\u0ccf\7\f\2\2\u0ccf\u0cd1\5.\30\2\u0cd0\u0ccd\3\2\2\2\u0cd0"+
		"\u0cce\3\2\2\2\u0cd0\u0cd1\3\2\2\2\u0cd1\u0d6b\3\2\2\2\u0cd2\u0cd4\7\u014b"+
		"\2\2\u0cd3\u0cd5\7\u02c7\2\2\u0cd4\u0cd3\3\2\2\2\u0cd4\u0cd5\3\2\2\2\u0cd5"+
		"\u0cd6\3\2\2\2\u0cd6\u0d6b\t\'\2\2\u0cd7\u0cd9\7\u018b\2\2\u0cd8\u0cda"+
		"\7S\2\2\u0cd9\u0cd8\3\2\2\2\u0cd9\u0cda\3\2\2\2\u0cda\u0cdb\3\2\2\2\u0cdb"+
		"\u0cdc\5.\30\2\u0cdc\u0ce0\5\u0136\u009c\2\u0cdd\u0ce1\7\u00d9\2\2\u0cde"+
		"\u0cdf\7\f\2\2\u0cdf\u0ce1\5.\30\2\u0ce0\u0cdd\3\2\2\2\u0ce0\u0cde\3\2"+
		"\2\2\u0ce0\u0ce1\3\2\2\2\u0ce1\u0d6b\3\2\2\2\u0ce2\u0ce4\7\u00ac\2\2\u0ce3"+
		"\u0ce5\7S\2\2\u0ce4\u0ce3\3\2\2\2\u0ce4\u0ce5\3\2\2\2\u0ce5\u0ce6\3\2"+
		"\2\2\u0ce6\u0d6b\5.\30\2\u0ce7\u0ce8\7\u00ac\2\2\u0ce8\u0ce9\7\u01ce\2"+
		"\2\u0ce9\u0d6b\7\u0129\2\2\u0cea\u0ceb\7\u00ac\2\2\u0ceb\u0cec\t\26\2"+
		"\2\u0cec\u0d6b\5\64\33\2\u0ced\u0cee\7\u00ac\2\2\u0cee\u0cef\7\u00e0\2"+
		"\2\u0cef\u0cf0\7\u0129\2\2\u0cf0\u0d6b\5<\37\2\u0cf1\u0cf2\7\u00a5\2\2"+
		"\u0cf2\u0d6b\7\u012b\2\2\u0cf3\u0cf4\7\u00b5\2\2\u0cf4\u0d6b\7\u012b\2"+
		"\2\u0cf5\u0cf7\7\u01ef\2\2\u0cf6\u0cf8\t\60\2\2\u0cf7\u0cf6\3\2\2\2\u0cf7"+
		"\u0cf8\3\2\2\2\u0cf8\u0cf9\3\2\2\2\u0cf9\u0d6b\5*\26\2\u0cfa\u0cfb\7\u01b1"+
		"\2\2\u0cfb\u0cfc\7\67\2\2\u0cfc\u0d01\5.\30\2\u0cfd\u0cfe\7\u02d2\2\2"+
		"\u0cfe\u0d00\5.\30\2\u0cff\u0cfd\3\2\2\2\u0d00\u0d03\3\2\2\2\u0d01\u0cff"+
		"\3\2\2\2\u0d01\u0d02\3\2\2\2\u0d02\u0d6b\3\2\2\2\u0d03\u0d01\3\2\2\2\u0d04"+
		"\u0d05\7i\2\2\u0d05\u0d06\7\u0274\2\2\u0d06\u0d07\7F\2\2\u0d07\u0d08\7"+
		"\u021a\2\2\u0d08\u0d0b\5\4\3\2\u0d09\u0d0a\7P\2\2\u0d0a\u0d0c\5> \2\u0d0b"+
		"\u0d09\3\2\2\2\u0d0b\u0d0c\3\2\2\2\u0d0c\u0d6b\3\2\2\2\u0d0d\u0d0f\7\u0099"+
		"\2\2\u0d0e\u0d0d\3\2\2\2\u0d0e\u0d0f\3\2\2\2\u0d0f\u0d10\3\2\2\2\u0d10"+
		"\u0d11\7F\2\2\u0d11\u0d13\7\u021a\2\2\u0d12\u0d14\7\u02c7\2\2\u0d13\u0d12"+
		"\3\2\2\2\u0d13\u0d14\3\2\2\2\u0d14\u0d15\3\2\2\2\u0d15\u0d1b\5\4\3\2\u0d16"+
		"\u0d18\7P\2\2\u0d17\u0d19\7\u02c7\2\2\u0d18\u0d17\3\2\2\2\u0d18\u0d19"+
		"\3\2\2\2\u0d19\u0d1a\3\2\2\2\u0d1a\u0d1c\5> \2\u0d1b\u0d16\3\2\2\2\u0d1b"+
		"\u0d1c\3\2\2\2\u0d1c\u0d6b\3\2\2\2\u0d1d\u0d1e\7\u00a6\2\2\u0d1e\u0d6b"+
		"\7\u025e\2\2\u0d1f\u0d20\7\u010a\2\2\u0d20\u0d6b\7\u025e\2\2\u0d21\u0d6b"+
		"\7\u00df\2\2\u0d22\u0d23\7\7\2\2\u0d23\u0d24\7\u01bb\2\2\u0d24\u0d25\7"+
		"\u02d5\2\2\u0d25\u0d26\5\u0148\u00a5\2\u0d26\u0d27\7\u02d4\2\2\u0d27\u0d6b"+
		"\3\2\2\2\u0d28\u0d29\7\u00ac\2\2\u0d29\u0d2a\7\u01bb\2\2\u0d2a\u0d6b\5"+
		"\u0098M\2\u0d2b\u0d2c\7\u027c\2\2\u0d2c\u0d2f\7\u01bb\2\2\u0d2d\u0d30"+
		"\5\u0098M\2\u0d2e\u0d30\7\20\2\2\u0d2f\u0d2d\3\2\2\2\u0d2f\u0d2e\3\2\2"+
		"\2\u0d30\u0d6b\3\2\2\2\u0d31\u0d32\7M\2\2\u0d32\u0d33\7\u01bb\2\2\u0d33"+
		"\u0d6b\7\u02e0\2\2\u0d34\u0d35\7\u01f0\2\2\u0d35\u0d36\7\u01bb\2\2\u0d36"+
		"\u0d37\5\u0098M\2\u0d37\u0d38\7\u011d\2\2\u0d38\u0d39\7\u02d5\2\2\u0d39"+
		"\u0d3e\5\u0148\u00a5\2\u0d3a\u0d3b\7\u02d2\2\2\u0d3b\u0d3d\5\u0148\u00a5"+
		"\2\u0d3c\u0d3a\3\2\2\2\u0d3d\u0d40\3\2\2\2\u0d3e\u0d3c\3\2\2\2\u0d3e\u0d3f"+
		"\3\2\2\2\u0d3f\u0d41\3\2\2\2\u0d40\u0d3e\3\2\2\2\u0d41\u0d42\7\u02d4\2"+
		"\2\u0d42\u0d6b\3\2\2\2\u0d43\u0d44\7\u00c6\2\2\u0d44\u0d45\7\u01bb\2\2"+
		"\u0d45\u0d46\5\66\34\2\u0d46\u0d47\7\u02b6\2\2\u0d47\u0d48\7\u025b\2\2"+
		"\u0d48\u0d49\5*\26\2\u0d49\u0d6b\3\2\2\2\u0d4a\u0d4b\7\22\2\2\u0d4b\u0d4e"+
		"\7\u01bb\2\2\u0d4c\u0d4f\5\u0098M\2\u0d4d\u0d4f\7\20\2\2\u0d4e\u0d4c\3"+
		"\2\2\2\u0d4e\u0d4d\3\2\2\2\u0d4f\u0d6b\3\2\2\2\u0d50\u0d51\7H\2\2\u0d51"+
		"\u0d54\7\u01bb\2\2\u0d52\u0d55\5\u0098M\2\u0d53\u0d55\7\20\2\2\u0d54\u0d52"+
		"\3\2\2\2\u0d54\u0d53\3\2\2\2\u0d55\u0d6b\3\2\2\2\u0d56\u0d57\7\u01ac\2"+
		"\2\u0d57\u0d5a\7\u01bb\2\2\u0d58\u0d5b\5\u0098M\2\u0d59\u0d5b\7\20\2\2"+
		"\u0d5a\u0d58\3\2\2\2\u0d5a\u0d59\3\2\2\2\u0d5b\u0d6b\3\2\2\2\u0d5c\u0d5d"+
		"\7\u01e2\2\2\u0d5d\u0d60\7\u01bb\2\2\u0d5e\u0d61\5\u0098M\2\u0d5f\u0d61"+
		"\7\20\2\2\u0d60\u0d5e\3\2\2\2\u0d60\u0d5f\3\2\2\2\u0d61\u0d6b\3\2\2\2"+
		"\u0d62\u0d63\7\u01f1\2\2\u0d63\u0d66\7\u01bb\2\2\u0d64\u0d67\5\u0098M"+
		"\2\u0d65\u0d67\7\20\2\2\u0d66\u0d64\3\2\2\2\u0d66\u0d65\3\2\2\2\u0d67"+
		"\u0d6b\3\2\2\2\u0d68\u0d69\7\u01ee\2\2\u0d69\u0d6b\7\u01bc\2\2\u0d6a\u0c28"+
		"\3\2\2\2\u0d6a\u0c29\3\2\2\2\u0d6a\u0c33\3\2\2\2\u0d6a\u0c3b\3\2\2\2\u0d6a"+
		"\u0c4c\3\2\2\2\u0d6a\u0c61\3\2\2\2\u0d6a\u0c82\3\2\2\2\u0d6a\u0c93\3\2"+
		"\2\2\u0d6a\u0ca4\3\2\2\2\u0d6a\u0cb5\3\2\2\2\u0d6a\u0cba\3\2\2\2\u0d6a"+
		"\u0cc6\3\2\2\2\u0d6a\u0cd2\3\2\2\2\u0d6a\u0cd7\3\2\2\2\u0d6a\u0ce2\3\2"+
		"\2\2\u0d6a\u0ce7\3\2\2\2\u0d6a\u0cea\3\2\2\2\u0d6a\u0ced\3\2\2\2\u0d6a"+
		"\u0cf1\3\2\2\2\u0d6a\u0cf3\3\2\2\2\u0d6a\u0cf5\3\2\2\2\u0d6a\u0cfa\3\2"+
		"\2\2\u0d6a\u0d04\3\2\2\2\u0d6a\u0d0e\3\2\2\2\u0d6a\u0d1d\3\2\2\2\u0d6a"+
		"\u0d1f\3\2\2\2\u0d6a\u0d21\3\2\2\2\u0d6a\u0d22\3\2\2\2\u0d6a\u0d28\3\2"+
		"\2\2\u0d6a\u0d2b\3\2\2\2\u0d6a\u0d31\3\2\2\2\u0d6a\u0d34\3\2\2\2\u0d6a"+
		"\u0d43\3\2\2\2\u0d6a\u0d4a\3\2\2\2\u0d6a\u0d50\3\2\2\2\u0d6a\u0d56\3\2"+
		"\2\2\u0d6a\u0d5c\3\2\2\2\u0d6a\u0d62\3\2\2\2\u0d6a\u0d68\3\2\2\2\u0d6b"+
		"\u0151\3\2\2\2\u0d6c\u0d71\5\u013c\u009f\2\u0d6d\u0d6e\7\u02d2\2\2\u0d6e"+
		"\u0d70\5\u013c\u009f\2\u0d6f\u0d6d\3\2\2\2\u0d70\u0d73\3\2\2\2\u0d71\u0d6f"+
		"\3\2\2\2\u0d71\u0d72\3\2\2\2\u0d72\u0153\3\2\2\2\u0d73\u0d71\3\2\2\2\u0d74"+
		"\u0d75\7\u0299\2\2\u0d75\u0d76\t\61\2\2\u0d76\u0155\3\2\2\2\u0d77\u0d79"+
		"\7\u0128\2\2\u0d78\u0d7a\7\u02c7\2\2\u0d79\u0d78\3\2\2\2\u0d79\u0d7a\3"+
		"\2\2\2\u0d7a\u0d7b\3\2\2\2\u0d7b\u0d83\7\u02e0\2\2\u0d7c\u0d83\5\u0154"+
		"\u00ab\2\u0d7d\u0d7e\7\u02b6\2\2\u0d7e\u0d7f\7\u01b9\2\2\u0d7f\u0d83\5"+
		"\62\32\2\u0d80\u0d81\7U\2\2\u0d81\u0d83\7\u02e4\2\2\u0d82\u0d77\3\2\2"+
		"\2\u0d82\u0d7c\3\2\2\2\u0d82\u0d7d\3\2\2\2\u0d82\u0d80\3\2\2\2\u0d83\u0157"+
		"\3\2\2\2\u0d84\u0d85\5.\30\2\u0d85\u0d8c\5\u0136\u009c\2\u0d86\u0d87\7"+
		"\u02d2\2\2\u0d87\u0d88\5.\30\2\u0d88\u0d89\5\u0136\u009c\2\u0d89\u0d8b"+
		"\3\2\2\2\u0d8a\u0d86\3\2\2\2\u0d8b\u0d8e\3\2\2\2\u0d8c\u0d8a\3\2\2\2\u0d8c"+
		"\u0d8d\3\2\2\2\u0d8d\u0159\3\2\2\2\u0d8e\u0d8c\3\2\2\2\u0d8f\u0d90\7\u01ef"+
		"\2\2\u0d90\u0d91\7\u025b\2\2\u0d91\u0d92\5*\26\2\u0d92\u0d93\7\u0274\2"+
		"\2\u0d93\u0d9b\5*\26\2\u0d94\u0d95\7\u02d2\2\2\u0d95\u0d96\5*\26\2\u0d96"+
		"\u0d97\7\u0274\2\2\u0d97\u0d98\5*\26\2\u0d98\u0d9a\3\2\2\2\u0d99\u0d94"+
		"\3\2\2\2\u0d9a\u0d9d\3\2\2\2\u0d9b\u0d99\3\2\2\2\u0d9b\u0d9c\3\2\2\2\u0d9c"+
		"\u015b\3\2\2\2\u0d9d\u0d9b\3\2\2\2\u0d9e\u0da0\7\u00ac\2\2\u0d9f\u0da1"+
		"\7\u0260\2\2\u0da0\u0d9f\3\2\2\2\u0da0\u0da1\3\2\2\2\u0da1\u0da2\3\2\2"+
		"\2\u0da2\u0da5\7\u025b\2\2\u0da3\u0da4\7\u0107\2\2\u0da4\u0da6\7\u00c9"+
		"\2\2\u0da5\u0da3\3\2\2\2\u0da5\u0da6\3\2\2\2\u0da6\u0da7\3\2\2\2\u0da7"+
		"\u0dac\5*\26\2\u0da8\u0da9\7\u02d2\2\2\u0da9\u0dab\5*\26\2\u0daa\u0da8"+
		"\3\2\2\2\u0dab\u0dae\3\2\2\2\u0dac\u0daa\3\2\2\2\u0dac\u0dad\3\2\2\2\u0dad"+
		"\u0db0\3\2\2\2\u0dae\u0dac\3\2\2\2\u0daf\u0db1\t\62\2\2\u0db0\u0daf\3"+
		"\2\2\2\u0db0\u0db1\3\2\2\2\u0db1\u015d\3\2\2\2\u0db2\u0db4\7\u027c\2\2"+
		"\u0db3\u0db5\7\u025b\2\2\u0db4\u0db3\3\2\2\2\u0db4\u0db5\3\2\2\2\u0db5"+
		"\u0db6\3\2\2\2\u0db6\u0db7\5*\26\2\u0db7\u015f\3\2\2\2\u0db8\u0dbb\7y"+
		"\2\2\u0db9\u0dba\7\u02c4\2\2\u0dba\u0dbc\7\u01f4\2\2\u0dbb\u0db9\3\2\2"+
		"\2\u0dbb\u0dbc\3\2\2\2\u0dbc\u0dbd\3\2\2\2\u0dbd\u0dbe\5\u0162\u00b2\2"+
		"\u0dbe\u0161\3\2\2\2\u0dbf\u0dc0\7\17\2\2\u0dc0\u0dc1\7\u02c7\2\2\u0dc1"+
		"\u0dc3\t\63\2\2\u0dc2\u0dbf\3\2\2\2\u0dc2\u0dc3\3\2\2\2\u0dc3\u0dca\3"+
		"\2\2\2\u0dc4\u0dc5\7\u009a\2\2\u0dc5\u0dc8\7\u02c7\2\2\u0dc6\u0dc9\5B"+
		"\"\2\u0dc7\u0dc9\7\177\2\2\u0dc8\u0dc6\3\2\2\2\u0dc8\u0dc7\3\2\2\2\u0dc9"+
		"\u0dcb\3\2\2\2\u0dca\u0dc4\3\2\2\2\u0dca\u0dcb\3\2\2\2\u0dcb\u0dcf\3\2"+
		"\2\2\u0dcc\u0dcd\7\u0236\2\2\u0dcd\u0dce\7\u0211\2\2\u0dce\u0dd0\t\64"+
		"\2\2\u0dcf\u0dcc\3\2\2\2\u0dcf\u0dd0\3\2\2\2\u0dd0\u0dd1\3\2\2\2\u0dd1"+
		"\u0dd2\7\u02ac\2\2\u0dd2\u0dd7\5\60\31\2\u0dd3\u0dd4\7\u02d5\2\2\u0dd4"+
		"\u0dd5\5\u00b8]\2\u0dd5\u0dd6\7\u02d4\2\2\u0dd6\u0dd8\3\2\2\2\u0dd7\u0dd3"+
		"\3\2\2\2\u0dd7\u0dd8\3\2\2\2\u0dd8\u0dd9\3\2\2\2\u0dd9\u0dda\7\25\2\2"+
		"\u0dda\u0de1\5\u00a0Q\2\u0ddb\u0ddd\7\u02b6\2\2\u0ddc\u0dde\t\65\2\2\u0ddd"+
		"\u0ddc\3\2\2\2\u0ddd\u0dde\3\2\2\2\u0dde\u0ddf\3\2\2\2\u0ddf\u0de0\7H"+
		"\2\2\u0de0\u0de2\7\u01ad\2\2\u0de1\u0ddb\3\2\2\2\u0de1\u0de2\3\2\2\2\u0de2"+
		"\u0163\3\2\2\2\u0de3\u0de4\7\21\2\2\u0de4\u0de5\5\u0162\u00b2\2\u0de5"+
		"\u0165\3\2\2\2\u0de6\u0de7\7\u00ac\2\2\u0de7\u0dea\7\u02ac\2\2\u0de8\u0de9"+
		"\7\u0107\2\2\u0de9\u0deb\7\u00c9\2\2\u0dea\u0de8\3\2\2\2\u0dea\u0deb\3"+
		"\2\2\2\u0deb\u0dec\3\2\2\2\u0dec\u0df1\5\60\31\2\u0ded\u0dee\7\u02d2\2"+
		"\2\u0dee\u0df0\5\60\31\2\u0def\u0ded\3\2\2\2\u0df0\u0df3\3\2\2\2\u0df1"+
		"\u0def\3\2\2\2\u0df1\u0df2\3\2\2\2\u0df2\u0df5\3\2\2\2\u0df3\u0df1\3\2"+
		"\2\2\u0df4\u0df6\t\62\2\2\u0df5\u0df4\3\2\2\2\u0df5\u0df6\3\2\2\2\u0df6"+
		"\u0167\3\2\2\2\u023e\u016e\u0172\u017a\u017c\u0180\u0185\u0187\u019a\u01a5"+
		"\u01b5\u01bb\u0210\u021b\u0223\u022b\u022f\u0236\u023a\u023c\u0245\u024a"+
		"\u024f\u0253\u0258\u025c\u026a\u0270\u0274\u027a\u027f\u0284\u0289\u028e"+
		"\u0293\u0298\u029d\u02a2\u02b1\u02ba\u02bd\u02c0\u02da\u02df\u02e3\u02ed"+
		"\u02f1\u02fe\u0302\u030c\u0312\u0317\u031c\u0326\u0334\u0339\u033d\u0342"+
		"\u0344\u034b\u034d\u0352\u0358\u035e\u0360\u0364\u0368\u036b\u036e\u0380"+
		"\u0386\u038d\u0397\u0399\u039f\u03af\u03b6\u03c3\u03c8\u03cc\u03cf\u03db"+
		"\u03f0\u03f5\u03fa\u03ff\u0402\u0405\u0408\u040b\u040e\u0411\u0414\u041a"+
		"\u041d\u0420\u0423\u0425\u0428\u042b\u0433\u043f\u0444\u0449\u0455\u045a"+
		"\u0460\u0467\u0472\u0476\u047e\u048a\u0494\u0498\u049a\u049e\u04a1\u04a4"+
		"\u04a9\u04ae\u04b1\u04b4\u04b7\u04bb\u04c0\u04c4\u04ca\u04cf\u04d4\u04d8"+
		"\u04de\u04e3\u04e7\u04ea\u04ed\u04f1\u0501\u0506\u050a\u0512\u0518\u051d"+
		"\u0521\u0529\u0531\u0538\u053c\u0540\u0544\u0548\u054b\u0550\u0553\u0556"+
		"\u055a\u055d\u0562\u056c\u056f\u0572\u057a\u0584\u0588\u0593\u0598\u059b"+
		"\u05a1\u05a4\u05a9\u05ac\u05b3\u05b6\u05bb\u05c1\u05c6\u05cc\u05cf\u05d4"+
		"\u05d9\u05db\u05e1\u05e6\u05e8\u05ed\u05f2\u05f7\u05fb\u05ff\u0602\u0607"+
		"\u060a\u060f\u0615\u061a\u0620\u0625\u062a\u062f\u0633\u0637\u063a\u0640"+
		"\u0644\u0647\u064b\u064e\u0655\u065e\u0666\u066b\u066f\u0674\u0679\u067c"+
		"\u0680\u0685\u0692\u0697\u069b\u069f\u06a2\u06a8\u06b1\u06b3\u06b9\u06c2"+
		"\u06c5\u06cc\u06d0\u06db\u06e8\u06eb\u06f4\u06f7\u06f9\u0705\u0707\u070e"+
		"\u0713\u0716\u071b\u0722\u0726\u0729\u072f\u0735\u073a\u0744\u074a\u074c"+
		"\u0751\u0757\u0762\u0764\u0775\u0789\u0795\u07a1\u07a8\u07ac\u07b2\u07bb"+
		"\u07c0\u07c3\u07c6\u07ca\u07d0\u07d4\u07d7\u07dd\u07e3\u07ed\u07f4\u07f6"+
		"\u07fb\u0803\u080a\u080f\u0812\u081a\u0821\u0826\u0828\u082c\u082f\u0832"+
		"\u083a\u0841\u0846\u0849\u0851\u0858\u085d\u085f\u0864\u086c\u0877\u087b"+
		"\u087f\u0883\u0885\u0889\u088d\u0890\u0895\u089c\u089f\u08a3\u08aa\u08ad"+
		"\u08b0\u08b3\u08b7\u08be\u08c1\u08c4\u08c7\u08cb\u08d2\u08d5\u08d8\u08db"+
		"\u08df\u08e6\u08e9\u08ec\u08ef\u08f3\u08fa\u08fd\u0900\u0903\u0907\u090e"+
		"\u0911\u0914\u0917\u091b\u0924\u0927\u092a\u092d\u0931\u093a\u093d\u0940"+
		"\u0943\u0947\u0950\u0953\u0956\u0959\u095d\u0964\u0968\u096b\u096e\u0971"+
		"\u0975\u097c\u0980\u0983\u0986\u0989\u098d\u0991\u0995\u0999\u099d\u09a1"+
		"\u09a5\u09a9\u09ad\u09b1\u09b5\u09bc\u09c1\u09c5\u09c8\u09cc\u09d5\u09d9"+
		"\u09dc\u09e0\u09e7\u09ea\u09ee\u09f5\u09f9\u09fd\u0a01\u0a05\u0a09\u0a0d"+
		"\u0a12\u0a16\u0a19\u0a1d\u0a22\u0a26\u0a29\u0a2d\u0a32\u0a36\u0a39\u0a3d"+
		"\u0a42\u0a46\u0a49\u0a52\u0a59\u0a5d\u0a60\u0a64\u0a6d\u0a74\u0a78\u0a7b"+
		"\u0a7f\u0a81\u0a87\u0a8a\u0a94\u0a9e\u0aa3\u0aa8\u0ab0\u0ab4\u0ab9\u0abe"+
		"\u0ac3\u0ac8\u0acc\u0ad1\u0ad6\u0ada\u0ade\u0ae3\u0ae8\u0aee\u0af3\u0af9"+
		"\u0afe\u0b03\u0b08\u0b0d\u0b12\u0b17\u0b1c\u0b21\u0b26\u0b2b\u0b33\u0b38"+
		"\u0b3d\u0b45\u0b56\u0b62\u0b64\u0b68\u0b6d\u0b75\u0b7c\u0b80\u0b82\u0b8a"+
		"\u0b8f\u0b9b\u0ba2\u0ba4\u0ba7\u0bab\u0bae\u0bb2\u0bb5\u0bba\u0bbd\u0bc2"+
		"\u0bc5\u0bc9\u0bcc\u0bd0\u0bd3\u0bdb\u0be0\u0be5\u0be9\u0bec\u0bf0\u0bf3"+
		"\u0bf8\u0bfb\u0c00\u0c03\u0c07\u0c0a\u0c0e\u0c11\u0c17\u0c20\u0c23\u0c26"+
		"\u0c2b\u0c31\u0c35\u0c3e\u0c41\u0c49\u0c4f\u0c51\u0c56\u0c5e\u0c64\u0c66"+
		"\u0c6a\u0c6d\u0c70\u0c78\u0c7f\u0c85\u0c88\u0c90\u0c96\u0c99\u0ca1\u0ca7"+
		"\u0ca9\u0cae\u0cb7\u0cbc\u0cc4\u0cc8\u0cd0\u0cd4\u0cd9\u0ce0\u0ce4\u0cf7"+
		"\u0d01\u0d0b\u0d0e\u0d13\u0d18\u0d1b\u0d2f\u0d3e\u0d4e\u0d54\u0d5a\u0d60"+
		"\u0d66\u0d6a\u0d71\u0d79\u0d82\u0d8c\u0d9b\u0da0\u0da5\u0dac\u0db0\u0db4"+
		"\u0dbb\u0dc2\u0dc8\u0dca\u0dcf\u0dd7\u0ddd\u0de1\u0dea\u0df1\u0df5";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}