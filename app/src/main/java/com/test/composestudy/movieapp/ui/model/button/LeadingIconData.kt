package com.test.composestudy.movieapp.ui.model.button

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class LeadingIconData(
    @DrawableRes val IconDrawable: Int,
    @StringRes val iconContentDescription: Int
)