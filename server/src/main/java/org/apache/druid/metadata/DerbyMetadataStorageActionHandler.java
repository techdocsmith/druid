/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.druid.metadata;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.annotations.VisibleForTesting;

public class DerbyMetadataStorageActionHandler<EntryType, StatusType, LogType, LockType>
    extends SQLMetadataStorageActionHandler<EntryType, StatusType, LogType, LockType>
{
  @VisibleForTesting
  DerbyMetadataStorageActionHandler(
      SQLMetadataConnector connector,
      ObjectMapper jsonMapper,
      MetadataStorageActionHandlerTypes<EntryType, StatusType, LogType, LockType> types,
      String entryTypeName,
      String entryTable,
      String logTable,
      String lockTable
  )
  {
    super(connector, jsonMapper, types, entryTypeName, entryTable, logTable, lockTable);
  }

  @Override
  protected String decorateSqlWithLimit(String sql)
  {
    return sql + " FETCH FIRST :n ROWS ONLY";
  }

}
