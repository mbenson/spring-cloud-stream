/*
 * Copyright 2016 the original author or authors.
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
package org.springframework.cloud.stream.binding;

import java.util.Collections;
import java.util.Set;

/**
 * Default adapter implementation for {@Bindable}.
 *
 * @author Ilayaperumal Gopinathan
 */
public class BindableAdapter implements Bindable {


	@Override
	public void bindInputs(ChannelBindingService adapter) {
	}

	@Override
	public void bindOutputs(ChannelBindingService adapter) {
	}

	@Override
	public void unbindInputs(ChannelBindingService adapter) {
	}

	@Override
	public void unbindOutputs(ChannelBindingService adapter) {
	}

	@Override
	public Set<String> getInputs() {
		return Collections.emptySet();
	}

	@Override
	public Set<String> getOutputs() {
		return Collections.emptySet();
	}
}
