/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.client.consumer.listener;

public enum ConsumeOrderlyStatus {
    /**
     * Success consumption
     * 消费成功但不提交
     */
    SUCCESS,
    /**
     * Rollback consumption(only for binlog consumption)
     * 消费失败，消费回滚
     */
    @Deprecated
    ROLLBACK,
    /**
     * Commit offset(only for binlog consumption)
     * 消费成功并且提交
     */
    @Deprecated
    COMMIT,
    /**
     * Suspend current queue a moment
     * 消费失败，挂起消费队列一会，稍后继续消费
     */
    SUSPEND_CURRENT_QUEUE_A_MOMENT;
}
