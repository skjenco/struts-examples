/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.demo;

import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <code>Set welcome message.</code>
 */
public class ProduceAction extends ActionSupport {

    private List<MyBean> list;

    public String execute() throws Exception {
        list = new ArrayList<MyBean>();
        MyBean bean = new MyBean(2, Arrays.asList("Lukas", "Antonio"));
        list.add(bean);
        bean = new MyBean(2, Arrays.asList("Stephen", "Jensen"));
        list.add(bean);
        bean = new MyBean(2, Arrays.asList("Kirk", "Jensen"));
        list.add(bean);
        return SUCCESS;
    }

    public List<MyBean> getList() {
        return list;
    }

    //public MyBean getBean() {
//        return bean;
//    }
}
