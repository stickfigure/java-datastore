/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/entity.proto

package com.google.datastore.v1;

public interface ValueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1.Value)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 11;</code>
   *
   * @return Whether the nullValue field is set.
   */
  boolean hasNullValue();
  /**
   *
   *
   * <pre>
   * A null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 11;</code>
   *
   * @return The enum numeric value on the wire for nullValue.
   */
  int getNullValueValue();
  /**
   *
   *
   * <pre>
   * A null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 11;</code>
   *
   * @return The nullValue.
   */
  com.google.protobuf.NullValue getNullValue();

  /**
   *
   *
   * <pre>
   * A boolean value.
   * </pre>
   *
   * <code>bool boolean_value = 1;</code>
   *
   * @return Whether the booleanValue field is set.
   */
  boolean hasBooleanValue();
  /**
   *
   *
   * <pre>
   * A boolean value.
   * </pre>
   *
   * <code>bool boolean_value = 1;</code>
   *
   * @return The booleanValue.
   */
  boolean getBooleanValue();

  /**
   *
   *
   * <pre>
   * An integer value.
   * </pre>
   *
   * <code>int64 integer_value = 2;</code>
   *
   * @return Whether the integerValue field is set.
   */
  boolean hasIntegerValue();
  /**
   *
   *
   * <pre>
   * An integer value.
   * </pre>
   *
   * <code>int64 integer_value = 2;</code>
   *
   * @return The integerValue.
   */
  long getIntegerValue();

  /**
   *
   *
   * <pre>
   * A double value.
   * </pre>
   *
   * <code>double double_value = 3;</code>
   *
   * @return Whether the doubleValue field is set.
   */
  boolean hasDoubleValue();
  /**
   *
   *
   * <pre>
   * A double value.
   * </pre>
   *
   * <code>double double_value = 3;</code>
   *
   * @return The doubleValue.
   */
  double getDoubleValue();

  /**
   *
   *
   * <pre>
   * A timestamp value.
   * When stored in the Datastore, precise only to microseconds;
   * any additional precision is rounded down.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp_value = 10;</code>
   *
   * @return Whether the timestampValue field is set.
   */
  boolean hasTimestampValue();
  /**
   *
   *
   * <pre>
   * A timestamp value.
   * When stored in the Datastore, precise only to microseconds;
   * any additional precision is rounded down.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp_value = 10;</code>
   *
   * @return The timestampValue.
   */
  com.google.protobuf.Timestamp getTimestampValue();
  /**
   *
   *
   * <pre>
   * A timestamp value.
   * When stored in the Datastore, precise only to microseconds;
   * any additional precision is rounded down.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp_value = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampValueOrBuilder();

  /**
   *
   *
   * <pre>
   * A key value.
   * </pre>
   *
   * <code>.google.datastore.v1.Key key_value = 5;</code>
   *
   * @return Whether the keyValue field is set.
   */
  boolean hasKeyValue();
  /**
   *
   *
   * <pre>
   * A key value.
   * </pre>
   *
   * <code>.google.datastore.v1.Key key_value = 5;</code>
   *
   * @return The keyValue.
   */
  com.google.datastore.v1.Key getKeyValue();
  /**
   *
   *
   * <pre>
   * A key value.
   * </pre>
   *
   * <code>.google.datastore.v1.Key key_value = 5;</code>
   */
  com.google.datastore.v1.KeyOrBuilder getKeyValueOrBuilder();

  /**
   *
   *
   * <pre>
   * A UTF-8 encoded string value.
   * When `exclude_from_indexes` is false (it is indexed) , may have at most 1500 bytes.
   * Otherwise, may be set to at most 1,000,000 bytes.
   * </pre>
   *
   * <code>string string_value = 17;</code>
   *
   * @return Whether the stringValue field is set.
   */
  boolean hasStringValue();
  /**
   *
   *
   * <pre>
   * A UTF-8 encoded string value.
   * When `exclude_from_indexes` is false (it is indexed) , may have at most 1500 bytes.
   * Otherwise, may be set to at most 1,000,000 bytes.
   * </pre>
   *
   * <code>string string_value = 17;</code>
   *
   * @return The stringValue.
   */
  java.lang.String getStringValue();
  /**
   *
   *
   * <pre>
   * A UTF-8 encoded string value.
   * When `exclude_from_indexes` is false (it is indexed) , may have at most 1500 bytes.
   * Otherwise, may be set to at most 1,000,000 bytes.
   * </pre>
   *
   * <code>string string_value = 17;</code>
   *
   * @return The bytes for stringValue.
   */
  com.google.protobuf.ByteString getStringValueBytes();

  /**
   *
   *
   * <pre>
   * A blob value.
   * May have at most 1,000,000 bytes.
   * When `exclude_from_indexes` is false, may have at most 1500 bytes.
   * In JSON requests, must be base64-encoded.
   * </pre>
   *
   * <code>bytes blob_value = 18;</code>
   *
   * @return Whether the blobValue field is set.
   */
  boolean hasBlobValue();
  /**
   *
   *
   * <pre>
   * A blob value.
   * May have at most 1,000,000 bytes.
   * When `exclude_from_indexes` is false, may have at most 1500 bytes.
   * In JSON requests, must be base64-encoded.
   * </pre>
   *
   * <code>bytes blob_value = 18;</code>
   *
   * @return The blobValue.
   */
  com.google.protobuf.ByteString getBlobValue();

  /**
   *
   *
   * <pre>
   * A geo point value representing a point on the surface of Earth.
   * </pre>
   *
   * <code>.google.type.LatLng geo_point_value = 8;</code>
   *
   * @return Whether the geoPointValue field is set.
   */
  boolean hasGeoPointValue();
  /**
   *
   *
   * <pre>
   * A geo point value representing a point on the surface of Earth.
   * </pre>
   *
   * <code>.google.type.LatLng geo_point_value = 8;</code>
   *
   * @return The geoPointValue.
   */
  com.google.type.LatLng getGeoPointValue();
  /**
   *
   *
   * <pre>
   * A geo point value representing a point on the surface of Earth.
   * </pre>
   *
   * <code>.google.type.LatLng geo_point_value = 8;</code>
   */
  com.google.type.LatLngOrBuilder getGeoPointValueOrBuilder();

  /**
   *
   *
   * <pre>
   * An entity value.
   * - May have no key.
   * - May have a key with an incomplete key path.
   * - May have a reserved/read-only key.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity entity_value = 6;</code>
   *
   * @return Whether the entityValue field is set.
   */
  boolean hasEntityValue();
  /**
   *
   *
   * <pre>
   * An entity value.
   * - May have no key.
   * - May have a key with an incomplete key path.
   * - May have a reserved/read-only key.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity entity_value = 6;</code>
   *
   * @return The entityValue.
   */
  com.google.datastore.v1.Entity getEntityValue();
  /**
   *
   *
   * <pre>
   * An entity value.
   * - May have no key.
   * - May have a key with an incomplete key path.
   * - May have a reserved/read-only key.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity entity_value = 6;</code>
   */
  com.google.datastore.v1.EntityOrBuilder getEntityValueOrBuilder();

  /**
   *
   *
   * <pre>
   * An array value.
   * Cannot contain another array value.
   * A `Value` instance that sets field `array_value` must not set fields
   * `meaning` or `exclude_from_indexes`.
   * </pre>
   *
   * <code>.google.datastore.v1.ArrayValue array_value = 9;</code>
   *
   * @return Whether the arrayValue field is set.
   */
  boolean hasArrayValue();
  /**
   *
   *
   * <pre>
   * An array value.
   * Cannot contain another array value.
   * A `Value` instance that sets field `array_value` must not set fields
   * `meaning` or `exclude_from_indexes`.
   * </pre>
   *
   * <code>.google.datastore.v1.ArrayValue array_value = 9;</code>
   *
   * @return The arrayValue.
   */
  com.google.datastore.v1.ArrayValue getArrayValue();
  /**
   *
   *
   * <pre>
   * An array value.
   * Cannot contain another array value.
   * A `Value` instance that sets field `array_value` must not set fields
   * `meaning` or `exclude_from_indexes`.
   * </pre>
   *
   * <code>.google.datastore.v1.ArrayValue array_value = 9;</code>
   */
  com.google.datastore.v1.ArrayValueOrBuilder getArrayValueOrBuilder();

  /**
   *
   *
   * <pre>
   * The `meaning` field should only be populated for backwards compatibility.
   * </pre>
   *
   * <code>int32 meaning = 14;</code>
   *
   * @return The meaning.
   */
  int getMeaning();

  /**
   *
   *
   * <pre>
   * If the value should be excluded from all indexes including those defined
   * explicitly.
   * </pre>
   *
   * <code>bool exclude_from_indexes = 19;</code>
   *
   * @return The excludeFromIndexes.
   */
  boolean getExcludeFromIndexes();

  public com.google.datastore.v1.Value.ValueTypeCase getValueTypeCase();
}
