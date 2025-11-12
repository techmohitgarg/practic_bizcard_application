package com.mohitgarg.bizcardapplication.ui.compose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.mohitgarg.bizcardapplication.R

/**
 * A composable function that creates a circular profile image placeholder.
 *
 * This component displays a default person icon within a circular surface with a border
 * and shadow elevation. It's designed to be used as a placeholder for user profile images
 * in the business card application.
 *
 * The component uses a [Surface] with [CircleShape] to create a circular container,
 * and displays a default [Icons.Default.Person] icon as the profile image placeholder.
 *
 * @param modifier Optional [Modifier] to be applied to the profile image container.
 *                 This can be used to set size, padding, or other layout properties.
 *                 Defaults to [Modifier] if not provided.
 *
 * @sample
 * ```
 * CreateProfileImageCompose(
 *     modifier = Modifier.size(100.dp)
 * )
 * ```
 */
@Composable
fun CreateProfileImageCompose(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        shape = CircleShape,
        border = BorderStroke(1.dp, Color.LightGray),
        shadowElevation = 4.dp
    ) {
        Image(
            painter = rememberVectorPainter(image = Icons.Default.Person),
            contentDescription = stringResource(R.string.profile_image),
            contentScale = ContentScale.Crop
        )
    }
}