package com.mohitgarg.bizcardapplication.ui.compose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Preview composable for the portfolio list component.
 *
 * This function provides a preview of the [PortfolioListCompose] component with sample data.
 * It wraps the portfolio list in a [Surface] with rounded corners, border, and elevation
 * to demonstrate how it appears in the application.
 *
 * This preview is used for design-time visualization in Android Studio's preview panel.
 * It displays a list of 10 sample projects to showcase the portfolio list UI.
 */
@Preview
@Composable
fun PortfolioContent() {
    Box(
        modifier = Modifier
            .padding(12.dp)
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(corner = CornerSize(10.dp)),
            border = BorderStroke(width = 2.dp, color = Color.LightGray),
            tonalElevation = 12.dp,
            shadowElevation = 12.dp
        ) {
            PortfolioListCompose(
                data = arrayListOf(
                    "Project 1",
                    "Project 2",
                    "Project 3",
                    "Project 4",
                    "Project 5",
                    "Project 6",
                    "Project 7",
                    "Project 8",
                    "Project 9",
                    "Project 10",
                )
            )
        }
    }
}

/**
 * A composable function that displays a scrollable list of portfolio items.
 *
 * This component renders a [LazyColumn] containing portfolio items, where each item
 * is displayed as a [Card] with a profile image placeholder and text information.
 * The list is optimized for performance using lazy loading, making it suitable for
 * displaying large numbers of portfolio items.
 *
 * Each portfolio item card contains:
 * - A circular profile image placeholder using [CreateProfileImageCompose]
 * - The project name displayed in bold text
 * - Additional project information displayed below the name
 *
 * The component uses Material Design 3 components and follows the application's
 * design system for consistent styling.
 *
 * @param data A list of strings representing portfolio project names or titles.
 *             Each string in the list will be rendered as a separate portfolio item card.
 *             The list can be empty, in which case no items will be displayed.
 *
 * @sample
 * ```
 * PortfolioListCompose(
 *     data = listOf("Project 1", "Project 2", "Project 3")
 * )
 * ```
 */
@Composable
private fun PortfolioListCompose(data: List<String>) {
    LazyColumn(
        contentPadding = PaddingValues(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(data) { item ->
            Card(
                colors = CardDefaults.cardColors(
                    contentColor = Color.DarkGray, containerColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    CreateProfileImageCompose(
                        modifier = Modifier
                            .size(80.dp)
                            .padding(5.dp)
                    )
                    Column(
                        modifier = Modifier
                            .padding(8.dp)
                            .align(Alignment.CenterVertically),
                    ) {
                        Text(
                            text = item,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.bodyLarge
                        )
                        Text(text = item, style = MaterialTheme.typography.bodySmall)
                    }
                }
            }
        }
    }
}