/**
 * Copyright 2015-2020 jiuxian.com.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jiuxian.mossrose.job;

import java.io.Serializable;

/**
 * 简单任务
 * <p>
 * 任务会在集群中任意节点上执行，但不会被切分
 * 
 * 例：
 * 
 * <pre>
 * public class SimpleExampleJob implements SimpleJob<Serializable> {
 *
 * 	&#64;Override
 * 	public Executor<Serializable> executor() {
 * 		return new Executor<Serializable>() {
 *
 * 			&#64;Override
 * 			public void execute(Serializable item) {
 * 				// Ignore the argument
 * 				// Do you job
 * 			}
 * 		};
 * 	}
 *
 * }
 * </pre>
 * 
 * @author <a href="mailto:wangyuxuan@jiuxian.com">Yuxuan Wang</a>
 *
 * @param <T>
 *            无意义，仅为接口一致性
 */
public interface SimpleJob<T extends Serializable> extends MJob<T> {

}
