package com.mohitgarg.bizcardapplication.ui.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * A composable function that displays the user's profile details.
 *
 * This component renders a vertical column containing the user's profile information,
 * including their name, job title, and social media handle. The information is
 * centered horizontally and arranged vertically with appropriate spacing.
 *
 * The component displays:
 * - User's full name in a large display style with primary color
 * - Job title/position in a medium title style
 * - Social media handle (e.g., Twitter/Instagram) in a body text style
 *
 * All text elements use Material Design 3 typography styles and color schemes
 * to maintain consistency with the application's design system.
 *
 * @sample
 * ```
 * ProfileDetailCompose()
 * ```
 */
@Composable
fun ProfileDetailCompose() {
    Column(
        modifier = Modifier.padding(top = 10.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Mohit Garg",
            style = MaterialTheme.typography.displaySmall,
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = "Android Software Engineer",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(top = 4.dp)
        )

        Text(
            text = "@techmohitgarg",
            modifier = Modifier.padding(top = 4.dp),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}