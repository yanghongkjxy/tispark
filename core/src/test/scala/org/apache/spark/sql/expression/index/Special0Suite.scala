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

package org.apache.spark.sql.expression.index

import org.apache.spark.sql.BaseTiSparkSuite
import org.apache.spark.sql.test.SharedSQLContext

class Special0Suite extends BaseTiSparkSuite with SharedSQLContext {

  test("select * from full_data_type_table_idx where tp_date = date(date '2017-10-30')") {
    runTest(
      "select * from full_data_type_table_idx where tp_date = date(date '2017-10-30')",
      "select * from full_data_type_table_idx_j where tp_date = date(date '2017-10-30')"
    )
  }

  test("select * from full_data_type_table_idx where tp_date = date(date '2017-11-02')") {
    runTest(
      "select * from full_data_type_table_idx where tp_date = date(date '2017-11-02')",
      "select * from full_data_type_table_idx_j where tp_date = date(date '2017-11-02')"
    )
  }

  test("select * from full_data_type_table_idx where tp_date < date(date '2017-10-30')") {
    runTest(
      "select * from full_data_type_table_idx where tp_date < date(date '2017-10-30')",
      "select * from full_data_type_table_idx_j where tp_date < date(date '2017-10-30')"
    )
  }

  test("select * from full_data_type_table_idx where tp_date < date(date '2017-11-02')") {
    runTest(
      "select * from full_data_type_table_idx where tp_date < date(date '2017-11-02')",
      "select * from full_data_type_table_idx_j where tp_date < date(date '2017-11-02')"
    )
  }

  test("select * from full_data_type_table_idx where tp_date > date(date '2017-10-30')") {
    runTest(
      "select * from full_data_type_table_idx where tp_date > date(date '2017-10-30')",
      "select * from full_data_type_table_idx_j where tp_date > date(date '2017-10-30')"
    )
  }

  test("select * from full_data_type_table_idx where tp_date > date(date '2017-11-02')") {
    runTest(
      "select * from full_data_type_table_idx where tp_date > date(date '2017-11-02')",
      "select * from full_data_type_table_idx_j where tp_date > date(date '2017-11-02')"
    )
  }

  test("select * from full_data_type_table_idx where tp_date <= date(date '2017-10-30')") {
    runTest(
      "select * from full_data_type_table_idx where tp_date <= date(date '2017-10-30')",
      "select * from full_data_type_table_idx_j where tp_date <= date(date '2017-10-30')"
    )
  }

  test("select * from full_data_type_table_idx where tp_date <= date(date '2017-11-02')") {
    runTest(
      "select * from full_data_type_table_idx where tp_date <= date(date '2017-11-02')",
      "select * from full_data_type_table_idx_j where tp_date <= date(date '2017-11-02')"
    )
  }

  test("select * from full_data_type_table_idx where tp_date >= date(date '2017-10-30')") {
    runTest(
      "select * from full_data_type_table_idx where tp_date >= date(date '2017-10-30')",
      "select * from full_data_type_table_idx_j where tp_date >= date(date '2017-10-30')"
    )
  }

  test("select * from full_data_type_table_idx where tp_date >= date(date '2017-11-02')") {
    runTest(
      "select * from full_data_type_table_idx where tp_date >= date(date '2017-11-02')",
      "select * from full_data_type_table_idx_j where tp_date >= date(date '2017-11-02')"
    )
  }

  test("select * from full_data_type_table_idx where tp_date != date(date '2017-10-30')") {
    runTest(
      "select * from full_data_type_table_idx where tp_date != date(date '2017-10-30')",
      "select * from full_data_type_table_idx_j where tp_date != date(date '2017-10-30')"
    )
  }

  test("select * from full_data_type_table_idx where tp_date != date(date '2017-11-02')") {
    runTest(
      "select * from full_data_type_table_idx where tp_date != date(date '2017-11-02')",
      "select * from full_data_type_table_idx_j where tp_date != date(date '2017-11-02')"
    )
  }

  test("select * from full_data_type_table_idx where tp_date <> date(date '2017-10-30')") {
    runTest(
      "select * from full_data_type_table_idx where tp_date <> date(date '2017-10-30')",
      "select * from full_data_type_table_idx_j where tp_date <> date(date '2017-10-30')"
    )
  }

  test("select * from full_data_type_table_idx where tp_date <> date(date '2017-11-02')") {
    runTest(
      "select * from full_data_type_table_idx where tp_date <> date(date '2017-11-02')",
      "select * from full_data_type_table_idx_j where tp_date <> date(date '2017-11-02')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime = timestamp(timestamp '2017-11-02 00:00:00')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime = timestamp(timestamp '2017-11-02 00:00:00')",
      "select * from full_data_type_table_idx_j where tp_datetime = timestamp(timestamp '2017-11-02 00:00:00')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime = timestamp(timestamp '2017-11-02 08:47:43')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime = timestamp(timestamp '2017-11-02 08:47:43')",
      "select * from full_data_type_table_idx_j where tp_datetime = timestamp(timestamp '2017-11-02 08:47:43')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime = timestamp(timestamp '2017-09-07 11:11:11')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime = timestamp(timestamp '2017-09-07 11:11:11')",
      "select * from full_data_type_table_idx_j where tp_datetime = timestamp(timestamp '2017-09-07 11:11:11')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime < timestamp(timestamp '2017-11-02 00:00:00')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime < timestamp(timestamp '2017-11-02 00:00:00')",
      "select * from full_data_type_table_idx_j where tp_datetime < timestamp(timestamp '2017-11-02 00:00:00')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime < timestamp(timestamp '2017-11-02 08:47:43')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime < timestamp(timestamp '2017-11-02 08:47:43')",
      "select * from full_data_type_table_idx_j where tp_datetime < timestamp(timestamp '2017-11-02 08:47:43')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime < timestamp(timestamp '2017-09-07 11:11:11')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime < timestamp(timestamp '2017-09-07 11:11:11')",
      "select * from full_data_type_table_idx_j where tp_datetime < timestamp(timestamp '2017-09-07 11:11:11')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime > timestamp(timestamp '2017-11-02 00:00:00')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime > timestamp(timestamp '2017-11-02 00:00:00')",
      "select * from full_data_type_table_idx_j where tp_datetime > timestamp(timestamp '2017-11-02 00:00:00')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime > timestamp(timestamp '2017-11-02 08:47:43')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime > timestamp(timestamp '2017-11-02 08:47:43')",
      "select * from full_data_type_table_idx_j where tp_datetime > timestamp(timestamp '2017-11-02 08:47:43')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime > timestamp(timestamp '2017-09-07 11:11:11')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime > timestamp(timestamp '2017-09-07 11:11:11')",
      "select * from full_data_type_table_idx_j where tp_datetime > timestamp(timestamp '2017-09-07 11:11:11')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime <= timestamp(timestamp '2017-11-02 00:00:00')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime <= timestamp(timestamp '2017-11-02 00:00:00')",
      "select * from full_data_type_table_idx_j where tp_datetime <= timestamp(timestamp '2017-11-02 00:00:00')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime <= timestamp(timestamp '2017-11-02 08:47:43')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime <= timestamp(timestamp '2017-11-02 08:47:43')",
      "select * from full_data_type_table_idx_j where tp_datetime <= timestamp(timestamp '2017-11-02 08:47:43')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime <= timestamp(timestamp '2017-09-07 11:11:11')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime <= timestamp(timestamp '2017-09-07 11:11:11')",
      "select * from full_data_type_table_idx_j where tp_datetime <= timestamp(timestamp '2017-09-07 11:11:11')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime >= timestamp(timestamp '2017-11-02 00:00:00')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime >= timestamp(timestamp '2017-11-02 00:00:00')",
      "select * from full_data_type_table_idx_j where tp_datetime >= timestamp(timestamp '2017-11-02 00:00:00')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime >= timestamp(timestamp '2017-11-02 08:47:43')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime >= timestamp(timestamp '2017-11-02 08:47:43')",
      "select * from full_data_type_table_idx_j where tp_datetime >= timestamp(timestamp '2017-11-02 08:47:43')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime >= timestamp(timestamp '2017-09-07 11:11:11')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime >= timestamp(timestamp '2017-09-07 11:11:11')",
      "select * from full_data_type_table_idx_j where tp_datetime >= timestamp(timestamp '2017-09-07 11:11:11')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime != timestamp(timestamp '2017-11-02 00:00:00')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime != timestamp(timestamp '2017-11-02 00:00:00')",
      "select * from full_data_type_table_idx_j where tp_datetime != timestamp(timestamp '2017-11-02 00:00:00')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime != timestamp(timestamp '2017-11-02 08:47:43')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime != timestamp(timestamp '2017-11-02 08:47:43')",
      "select * from full_data_type_table_idx_j where tp_datetime != timestamp(timestamp '2017-11-02 08:47:43')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime != timestamp(timestamp '2017-09-07 11:11:11')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime != timestamp(timestamp '2017-09-07 11:11:11')",
      "select * from full_data_type_table_idx_j where tp_datetime != timestamp(timestamp '2017-09-07 11:11:11')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime <> timestamp(timestamp '2017-11-02 00:00:00')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime <> timestamp(timestamp '2017-11-02 00:00:00')",
      "select * from full_data_type_table_idx_j where tp_datetime <> timestamp(timestamp '2017-11-02 00:00:00')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime <> timestamp(timestamp '2017-11-02 08:47:43')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime <> timestamp(timestamp '2017-11-02 08:47:43')",
      "select * from full_data_type_table_idx_j where tp_datetime <> timestamp(timestamp '2017-11-02 08:47:43')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_datetime <> timestamp(timestamp '2017-09-07 11:11:11')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_datetime <> timestamp(timestamp '2017-09-07 11:11:11')",
      "select * from full_data_type_table_idx_j where tp_datetime <> timestamp(timestamp '2017-09-07 11:11:11')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp = timestamp(timestamp '2017-11-02 00:00:00')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp = timestamp(timestamp '2017-11-02 00:00:00')",
      "select * from full_data_type_table_idx_j where tp_timestamp = timestamp(timestamp '2017-11-02 00:00:00')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp = timestamp(timestamp '2017-11-02 08:47:43')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp = timestamp(timestamp '2017-11-02 08:47:43')",
      "select * from full_data_type_table_idx_j where tp_timestamp = timestamp(timestamp '2017-11-02 08:47:43')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp = timestamp(timestamp '2017-09-07 11:11:11')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp = timestamp(timestamp '2017-09-07 11:11:11')",
      "select * from full_data_type_table_idx_j where tp_timestamp = timestamp(timestamp '2017-09-07 11:11:11')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp < timestamp(timestamp '2017-11-02 00:00:00')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp < timestamp(timestamp '2017-11-02 00:00:00')",
      "select * from full_data_type_table_idx_j where tp_timestamp < timestamp(timestamp '2017-11-02 00:00:00')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp < timestamp(timestamp '2017-11-02 08:47:43')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp < timestamp(timestamp '2017-11-02 08:47:43')",
      "select * from full_data_type_table_idx_j where tp_timestamp < timestamp(timestamp '2017-11-02 08:47:43')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp < timestamp(timestamp '2017-09-07 11:11:11')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp < timestamp(timestamp '2017-09-07 11:11:11')",
      "select * from full_data_type_table_idx_j where tp_timestamp < timestamp(timestamp '2017-09-07 11:11:11')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp > timestamp(timestamp '2017-11-02 00:00:00')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp > timestamp(timestamp '2017-11-02 00:00:00')",
      "select * from full_data_type_table_idx_j where tp_timestamp > timestamp(timestamp '2017-11-02 00:00:00')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp > timestamp(timestamp '2017-11-02 08:47:43')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp > timestamp(timestamp '2017-11-02 08:47:43')",
      "select * from full_data_type_table_idx_j where tp_timestamp > timestamp(timestamp '2017-11-02 08:47:43')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp > timestamp(timestamp '2017-09-07 11:11:11')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp > timestamp(timestamp '2017-09-07 11:11:11')",
      "select * from full_data_type_table_idx_j where tp_timestamp > timestamp(timestamp '2017-09-07 11:11:11')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp <= timestamp(timestamp '2017-11-02 00:00:00')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp <= timestamp(timestamp '2017-11-02 00:00:00')",
      "select * from full_data_type_table_idx_j where tp_timestamp <= timestamp(timestamp '2017-11-02 00:00:00')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp <= timestamp(timestamp '2017-11-02 08:47:43')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp <= timestamp(timestamp '2017-11-02 08:47:43')",
      "select * from full_data_type_table_idx_j where tp_timestamp <= timestamp(timestamp '2017-11-02 08:47:43')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp <= timestamp(timestamp '2017-09-07 11:11:11')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp <= timestamp(timestamp '2017-09-07 11:11:11')",
      "select * from full_data_type_table_idx_j where tp_timestamp <= timestamp(timestamp '2017-09-07 11:11:11')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp >= timestamp(timestamp '2017-11-02 00:00:00')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp >= timestamp(timestamp '2017-11-02 00:00:00')",
      "select * from full_data_type_table_idx_j where tp_timestamp >= timestamp(timestamp '2017-11-02 00:00:00')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp >= timestamp(timestamp '2017-11-02 08:47:43')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp >= timestamp(timestamp '2017-11-02 08:47:43')",
      "select * from full_data_type_table_idx_j where tp_timestamp >= timestamp(timestamp '2017-11-02 08:47:43')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp >= timestamp(timestamp '2017-09-07 11:11:11')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp >= timestamp(timestamp '2017-09-07 11:11:11')",
      "select * from full_data_type_table_idx_j where tp_timestamp >= timestamp(timestamp '2017-09-07 11:11:11')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp != timestamp(timestamp '2017-11-02 00:00:00')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp != timestamp(timestamp '2017-11-02 00:00:00')",
      "select * from full_data_type_table_idx_j where tp_timestamp != timestamp(timestamp '2017-11-02 00:00:00')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp != timestamp(timestamp '2017-11-02 08:47:43')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp != timestamp(timestamp '2017-11-02 08:47:43')",
      "select * from full_data_type_table_idx_j where tp_timestamp != timestamp(timestamp '2017-11-02 08:47:43')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp != timestamp(timestamp '2017-09-07 11:11:11')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp != timestamp(timestamp '2017-09-07 11:11:11')",
      "select * from full_data_type_table_idx_j where tp_timestamp != timestamp(timestamp '2017-09-07 11:11:11')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp <> timestamp(timestamp '2017-11-02 00:00:00')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp <> timestamp(timestamp '2017-11-02 00:00:00')",
      "select * from full_data_type_table_idx_j where tp_timestamp <> timestamp(timestamp '2017-11-02 00:00:00')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp <> timestamp(timestamp '2017-11-02 08:47:43')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp <> timestamp(timestamp '2017-11-02 08:47:43')",
      "select * from full_data_type_table_idx_j where tp_timestamp <> timestamp(timestamp '2017-11-02 08:47:43')"
    )
  }

  test(
    "select * from full_data_type_table_idx where tp_timestamp <> timestamp(timestamp '2017-09-07 11:11:11')"
  ) {
    runTest(
      "select * from full_data_type_table_idx where tp_timestamp <> timestamp(timestamp '2017-09-07 11:11:11')",
      "select * from full_data_type_table_idx_j where tp_timestamp <> timestamp(timestamp '2017-09-07 11:11:11')"
    )
  }

}