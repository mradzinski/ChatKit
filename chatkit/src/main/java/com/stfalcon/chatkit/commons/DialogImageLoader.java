/*
 * Copyright (c) 2019. DNA Software. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.stfalcon.chatkit.commons;

import android.widget.ImageView;

import com.stfalcon.chatkit.commons.models.IDialog;

/**
 * Callback for implementing images loading in dialogs list
 */
public interface DialogImageLoader<T extends IDialog> {

    void loadImage(ImageView imageView, T dialog, String url);

}