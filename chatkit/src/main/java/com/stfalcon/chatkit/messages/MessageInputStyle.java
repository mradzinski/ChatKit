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

package com.stfalcon.chatkit.messages;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

import com.stfalcon.chatkit.R;
import com.stfalcon.chatkit.commons.Style;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.core.graphics.drawable.DrawableCompat;

/**
 * Style for MessageInputStyle customization by xml attributes
 */
@SuppressWarnings("WeakerAccess")
public class MessageInputStyle extends Style {

    private static final int DEFAULT_MAX_LINES = 5;
    private static final int DEFAULT_DELAY_TYPING_STATUS = 1500;

    private boolean showAttachmentButton;

    private int attachmentButtonBackground;
    private int attachmentButtonDefaultBgColor;
    private int attachmentButtonDefaultBgPressedColor;
    private int attachmentButtonDefaultBgDisabledColor;

    private int attachmentButtonIcon;
    private int attachmentButtonDefaultIconColor;
    private int attachmentButtonDefaultIconPressedColor;
    private int attachmentButtonDefaultIconDisabledColor;

    private int attachmentButtonWidth;
    private int attachmentButtonHeight;
    private int attachmentButtonMargin;

    private int inputButtonBackground;
    private int inputButtonDefaultBgColor;
    private int inputButtonDefaultBgPressedColor;
    private int inputButtonDefaultBgDisabledColor;

    private int inputButtonIcon;
    private int inputButtonDefaultIconColor;
    private int inputButtonDefaultIconPressedColor;
    private int inputButtonDefaultIconDisabledColor;

    private int inputButtonWidth;
    private int inputButtonHeight;
    private int inputButtonMargin;

    private int inputMaxLines;
    private String inputHint;
    private String inputText;

    private int inputTextSize;
    private int inputTextColor;
    private int inputHintColor;

    private Drawable inputBackground;
    private Drawable inputCursorDrawable;

    private int inputDefaultPaddingLeft;
    private int inputDefaultPaddingRight;
    private int inputDefaultPaddingTop;
    private int inputDefaultPaddingBottom;

    private int delayTypingStatus;

    static MessageInputStyle parse(Context context, AttributeSet attrs) {
        MessageInputStyle style = new MessageInputStyle(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MessageInput);

        style.showAttachmentButton = typedArray.getBoolean(R.styleable.MessageInput_showAttachmentButton, false);

        style.attachmentButtonBackground = typedArray.getResourceId(R.styleable.MessageInput_attachmentButtonBackground, -1);
        style.attachmentButtonDefaultBgColor = typedArray.getColor(R.styleable.MessageInput_attachmentButtonDefaultBgColor,
                style.getColor(R.color.white_four));
        style.attachmentButtonDefaultBgPressedColor = typedArray.getColor(R.styleable.MessageInput_attachmentButtonDefaultBgPressedColor,
                style.getColor(R.color.white_five));
        style.attachmentButtonDefaultBgDisabledColor = typedArray.getColor(R.styleable.MessageInput_attachmentButtonDefaultBgDisabledColor,
                style.getColor(R.color.transparent));

        style.attachmentButtonIcon = typedArray.getResourceId(R.styleable.MessageInput_attachmentButtonIcon, -1);
        style.attachmentButtonDefaultIconColor = typedArray.getColor(R.styleable.MessageInput_attachmentButtonDefaultIconColor,
                style.getColor(R.color.cornflower_blue_two));
        style.attachmentButtonDefaultIconPressedColor = typedArray.getColor(R.styleable.MessageInput_attachmentButtonDefaultIconPressedColor,
                style.getColor(R.color.cornflower_blue_two_dark));
        style.attachmentButtonDefaultIconDisabledColor = typedArray.getColor(R.styleable.MessageInput_attachmentButtonDefaultIconDisabledColor,
                style.getColor(R.color.cornflower_blue_light_40));

        style.attachmentButtonWidth = typedArray.getDimensionPixelSize(R.styleable.MessageInput_attachmentButtonWidth, style.getDimension(R.dimen.input_button_width));
        style.attachmentButtonHeight = typedArray.getDimensionPixelSize(R.styleable.MessageInput_attachmentButtonHeight, style.getDimension(R.dimen.input_button_height));
        style.attachmentButtonMargin = typedArray.getDimensionPixelSize(R.styleable.MessageInput_attachmentButtonMargin, style.getDimension(R.dimen.input_button_margin));

        style.inputButtonBackground = typedArray.getResourceId(R.styleable.MessageInput_inputButtonBackground, -1);
        style.inputButtonDefaultBgColor = typedArray.getColor(R.styleable.MessageInput_inputButtonDefaultBgColor,
                style.getColor(R.color.cornflower_blue_two));
        style.inputButtonDefaultBgPressedColor = typedArray.getColor(R.styleable.MessageInput_inputButtonDefaultBgPressedColor,
                style.getColor(R.color.cornflower_blue_two_dark));
        style.inputButtonDefaultBgDisabledColor = typedArray.getColor(R.styleable.MessageInput_inputButtonDefaultBgDisabledColor,
                style.getColor(R.color.white_four));

        style.inputButtonIcon = typedArray.getResourceId(R.styleable.MessageInput_inputButtonIcon, -1);
        style.inputButtonDefaultIconColor = typedArray.getColor(R.styleable.MessageInput_inputButtonDefaultIconColor,
                style.getColor(R.color.white));
        style.inputButtonDefaultIconPressedColor = typedArray.getColor(R.styleable.MessageInput_inputButtonDefaultIconPressedColor,
                style.getColor(R.color.white));
        style.inputButtonDefaultIconDisabledColor = typedArray.getColor(R.styleable.MessageInput_inputButtonDefaultIconDisabledColor,
                style.getColor(R.color.warm_grey));

        style.inputButtonWidth = typedArray.getDimensionPixelSize(R.styleable.MessageInput_inputButtonWidth, style.getDimension(R.dimen.input_button_width));
        style.inputButtonHeight = typedArray.getDimensionPixelSize(R.styleable.MessageInput_inputButtonHeight, style.getDimension(R.dimen.input_button_height));
        style.inputButtonMargin = typedArray.getDimensionPixelSize(R.styleable.MessageInput_inputButtonMargin, style.getDimension(R.dimen.input_button_margin));

        style.inputMaxLines = typedArray.getInt(R.styleable.MessageInput_inputMaxLines, DEFAULT_MAX_LINES);
        style.inputHint = typedArray.getString(R.styleable.MessageInput_inputHint);
        style.inputText = typedArray.getString(R.styleable.MessageInput_inputText);

        style.inputTextSize = typedArray.getDimensionPixelSize(R.styleable.MessageInput_inputTextSize, style.getDimension(R.dimen.input_text_size));
        style.inputTextColor = typedArray.getColor(R.styleable.MessageInput_inputTextColor, style.getColor(R.color.dark_grey_two));
        style.inputHintColor = typedArray.getColor(R.styleable.MessageInput_inputHintColor, style.getColor(R.color.warm_grey_three));

        style.inputBackground = typedArray.getDrawable(R.styleable.MessageInput_inputBackground);
        style.inputCursorDrawable = typedArray.getDrawable(R.styleable.MessageInput_inputCursorDrawable);

        style.delayTypingStatus = typedArray.getInt(R.styleable.MessageInput_delayTypingStatus, DEFAULT_DELAY_TYPING_STATUS);

        typedArray.recycle();

        style.inputDefaultPaddingLeft = style.getDimension(R.dimen.input_padding_left);
        style.inputDefaultPaddingRight = style.getDimension(R.dimen.input_padding_right);
        style.inputDefaultPaddingTop = style.getDimension(R.dimen.input_padding_top);
        style.inputDefaultPaddingBottom = style.getDimension(R.dimen.input_padding_bottom);

        return style;
    }

    private MessageInputStyle(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private Drawable getSelector(@ColorInt int normalColor, @ColorInt int pressedColor,
                                 @ColorInt int disabledColor, @DrawableRes int shape) {

        Drawable drawable = DrawableCompat.wrap(getVectorDrawable(shape)).mutate();
        DrawableCompat.setTintList(
                drawable,
                new ColorStateList(
                        new int[][]{
                                new int[]{android.R.attr.state_enabled, -android.R.attr.state_pressed},
                                new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed},
                                new int[]{-android.R.attr.state_enabled}
                        },
                        new int[]{normalColor, pressedColor, disabledColor}
                ));
        return drawable;
    }

    protected boolean showAttachmentButton() {
        return showAttachmentButton;
    }

    protected Drawable getAttachmentButtonBackground() {
        int shape = attachmentButtonBackground != -1 ? attachmentButtonBackground : R.drawable.chatkit_mask;
        return getSelector(attachmentButtonDefaultBgColor, attachmentButtonDefaultBgPressedColor,
                attachmentButtonDefaultBgDisabledColor, shape);
    }

    protected Drawable getAttachmentButtonIcon() {
        int shape = attachmentButtonIcon != -1 ? attachmentButtonIcon : R.drawable.chatkit_ic_add_attachment;
        return getSelector(attachmentButtonDefaultIconColor, attachmentButtonDefaultIconPressedColor,
                attachmentButtonDefaultIconDisabledColor, shape);
    }

    protected int getAttachmentButtonWidth() {
        return attachmentButtonWidth;
    }

    protected int getAttachmentButtonHeight() {
        return attachmentButtonHeight;
    }

    protected int getAttachmentButtonMargin() {
        return attachmentButtonMargin;
    }

    protected Drawable getInputButtonBackground() {
        int shape = inputButtonBackground != -1 ? inputButtonBackground : R.drawable.chatkit_mask;
        return getSelector(inputButtonDefaultBgColor, inputButtonDefaultBgPressedColor,
                inputButtonDefaultBgDisabledColor, shape);
    }

    protected Drawable getInputButtonIcon() {
        int shape = inputButtonIcon != -1 ? inputButtonIcon : R.drawable.chatkit_ic_send;
        return getSelector(inputButtonDefaultIconColor, inputButtonDefaultIconPressedColor,
                inputButtonDefaultIconDisabledColor, shape);
    }

    protected int getInputButtonMargin() {
        return inputButtonMargin;
    }

    protected int getInputButtonWidth() {
        return inputButtonWidth;
    }

    protected int getInputButtonHeight() {
        return inputButtonHeight;
    }

    protected int getInputMaxLines() {
        return inputMaxLines;
    }

    protected String getInputHint() {
        return inputHint;
    }

    protected String getInputText() {
        return inputText;
    }

    protected int getInputTextSize() {
        return inputTextSize;
    }

    protected int getInputTextColor() {
        return inputTextColor;
    }

    protected int getInputHintColor() {
        return inputHintColor;
    }

    protected Drawable getInputBackground() {
        return inputBackground;
    }

    protected Drawable getInputCursorDrawable() {
        return inputCursorDrawable;
    }

    protected int getInputDefaultPaddingLeft() {
        return inputDefaultPaddingLeft;
    }

    protected int getInputDefaultPaddingRight() {
        return inputDefaultPaddingRight;
    }

    protected int getInputDefaultPaddingTop() {
        return inputDefaultPaddingTop;
    }

    protected int getInputDefaultPaddingBottom() {
        return inputDefaultPaddingBottom;
    }

    int getDelayTypingStatus() {
        return delayTypingStatus;
    }

    public int getAttachmentButtonDefaultBgColor() {
        return attachmentButtonDefaultBgColor;
    }

    public int getAttachmentButtonDefaultBgPressedColor() {
        return attachmentButtonDefaultBgPressedColor;
    }

    public int getAttachmentButtonDefaultBgDisabledColor() {
        return attachmentButtonDefaultBgDisabledColor;
    }

    public int getAttachmentButtonDefaultIconColor() {
        return attachmentButtonDefaultIconColor;
    }

    public int getAttachmentButtonDefaultIconPressedColor() {
        return attachmentButtonDefaultIconPressedColor;
    }

    public int getAttachmentButtonDefaultIconDisabledColor() {
        return attachmentButtonDefaultIconDisabledColor;
    }

    public int getInputButtonDefaultBgColor() {
        return inputButtonDefaultBgColor;
    }

    public int getInputButtonDefaultBgPressedColor() {
        return inputButtonDefaultBgPressedColor;
    }

    public int getInputButtonDefaultBgDisabledColor() {
        return inputButtonDefaultBgDisabledColor;
    }

    public int getInputButtonDefaultIconColor() {
        return inputButtonDefaultIconColor;
    }

    public int getInputButtonDefaultIconPressedColor() {
        return inputButtonDefaultIconPressedColor;
    }

    public int getInputButtonDefaultIconDisabledColor() {
        return inputButtonDefaultIconDisabledColor;
    }

    public void setShowAttachmentButton(boolean showAttachmentButton) {
        this.showAttachmentButton = showAttachmentButton;
    }

    public void setAttachmentButtonBackground(int attachmentButtonBackground) {
        this.attachmentButtonBackground = attachmentButtonBackground;
    }

    public void setAttachmentButtonDefaultBgColor(int attachmentButtonDefaultBgColor) {
        this.attachmentButtonDefaultBgColor = attachmentButtonDefaultBgColor;
    }

    public void setAttachmentButtonDefaultBgPressedColor(int attachmentButtonDefaultBgPressedColor) {
        this.attachmentButtonDefaultBgPressedColor = attachmentButtonDefaultBgPressedColor;
    }

    public void setAttachmentButtonDefaultBgDisabledColor(int attachmentButtonDefaultBgDisabledColor) {
        this.attachmentButtonDefaultBgDisabledColor = attachmentButtonDefaultBgDisabledColor;
    }

    public void setAttachmentButtonIcon(int attachmentButtonIcon) {
        this.attachmentButtonIcon = attachmentButtonIcon;
    }

    public void setAttachmentButtonDefaultIconColor(int attachmentButtonDefaultIconColor) {
        this.attachmentButtonDefaultIconColor = attachmentButtonDefaultIconColor;
    }

    public void setAttachmentButtonDefaultIconPressedColor(int attachmentButtonDefaultIconPressedColor) {
        this.attachmentButtonDefaultIconPressedColor = attachmentButtonDefaultIconPressedColor;
    }

    public void setAttachmentButtonDefaultIconDisabledColor(int attachmentButtonDefaultIconDisabledColor) {
        this.attachmentButtonDefaultIconDisabledColor = attachmentButtonDefaultIconDisabledColor;
    }

    public void setAttachmentButtonWidth(int attachmentButtonWidth) {
        this.attachmentButtonWidth = attachmentButtonWidth;
    }

    public void setAttachmentButtonHeight(int attachmentButtonHeight) {
        this.attachmentButtonHeight = attachmentButtonHeight;
    }

    public void setAttachmentButtonMargin(int attachmentButtonMargin) {
        this.attachmentButtonMargin = attachmentButtonMargin;
    }

    public void setInputButtonBackground(int inputButtonBackground) {
        this.inputButtonBackground = inputButtonBackground;
    }

    public void setInputButtonDefaultBgColor(int inputButtonDefaultBgColor) {
        this.inputButtonDefaultBgColor = inputButtonDefaultBgColor;
    }

    public void setInputButtonDefaultBgPressedColor(int inputButtonDefaultBgPressedColor) {
        this.inputButtonDefaultBgPressedColor = inputButtonDefaultBgPressedColor;
    }

    public void setInputButtonDefaultBgDisabledColor(int inputButtonDefaultBgDisabledColor) {
        this.inputButtonDefaultBgDisabledColor = inputButtonDefaultBgDisabledColor;
    }

    public void setInputButtonIcon(int inputButtonIcon) {
        this.inputButtonIcon = inputButtonIcon;
    }

    public void setInputButtonDefaultIconColor(int inputButtonDefaultIconColor) {
        this.inputButtonDefaultIconColor = inputButtonDefaultIconColor;
    }

    public void setInputButtonDefaultIconPressedColor(int inputButtonDefaultIconPressedColor) {
        this.inputButtonDefaultIconPressedColor = inputButtonDefaultIconPressedColor;
    }

    public void setInputButtonDefaultIconDisabledColor(int inputButtonDefaultIconDisabledColor) {
        this.inputButtonDefaultIconDisabledColor = inputButtonDefaultIconDisabledColor;
    }

    public void setInputButtonWidth(int inputButtonWidth) {
        this.inputButtonWidth = inputButtonWidth;
    }

    public void setInputButtonHeight(int inputButtonHeight) {
        this.inputButtonHeight = inputButtonHeight;
    }

    public void setInputButtonMargin(int inputButtonMargin) {
        this.inputButtonMargin = inputButtonMargin;
    }

    public void setInputMaxLines(int inputMaxLines) {
        this.inputMaxLines = inputMaxLines;
    }

    public void setInputHint(String inputHint) {
        this.inputHint = inputHint;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public void setInputTextSize(int inputTextSize) {
        this.inputTextSize = inputTextSize;
    }

    public void setInputTextColor(int inputTextColor) {
        this.inputTextColor = inputTextColor;
    }

    public void setInputHintColor(int inputHintColor) {
        this.inputHintColor = inputHintColor;
    }

    public void setInputBackground(Drawable inputBackground) {
        this.inputBackground = inputBackground;
    }

    public void setInputCursorDrawable(Drawable inputCursorDrawable) {
        this.inputCursorDrawable = inputCursorDrawable;
    }

    public void setInputDefaultPaddingLeft(int inputDefaultPaddingLeft) {
        this.inputDefaultPaddingLeft = inputDefaultPaddingLeft;
    }

    public void setInputDefaultPaddingRight(int inputDefaultPaddingRight) {
        this.inputDefaultPaddingRight = inputDefaultPaddingRight;
    }

    public void setInputDefaultPaddingTop(int inputDefaultPaddingTop) {
        this.inputDefaultPaddingTop = inputDefaultPaddingTop;
    }

    public void setInputDefaultPaddingBottom(int inputDefaultPaddingBottom) {
        this.inputDefaultPaddingBottom = inputDefaultPaddingBottom;
    }


}
