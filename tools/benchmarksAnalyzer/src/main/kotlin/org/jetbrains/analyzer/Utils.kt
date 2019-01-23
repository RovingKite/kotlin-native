/*
 * Copyright 2010-2018 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.analyzer

expect fun readFile(fileName: String): String
expect fun format(number: Double, decimalNumber: Int = 4): String
expect fun writeToFile(fileName: String, text: String)
expect fun assert(value: Boolean, lazyMessage: () -> Any)
expect fun getEnv(variableName:String): String?
expect fun sendGetRequest(url: String, user: String? = null, password: String? = null,
                          followLocation: Boolean = false) : String