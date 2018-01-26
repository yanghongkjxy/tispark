/*
 *
 * Copyright 2017 PingCAP, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.spark.sql

import org.apache.spark.sql.test.SharedSQLContext

class CartesianTypeTestCases0Suite
  extends BaseTiSparkSuite
  with SharedSQLContext {
           

  test("select id_dt,tp_smallint from full_data_type_table  where id_dt = tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_smallint from full_data_type_table  where id_dt = tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_smallint from full_data_type_table_j  where id_dt = tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_bigint from full_data_type_table  where id_dt = tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_bigint from full_data_type_table  where id_dt = tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_bigint from full_data_type_table_j  where id_dt = tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_decimal from full_data_type_table  where tp_text = tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_decimal from full_data_type_table  where tp_text = tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_decimal from full_data_type_table_j  where tp_text = tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_tinyint from full_data_type_table  where tp_decimal = tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_tinyint from full_data_type_table  where tp_decimal = tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_tinyint from full_data_type_table_j  where tp_decimal = tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_tinyint from full_data_type_table  where tp_int = tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_tinyint from full_data_type_table  where tp_int = tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_tinyint from full_data_type_table_j  where tp_int = tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_smallint from full_data_type_table  where tp_int = tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_smallint from full_data_type_table  where tp_int = tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_smallint from full_data_type_table_j  where tp_int = tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_text from full_data_type_table  where tp_mediumint = tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_text from full_data_type_table  where tp_mediumint = tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_text from full_data_type_table_j  where tp_mediumint = tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,id_dt from full_data_type_table  where tp_smallint = id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,id_dt from full_data_type_table  where tp_smallint = id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,id_dt from full_data_type_table_j  where tp_smallint = id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_nvarchar,tp_nvarchar from full_data_type_table  where tp_nvarchar = tp_nvarchar order by id_dt  limit 20") {
    val r1 = querySpark("select tp_nvarchar,tp_nvarchar from full_data_type_table  where tp_nvarchar = tp_nvarchar order by id_dt  limit 20")
    val r2 = querySpark("select tp_nvarchar,tp_nvarchar from full_data_type_table_j  where tp_nvarchar = tp_nvarchar order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_bigint from full_data_type_table  where tp_text = tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_bigint from full_data_type_table  where tp_text = tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_bigint from full_data_type_table_j  where tp_text = tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_text from full_data_type_table  where tp_text = tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_text from full_data_type_table  where tp_text = tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_text from full_data_type_table_j  where tp_text = tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_double from full_data_type_table  where tp_double = tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_double from full_data_type_table  where tp_double = tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_double from full_data_type_table_j  where tp_double = tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_timestamp,tp_datetime from full_data_type_table  where tp_timestamp = tp_datetime order by id_dt  limit 20") {
    val r1 = querySpark("select tp_timestamp,tp_datetime from full_data_type_table  where tp_timestamp = tp_datetime order by id_dt  limit 20")
    val r2 = querySpark("select tp_timestamp,tp_datetime from full_data_type_table_j  where tp_timestamp = tp_datetime order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_tinytext from full_data_type_table  where tp_tinytext = tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_tinytext from full_data_type_table  where tp_tinytext = tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_tinytext from full_data_type_table_j  where tp_tinytext = tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_int from full_data_type_table  where tp_float = tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_int from full_data_type_table  where tp_float = tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_int from full_data_type_table_j  where tp_float = tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_decimal from full_data_type_table  where tp_decimal = tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_decimal from full_data_type_table  where tp_decimal = tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_decimal from full_data_type_table_j  where tp_decimal = tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_smallint from full_data_type_table  where tp_decimal = tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_smallint from full_data_type_table  where tp_decimal = tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_smallint from full_data_type_table_j  where tp_decimal = tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_date from full_data_type_table  where tp_tinytext = tp_date order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_date from full_data_type_table  where tp_tinytext = tp_date order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_date from full_data_type_table_j  where tp_tinytext = tp_date order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_float from full_data_type_table  where tp_smallint = tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_float from full_data_type_table  where tp_smallint = tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_float from full_data_type_table_j  where tp_smallint = tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,id_dt from full_data_type_table  where tp_real = id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,id_dt from full_data_type_table  where tp_real = id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,id_dt from full_data_type_table_j  where tp_real = id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_text from full_data_type_table  where tp_bigint = tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_text from full_data_type_table  where tp_bigint = tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_text from full_data_type_table_j  where tp_bigint = tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_tinytext from full_data_type_table  where tp_mediumint = tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_tinytext from full_data_type_table  where tp_mediumint = tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_tinytext from full_data_type_table_j  where tp_mediumint = tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_date,tp_datetime from full_data_type_table  where tp_date = tp_datetime order by id_dt  limit 20") {
    val r1 = querySpark("select tp_date,tp_datetime from full_data_type_table  where tp_date = tp_datetime order by id_dt  limit 20")
    val r2 = querySpark("select tp_date,tp_datetime from full_data_type_table_j  where tp_date = tp_datetime order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_timestamp from full_data_type_table  where tp_text = tp_timestamp order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_timestamp from full_data_type_table  where tp_text = tp_timestamp order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_timestamp from full_data_type_table_j  where tp_text = tp_timestamp order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_mediumint from full_data_type_table  where tp_smallint = tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_mediumint from full_data_type_table  where tp_smallint = tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_mediumint from full_data_type_table_j  where tp_smallint = tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_binary,tp_blob from full_data_type_table  where tp_binary = tp_blob order by id_dt  limit 20") {
    val r1 = querySpark("select tp_binary,tp_blob from full_data_type_table  where tp_binary = tp_blob order by id_dt  limit 20")
    val r2 = querySpark("select tp_binary,tp_blob from full_data_type_table_j  where tp_binary = tp_blob order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_tinytext from full_data_type_table  where tp_text = tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_tinytext from full_data_type_table  where tp_text = tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_tinytext from full_data_type_table_j  where tp_text = tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_real from full_data_type_table  where tp_decimal = tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_real from full_data_type_table  where tp_decimal = tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_real from full_data_type_table_j  where tp_decimal = tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_int from full_data_type_table  where id_dt = tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_int from full_data_type_table  where id_dt = tp_int order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_int from full_data_type_table_j  where id_dt = tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_bigint from full_data_type_table  where tp_mediumint = tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_bigint from full_data_type_table  where tp_mediumint = tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_bigint from full_data_type_table_j  where tp_mediumint = tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_timestamp,tp_text from full_data_type_table  where tp_timestamp = tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_timestamp,tp_text from full_data_type_table  where tp_timestamp = tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_timestamp,tp_text from full_data_type_table_j  where tp_timestamp = tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_mediumint from full_data_type_table  where tp_real = tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_mediumint from full_data_type_table  where tp_real = tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_mediumint from full_data_type_table_j  where tp_real = tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_bigint from full_data_type_table  where tp_tinyint = tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_bigint from full_data_type_table  where tp_tinyint = tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_bigint from full_data_type_table_j  where tp_tinyint = tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_tinytext from full_data_type_table  where tp_bigint = tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_tinytext from full_data_type_table  where tp_bigint = tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_tinytext from full_data_type_table_j  where tp_bigint = tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_text from full_data_type_table  where tp_double = tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_text from full_data_type_table  where tp_double = tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_text from full_data_type_table_j  where tp_double = tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_float from full_data_type_table  where tp_mediumint = tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_float from full_data_type_table  where tp_mediumint = tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_float from full_data_type_table_j  where tp_mediumint = tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_real from full_data_type_table  where tp_float = tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_real from full_data_type_table  where tp_float = tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_real from full_data_type_table_j  where tp_float = tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_blob,tp_blob from full_data_type_table  where tp_blob = tp_blob order by id_dt  limit 20") {
    val r1 = querySpark("select tp_blob,tp_blob from full_data_type_table  where tp_blob = tp_blob order by id_dt  limit 20")
    val r2 = querySpark("select tp_blob,tp_blob from full_data_type_table_j  where tp_blob = tp_blob order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_decimal from full_data_type_table  where tp_smallint = tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_decimal from full_data_type_table  where tp_smallint = tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_decimal from full_data_type_table_j  where tp_smallint = tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_real from full_data_type_table  where tp_real = tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_real from full_data_type_table  where tp_real = tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_real from full_data_type_table_j  where tp_real = tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_decimal from full_data_type_table  where tp_bigint = tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_decimal from full_data_type_table  where tp_bigint = tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_decimal from full_data_type_table_j  where tp_bigint = tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_tinytext from full_data_type_table  where tp_double = tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_tinytext from full_data_type_table  where tp_double = tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_tinytext from full_data_type_table_j  where tp_double = tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_int from full_data_type_table  where tp_text = tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_int from full_data_type_table  where tp_text = tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_int from full_data_type_table_j  where tp_text = tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_text from full_data_type_table  where tp_int = tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_text from full_data_type_table  where tp_int = tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_text from full_data_type_table_j  where tp_int = tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_blob,tp_binary from full_data_type_table  where tp_blob = tp_binary order by id_dt  limit 20") {
    val r1 = querySpark("select tp_blob,tp_binary from full_data_type_table  where tp_blob = tp_binary order by id_dt  limit 20")
    val r2 = querySpark("select tp_blob,tp_binary from full_data_type_table_j  where tp_blob = tp_binary order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_mediumint from full_data_type_table  where tp_decimal = tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_mediumint from full_data_type_table  where tp_decimal = tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_mediumint from full_data_type_table_j  where tp_decimal = tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_float from full_data_type_table  where tp_tinyint = tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_float from full_data_type_table  where tp_tinyint = tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_float from full_data_type_table_j  where tp_tinyint = tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_smallint from full_data_type_table  where tp_bigint = tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_smallint from full_data_type_table  where tp_bigint = tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_smallint from full_data_type_table_j  where tp_bigint = tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_tinyint from full_data_type_table  where tp_real = tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_tinyint from full_data_type_table  where tp_real = tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_tinyint from full_data_type_table_j  where tp_real = tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_int from full_data_type_table  where tp_double = tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_int from full_data_type_table  where tp_double = tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_int from full_data_type_table_j  where tp_double = tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,id_dt from full_data_type_table  where id_dt = id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,id_dt from full_data_type_table  where id_dt = id_dt order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,id_dt from full_data_type_table_j  where id_dt = id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_double from full_data_type_table  where tp_tinyint = tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_double from full_data_type_table  where tp_tinyint = tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_double from full_data_type_table_j  where tp_tinyint = tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_timestamp,tp_timestamp from full_data_type_table  where tp_timestamp = tp_timestamp order by id_dt  limit 20") {
    val r1 = querySpark("select tp_timestamp,tp_timestamp from full_data_type_table  where tp_timestamp = tp_timestamp order by id_dt  limit 20")
    val r2 = querySpark("select tp_timestamp,tp_timestamp from full_data_type_table_j  where tp_timestamp = tp_timestamp order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_mediumint from full_data_type_table  where tp_text = tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_mediumint from full_data_type_table  where tp_text = tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_mediumint from full_data_type_table_j  where tp_text = tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_real from full_data_type_table  where tp_text = tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_real from full_data_type_table  where tp_text = tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_real from full_data_type_table_j  where tp_text = tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_tinytext from full_data_type_table  where tp_int = tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_tinytext from full_data_type_table  where tp_int = tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_tinytext from full_data_type_table_j  where tp_int = tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_datetime from full_data_type_table  where tp_text = tp_datetime order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_datetime from full_data_type_table  where tp_text = tp_datetime order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_datetime from full_data_type_table_j  where tp_text = tp_datetime order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_int from full_data_type_table  where tp_real = tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_int from full_data_type_table  where tp_real = tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_int from full_data_type_table_j  where tp_real = tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_datetime,tp_date from full_data_type_table  where tp_datetime = tp_date order by id_dt  limit 20") {
    val r1 = querySpark("select tp_datetime,tp_date from full_data_type_table  where tp_datetime = tp_date order by id_dt  limit 20")
    val r2 = querySpark("select tp_datetime,tp_date from full_data_type_table_j  where tp_datetime = tp_date order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_datetime,tp_tinytext from full_data_type_table  where tp_datetime = tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_datetime,tp_tinytext from full_data_type_table  where tp_datetime = tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_datetime,tp_tinytext from full_data_type_table_j  where tp_datetime = tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_date,tp_timestamp from full_data_type_table  where tp_date = tp_timestamp order by id_dt  limit 20") {
    val r1 = querySpark("select tp_date,tp_timestamp from full_data_type_table  where tp_date = tp_timestamp order by id_dt  limit 20")
    val r2 = querySpark("select tp_date,tp_timestamp from full_data_type_table_j  where tp_date = tp_timestamp order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_real from full_data_type_table  where tp_double = tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_real from full_data_type_table  where tp_double = tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_real from full_data_type_table_j  where tp_double = tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_smallint from full_data_type_table  where tp_tinyint = tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_smallint from full_data_type_table  where tp_tinyint = tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_smallint from full_data_type_table_j  where tp_tinyint = tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_real from full_data_type_table  where tp_tinyint = tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_real from full_data_type_table  where tp_tinyint = tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_real from full_data_type_table_j  where tp_tinyint = tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_mediumint from full_data_type_table  where tp_bigint = tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_mediumint from full_data_type_table  where tp_bigint = tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_mediumint from full_data_type_table_j  where tp_bigint = tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_text from full_data_type_table  where tp_smallint = tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_text from full_data_type_table  where tp_smallint = tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_text from full_data_type_table_j  where tp_smallint = tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_mediumint from full_data_type_table  where tp_double = tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_mediumint from full_data_type_table  where tp_double = tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_mediumint from full_data_type_table_j  where tp_double = tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,id_dt from full_data_type_table  where tp_decimal = id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,id_dt from full_data_type_table  where tp_decimal = id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,id_dt from full_data_type_table_j  where tp_decimal = id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_mediumint from full_data_type_table  where tp_float = tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_mediumint from full_data_type_table  where tp_float = tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_mediumint from full_data_type_table_j  where tp_float = tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_decimal from full_data_type_table  where tp_tinyint = tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_decimal from full_data_type_table  where tp_tinyint = tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_decimal from full_data_type_table_j  where tp_tinyint = tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_varchar,tp_varchar from full_data_type_table  where tp_varchar = tp_varchar order by id_dt  limit 20") {
    val r1 = querySpark("select tp_varchar,tp_varchar from full_data_type_table  where tp_varchar = tp_varchar order by id_dt  limit 20")
    val r2 = querySpark("select tp_varchar,tp_varchar from full_data_type_table_j  where tp_varchar = tp_varchar order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_decimal from full_data_type_table  where tp_double = tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_decimal from full_data_type_table  where tp_double = tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_decimal from full_data_type_table_j  where tp_double = tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_binary,tp_binary from full_data_type_table  where tp_binary = tp_binary order by id_dt  limit 20") {
    val r1 = querySpark("select tp_binary,tp_binary from full_data_type_table  where tp_binary = tp_binary order by id_dt  limit 20")
    val r2 = querySpark("select tp_binary,tp_binary from full_data_type_table_j  where tp_binary = tp_binary order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_date from full_data_type_table  where tp_text = tp_date order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_date from full_data_type_table  where tp_text = tp_date order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_date from full_data_type_table_j  where tp_text = tp_date order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_tinytext from full_data_type_table  where tp_smallint = tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_tinytext from full_data_type_table  where tp_smallint = tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_tinytext from full_data_type_table_j  where tp_smallint = tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_datetime,tp_timestamp from full_data_type_table  where tp_datetime = tp_timestamp order by id_dt  limit 20") {
    val r1 = querySpark("select tp_datetime,tp_timestamp from full_data_type_table  where tp_datetime = tp_timestamp order by id_dt  limit 20")
    val r2 = querySpark("select tp_datetime,tp_timestamp from full_data_type_table_j  where tp_datetime = tp_timestamp order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,id_dt from full_data_type_table  where tp_double = id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,id_dt from full_data_type_table  where tp_double = id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,id_dt from full_data_type_table_j  where tp_double = id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_text from full_data_type_table  where tp_float = tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_text from full_data_type_table  where tp_float = tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_text from full_data_type_table_j  where tp_float = tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_tinyint from full_data_type_table  where tp_text = tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_tinyint from full_data_type_table  where tp_text = tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_tinyint from full_data_type_table_j  where tp_text = tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_timestamp from full_data_type_table  where tp_tinytext = tp_timestamp order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_timestamp from full_data_type_table  where tp_tinytext = tp_timestamp order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_timestamp from full_data_type_table_j  where tp_tinytext = tp_timestamp order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_bigint from full_data_type_table  where tp_double = tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_bigint from full_data_type_table  where tp_double = tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_bigint from full_data_type_table_j  where tp_double = tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_float from full_data_type_table  where tp_real = tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_float from full_data_type_table  where tp_real = tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_float from full_data_type_table_j  where tp_real = tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_mediumint from full_data_type_table  where tp_mediumint = tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_mediumint from full_data_type_table  where tp_mediumint = tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_mediumint from full_data_type_table_j  where tp_mediumint = tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_bigint from full_data_type_table  where tp_smallint = tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_bigint from full_data_type_table  where tp_smallint = tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_bigint from full_data_type_table_j  where tp_smallint = tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_decimal from full_data_type_table  where tp_int = tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_decimal from full_data_type_table  where tp_int = tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_decimal from full_data_type_table_j  where tp_int = tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumtext,tp_mediumtext from full_data_type_table  where tp_mediumtext = tp_mediumtext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumtext,tp_mediumtext from full_data_type_table  where tp_mediumtext = tp_mediumtext order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumtext,tp_mediumtext from full_data_type_table_j  where tp_mediumtext = tp_mediumtext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_smallint from full_data_type_table  where tp_text = tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_smallint from full_data_type_table  where tp_text = tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_smallint from full_data_type_table_j  where tp_text = tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_longtext,tp_longtext from full_data_type_table  where tp_longtext = tp_longtext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_longtext,tp_longtext from full_data_type_table  where tp_longtext = tp_longtext order by id_dt  limit 20")
    val r2 = querySpark("select tp_longtext,tp_longtext from full_data_type_table_j  where tp_longtext = tp_longtext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_bigint from full_data_type_table  where tp_decimal = tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_bigint from full_data_type_table  where tp_decimal = tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_bigint from full_data_type_table_j  where tp_decimal = tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_date,tp_date from full_data_type_table  where tp_date = tp_date order by id_dt  limit 20") {
    val r1 = querySpark("select tp_date,tp_date from full_data_type_table  where tp_date = tp_date order by id_dt  limit 20")
    val r2 = querySpark("select tp_date,tp_date from full_data_type_table_j  where tp_date = tp_date order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_tinyint from full_data_type_table  where tp_tinyint = tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_tinyint from full_data_type_table  where tp_tinyint = tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_tinyint from full_data_type_table_j  where tp_tinyint = tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_tinyint from full_data_type_table  where tp_smallint = tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_tinyint from full_data_type_table  where tp_smallint = tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_tinyint from full_data_type_table_j  where tp_smallint = tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_tinyint from full_data_type_table  where tp_double = tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_tinyint from full_data_type_table  where tp_double = tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_tinyint from full_data_type_table_j  where tp_double = tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_double from full_data_type_table  where tp_real = tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_double from full_data_type_table  where tp_real = tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_double from full_data_type_table_j  where tp_real = tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_float from full_data_type_table  where tp_double = tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_float from full_data_type_table  where tp_double = tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_float from full_data_type_table_j  where tp_double = tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,id_dt from full_data_type_table  where tp_text = id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,id_dt from full_data_type_table  where tp_text = id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,id_dt from full_data_type_table_j  where tp_text = id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_float from full_data_type_table  where tp_decimal = tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_float from full_data_type_table  where tp_decimal = tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_float from full_data_type_table_j  where tp_decimal = tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_tinytext from full_data_type_table  where tp_real = tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_tinytext from full_data_type_table  where tp_real = tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_tinytext from full_data_type_table_j  where tp_real = tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_double from full_data_type_table  where tp_float = tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_double from full_data_type_table  where tp_float = tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_double from full_data_type_table_j  where tp_float = tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,id_dt from full_data_type_table  where tp_mediumint = id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,id_dt from full_data_type_table  where tp_mediumint = id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,id_dt from full_data_type_table_j  where tp_mediumint = id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_float from full_data_type_table  where tp_bigint = tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_float from full_data_type_table  where tp_bigint = tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_float from full_data_type_table_j  where tp_bigint = tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_tinytext from full_data_type_table  where id_dt = tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_tinytext from full_data_type_table  where id_dt = tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_tinytext from full_data_type_table_j  where id_dt = tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_int from full_data_type_table  where tp_bigint = tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_int from full_data_type_table  where tp_bigint = tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_int from full_data_type_table_j  where tp_bigint = tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,id_dt from full_data_type_table  where tp_tinytext = id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,id_dt from full_data_type_table  where tp_tinytext = id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,id_dt from full_data_type_table_j  where tp_tinytext = id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_double from full_data_type_table  where tp_decimal = tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_double from full_data_type_table  where tp_decimal = tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_double from full_data_type_table_j  where tp_decimal = tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_bigint from full_data_type_table  where tp_tinytext = tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_bigint from full_data_type_table  where tp_tinytext = tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_bigint from full_data_type_table_j  where tp_tinytext = tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_double from full_data_type_table  where tp_smallint = tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_double from full_data_type_table  where tp_smallint = tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_double from full_data_type_table_j  where tp_smallint = tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,id_dt from full_data_type_table  where tp_float = id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,id_dt from full_data_type_table  where tp_float = id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,id_dt from full_data_type_table_j  where tp_float = id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_real from full_data_type_table  where id_dt = tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_real from full_data_type_table  where id_dt = tp_real order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_real from full_data_type_table_j  where id_dt = tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_datetime,tp_text from full_data_type_table  where tp_datetime = tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_datetime,tp_text from full_data_type_table  where tp_datetime = tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_datetime,tp_text from full_data_type_table_j  where tp_datetime = tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_tinyint from full_data_type_table  where id_dt = tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_tinyint from full_data_type_table  where id_dt = tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_tinyint from full_data_type_table_j  where id_dt = tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_real from full_data_type_table  where tp_smallint = tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_real from full_data_type_table  where tp_smallint = tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_real from full_data_type_table_j  where tp_smallint = tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_int from full_data_type_table  where tp_int = tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_int from full_data_type_table  where tp_int = tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_int from full_data_type_table_j  where tp_int = tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_int from full_data_type_table  where tp_decimal = tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_int from full_data_type_table  where tp_decimal = tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_int from full_data_type_table_j  where tp_decimal = tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_real from full_data_type_table  where tp_tinytext = tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_real from full_data_type_table  where tp_tinytext = tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_real from full_data_type_table_j  where tp_tinytext = tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_char,tp_char from full_data_type_table  where tp_char = tp_char order by id_dt  limit 20") {
    val r1 = querySpark("select tp_char,tp_char from full_data_type_table  where tp_char = tp_char order by id_dt  limit 20")
    val r2 = querySpark("select tp_char,tp_char from full_data_type_table_j  where tp_char = tp_char order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_int from full_data_type_table  where tp_tinytext = tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_int from full_data_type_table  where tp_tinytext = tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_int from full_data_type_table_j  where tp_tinytext = tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_date,tp_text from full_data_type_table  where tp_date = tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_date,tp_text from full_data_type_table  where tp_date = tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_date,tp_text from full_data_type_table_j  where tp_date = tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_text from full_data_type_table  where tp_real = tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_text from full_data_type_table  where tp_real = tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_text from full_data_type_table_j  where tp_real = tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_tinytext from full_data_type_table  where tp_float = tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_tinytext from full_data_type_table  where tp_float = tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_tinytext from full_data_type_table_j  where tp_float = tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_decimal from full_data_type_table  where tp_tinytext = tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_decimal from full_data_type_table  where tp_tinytext = tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_decimal from full_data_type_table_j  where tp_tinytext = tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_text from full_data_type_table  where id_dt = tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_text from full_data_type_table  where id_dt = tp_text order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_text from full_data_type_table_j  where id_dt = tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_text from full_data_type_table  where tp_decimal = tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_text from full_data_type_table  where tp_decimal = tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_text from full_data_type_table_j  where tp_decimal = tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_int from full_data_type_table  where tp_mediumint = tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_int from full_data_type_table  where tp_mediumint = tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_int from full_data_type_table_j  where tp_mediumint = tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_double from full_data_type_table  where tp_bigint = tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_double from full_data_type_table  where tp_bigint = tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_double from full_data_type_table_j  where tp_bigint = tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_real from full_data_type_table  where tp_bigint = tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_real from full_data_type_table  where tp_bigint = tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_real from full_data_type_table_j  where tp_bigint = tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_double from full_data_type_table  where tp_tinytext = tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_double from full_data_type_table  where tp_tinytext = tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_double from full_data_type_table_j  where tp_tinytext = tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,id_dt from full_data_type_table  where tp_int = id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,id_dt from full_data_type_table  where tp_int = id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,id_dt from full_data_type_table_j  where tp_int = id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,id_dt from full_data_type_table  where tp_bigint = id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,id_dt from full_data_type_table  where tp_bigint = id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,id_dt from full_data_type_table_j  where tp_bigint = id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_date,tp_tinytext from full_data_type_table  where tp_date = tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_date,tp_tinytext from full_data_type_table  where tp_date = tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_date,tp_tinytext from full_data_type_table_j  where tp_date = tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_decimal from full_data_type_table  where tp_real = tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_decimal from full_data_type_table  where tp_real = tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_decimal from full_data_type_table_j  where tp_real = tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_smallint from full_data_type_table  where tp_double = tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_smallint from full_data_type_table  where tp_double = tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_smallint from full_data_type_table_j  where tp_double = tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_smallint from full_data_type_table  where tp_smallint = tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_smallint from full_data_type_table  where tp_smallint = tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_smallint from full_data_type_table_j  where tp_smallint = tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_float from full_data_type_table  where tp_int = tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_float from full_data_type_table  where tp_int = tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_float from full_data_type_table_j  where tp_int = tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,id_dt from full_data_type_table  where tp_tinyint = id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,id_dt from full_data_type_table  where tp_tinyint = id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,id_dt from full_data_type_table_j  where tp_tinyint = id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_float from full_data_type_table  where id_dt = tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_float from full_data_type_table  where id_dt = tp_float order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_float from full_data_type_table_j  where id_dt = tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_decimal from full_data_type_table  where tp_float = tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_decimal from full_data_type_table  where tp_float = tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_decimal from full_data_type_table_j  where tp_float = tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_tinyint from full_data_type_table  where tp_tinytext = tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_tinyint from full_data_type_table  where tp_tinytext = tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_tinyint from full_data_type_table_j  where tp_tinytext = tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_double from full_data_type_table  where tp_int = tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_double from full_data_type_table  where tp_int = tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_double from full_data_type_table_j  where tp_int = tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_smallint from full_data_type_table  where tp_float = tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_smallint from full_data_type_table  where tp_float = tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_smallint from full_data_type_table_j  where tp_float = tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_real from full_data_type_table  where tp_mediumint = tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_real from full_data_type_table  where tp_mediumint = tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_real from full_data_type_table_j  where tp_mediumint = tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_tinyint from full_data_type_table  where tp_bigint = tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_tinyint from full_data_type_table  where tp_bigint = tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_tinyint from full_data_type_table_j  where tp_bigint = tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_timestamp,tp_tinytext from full_data_type_table  where tp_timestamp = tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_timestamp,tp_tinytext from full_data_type_table  where tp_timestamp = tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_timestamp,tp_tinytext from full_data_type_table_j  where tp_timestamp = tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_float from full_data_type_table  where tp_float = tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_float from full_data_type_table  where tp_float = tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_float from full_data_type_table_j  where tp_float = tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_bigint from full_data_type_table  where tp_float = tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_bigint from full_data_type_table  where tp_float = tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_bigint from full_data_type_table_j  where tp_float = tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_text from full_data_type_table  where tp_tinytext = tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_text from full_data_type_table  where tp_tinytext = tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_text from full_data_type_table_j  where tp_tinytext = tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_decimal from full_data_type_table  where tp_mediumint = tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_decimal from full_data_type_table  where tp_mediumint = tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_decimal from full_data_type_table_j  where tp_mediumint = tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_datetime from full_data_type_table  where tp_tinytext = tp_datetime order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_datetime from full_data_type_table  where tp_tinytext = tp_datetime order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_datetime from full_data_type_table_j  where tp_tinytext = tp_datetime order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_mediumint from full_data_type_table  where id_dt = tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_mediumint from full_data_type_table  where id_dt = tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_mediumint from full_data_type_table_j  where id_dt = tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_decimal from full_data_type_table  where id_dt = tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_decimal from full_data_type_table  where id_dt = tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_decimal from full_data_type_table_j  where id_dt = tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_int from full_data_type_table  where tp_tinyint = tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_int from full_data_type_table  where tp_tinyint = tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_int from full_data_type_table_j  where tp_tinyint = tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_mediumint from full_data_type_table  where tp_tinytext = tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_mediumint from full_data_type_table  where tp_tinytext = tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_mediumint from full_data_type_table_j  where tp_tinytext = tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_datetime,tp_datetime from full_data_type_table  where tp_datetime = tp_datetime order by id_dt  limit 20") {
    val r1 = querySpark("select tp_datetime,tp_datetime from full_data_type_table  where tp_datetime = tp_datetime order by id_dt  limit 20")
    val r2 = querySpark("select tp_datetime,tp_datetime from full_data_type_table_j  where tp_datetime = tp_datetime order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_double from full_data_type_table  where tp_text = tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_double from full_data_type_table  where tp_text = tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_double from full_data_type_table_j  where tp_text = tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_tinyint from full_data_type_table  where tp_mediumint = tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_tinyint from full_data_type_table  where tp_mediumint = tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_tinyint from full_data_type_table_j  where tp_mediumint = tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_mediumint from full_data_type_table  where tp_int = tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_mediumint from full_data_type_table  where tp_int = tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_mediumint from full_data_type_table_j  where tp_int = tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_tinyint from full_data_type_table  where tp_float = tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_tinyint from full_data_type_table  where tp_float = tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_tinyint from full_data_type_table_j  where tp_float = tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_double from full_data_type_table  where tp_mediumint = tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_double from full_data_type_table  where tp_mediumint = tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_double from full_data_type_table_j  where tp_mediumint = tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_bigint from full_data_type_table  where tp_bigint = tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_bigint from full_data_type_table  where tp_bigint = tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_bigint from full_data_type_table_j  where tp_bigint = tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_smallint from full_data_type_table  where tp_real = tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_smallint from full_data_type_table  where tp_real = tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_smallint from full_data_type_table_j  where tp_real = tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_tinytext from full_data_type_table  where tp_decimal = tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_tinytext from full_data_type_table  where tp_decimal = tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_tinytext from full_data_type_table_j  where tp_decimal = tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_float from full_data_type_table  where tp_text = tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_float from full_data_type_table  where tp_text = tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_float from full_data_type_table_j  where tp_text = tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_float from full_data_type_table  where tp_tinytext = tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_float from full_data_type_table  where tp_tinytext = tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_float from full_data_type_table_j  where tp_tinytext = tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_bigint from full_data_type_table  where tp_int = tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_bigint from full_data_type_table  where tp_int = tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_bigint from full_data_type_table_j  where tp_int = tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_double from full_data_type_table  where id_dt = tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_double from full_data_type_table  where id_dt = tp_double order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_double from full_data_type_table_j  where id_dt = tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_tinytext from full_data_type_table  where tp_tinyint = tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_tinytext from full_data_type_table  where tp_tinyint = tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_tinytext from full_data_type_table_j  where tp_tinyint = tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_smallint from full_data_type_table  where tp_mediumint = tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_smallint from full_data_type_table  where tp_mediumint = tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_smallint from full_data_type_table_j  where tp_mediumint = tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_mediumint from full_data_type_table  where tp_tinyint = tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_mediumint from full_data_type_table  where tp_tinyint = tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_mediumint from full_data_type_table_j  where tp_tinyint = tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_real from full_data_type_table  where tp_int = tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_real from full_data_type_table  where tp_int = tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_real from full_data_type_table_j  where tp_int = tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_int from full_data_type_table  where tp_smallint = tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_int from full_data_type_table  where tp_smallint = tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_int from full_data_type_table_j  where tp_smallint = tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_text from full_data_type_table  where tp_tinyint = tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_text from full_data_type_table  where tp_tinyint = tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_text from full_data_type_table_j  where tp_tinyint = tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_smallint from full_data_type_table  where tp_tinytext = tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_smallint from full_data_type_table  where tp_tinytext = tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_smallint from full_data_type_table_j  where tp_tinytext = tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_timestamp,tp_date from full_data_type_table  where tp_timestamp = tp_date order by id_dt  limit 20") {
    val r1 = querySpark("select tp_timestamp,tp_date from full_data_type_table  where tp_timestamp = tp_date order by id_dt  limit 20")
    val r2 = querySpark("select tp_timestamp,tp_date from full_data_type_table_j  where tp_timestamp = tp_date order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_bigint from full_data_type_table  where tp_real = tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_bigint from full_data_type_table  where tp_real = tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_bigint from full_data_type_table_j  where tp_real = tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_mediumint from full_data_type_table  where tp_text < tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_mediumint from full_data_type_table  where tp_text < tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_mediumint from full_data_type_table_j  where tp_text < tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,id_dt from full_data_type_table  where tp_tinyint < id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,id_dt from full_data_type_table  where tp_tinyint < id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,id_dt from full_data_type_table_j  where tp_tinyint < id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_tinytext from full_data_type_table  where tp_float < tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_tinytext from full_data_type_table  where tp_float < tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_tinytext from full_data_type_table_j  where tp_float < tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_text from full_data_type_table  where tp_bigint < tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_text from full_data_type_table  where tp_bigint < tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_text from full_data_type_table_j  where tp_bigint < tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_date,tp_text from full_data_type_table  where tp_date < tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_date,tp_text from full_data_type_table  where tp_date < tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_date,tp_text from full_data_type_table_j  where tp_date < tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,id_dt from full_data_type_table  where tp_mediumint < id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,id_dt from full_data_type_table  where tp_mediumint < id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,id_dt from full_data_type_table_j  where tp_mediumint < id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_tinyint from full_data_type_table  where tp_mediumint < tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_tinyint from full_data_type_table  where tp_mediumint < tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_tinyint from full_data_type_table_j  where tp_mediumint < tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_binary,tp_blob from full_data_type_table  where tp_binary < tp_blob order by id_dt  limit 20") {
    val r1 = querySpark("select tp_binary,tp_blob from full_data_type_table  where tp_binary < tp_blob order by id_dt  limit 20")
    val r2 = querySpark("select tp_binary,tp_blob from full_data_type_table_j  where tp_binary < tp_blob order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_double from full_data_type_table  where tp_tinyint < tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_double from full_data_type_table  where tp_tinyint < tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_double from full_data_type_table_j  where tp_tinyint < tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_tinyint from full_data_type_table  where id_dt < tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_tinyint from full_data_type_table  where id_dt < tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_tinyint from full_data_type_table_j  where id_dt < tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_real from full_data_type_table  where tp_decimal < tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_real from full_data_type_table  where tp_decimal < tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_real from full_data_type_table_j  where tp_decimal < tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_longtext,tp_longtext from full_data_type_table  where tp_longtext < tp_longtext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_longtext,tp_longtext from full_data_type_table  where tp_longtext < tp_longtext order by id_dt  limit 20")
    val r2 = querySpark("select tp_longtext,tp_longtext from full_data_type_table_j  where tp_longtext < tp_longtext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_int from full_data_type_table  where tp_smallint < tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_int from full_data_type_table  where tp_smallint < tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_int from full_data_type_table_j  where tp_smallint < tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_timestamp,tp_date from full_data_type_table  where tp_timestamp < tp_date order by id_dt  limit 20") {
    val r1 = querySpark("select tp_timestamp,tp_date from full_data_type_table  where tp_timestamp < tp_date order by id_dt  limit 20")
    val r2 = querySpark("select tp_timestamp,tp_date from full_data_type_table_j  where tp_timestamp < tp_date order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_char,tp_char from full_data_type_table  where tp_char < tp_char order by id_dt  limit 20") {
    val r1 = querySpark("select tp_char,tp_char from full_data_type_table  where tp_char < tp_char order by id_dt  limit 20")
    val r2 = querySpark("select tp_char,tp_char from full_data_type_table_j  where tp_char < tp_char order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_date,tp_timestamp from full_data_type_table  where tp_date < tp_timestamp order by id_dt  limit 20") {
    val r1 = querySpark("select tp_date,tp_timestamp from full_data_type_table  where tp_date < tp_timestamp order by id_dt  limit 20")
    val r2 = querySpark("select tp_date,tp_timestamp from full_data_type_table_j  where tp_date < tp_timestamp order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumtext,tp_mediumtext from full_data_type_table  where tp_mediumtext < tp_mediumtext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumtext,tp_mediumtext from full_data_type_table  where tp_mediumtext < tp_mediumtext order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumtext,tp_mediumtext from full_data_type_table_j  where tp_mediumtext < tp_mediumtext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_timestamp,tp_text from full_data_type_table  where tp_timestamp < tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_timestamp,tp_text from full_data_type_table  where tp_timestamp < tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_timestamp,tp_text from full_data_type_table_j  where tp_timestamp < tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_date,tp_tinytext from full_data_type_table  where tp_date < tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_date,tp_tinytext from full_data_type_table  where tp_date < tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_date,tp_tinytext from full_data_type_table_j  where tp_date < tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_datetime,tp_timestamp from full_data_type_table  where tp_datetime < tp_timestamp order by id_dt  limit 20") {
    val r1 = querySpark("select tp_datetime,tp_timestamp from full_data_type_table  where tp_datetime < tp_timestamp order by id_dt  limit 20")
    val r2 = querySpark("select tp_datetime,tp_timestamp from full_data_type_table_j  where tp_datetime < tp_timestamp order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_decimal from full_data_type_table  where tp_int < tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_decimal from full_data_type_table  where tp_int < tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_decimal from full_data_type_table_j  where tp_int < tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_mediumint from full_data_type_table  where tp_int < tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_mediumint from full_data_type_table  where tp_int < tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_mediumint from full_data_type_table_j  where tp_int < tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,id_dt from full_data_type_table  where tp_float < id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,id_dt from full_data_type_table  where tp_float < id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,id_dt from full_data_type_table_j  where tp_float < id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_timestamp from full_data_type_table  where tp_text < tp_timestamp order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_timestamp from full_data_type_table  where tp_text < tp_timestamp order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_timestamp from full_data_type_table_j  where tp_text < tp_timestamp order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_real from full_data_type_table  where tp_float < tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_real from full_data_type_table  where tp_float < tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_real from full_data_type_table_j  where tp_float < tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_blob,tp_blob from full_data_type_table  where tp_blob < tp_blob order by id_dt  limit 20") {
    val r1 = querySpark("select tp_blob,tp_blob from full_data_type_table  where tp_blob < tp_blob order by id_dt  limit 20")
    val r2 = querySpark("select tp_blob,tp_blob from full_data_type_table_j  where tp_blob < tp_blob order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_mediumint from full_data_type_table  where tp_smallint < tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_mediumint from full_data_type_table  where tp_smallint < tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_mediumint from full_data_type_table_j  where tp_smallint < tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_int from full_data_type_table  where tp_mediumint < tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_int from full_data_type_table  where tp_mediumint < tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_int from full_data_type_table_j  where tp_mediumint < tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_text from full_data_type_table  where tp_mediumint < tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_text from full_data_type_table  where tp_mediumint < tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_text from full_data_type_table_j  where tp_mediumint < tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_double from full_data_type_table  where tp_smallint < tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_double from full_data_type_table  where tp_smallint < tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_double from full_data_type_table_j  where tp_smallint < tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_float from full_data_type_table  where tp_tinyint < tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_float from full_data_type_table  where tp_tinyint < tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_float from full_data_type_table_j  where tp_tinyint < tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_smallint from full_data_type_table  where tp_float < tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_smallint from full_data_type_table  where tp_float < tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_smallint from full_data_type_table_j  where tp_float < tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_bigint from full_data_type_table  where tp_float < tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_bigint from full_data_type_table  where tp_float < tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_bigint from full_data_type_table_j  where tp_float < tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_date,tp_date from full_data_type_table  where tp_date < tp_date order by id_dt  limit 20") {
    val r1 = querySpark("select tp_date,tp_date from full_data_type_table  where tp_date < tp_date order by id_dt  limit 20")
    val r2 = querySpark("select tp_date,tp_date from full_data_type_table_j  where tp_date < tp_date order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_tinyint from full_data_type_table  where tp_decimal < tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_tinyint from full_data_type_table  where tp_decimal < tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_tinyint from full_data_type_table_j  where tp_decimal < tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_float from full_data_type_table  where tp_double < tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_float from full_data_type_table  where tp_double < tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_float from full_data_type_table_j  where tp_double < tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_tinyint from full_data_type_table  where tp_tinytext < tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_tinyint from full_data_type_table  where tp_tinytext < tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_tinyint from full_data_type_table_j  where tp_tinytext < tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_mediumint from full_data_type_table  where tp_decimal < tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_mediumint from full_data_type_table  where tp_decimal < tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_mediumint from full_data_type_table_j  where tp_decimal < tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_float from full_data_type_table  where tp_decimal < tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_float from full_data_type_table  where tp_decimal < tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_float from full_data_type_table_j  where tp_decimal < tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_decimal from full_data_type_table  where tp_real < tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_decimal from full_data_type_table  where tp_real < tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_decimal from full_data_type_table_j  where tp_real < tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_double from full_data_type_table  where tp_mediumint < tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_double from full_data_type_table  where tp_mediumint < tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_double from full_data_type_table_j  where tp_mediumint < tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,id_dt from full_data_type_table  where id_dt < id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,id_dt from full_data_type_table  where id_dt < id_dt order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,id_dt from full_data_type_table_j  where id_dt < id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_smallint from full_data_type_table  where tp_real < tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_smallint from full_data_type_table  where tp_real < tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_smallint from full_data_type_table_j  where tp_real < tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_tinytext from full_data_type_table  where tp_decimal < tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_tinytext from full_data_type_table  where tp_decimal < tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_tinytext from full_data_type_table_j  where tp_decimal < tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_bigint from full_data_type_table  where tp_int < tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_bigint from full_data_type_table  where tp_int < tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_bigint from full_data_type_table_j  where tp_int < tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_double from full_data_type_table  where id_dt < tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_double from full_data_type_table  where id_dt < tp_double order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_double from full_data_type_table_j  where id_dt < tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,id_dt from full_data_type_table  where tp_smallint < id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,id_dt from full_data_type_table  where tp_smallint < id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,id_dt from full_data_type_table_j  where tp_smallint < id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_tinyint from full_data_type_table  where tp_bigint < tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_tinyint from full_data_type_table  where tp_bigint < tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_tinyint from full_data_type_table_j  where tp_bigint < tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_float from full_data_type_table  where tp_bigint < tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_float from full_data_type_table  where tp_bigint < tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_float from full_data_type_table_j  where tp_bigint < tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_decimal from full_data_type_table  where tp_mediumint < tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_decimal from full_data_type_table  where tp_mediumint < tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_decimal from full_data_type_table_j  where tp_mediumint < tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_decimal from full_data_type_table  where tp_double < tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_decimal from full_data_type_table  where tp_double < tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_decimal from full_data_type_table_j  where tp_double < tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_smallint from full_data_type_table  where tp_tinytext < tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_smallint from full_data_type_table  where tp_tinytext < tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_smallint from full_data_type_table_j  where tp_tinytext < tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_blob,tp_binary from full_data_type_table  where tp_blob < tp_binary order by id_dt  limit 20") {
    val r1 = querySpark("select tp_blob,tp_binary from full_data_type_table  where tp_blob < tp_binary order by id_dt  limit 20")
    val r2 = querySpark("select tp_blob,tp_binary from full_data_type_table_j  where tp_blob < tp_binary order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_int from full_data_type_table  where id_dt < tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_int from full_data_type_table  where id_dt < tp_int order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_int from full_data_type_table_j  where id_dt < tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_real from full_data_type_table  where tp_int < tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_real from full_data_type_table  where tp_int < tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_real from full_data_type_table_j  where tp_int < tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_tinyint from full_data_type_table  where tp_float < tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_tinyint from full_data_type_table  where tp_float < tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_tinyint from full_data_type_table_j  where tp_float < tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_float from full_data_type_table  where tp_tinytext < tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_float from full_data_type_table  where tp_tinytext < tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_float from full_data_type_table_j  where tp_tinytext < tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_smallint from full_data_type_table  where tp_int < tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_smallint from full_data_type_table  where tp_int < tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_smallint from full_data_type_table_j  where tp_int < tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_int from full_data_type_table  where tp_text < tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_int from full_data_type_table  where tp_text < tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_int from full_data_type_table_j  where tp_text < tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_mediumint from full_data_type_table  where tp_bigint < tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_mediumint from full_data_type_table  where tp_bigint < tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_mediumint from full_data_type_table_j  where tp_bigint < tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_mediumint from full_data_type_table  where tp_double < tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_mediumint from full_data_type_table  where tp_double < tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_mediumint from full_data_type_table_j  where tp_double < tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_tinytext from full_data_type_table  where tp_int < tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_tinytext from full_data_type_table  where tp_int < tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_tinytext from full_data_type_table_j  where tp_int < tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_bigint from full_data_type_table  where tp_text < tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_bigint from full_data_type_table  where tp_text < tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_bigint from full_data_type_table_j  where tp_text < tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_datetime from full_data_type_table  where tp_text < tp_datetime order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_datetime from full_data_type_table  where tp_text < tp_datetime order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_datetime from full_data_type_table_j  where tp_text < tp_datetime order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_smallint from full_data_type_table  where tp_double < tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_smallint from full_data_type_table  where tp_double < tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_smallint from full_data_type_table_j  where tp_double < tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_smallint from full_data_type_table  where tp_smallint < tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_smallint from full_data_type_table  where tp_smallint < tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_smallint from full_data_type_table_j  where tp_smallint < tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_decimal from full_data_type_table  where tp_smallint < tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_decimal from full_data_type_table  where tp_smallint < tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_decimal from full_data_type_table_j  where tp_smallint < tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_text from full_data_type_table  where id_dt < tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_text from full_data_type_table  where id_dt < tp_text order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_text from full_data_type_table_j  where id_dt < tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_timestamp,tp_datetime from full_data_type_table  where tp_timestamp < tp_datetime order by id_dt  limit 20") {
    val r1 = querySpark("select tp_timestamp,tp_datetime from full_data_type_table  where tp_timestamp < tp_datetime order by id_dt  limit 20")
    val r2 = querySpark("select tp_timestamp,tp_datetime from full_data_type_table_j  where tp_timestamp < tp_datetime order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_text from full_data_type_table  where tp_decimal < tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_text from full_data_type_table  where tp_decimal < tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_text from full_data_type_table_j  where tp_decimal < tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_mediumint from full_data_type_table  where tp_real < tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_mediumint from full_data_type_table  where tp_real < tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_mediumint from full_data_type_table_j  where tp_real < tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_timestamp,tp_tinytext from full_data_type_table  where tp_timestamp < tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_timestamp,tp_tinytext from full_data_type_table  where tp_timestamp < tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_timestamp,tp_tinytext from full_data_type_table_j  where tp_timestamp < tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_timestamp from full_data_type_table  where tp_tinytext < tp_timestamp order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_timestamp from full_data_type_table  where tp_tinytext < tp_timestamp order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_timestamp from full_data_type_table_j  where tp_tinytext < tp_timestamp order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_datetime from full_data_type_table  where tp_tinytext < tp_datetime order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_datetime from full_data_type_table  where tp_tinytext < tp_datetime order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_datetime from full_data_type_table_j  where tp_tinytext < tp_datetime order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_tinyint from full_data_type_table  where tp_double < tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_tinyint from full_data_type_table  where tp_double < tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_tinyint from full_data_type_table_j  where tp_double < tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_double from full_data_type_table  where tp_text < tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_double from full_data_type_table  where tp_text < tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_double from full_data_type_table_j  where tp_text < tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_tinyint from full_data_type_table  where tp_real < tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_tinyint from full_data_type_table  where tp_real < tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_tinyint from full_data_type_table_j  where tp_real < tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_date from full_data_type_table  where tp_tinytext < tp_date order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_date from full_data_type_table  where tp_tinytext < tp_date order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_date from full_data_type_table_j  where tp_tinytext < tp_date order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_datetime,tp_datetime from full_data_type_table  where tp_datetime < tp_datetime order by id_dt  limit 20") {
    val r1 = querySpark("select tp_datetime,tp_datetime from full_data_type_table  where tp_datetime < tp_datetime order by id_dt  limit 20")
    val r2 = querySpark("select tp_datetime,tp_datetime from full_data_type_table_j  where tp_datetime < tp_datetime order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_int from full_data_type_table  where tp_float < tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_int from full_data_type_table  where tp_float < tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_int from full_data_type_table_j  where tp_float < tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_tinytext from full_data_type_table  where tp_text < tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_tinytext from full_data_type_table  where tp_text < tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_tinytext from full_data_type_table_j  where tp_text < tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_real from full_data_type_table  where tp_double < tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_real from full_data_type_table  where tp_double < tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_real from full_data_type_table_j  where tp_double < tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_real from full_data_type_table  where tp_tinyint < tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_real from full_data_type_table  where tp_tinyint < tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_real from full_data_type_table_j  where tp_tinyint < tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_float from full_data_type_table  where tp_float < tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_float from full_data_type_table  where tp_float < tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_float from full_data_type_table_j  where tp_float < tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_tinytext from full_data_type_table  where tp_tinyint < tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_tinytext from full_data_type_table  where tp_tinyint < tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_tinytext from full_data_type_table_j  where tp_tinyint < tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_decimal from full_data_type_table  where tp_decimal < tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_decimal from full_data_type_table  where tp_decimal < tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_decimal from full_data_type_table_j  where tp_decimal < tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_double from full_data_type_table  where tp_bigint < tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_double from full_data_type_table  where tp_bigint < tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_double from full_data_type_table_j  where tp_bigint < tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_smallint from full_data_type_table  where tp_text < tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_smallint from full_data_type_table  where tp_text < tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_smallint from full_data_type_table_j  where tp_text < tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_timestamp,tp_timestamp from full_data_type_table  where tp_timestamp < tp_timestamp order by id_dt  limit 20") {
    val r1 = querySpark("select tp_timestamp,tp_timestamp from full_data_type_table  where tp_timestamp < tp_timestamp order by id_dt  limit 20")
    val r2 = querySpark("select tp_timestamp,tp_timestamp from full_data_type_table_j  where tp_timestamp < tp_timestamp order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_date from full_data_type_table  where tp_text < tp_date order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_date from full_data_type_table  where tp_text < tp_date order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_date from full_data_type_table_j  where tp_text < tp_date order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_bigint from full_data_type_table  where tp_smallint < tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_bigint from full_data_type_table  where tp_smallint < tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_bigint from full_data_type_table_j  where tp_smallint < tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_text from full_data_type_table  where tp_float < tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_text from full_data_type_table  where tp_float < tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_text from full_data_type_table_j  where tp_float < tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_tinytext from full_data_type_table  where tp_double < tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_tinytext from full_data_type_table  where tp_double < tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_tinytext from full_data_type_table_j  where tp_double < tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_real from full_data_type_table  where id_dt < tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_real from full_data_type_table  where id_dt < tp_real order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_real from full_data_type_table_j  where id_dt < tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_bigint from full_data_type_table  where id_dt < tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_bigint from full_data_type_table  where id_dt < tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_bigint from full_data_type_table_j  where id_dt < tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_datetime,tp_text from full_data_type_table  where tp_datetime < tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_datetime,tp_text from full_data_type_table  where tp_datetime < tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_datetime,tp_text from full_data_type_table_j  where tp_datetime < tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_smallint from full_data_type_table  where id_dt < tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_smallint from full_data_type_table  where id_dt < tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_smallint from full_data_type_table_j  where id_dt < tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_real from full_data_type_table  where tp_smallint < tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_real from full_data_type_table  where tp_smallint < tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_real from full_data_type_table_j  where tp_smallint < tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_float from full_data_type_table  where tp_text < tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_float from full_data_type_table  where tp_text < tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_float from full_data_type_table_j  where tp_text < tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_double from full_data_type_table  where tp_real < tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_double from full_data_type_table  where tp_real < tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_double from full_data_type_table_j  where tp_real < tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_smallint from full_data_type_table  where tp_bigint < tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_smallint from full_data_type_table  where tp_bigint < tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_smallint from full_data_type_table_j  where tp_bigint < tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_text from full_data_type_table  where tp_real < tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_text from full_data_type_table  where tp_real < tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_text from full_data_type_table_j  where tp_real < tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_nvarchar,tp_nvarchar from full_data_type_table  where tp_nvarchar < tp_nvarchar order by id_dt  limit 20") {
    val r1 = querySpark("select tp_nvarchar,tp_nvarchar from full_data_type_table  where tp_nvarchar < tp_nvarchar order by id_dt  limit 20")
    val r2 = querySpark("select tp_nvarchar,tp_nvarchar from full_data_type_table_j  where tp_nvarchar < tp_nvarchar order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_decimal from full_data_type_table  where tp_text < tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_decimal from full_data_type_table  where tp_text < tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_decimal from full_data_type_table_j  where tp_text < tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_double from full_data_type_table  where tp_double < tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_double from full_data_type_table  where tp_double < tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_double from full_data_type_table_j  where tp_double < tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_real from full_data_type_table  where tp_real < tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_real from full_data_type_table  where tp_real < tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_real from full_data_type_table_j  where tp_real < tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_tinytext from full_data_type_table  where tp_tinytext < tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_tinytext from full_data_type_table  where tp_tinytext < tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_tinytext from full_data_type_table_j  where tp_tinytext < tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_bigint from full_data_type_table  where tp_bigint < tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_bigint from full_data_type_table  where tp_bigint < tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_bigint from full_data_type_table_j  where tp_bigint < tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_smallint from full_data_type_table  where tp_decimal < tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_smallint from full_data_type_table  where tp_decimal < tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_smallint from full_data_type_table_j  where tp_decimal < tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_real from full_data_type_table  where tp_bigint < tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_real from full_data_type_table  where tp_bigint < tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_real from full_data_type_table_j  where tp_bigint < tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_int from full_data_type_table  where tp_double < tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_int from full_data_type_table  where tp_double < tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_int from full_data_type_table_j  where tp_double < tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_tinyint from full_data_type_table  where tp_tinyint < tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_tinyint from full_data_type_table  where tp_tinyint < tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_tinyint from full_data_type_table_j  where tp_tinyint < tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_tinyint from full_data_type_table  where tp_smallint < tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_tinyint from full_data_type_table  where tp_smallint < tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_tinyint from full_data_type_table_j  where tp_smallint < tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_bigint from full_data_type_table  where tp_mediumint < tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_bigint from full_data_type_table  where tp_mediumint < tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_bigint from full_data_type_table_j  where tp_mediumint < tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_datetime,tp_tinytext from full_data_type_table  where tp_datetime < tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_datetime,tp_tinytext from full_data_type_table  where tp_datetime < tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_datetime,tp_tinytext from full_data_type_table_j  where tp_datetime < tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_smallint from full_data_type_table  where tp_tinyint < tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_smallint from full_data_type_table  where tp_tinyint < tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_smallint from full_data_type_table_j  where tp_tinyint < tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_binary,tp_binary from full_data_type_table  where tp_binary < tp_binary order by id_dt  limit 20") {
    val r1 = querySpark("select tp_binary,tp_binary from full_data_type_table  where tp_binary < tp_binary order by id_dt  limit 20")
    val r2 = querySpark("select tp_binary,tp_binary from full_data_type_table_j  where tp_binary < tp_binary order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_tinytext from full_data_type_table  where tp_mediumint < tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_tinytext from full_data_type_table  where tp_mediumint < tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_tinytext from full_data_type_table_j  where tp_mediumint < tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_int from full_data_type_table  where tp_real < tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_int from full_data_type_table  where tp_real < tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_int from full_data_type_table_j  where tp_real < tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_date,tp_datetime from full_data_type_table  where tp_date < tp_datetime order by id_dt  limit 20") {
    val r1 = querySpark("select tp_date,tp_datetime from full_data_type_table  where tp_date < tp_datetime order by id_dt  limit 20")
    val r2 = querySpark("select tp_date,tp_datetime from full_data_type_table_j  where tp_date < tp_datetime order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_bigint from full_data_type_table  where tp_real < tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_bigint from full_data_type_table  where tp_real < tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_bigint from full_data_type_table_j  where tp_real < tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_decimal from full_data_type_table  where tp_float < tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_decimal from full_data_type_table  where tp_float < tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_decimal from full_data_type_table_j  where tp_float < tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_int from full_data_type_table  where tp_bigint < tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_int from full_data_type_table  where tp_bigint < tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_int from full_data_type_table_j  where tp_bigint < tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_tinytext from full_data_type_table  where tp_smallint < tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_tinytext from full_data_type_table  where tp_smallint < tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_tinytext from full_data_type_table_j  where tp_smallint < tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_real from full_data_type_table  where tp_mediumint < tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_real from full_data_type_table  where tp_mediumint < tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_real from full_data_type_table_j  where tp_mediumint < tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_text from full_data_type_table  where tp_smallint < tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_text from full_data_type_table  where tp_smallint < tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_text from full_data_type_table_j  where tp_smallint < tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_text from full_data_type_table  where tp_tinytext < tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_text from full_data_type_table  where tp_tinytext < tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_text from full_data_type_table_j  where tp_tinytext < tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_tinytext from full_data_type_table  where tp_bigint < tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_tinytext from full_data_type_table  where tp_bigint < tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_tinytext from full_data_type_table_j  where tp_bigint < tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_bigint from full_data_type_table  where tp_double < tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_bigint from full_data_type_table  where tp_double < tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_bigint from full_data_type_table_j  where tp_double < tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_double from full_data_type_table  where tp_tinytext < tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_double from full_data_type_table  where tp_tinytext < tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_double from full_data_type_table_j  where tp_tinytext < tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_int from full_data_type_table  where tp_decimal < tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_int from full_data_type_table  where tp_decimal < tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_int from full_data_type_table_j  where tp_decimal < tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_int from full_data_type_table  where tp_int < tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_int from full_data_type_table  where tp_int < tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_int from full_data_type_table_j  where tp_int < tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_decimal from full_data_type_table  where id_dt < tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_decimal from full_data_type_table  where id_dt < tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_decimal from full_data_type_table_j  where id_dt < tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_int from full_data_type_table  where tp_tinytext < tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_int from full_data_type_table  where tp_tinytext < tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_int from full_data_type_table_j  where tp_tinytext < tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,id_dt from full_data_type_table  where tp_real < id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,id_dt from full_data_type_table  where tp_real < id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,id_dt from full_data_type_table_j  where tp_real < id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_mediumint from full_data_type_table  where tp_float < tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_mediumint from full_data_type_table  where tp_float < tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_mediumint from full_data_type_table_j  where tp_float < tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_bigint from full_data_type_table  where tp_decimal < tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_bigint from full_data_type_table  where tp_decimal < tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_bigint from full_data_type_table_j  where tp_decimal < tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_mediumint from full_data_type_table  where id_dt < tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_mediumint from full_data_type_table  where id_dt < tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_mediumint from full_data_type_table_j  where id_dt < tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,id_dt from full_data_type_table  where tp_tinytext < id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,id_dt from full_data_type_table  where tp_tinytext < id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,id_dt from full_data_type_table_j  where tp_tinytext < id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_mediumint from full_data_type_table  where tp_tinytext < tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_mediumint from full_data_type_table  where tp_tinytext < tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_mediumint from full_data_type_table_j  where tp_tinytext < tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_decimal from full_data_type_table  where tp_bigint < tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_decimal from full_data_type_table  where tp_bigint < tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_decimal from full_data_type_table_j  where tp_bigint < tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_tinyint from full_data_type_table  where tp_text < tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_tinyint from full_data_type_table  where tp_text < tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_tinyint from full_data_type_table_j  where tp_text < tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_text from full_data_type_table  where tp_tinyint < tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_text from full_data_type_table  where tp_tinyint < tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_text from full_data_type_table_j  where tp_tinyint < tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_text from full_data_type_table  where tp_double < tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_text from full_data_type_table  where tp_double < tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_text from full_data_type_table_j  where tp_double < tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_float from full_data_type_table  where tp_mediumint < tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_float from full_data_type_table  where tp_mediumint < tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_float from full_data_type_table_j  where tp_mediumint < tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,id_dt from full_data_type_table  where tp_decimal < id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,id_dt from full_data_type_table  where tp_decimal < id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,id_dt from full_data_type_table_j  where tp_decimal < id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_float from full_data_type_table  where tp_real < tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_float from full_data_type_table  where tp_real < tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_float from full_data_type_table_j  where tp_real < tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_text from full_data_type_table  where tp_int < tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_text from full_data_type_table  where tp_int < tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_text from full_data_type_table_j  where tp_int < tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_double from full_data_type_table  where tp_float < tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_double from full_data_type_table  where tp_float < tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_double from full_data_type_table_j  where tp_float < tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_double from full_data_type_table  where tp_int < tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_double from full_data_type_table  where tp_int < tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_double from full_data_type_table_j  where tp_int < tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_mediumint from full_data_type_table  where tp_mediumint < tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_mediumint from full_data_type_table  where tp_mediumint < tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_mediumint from full_data_type_table_j  where tp_mediumint < tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_tinytext from full_data_type_table  where tp_real < tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_tinytext from full_data_type_table  where tp_real < tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_tinytext from full_data_type_table_j  where tp_real < tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_decimal from full_data_type_table  where tp_tinytext < tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_decimal from full_data_type_table  where tp_tinytext < tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_decimal from full_data_type_table_j  where tp_tinytext < tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,id_dt from full_data_type_table  where tp_double < id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,id_dt from full_data_type_table  where tp_double < id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,id_dt from full_data_type_table_j  where tp_double < id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_mediumint from full_data_type_table  where tp_tinyint < tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_mediumint from full_data_type_table  where tp_tinyint < tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_mediumint from full_data_type_table_j  where tp_tinyint < tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_float from full_data_type_table  where tp_int < tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_float from full_data_type_table  where tp_int < tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_float from full_data_type_table_j  where tp_int < tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_float from full_data_type_table  where id_dt < tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_float from full_data_type_table  where id_dt < tp_float order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_float from full_data_type_table_j  where id_dt < tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_tinytext from full_data_type_table  where id_dt < tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_tinytext from full_data_type_table  where id_dt < tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_tinytext from full_data_type_table_j  where id_dt < tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_bigint from full_data_type_table  where tp_tinytext < tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_bigint from full_data_type_table  where tp_tinytext < tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_bigint from full_data_type_table_j  where tp_tinytext < tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_double from full_data_type_table  where tp_decimal < tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_double from full_data_type_table  where tp_decimal < tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_double from full_data_type_table_j  where tp_decimal < tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_tinyint from full_data_type_table  where tp_int < tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_tinyint from full_data_type_table  where tp_int < tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_tinyint from full_data_type_table_j  where tp_int < tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_bigint from full_data_type_table  where tp_tinyint < tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_bigint from full_data_type_table  where tp_tinyint < tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_bigint from full_data_type_table_j  where tp_tinyint < tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_text from full_data_type_table  where tp_text < tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_text from full_data_type_table  where tp_text < tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_text from full_data_type_table_j  where tp_text < tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_smallint from full_data_type_table  where tp_mediumint < tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_smallint from full_data_type_table  where tp_mediumint < tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_smallint from full_data_type_table_j  where tp_mediumint < tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_float from full_data_type_table  where tp_smallint < tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_float from full_data_type_table  where tp_smallint < tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_float from full_data_type_table_j  where tp_smallint < tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_real from full_data_type_table  where tp_text < tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_real from full_data_type_table  where tp_text < tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_real from full_data_type_table_j  where tp_text < tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,id_dt from full_data_type_table  where tp_int < id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,id_dt from full_data_type_table  where tp_int < id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,id_dt from full_data_type_table_j  where tp_int < id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,id_dt from full_data_type_table  where tp_bigint < id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,id_dt from full_data_type_table  where tp_bigint < id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,id_dt from full_data_type_table_j  where tp_bigint < id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_int from full_data_type_table  where tp_tinyint < tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_int from full_data_type_table  where tp_tinyint < tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_int from full_data_type_table_j  where tp_tinyint < tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,id_dt from full_data_type_table  where tp_text < id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,id_dt from full_data_type_table  where tp_text < id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,id_dt from full_data_type_table_j  where tp_text < id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_datetime,tp_date from full_data_type_table  where tp_datetime < tp_date order by id_dt  limit 20") {
    val r1 = querySpark("select tp_datetime,tp_date from full_data_type_table  where tp_datetime < tp_date order by id_dt  limit 20")
    val r2 = querySpark("select tp_datetime,tp_date from full_data_type_table_j  where tp_datetime < tp_date order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_decimal from full_data_type_table  where tp_tinyint < tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_decimal from full_data_type_table  where tp_tinyint < tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_decimal from full_data_type_table_j  where tp_tinyint < tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_varchar,tp_varchar from full_data_type_table  where tp_varchar < tp_varchar order by id_dt  limit 20") {
    val r1 = querySpark("select tp_varchar,tp_varchar from full_data_type_table  where tp_varchar < tp_varchar order by id_dt  limit 20")
    val r2 = querySpark("select tp_varchar,tp_varchar from full_data_type_table_j  where tp_varchar < tp_varchar order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_real from full_data_type_table  where tp_tinytext < tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_real from full_data_type_table  where tp_tinytext < tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_real from full_data_type_table_j  where tp_tinytext < tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_int from full_data_type_table  where tp_float > tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_int from full_data_type_table  where tp_float > tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_int from full_data_type_table_j  where tp_float > tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_double from full_data_type_table  where tp_real > tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_double from full_data_type_table  where tp_real > tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_double from full_data_type_table_j  where tp_real > tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_tinyint from full_data_type_table  where tp_float > tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_tinyint from full_data_type_table  where tp_float > tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_tinyint from full_data_type_table_j  where tp_float > tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_real from full_data_type_table  where id_dt > tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_real from full_data_type_table  where id_dt > tp_real order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_real from full_data_type_table_j  where id_dt > tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_text from full_data_type_table  where tp_smallint > tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_text from full_data_type_table  where tp_smallint > tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_text from full_data_type_table_j  where tp_smallint > tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_datetime,tp_text from full_data_type_table  where tp_datetime > tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_datetime,tp_text from full_data_type_table  where tp_datetime > tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_datetime,tp_text from full_data_type_table_j  where tp_datetime > tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_datetime,tp_date from full_data_type_table  where tp_datetime > tp_date order by id_dt  limit 20") {
    val r1 = querySpark("select tp_datetime,tp_date from full_data_type_table  where tp_datetime > tp_date order by id_dt  limit 20")
    val r2 = querySpark("select tp_datetime,tp_date from full_data_type_table_j  where tp_datetime > tp_date order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_double from full_data_type_table  where tp_tinyint > tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_double from full_data_type_table  where tp_tinyint > tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_double from full_data_type_table_j  where tp_tinyint > tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_tinytext from full_data_type_table  where tp_real > tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_tinytext from full_data_type_table  where tp_real > tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_tinytext from full_data_type_table_j  where tp_real > tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_real from full_data_type_table  where tp_smallint > tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_real from full_data_type_table  where tp_smallint > tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_real from full_data_type_table_j  where tp_smallint > tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_tinytext from full_data_type_table  where tp_tinytext > tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_tinytext from full_data_type_table  where tp_tinytext > tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_tinytext from full_data_type_table_j  where tp_tinytext > tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_tinytext from full_data_type_table  where tp_int > tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_tinytext from full_data_type_table  where tp_int > tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_tinytext from full_data_type_table_j  where tp_int > tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_datetime from full_data_type_table  where tp_text > tp_datetime order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_datetime from full_data_type_table  where tp_text > tp_datetime order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_datetime from full_data_type_table_j  where tp_text > tp_datetime order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_text from full_data_type_table  where tp_real > tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_text from full_data_type_table  where tp_real > tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_text from full_data_type_table_j  where tp_real > tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_real from full_data_type_table  where tp_int > tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_real from full_data_type_table  where tp_int > tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_real from full_data_type_table_j  where tp_int > tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_decimal from full_data_type_table  where tp_smallint > tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_decimal from full_data_type_table  where tp_smallint > tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_decimal from full_data_type_table_j  where tp_smallint > tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_text from full_data_type_table  where tp_tinyint > tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_text from full_data_type_table  where tp_tinyint > tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_text from full_data_type_table_j  where tp_tinyint > tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_timestamp,tp_date from full_data_type_table  where tp_timestamp > tp_date order by id_dt  limit 20") {
    val r1 = querySpark("select tp_timestamp,tp_date from full_data_type_table  where tp_timestamp > tp_date order by id_dt  limit 20")
    val r2 = querySpark("select tp_timestamp,tp_date from full_data_type_table_j  where tp_timestamp > tp_date order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_double from full_data_type_table  where tp_smallint > tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_double from full_data_type_table  where tp_smallint > tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_double from full_data_type_table_j  where tp_smallint > tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_tinyint from full_data_type_table  where tp_text > tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_tinyint from full_data_type_table  where tp_text > tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_tinyint from full_data_type_table_j  where tp_text > tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,id_dt from full_data_type_table  where id_dt > id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,id_dt from full_data_type_table  where id_dt > id_dt order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,id_dt from full_data_type_table_j  where id_dt > id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_bigint from full_data_type_table  where tp_float > tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_bigint from full_data_type_table  where tp_float > tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_bigint from full_data_type_table_j  where tp_float > tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_tinytext from full_data_type_table  where id_dt > tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_tinytext from full_data_type_table  where id_dt > tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_tinytext from full_data_type_table_j  where id_dt > tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_float from full_data_type_table  where tp_mediumint > tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_float from full_data_type_table  where tp_mediumint > tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_float from full_data_type_table_j  where tp_mediumint > tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_tinyint from full_data_type_table  where tp_double > tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_tinyint from full_data_type_table  where tp_double > tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_tinyint from full_data_type_table_j  where tp_double > tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_decimal from full_data_type_table  where tp_tinytext > tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_decimal from full_data_type_table  where tp_tinytext > tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_decimal from full_data_type_table_j  where tp_tinytext > tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_text from full_data_type_table  where tp_mediumint > tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_text from full_data_type_table  where tp_mediumint > tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_text from full_data_type_table_j  where tp_mediumint > tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumtext,tp_mediumtext from full_data_type_table  where tp_mediumtext > tp_mediumtext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumtext,tp_mediumtext from full_data_type_table  where tp_mediumtext > tp_mediumtext order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumtext,tp_mediumtext from full_data_type_table_j  where tp_mediumtext > tp_mediumtext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,id_dt from full_data_type_table  where tp_tinyint > id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,id_dt from full_data_type_table  where tp_tinyint > id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,id_dt from full_data_type_table_j  where tp_tinyint > id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_tinytext from full_data_type_table  where tp_float > tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_tinytext from full_data_type_table  where tp_float > tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_tinytext from full_data_type_table_j  where tp_float > tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_tinyint from full_data_type_table  where tp_int > tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_tinyint from full_data_type_table  where tp_int > tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_tinyint from full_data_type_table_j  where tp_int > tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_text from full_data_type_table  where tp_text > tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_text from full_data_type_table  where tp_text > tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_text from full_data_type_table_j  where tp_text > tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_float from full_data_type_table  where tp_int > tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_float from full_data_type_table  where tp_int > tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_float from full_data_type_table_j  where tp_int > tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_date,tp_date from full_data_type_table  where tp_date > tp_date order by id_dt  limit 20") {
    val r1 = querySpark("select tp_date,tp_date from full_data_type_table  where tp_date > tp_date order by id_dt  limit 20")
    val r2 = querySpark("select tp_date,tp_date from full_data_type_table_j  where tp_date > tp_date order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_date,tp_timestamp from full_data_type_table  where tp_date > tp_timestamp order by id_dt  limit 20") {
    val r1 = querySpark("select tp_date,tp_timestamp from full_data_type_table  where tp_date > tp_timestamp order by id_dt  limit 20")
    val r2 = querySpark("select tp_date,tp_timestamp from full_data_type_table_j  where tp_date > tp_timestamp order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_tinytext from full_data_type_table  where tp_tinyint > tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_tinytext from full_data_type_table  where tp_tinyint > tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_tinytext from full_data_type_table_j  where tp_tinyint > tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_smallint from full_data_type_table  where tp_text > tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_smallint from full_data_type_table  where tp_text > tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_smallint from full_data_type_table_j  where tp_text > tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_mediumint from full_data_type_table  where tp_int > tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_mediumint from full_data_type_table  where tp_int > tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_mediumint from full_data_type_table_j  where tp_int > tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_longtext,tp_longtext from full_data_type_table  where tp_longtext > tp_longtext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_longtext,tp_longtext from full_data_type_table  where tp_longtext > tp_longtext order by id_dt  limit 20")
    val r2 = querySpark("select tp_longtext,tp_longtext from full_data_type_table_j  where tp_longtext > tp_longtext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_float from full_data_type_table  where tp_float > tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_float from full_data_type_table  where tp_float > tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_float from full_data_type_table_j  where tp_float > tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_timestamp from full_data_type_table  where tp_text > tp_timestamp order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_timestamp from full_data_type_table  where tp_text > tp_timestamp order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_timestamp from full_data_type_table_j  where tp_text > tp_timestamp order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_mediumint from full_data_type_table  where tp_smallint > tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_mediumint from full_data_type_table  where tp_smallint > tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_mediumint from full_data_type_table_j  where tp_smallint > tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_date from full_data_type_table  where tp_tinytext > tp_date order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_date from full_data_type_table  where tp_tinytext > tp_date order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_date from full_data_type_table_j  where tp_tinytext > tp_date order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_double from full_data_type_table  where tp_bigint > tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_double from full_data_type_table  where tp_bigint > tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_double from full_data_type_table_j  where tp_bigint > tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_date,tp_tinytext from full_data_type_table  where tp_date > tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_date,tp_tinytext from full_data_type_table  where tp_date > tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_date,tp_tinytext from full_data_type_table_j  where tp_date > tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,id_dt from full_data_type_table  where tp_double > id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,id_dt from full_data_type_table  where tp_double > id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,id_dt from full_data_type_table_j  where tp_double > id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_int from full_data_type_table  where tp_real > tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_int from full_data_type_table  where tp_real > tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_int from full_data_type_table_j  where tp_real > tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_mediumint from full_data_type_table  where tp_double > tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_mediumint from full_data_type_table  where tp_double > tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_mediumint from full_data_type_table_j  where tp_double > tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_decimal from full_data_type_table  where tp_tinyint > tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_decimal from full_data_type_table  where tp_tinyint > tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_decimal from full_data_type_table_j  where tp_tinyint > tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_varchar,tp_varchar from full_data_type_table  where tp_varchar > tp_varchar order by id_dt  limit 20") {
    val r1 = querySpark("select tp_varchar,tp_varchar from full_data_type_table  where tp_varchar > tp_varchar order by id_dt  limit 20")
    val r2 = querySpark("select tp_varchar,tp_varchar from full_data_type_table_j  where tp_varchar > tp_varchar order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_int from full_data_type_table  where tp_bigint > tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_int from full_data_type_table  where tp_bigint > tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_int from full_data_type_table_j  where tp_bigint > tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_float from full_data_type_table  where tp_bigint > tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_float from full_data_type_table  where tp_bigint > tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_float from full_data_type_table_j  where tp_bigint > tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_float from full_data_type_table  where tp_text > tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_float from full_data_type_table  where tp_text > tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_float from full_data_type_table_j  where tp_text > tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_real from full_data_type_table  where tp_decimal > tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_real from full_data_type_table  where tp_decimal > tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_real from full_data_type_table_j  where tp_decimal > tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_smallint from full_data_type_table  where tp_float > tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_smallint from full_data_type_table  where tp_float > tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_smallint from full_data_type_table_j  where tp_float > tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_nvarchar,tp_nvarchar from full_data_type_table  where tp_nvarchar > tp_nvarchar order by id_dt  limit 20") {
    val r1 = querySpark("select tp_nvarchar,tp_nvarchar from full_data_type_table  where tp_nvarchar > tp_nvarchar order by id_dt  limit 20")
    val r2 = querySpark("select tp_nvarchar,tp_nvarchar from full_data_type_table_j  where tp_nvarchar > tp_nvarchar order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_double from full_data_type_table  where tp_float > tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_double from full_data_type_table  where tp_float > tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_double from full_data_type_table_j  where tp_float > tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_double from full_data_type_table  where tp_int > tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_double from full_data_type_table  where tp_int > tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_double from full_data_type_table_j  where tp_int > tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_mediumint from full_data_type_table  where tp_decimal > tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_mediumint from full_data_type_table  where tp_decimal > tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_mediumint from full_data_type_table_j  where tp_decimal > tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_text from full_data_type_table  where tp_double > tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_text from full_data_type_table  where tp_double > tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_text from full_data_type_table_j  where tp_double > tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,id_dt from full_data_type_table  where tp_bigint > id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,id_dt from full_data_type_table  where tp_bigint > id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,id_dt from full_data_type_table_j  where tp_bigint > id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_decimal from full_data_type_table  where tp_int > tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_decimal from full_data_type_table  where tp_int > tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_decimal from full_data_type_table_j  where tp_int > tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_bigint from full_data_type_table  where tp_tinytext > tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_bigint from full_data_type_table  where tp_tinytext > tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_bigint from full_data_type_table_j  where tp_tinytext > tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_real from full_data_type_table  where tp_real > tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_real from full_data_type_table  where tp_real > tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_real from full_data_type_table_j  where tp_real > tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_text from full_data_type_table  where tp_int > tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_text from full_data_type_table  where tp_int > tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_text from full_data_type_table_j  where tp_int > tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,id_dt from full_data_type_table  where tp_text > id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,id_dt from full_data_type_table  where tp_text > id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,id_dt from full_data_type_table_j  where tp_text > id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_smallint from full_data_type_table  where tp_real > tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_smallint from full_data_type_table  where tp_real > tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_smallint from full_data_type_table_j  where tp_real > tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_tinytext from full_data_type_table  where tp_decimal > tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_tinytext from full_data_type_table  where tp_decimal > tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_tinytext from full_data_type_table_j  where tp_decimal > tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_tinyint from full_data_type_table  where tp_smallint > tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_tinyint from full_data_type_table  where tp_smallint > tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_tinyint from full_data_type_table_j  where tp_smallint > tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_timestamp,tp_timestamp from full_data_type_table  where tp_timestamp > tp_timestamp order by id_dt  limit 20") {
    val r1 = querySpark("select tp_timestamp,tp_timestamp from full_data_type_table  where tp_timestamp > tp_timestamp order by id_dt  limit 20")
    val r2 = querySpark("select tp_timestamp,tp_timestamp from full_data_type_table_j  where tp_timestamp > tp_timestamp order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_bigint from full_data_type_table  where tp_bigint > tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_bigint from full_data_type_table  where tp_bigint > tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_bigint from full_data_type_table_j  where tp_bigint > tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_mediumint from full_data_type_table  where tp_text > tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_mediumint from full_data_type_table  where tp_text > tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_mediumint from full_data_type_table_j  where tp_text > tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_smallint from full_data_type_table  where tp_tinyint > tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_smallint from full_data_type_table  where tp_tinyint > tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_smallint from full_data_type_table_j  where tp_tinyint > tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,id_dt from full_data_type_table  where tp_mediumint > id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,id_dt from full_data_type_table  where tp_mediumint > id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,id_dt from full_data_type_table_j  where tp_mediumint > id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_text from full_data_type_table  where id_dt > tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_text from full_data_type_table  where id_dt > tp_text order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_text from full_data_type_table_j  where id_dt > tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_date,tp_datetime from full_data_type_table  where tp_date > tp_datetime order by id_dt  limit 20") {
    val r1 = querySpark("select tp_date,tp_datetime from full_data_type_table  where tp_date > tp_datetime order by id_dt  limit 20")
    val r2 = querySpark("select tp_date,tp_datetime from full_data_type_table_j  where tp_date > tp_datetime order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_smallint from full_data_type_table  where tp_tinytext > tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_smallint from full_data_type_table  where tp_tinytext > tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_smallint from full_data_type_table_j  where tp_tinytext > tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_binary,tp_binary from full_data_type_table  where tp_binary > tp_binary order by id_dt  limit 20") {
    val r1 = querySpark("select tp_binary,tp_binary from full_data_type_table  where tp_binary > tp_binary order by id_dt  limit 20")
    val r2 = querySpark("select tp_binary,tp_binary from full_data_type_table_j  where tp_binary > tp_binary order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_decimal from full_data_type_table  where tp_float > tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_decimal from full_data_type_table  where tp_float > tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_decimal from full_data_type_table_j  where tp_float > tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_tinyint from full_data_type_table  where tp_tinytext > tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_tinyint from full_data_type_table  where tp_tinytext > tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_tinyint from full_data_type_table_j  where tp_tinytext > tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_real from full_data_type_table  where tp_bigint > tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_real from full_data_type_table  where tp_bigint > tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_real from full_data_type_table_j  where tp_bigint > tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,id_dt from full_data_type_table  where tp_float > id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,id_dt from full_data_type_table  where tp_float > id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,id_dt from full_data_type_table_j  where tp_float > id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_real from full_data_type_table  where tp_text > tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_real from full_data_type_table  where tp_text > tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_real from full_data_type_table_j  where tp_text > tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_float from full_data_type_table  where tp_double > tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_float from full_data_type_table  where tp_double > tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_float from full_data_type_table_j  where tp_double > tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_real from full_data_type_table  where tp_mediumint > tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_real from full_data_type_table  where tp_mediumint > tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_real from full_data_type_table_j  where tp_mediumint > tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_smallint from full_data_type_table  where tp_int > tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_smallint from full_data_type_table  where tp_int > tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_smallint from full_data_type_table_j  where tp_int > tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_decimal from full_data_type_table  where id_dt > tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_decimal from full_data_type_table  where id_dt > tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_decimal from full_data_type_table_j  where id_dt > tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_double from full_data_type_table  where tp_tinytext > tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_double from full_data_type_table  where tp_tinytext > tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_double from full_data_type_table_j  where tp_tinytext > tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_float from full_data_type_table  where tp_smallint > tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_float from full_data_type_table  where tp_smallint > tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_float from full_data_type_table_j  where tp_smallint > tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_real from full_data_type_table  where tp_double > tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_real from full_data_type_table  where tp_double > tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_real from full_data_type_table_j  where tp_double > tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_mediumint from full_data_type_table  where tp_real > tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_mediumint from full_data_type_table  where tp_real > tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_mediumint from full_data_type_table_j  where tp_real > tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_smallint from full_data_type_table  where tp_double > tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_smallint from full_data_type_table  where tp_double > tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_smallint from full_data_type_table_j  where tp_double > tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_text from full_data_type_table  where tp_bigint > tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_text from full_data_type_table  where tp_bigint > tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_text from full_data_type_table_j  where tp_bigint > tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_decimal from full_data_type_table  where tp_double > tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_decimal from full_data_type_table  where tp_double > tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_decimal from full_data_type_table_j  where tp_double > tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_timestamp from full_data_type_table  where tp_tinytext > tp_timestamp order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_timestamp from full_data_type_table  where tp_tinytext > tp_timestamp order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_timestamp from full_data_type_table_j  where tp_tinytext > tp_timestamp order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_binary,tp_blob from full_data_type_table  where tp_binary > tp_blob order by id_dt  limit 20") {
    val r1 = querySpark("select tp_binary,tp_blob from full_data_type_table  where tp_binary > tp_blob order by id_dt  limit 20")
    val r2 = querySpark("select tp_binary,tp_blob from full_data_type_table_j  where tp_binary > tp_blob order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_int from full_data_type_table  where tp_tinyint > tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_int from full_data_type_table  where tp_tinyint > tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_int from full_data_type_table_j  where tp_tinyint > tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_bigint from full_data_type_table  where tp_decimal > tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_bigint from full_data_type_table  where tp_decimal > tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_bigint from full_data_type_table_j  where tp_decimal > tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_timestamp,tp_datetime from full_data_type_table  where tp_timestamp > tp_datetime order by id_dt  limit 20") {
    val r1 = querySpark("select tp_timestamp,tp_datetime from full_data_type_table  where tp_timestamp > tp_datetime order by id_dt  limit 20")
    val r2 = querySpark("select tp_timestamp,tp_datetime from full_data_type_table_j  where tp_timestamp > tp_datetime order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_date from full_data_type_table  where tp_text > tp_date order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_date from full_data_type_table  where tp_text > tp_date order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_date from full_data_type_table_j  where tp_text > tp_date order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_mediumint from full_data_type_table  where tp_mediumint > tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_mediumint from full_data_type_table  where tp_mediumint > tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_mediumint from full_data_type_table_j  where tp_mediumint > tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_timestamp,tp_tinytext from full_data_type_table  where tp_timestamp > tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_timestamp,tp_tinytext from full_data_type_table  where tp_timestamp > tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_timestamp,tp_tinytext from full_data_type_table_j  where tp_timestamp > tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_timestamp,tp_text from full_data_type_table  where tp_timestamp > tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_timestamp,tp_text from full_data_type_table  where tp_timestamp > tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_timestamp,tp_text from full_data_type_table_j  where tp_timestamp > tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_datetime from full_data_type_table  where tp_tinytext > tp_datetime order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_datetime from full_data_type_table  where tp_tinytext > tp_datetime order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_datetime from full_data_type_table_j  where tp_tinytext > tp_datetime order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_int from full_data_type_table  where tp_decimal > tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_int from full_data_type_table  where tp_decimal > tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_int from full_data_type_table_j  where tp_decimal > tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_int from full_data_type_table  where tp_int > tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_int from full_data_type_table  where tp_int > tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_int from full_data_type_table_j  where tp_int > tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,id_dt from full_data_type_table  where tp_int > id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,id_dt from full_data_type_table  where tp_int > id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,id_dt from full_data_type_table_j  where tp_int > id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_real from full_data_type_table  where tp_float > tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_real from full_data_type_table  where tp_float > tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_real from full_data_type_table_j  where tp_float > tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_blob,tp_blob from full_data_type_table  where tp_blob > tp_blob order by id_dt  limit 20") {
    val r1 = querySpark("select tp_blob,tp_blob from full_data_type_table  where tp_blob > tp_blob order by id_dt  limit 20")
    val r2 = querySpark("select tp_blob,tp_blob from full_data_type_table_j  where tp_blob > tp_blob order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,id_dt from full_data_type_table  where tp_smallint > id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,id_dt from full_data_type_table  where tp_smallint > id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,id_dt from full_data_type_table_j  where tp_smallint > id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_datetime,tp_datetime from full_data_type_table  where tp_datetime > tp_datetime order by id_dt  limit 20") {
    val r1 = querySpark("select tp_datetime,tp_datetime from full_data_type_table  where tp_datetime > tp_datetime order by id_dt  limit 20")
    val r2 = querySpark("select tp_datetime,tp_datetime from full_data_type_table_j  where tp_datetime > tp_datetime order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_tinytext from full_data_type_table  where tp_text > tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_tinytext from full_data_type_table  where tp_text > tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_tinytext from full_data_type_table_j  where tp_text > tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_double from full_data_type_table  where tp_mediumint > tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_double from full_data_type_table  where tp_mediumint > tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_double from full_data_type_table_j  where tp_mediumint > tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_int from full_data_type_table  where tp_mediumint > tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_int from full_data_type_table  where tp_mediumint > tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_int from full_data_type_table_j  where tp_mediumint > tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_bigint from full_data_type_table  where tp_int > tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_bigint from full_data_type_table  where tp_int > tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_bigint from full_data_type_table_j  where tp_int > tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_bigint from full_data_type_table  where tp_mediumint > tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_bigint from full_data_type_table  where tp_mediumint > tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_bigint from full_data_type_table_j  where tp_mediumint > tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_double from full_data_type_table  where id_dt > tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_double from full_data_type_table  where id_dt > tp_double order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_double from full_data_type_table_j  where id_dt > tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_smallint from full_data_type_table  where tp_mediumint > tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_smallint from full_data_type_table  where tp_mediumint > tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_smallint from full_data_type_table_j  where tp_mediumint > tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_text from full_data_type_table  where tp_decimal > tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_text from full_data_type_table  where tp_decimal > tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_text from full_data_type_table_j  where tp_decimal > tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_bigint from full_data_type_table  where tp_tinyint > tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_bigint from full_data_type_table  where tp_tinyint > tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_bigint from full_data_type_table_j  where tp_tinyint > tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_tinyint from full_data_type_table  where tp_tinyint > tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_tinyint from full_data_type_table  where tp_tinyint > tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_tinyint from full_data_type_table_j  where tp_tinyint > tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_mediumint from full_data_type_table  where id_dt > tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_mediumint from full_data_type_table  where id_dt > tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_mediumint from full_data_type_table_j  where id_dt > tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_tinytext from full_data_type_table  where tp_double > tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_tinytext from full_data_type_table  where tp_double > tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_tinytext from full_data_type_table_j  where tp_double > tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,id_dt from full_data_type_table  where tp_real > id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,id_dt from full_data_type_table  where tp_real > id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,id_dt from full_data_type_table_j  where tp_real > id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_bigint from full_data_type_table  where tp_real > tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_bigint from full_data_type_table  where tp_real > tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_bigint from full_data_type_table_j  where tp_real > tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_blob,tp_binary from full_data_type_table  where tp_blob > tp_binary order by id_dt  limit 20") {
    val r1 = querySpark("select tp_blob,tp_binary from full_data_type_table  where tp_blob > tp_binary order by id_dt  limit 20")
    val r2 = querySpark("select tp_blob,tp_binary from full_data_type_table_j  where tp_blob > tp_binary order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_mediumint from full_data_type_table  where tp_bigint > tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_mediumint from full_data_type_table  where tp_bigint > tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_mediumint from full_data_type_table_j  where tp_bigint > tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_decimal from full_data_type_table  where tp_mediumint > tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_decimal from full_data_type_table  where tp_mediumint > tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_decimal from full_data_type_table_j  where tp_mediumint > tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_mediumint from full_data_type_table  where tp_float > tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_mediumint from full_data_type_table  where tp_float > tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_mediumint from full_data_type_table_j  where tp_float > tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,id_dt from full_data_type_table  where tp_tinytext > id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,id_dt from full_data_type_table  where tp_tinytext > id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,id_dt from full_data_type_table_j  where tp_tinytext > id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_smallint from full_data_type_table  where tp_bigint > tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_smallint from full_data_type_table  where tp_bigint > tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_smallint from full_data_type_table_j  where tp_bigint > tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_int from full_data_type_table  where tp_double > tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_int from full_data_type_table  where tp_double > tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_int from full_data_type_table_j  where tp_double > tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_datetime,tp_timestamp from full_data_type_table  where tp_datetime > tp_timestamp order by id_dt  limit 20") {
    val r1 = querySpark("select tp_datetime,tp_timestamp from full_data_type_table  where tp_datetime > tp_timestamp order by id_dt  limit 20")
    val r2 = querySpark("select tp_datetime,tp_timestamp from full_data_type_table_j  where tp_datetime > tp_timestamp order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_tinyint from full_data_type_table  where tp_mediumint > tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_tinyint from full_data_type_table  where tp_mediumint > tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_tinyint from full_data_type_table_j  where tp_mediumint > tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,id_dt from full_data_type_table  where tp_decimal > id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,id_dt from full_data_type_table  where tp_decimal > id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,id_dt from full_data_type_table_j  where tp_decimal > id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_decimal from full_data_type_table  where tp_decimal > tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_decimal from full_data_type_table  where tp_decimal > tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_decimal from full_data_type_table_j  where tp_decimal > tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_real from full_data_type_table  where tp_tinyint > tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_real from full_data_type_table  where tp_tinyint > tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_real from full_data_type_table_j  where tp_tinyint > tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_tinyint from full_data_type_table  where id_dt > tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_tinyint from full_data_type_table  where id_dt > tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_tinyint from full_data_type_table_j  where id_dt > tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_smallint from full_data_type_table  where tp_smallint > tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_smallint from full_data_type_table  where tp_smallint > tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_smallint from full_data_type_table_j  where tp_smallint > tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_text from full_data_type_table  where tp_tinytext > tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_text from full_data_type_table  where tp_tinytext > tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_text from full_data_type_table_j  where tp_tinytext > tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_bigint from full_data_type_table  where tp_text > tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_bigint from full_data_type_table  where tp_text > tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_bigint from full_data_type_table_j  where tp_text > tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_double from full_data_type_table  where tp_double > tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_double from full_data_type_table  where tp_double > tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_double from full_data_type_table_j  where tp_double > tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_real from full_data_type_table  where tp_tinytext > tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_real from full_data_type_table  where tp_tinytext > tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_real from full_data_type_table_j  where tp_tinytext > tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_char,tp_char from full_data_type_table  where tp_char > tp_char order by id_dt  limit 20") {
    val r1 = querySpark("select tp_char,tp_char from full_data_type_table  where tp_char > tp_char order by id_dt  limit 20")
    val r2 = querySpark("select tp_char,tp_char from full_data_type_table_j  where tp_char > tp_char order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_smallint from full_data_type_table  where tp_decimal > tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_smallint from full_data_type_table  where tp_decimal > tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_smallint from full_data_type_table_j  where tp_decimal > tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_text from full_data_type_table  where tp_float > tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_text from full_data_type_table  where tp_float > tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_text from full_data_type_table_j  where tp_float > tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_mediumint from full_data_type_table  where tp_tinyint > tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_mediumint from full_data_type_table  where tp_tinyint > tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_mediumint from full_data_type_table_j  where tp_tinyint > tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_date,tp_text from full_data_type_table  where tp_date > tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_date,tp_text from full_data_type_table  where tp_date > tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_date,tp_text from full_data_type_table_j  where tp_date > tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_int from full_data_type_table  where id_dt > tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_int from full_data_type_table  where id_dt > tp_int order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_int from full_data_type_table_j  where id_dt > tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_datetime,tp_tinytext from full_data_type_table  where tp_datetime > tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_datetime,tp_tinytext from full_data_type_table  where tp_datetime > tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_datetime,tp_tinytext from full_data_type_table_j  where tp_datetime > tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_decimal from full_data_type_table  where tp_bigint > tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_decimal from full_data_type_table  where tp_bigint > tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_decimal from full_data_type_table_j  where tp_bigint > tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_float from full_data_type_table  where tp_tinytext > tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_float from full_data_type_table  where tp_tinytext > tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_float from full_data_type_table_j  where tp_tinytext > tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_float from full_data_type_table  where tp_real > tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_float from full_data_type_table  where tp_real > tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_float from full_data_type_table_j  where tp_real > tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_tinytext from full_data_type_table  where tp_mediumint > tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_tinytext from full_data_type_table  where tp_mediumint > tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_tinytext from full_data_type_table_j  where tp_mediumint > tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_int from full_data_type_table  where tp_smallint > tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_int from full_data_type_table  where tp_smallint > tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_int from full_data_type_table_j  where tp_smallint > tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_float from full_data_type_table  where tp_tinyint > tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_float from full_data_type_table  where tp_tinyint > tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_float from full_data_type_table_j  where tp_tinyint > tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_double from full_data_type_table  where tp_text > tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_double from full_data_type_table  where tp_text > tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_double from full_data_type_table_j  where tp_text > tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_decimal from full_data_type_table  where tp_text > tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_decimal from full_data_type_table  where tp_text > tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_decimal from full_data_type_table_j  where tp_text > tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_tinyint from full_data_type_table  where tp_decimal > tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_tinyint from full_data_type_table  where tp_decimal > tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_tinyint from full_data_type_table_j  where tp_decimal > tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_int from full_data_type_table  where tp_text > tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_int from full_data_type_table  where tp_text > tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_int from full_data_type_table_j  where tp_text > tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_int from full_data_type_table  where tp_tinytext > tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_int from full_data_type_table  where tp_tinytext > tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_int from full_data_type_table_j  where tp_tinytext > tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_tinytext from full_data_type_table  where tp_smallint > tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_tinytext from full_data_type_table  where tp_smallint > tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_tinytext from full_data_type_table_j  where tp_smallint > tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_tinyint from full_data_type_table  where tp_real > tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_tinyint from full_data_type_table  where tp_real > tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_tinyint from full_data_type_table_j  where tp_real > tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_double from full_data_type_table  where tp_decimal > tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_double from full_data_type_table  where tp_decimal > tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_double from full_data_type_table_j  where tp_decimal > tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_decimal from full_data_type_table  where tp_real > tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_decimal from full_data_type_table  where tp_real > tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_decimal from full_data_type_table_j  where tp_real > tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_tinytext from full_data_type_table  where tp_bigint > tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_tinytext from full_data_type_table  where tp_bigint > tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_tinytext from full_data_type_table_j  where tp_bigint > tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_float from full_data_type_table  where tp_decimal > tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_float from full_data_type_table  where tp_decimal > tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_float from full_data_type_table_j  where tp_decimal > tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_bigint from full_data_type_table  where tp_double > tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_bigint from full_data_type_table  where tp_double > tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_bigint from full_data_type_table_j  where tp_double > tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_float from full_data_type_table  where id_dt > tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_float from full_data_type_table  where id_dt > tp_float order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_float from full_data_type_table_j  where id_dt > tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_mediumint from full_data_type_table  where tp_tinytext > tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_mediumint from full_data_type_table  where tp_tinytext > tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_mediumint from full_data_type_table_j  where tp_tinytext > tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_tinyint from full_data_type_table  where tp_bigint > tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_tinyint from full_data_type_table  where tp_bigint > tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_tinyint from full_data_type_table_j  where tp_bigint > tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_smallint from full_data_type_table  where id_dt > tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_smallint from full_data_type_table  where id_dt > tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_smallint from full_data_type_table_j  where id_dt > tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_bigint from full_data_type_table  where tp_smallint > tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_bigint from full_data_type_table  where tp_smallint > tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_bigint from full_data_type_table_j  where tp_smallint > tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_bigint from full_data_type_table  where id_dt > tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_bigint from full_data_type_table  where id_dt > tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_bigint from full_data_type_table_j  where id_dt > tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_timestamp,tp_text from full_data_type_table  where tp_timestamp <= tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_timestamp,tp_text from full_data_type_table  where tp_timestamp <= tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_timestamp,tp_text from full_data_type_table_j  where tp_timestamp <= tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_int from full_data_type_table  where tp_text <= tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_int from full_data_type_table  where tp_text <= tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_int from full_data_type_table_j  where tp_text <= tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_mediumint from full_data_type_table  where tp_int <= tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_mediumint from full_data_type_table  where tp_int <= tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_mediumint from full_data_type_table_j  where tp_int <= tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_real from full_data_type_table  where tp_tinyint <= tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_real from full_data_type_table  where tp_tinyint <= tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_real from full_data_type_table_j  where tp_tinyint <= tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_date,tp_timestamp from full_data_type_table  where tp_date <= tp_timestamp order by id_dt  limit 20") {
    val r1 = querySpark("select tp_date,tp_timestamp from full_data_type_table  where tp_date <= tp_timestamp order by id_dt  limit 20")
    val r2 = querySpark("select tp_date,tp_timestamp from full_data_type_table_j  where tp_date <= tp_timestamp order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_bigint from full_data_type_table  where tp_smallint <= tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_bigint from full_data_type_table  where tp_smallint <= tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_bigint from full_data_type_table_j  where tp_smallint <= tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_double from full_data_type_table  where tp_int <= tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_double from full_data_type_table  where tp_int <= tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_double from full_data_type_table_j  where tp_int <= tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_timestamp,tp_timestamp from full_data_type_table  where tp_timestamp <= tp_timestamp order by id_dt  limit 20") {
    val r1 = querySpark("select tp_timestamp,tp_timestamp from full_data_type_table  where tp_timestamp <= tp_timestamp order by id_dt  limit 20")
    val r2 = querySpark("select tp_timestamp,tp_timestamp from full_data_type_table_j  where tp_timestamp <= tp_timestamp order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_float from full_data_type_table  where tp_float <= tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_float from full_data_type_table  where tp_float <= tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_float from full_data_type_table_j  where tp_float <= tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,id_dt from full_data_type_table  where tp_decimal <= id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,id_dt from full_data_type_table  where tp_decimal <= id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,id_dt from full_data_type_table_j  where tp_decimal <= id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_smallint from full_data_type_table  where tp_int <= tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_smallint from full_data_type_table  where tp_int <= tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_smallint from full_data_type_table_j  where tp_int <= tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_float from full_data_type_table  where tp_int <= tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_float from full_data_type_table  where tp_int <= tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_float from full_data_type_table_j  where tp_int <= tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_smallint from full_data_type_table  where tp_float <= tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_smallint from full_data_type_table  where tp_float <= tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_smallint from full_data_type_table_j  where tp_float <= tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_tinyint from full_data_type_table  where tp_text <= tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_tinyint from full_data_type_table  where tp_text <= tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_tinyint from full_data_type_table_j  where tp_text <= tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_bigint from full_data_type_table  where id_dt <= tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_bigint from full_data_type_table  where id_dt <= tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_bigint from full_data_type_table_j  where id_dt <= tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_longtext,tp_longtext from full_data_type_table  where tp_longtext <= tp_longtext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_longtext,tp_longtext from full_data_type_table  where tp_longtext <= tp_longtext order by id_dt  limit 20")
    val r2 = querySpark("select tp_longtext,tp_longtext from full_data_type_table_j  where tp_longtext <= tp_longtext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_float,tp_decimal from full_data_type_table  where tp_float <= tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_float,tp_decimal from full_data_type_table  where tp_float <= tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_float,tp_decimal from full_data_type_table_j  where tp_float <= tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_int from full_data_type_table  where tp_tinyint <= tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_int from full_data_type_table  where tp_tinyint <= tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_int from full_data_type_table_j  where tp_tinyint <= tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_float from full_data_type_table  where tp_tinytext <= tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_float from full_data_type_table  where tp_tinytext <= tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_float from full_data_type_table_j  where tp_tinytext <= tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_decimal from full_data_type_table  where tp_decimal <= tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_decimal from full_data_type_table  where tp_decimal <= tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_decimal from full_data_type_table_j  where tp_decimal <= tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_bigint from full_data_type_table  where tp_text <= tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_bigint from full_data_type_table  where tp_text <= tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_bigint from full_data_type_table_j  where tp_text <= tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_decimal from full_data_type_table  where tp_mediumint <= tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_decimal from full_data_type_table  where tp_mediumint <= tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_decimal from full_data_type_table_j  where tp_mediumint <= tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_real from full_data_type_table  where tp_decimal <= tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_real from full_data_type_table  where tp_decimal <= tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_real from full_data_type_table_j  where tp_decimal <= tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,id_dt from full_data_type_table  where tp_real <= id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,id_dt from full_data_type_table  where tp_real <= id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,id_dt from full_data_type_table_j  where tp_real <= id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_text from full_data_type_table  where id_dt <= tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_text from full_data_type_table  where id_dt <= tp_text order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_text from full_data_type_table_j  where id_dt <= tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_double from full_data_type_table  where tp_decimal <= tp_double order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_double from full_data_type_table  where tp_decimal <= tp_double order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_double from full_data_type_table_j  where tp_decimal <= tp_double order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_real from full_data_type_table  where tp_int <= tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_real from full_data_type_table  where tp_int <= tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_real from full_data_type_table_j  where tp_int <= tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,id_dt from full_data_type_table  where tp_bigint <= id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,id_dt from full_data_type_table  where tp_bigint <= id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,id_dt from full_data_type_table_j  where tp_bigint <= id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_tinyint from full_data_type_table  where tp_int <= tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_tinyint from full_data_type_table  where tp_int <= tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_tinyint from full_data_type_table_j  where tp_int <= tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_smallint from full_data_type_table  where id_dt <= tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_smallint from full_data_type_table  where id_dt <= tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_smallint from full_data_type_table_j  where id_dt <= tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_date,tp_text from full_data_type_table  where tp_date <= tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_date,tp_text from full_data_type_table  where tp_date <= tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_date,tp_text from full_data_type_table_j  where tp_date <= tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select id_dt,tp_float from full_data_type_table  where id_dt <= tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select id_dt,tp_float from full_data_type_table  where id_dt <= tp_float order by id_dt  limit 20")
    val r2 = querySpark("select id_dt,tp_float from full_data_type_table_j  where id_dt <= tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_real from full_data_type_table  where tp_mediumint <= tp_real order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_real from full_data_type_table  where tp_mediumint <= tp_real order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_real from full_data_type_table_j  where tp_mediumint <= tp_real order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_decimal from full_data_type_table  where tp_int <= tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_decimal from full_data_type_table  where tp_int <= tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_decimal from full_data_type_table_j  where tp_int <= tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,id_dt from full_data_type_table  where tp_tinyint <= id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,id_dt from full_data_type_table  where tp_tinyint <= id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,id_dt from full_data_type_table_j  where tp_tinyint <= id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,id_dt from full_data_type_table  where tp_double <= id_dt order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,id_dt from full_data_type_table  where tp_double <= id_dt order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,id_dt from full_data_type_table_j  where tp_double <= id_dt order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_tinytext from full_data_type_table  where tp_text <= tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_tinytext from full_data_type_table  where tp_text <= tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_tinytext from full_data_type_table_j  where tp_text <= tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_tinyint from full_data_type_table  where tp_double <= tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_tinyint from full_data_type_table  where tp_double <= tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_tinyint from full_data_type_table_j  where tp_double <= tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_decimal from full_data_type_table  where tp_smallint <= tp_decimal order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_decimal from full_data_type_table  where tp_smallint <= tp_decimal order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_decimal from full_data_type_table_j  where tp_smallint <= tp_decimal order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_smallint from full_data_type_table  where tp_bigint <= tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_smallint from full_data_type_table  where tp_bigint <= tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_smallint from full_data_type_table_j  where tp_bigint <= tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_tinytext from full_data_type_table  where tp_decimal <= tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_tinytext from full_data_type_table  where tp_decimal <= tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_tinytext from full_data_type_table_j  where tp_decimal <= tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_date from full_data_type_table  where tp_tinytext <= tp_date order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_date from full_data_type_table  where tp_tinytext <= tp_date order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_date from full_data_type_table_j  where tp_tinytext <= tp_date order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_int from full_data_type_table  where tp_real <= tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_int from full_data_type_table  where tp_real <= tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_int from full_data_type_table_j  where tp_real <= tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_int from full_data_type_table  where tp_mediumint <= tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_int from full_data_type_table  where tp_mediumint <= tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_int from full_data_type_table_j  where tp_mediumint <= tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_tinytext from full_data_type_table  where tp_double <= tp_tinytext order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_tinytext from full_data_type_table  where tp_double <= tp_tinytext order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_tinytext from full_data_type_table_j  where tp_double <= tp_tinytext order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_float from full_data_type_table  where tp_bigint <= tp_float order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_float from full_data_type_table  where tp_bigint <= tp_float order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_float from full_data_type_table_j  where tp_bigint <= tp_float order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_timestamp from full_data_type_table  where tp_tinytext <= tp_timestamp order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_timestamp from full_data_type_table  where tp_tinytext <= tp_timestamp order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_timestamp from full_data_type_table_j  where tp_tinytext <= tp_timestamp order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_bigint from full_data_type_table  where tp_real <= tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_bigint from full_data_type_table  where tp_real <= tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_bigint from full_data_type_table_j  where tp_real <= tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_datetime,tp_text from full_data_type_table  where tp_datetime <= tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_datetime,tp_text from full_data_type_table  where tp_datetime <= tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_datetime,tp_text from full_data_type_table_j  where tp_datetime <= tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_mediumint from full_data_type_table  where tp_mediumint <= tp_mediumint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_mediumint from full_data_type_table  where tp_mediumint <= tp_mediumint order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_mediumint from full_data_type_table_j  where tp_mediumint <= tp_mediumint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_tinyint from full_data_type_table  where tp_tinyint <= tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_tinyint from full_data_type_table  where tp_tinyint <= tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_tinyint from full_data_type_table_j  where tp_tinyint <= tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_tinyint from full_data_type_table  where tp_mediumint <= tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_tinyint from full_data_type_table  where tp_mediumint <= tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_tinyint from full_data_type_table_j  where tp_mediumint <= tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_text from full_data_type_table  where tp_real <= tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_text from full_data_type_table  where tp_real <= tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_text from full_data_type_table_j  where tp_real <= tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_text from full_data_type_table  where tp_decimal <= tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_text from full_data_type_table  where tp_decimal <= tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_text from full_data_type_table_j  where tp_decimal <= tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_int from full_data_type_table  where tp_int <= tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_int from full_data_type_table  where tp_int <= tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_int from full_data_type_table_j  where tp_int <= tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinyint,tp_bigint from full_data_type_table  where tp_tinyint <= tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinyint,tp_bigint from full_data_type_table  where tp_tinyint <= tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinyint,tp_bigint from full_data_type_table_j  where tp_tinyint <= tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_int,tp_text from full_data_type_table  where tp_int <= tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_int,tp_text from full_data_type_table  where tp_int <= tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_int,tp_text from full_data_type_table_j  where tp_int <= tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_blob,tp_blob from full_data_type_table  where tp_blob <= tp_blob order by id_dt  limit 20") {
    val r1 = querySpark("select tp_blob,tp_blob from full_data_type_table  where tp_blob <= tp_blob order by id_dt  limit 20")
    val r2 = querySpark("select tp_blob,tp_blob from full_data_type_table_j  where tp_blob <= tp_blob order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_real,tp_smallint from full_data_type_table  where tp_real <= tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_real,tp_smallint from full_data_type_table  where tp_real <= tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_real,tp_smallint from full_data_type_table_j  where tp_real <= tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_timestamp from full_data_type_table  where tp_text <= tp_timestamp order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_timestamp from full_data_type_table  where tp_text <= tp_timestamp order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_timestamp from full_data_type_table_j  where tp_text <= tp_timestamp order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_smallint,tp_smallint from full_data_type_table  where tp_smallint <= tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_smallint,tp_smallint from full_data_type_table  where tp_smallint <= tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_smallint,tp_smallint from full_data_type_table_j  where tp_smallint <= tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_mediumint,tp_smallint from full_data_type_table  where tp_mediumint <= tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_mediumint,tp_smallint from full_data_type_table  where tp_mediumint <= tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_mediumint,tp_smallint from full_data_type_table_j  where tp_mediumint <= tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_binary,tp_binary from full_data_type_table  where tp_binary <= tp_binary order by id_dt  limit 20") {
    val r1 = querySpark("select tp_binary,tp_binary from full_data_type_table  where tp_binary <= tp_binary order by id_dt  limit 20")
    val r2 = querySpark("select tp_binary,tp_binary from full_data_type_table_j  where tp_binary <= tp_binary order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_text,tp_datetime from full_data_type_table  where tp_text <= tp_datetime order by id_dt  limit 20") {
    val r1 = querySpark("select tp_text,tp_datetime from full_data_type_table  where tp_text <= tp_datetime order by id_dt  limit 20")
    val r2 = querySpark("select tp_text,tp_datetime from full_data_type_table_j  where tp_text <= tp_datetime order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_tinytext,tp_int from full_data_type_table  where tp_tinytext <= tp_int order by id_dt  limit 20") {
    val r1 = querySpark("select tp_tinytext,tp_int from full_data_type_table  where tp_tinytext <= tp_int order by id_dt  limit 20")
    val r2 = querySpark("select tp_tinytext,tp_int from full_data_type_table_j  where tp_tinytext <= tp_int order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_bigint from full_data_type_table  where tp_double <= tp_bigint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_bigint from full_data_type_table  where tp_double <= tp_bigint order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_bigint from full_data_type_table_j  where tp_double <= tp_bigint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_decimal,tp_tinyint from full_data_type_table  where tp_decimal <= tp_tinyint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_decimal,tp_tinyint from full_data_type_table  where tp_decimal <= tp_tinyint order by id_dt  limit 20")
    val r2 = querySpark("select tp_decimal,tp_tinyint from full_data_type_table_j  where tp_decimal <= tp_tinyint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_varchar,tp_varchar from full_data_type_table  where tp_varchar <= tp_varchar order by id_dt  limit 20") {
    val r1 = querySpark("select tp_varchar,tp_varchar from full_data_type_table  where tp_varchar <= tp_varchar order by id_dt  limit 20")
    val r2 = querySpark("select tp_varchar,tp_varchar from full_data_type_table_j  where tp_varchar <= tp_varchar order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_char,tp_char from full_data_type_table  where tp_char <= tp_char order by id_dt  limit 20") {
    val r1 = querySpark("select tp_char,tp_char from full_data_type_table  where tp_char <= tp_char order by id_dt  limit 20")
    val r2 = querySpark("select tp_char,tp_char from full_data_type_table_j  where tp_char <= tp_char order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_date,tp_date from full_data_type_table  where tp_date <= tp_date order by id_dt  limit 20") {
    val r1 = querySpark("select tp_date,tp_date from full_data_type_table  where tp_date <= tp_date order by id_dt  limit 20")
    val r2 = querySpark("select tp_date,tp_date from full_data_type_table_j  where tp_date <= tp_date order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_bigint,tp_text from full_data_type_table  where tp_bigint <= tp_text order by id_dt  limit 20") {
    val r1 = querySpark("select tp_bigint,tp_text from full_data_type_table  where tp_bigint <= tp_text order by id_dt  limit 20")
    val r2 = querySpark("select tp_bigint,tp_text from full_data_type_table_j  where tp_bigint <= tp_text order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           

  test("select tp_double,tp_smallint from full_data_type_table  where tp_double <= tp_smallint order by id_dt  limit 20") {
    val r1 = querySpark("select tp_double,tp_smallint from full_data_type_table  where tp_double <= tp_smallint order by id_dt  limit 20")
    val r2 = querySpark("select tp_double,tp_smallint from full_data_type_table_j  where tp_double <= tp_smallint order by id_dt  limit 20")
    val result = compResult(r1, r2)
    if (!result) {
      fail(s"Failed with \nTiSpark:\t\t$r1\nSpark With JDBC:$r2")
    }
  }
           
}