package com.example.thirtydaysoffitness

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.thirtydaysoffitness.ui.theme.ThirtyDaysOfFitnessTheme

@Composable
fun TopAppBar() {
    Text(
        text = stringResource(id = R.string.top_app_bar),
        style = MaterialTheme.typography.headlineLarge,
        modifier = Modifier
            .padding(
                top = dimensionResource(id = R.dimen.padding_medium),
                start = dimensionResource(id = R.dimen.padding_medium)
            )
    )
}

@Composable
fun FitnessList(
    listOfExercises: List<Day>,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier.padding(dimensionResource(id = R.dimen.padding_medium))
    ) {
        itemsIndexed(listOfExercises) { _, day ->
            DayItem(day = day)
        }
    }
}

@Composable
fun DayItem(
    day: Day,
    modifier: Modifier = Modifier
) {
    var showDescription by remember { mutableStateOf(false) }

    Card(modifier = modifier
        .fillMaxWidth()
        .padding(vertical = dimensionResource(id = R.dimen.padding_small))
        .clickable {
            showDescription = !showDescription
        }
    ) {
        Column(
            modifier = modifier
                .padding(dimensionResource(id = R.dimen.padding_medium))
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness = Spring.StiffnessMedium
                    )
                )
        ) {
            Text(
                text = "Day ${day.dayNumber}",
                style = MaterialTheme.typography.displaySmall
            )
            Text(
                text = stringResource(id = day.exercise),
                style = MaterialTheme.typography.displayMedium
            )
            Box(
                modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = day.image),
                    contentDescription = "Image ${day.exercise}",
                    Modifier
                        .fillMaxWidth()
                        .padding(vertical = dimensionResource(id = R.dimen.padding_medium)),
                    contentScale = ContentScale.FillWidth,
                )
            }

            if (showDescription) {
                Text(
                    text = stringResource(id = day.description),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
    
}

@Preview(showBackground = true)
@Composable
fun FitnessListPreview() {
    ThirtyDaysOfFitnessTheme {
        val listOfExercises = FitnessRepository.listOfExercises
        FitnessList(listOfExercises)
    }
}

@Preview(showBackground = true)
@Composable
fun FitnessListPreviewDark() {
    ThirtyDaysOfFitnessTheme(darkTheme = true) {
        val listOfExercises = FitnessRepository.listOfExercises
        FitnessList(listOfExercises)
    }
}

@Preview(showBackground = true)
@Composable
fun DayItemPreview() {
    ThirtyDaysOfFitnessTheme {
        val day = FitnessRepository.listOfExercises[0]
        DayItem(day = day)
    }
}