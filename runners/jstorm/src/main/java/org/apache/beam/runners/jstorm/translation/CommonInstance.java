/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.beam.runners.jstorm.translation;

/**
 * Common definition of JStorm runner.
 */
public class CommonInstance {
  public static final String KEY = "Key";
  public static final String VALUE = "Value";

  public static final String BEAM_WATERMARK_STREAM_ID = "BEAM_WATERMARK";

  public static final String METRIC_KEY_SEPARATOR = "__";
  public static final String BEAM_SOURCE_WATERMARK_METRICS = "__beam_source_watermark";
  public static final String BEAM_INPUT_WATERMARK_METRICS = "__beam_input_watermark";
  public static final String BEAM_OUTPUT_WATERMARK_METRICS = "__beam_output_watermark";
}
