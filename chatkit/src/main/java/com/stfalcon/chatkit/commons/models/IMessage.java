/*******************************************************************************
 * Copyright 2016 stfalcon.com
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package com.stfalcon.chatkit.commons.models;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;

/**
 * For implementing by real message model
 */
public interface IMessage {

	String TYPE_TEXT   = "text";
	String TYPE_TYPING = "typing";

	@StringDef({TYPE_TEXT, TYPE_TYPING})
	@Retention(RetentionPolicy.SOURCE)
	@interface Type {
	}

	/**
	 * Returns message identifier
	 *
	 * @return the message id
	 */
	String getId();

	/**
	 * Returns message type
	 *
	 * @return the message type
	 */
	@Type
	String getType();

	/**
	 * Returns message text
	 *
	 * @return the message text
	 */
	String getText();

	/**
	 * Returns message author. See the {@link IUser} for more details
	 *
	 * @return the message author
	 */
	IUser getUser();

	/**
	 * Returns message creation date
	 *
	 * @return the message creation date
	 */
	Date getCreatedAt();
}
