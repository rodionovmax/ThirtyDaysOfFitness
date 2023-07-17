package com.example.thirtydaysoffitness

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Day(
    val dayNumber: Int,
    @StringRes val exercise: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int
)

object FitnessRepository {
    val listOfExercises = listOf(
        Day(
            dayNumber = 1,
            exercise = R.string.exercise_1,
            description = R.string.description_1,
            image = R.drawable.push_ups
        ),
        Day(
            dayNumber = 2,
            exercise = R.string.exercise_2,
            description = R.string.description_2,
            image = R.drawable.__squats
        ),
        Day(
            dayNumber = 3,
            exercise = R.string.exercise_3,
            description = R.string.description_3,
            image = R.drawable.__plank
        ),
        Day(
            dayNumber = 4,
            exercise = R.string.exercise_4,
            description = R.string.description_4,
            image = R.drawable.__mountain_climbers
        ),
        Day(
            dayNumber = 5,
            exercise = R.string.exercise_5,
            description = R.string.description_5,
            image = R.drawable.__bicycle_crunches
        ),
        Day(
            dayNumber = 6,
            exercise = R.string.exercise_6,
            description = R.string.description_6,
            image = R.drawable.__jumping_jacks
        ),
        Day(
            dayNumber = 7,
            exercise = R.string.exercise_7,
            description = R.string.description_7,
            image = R.drawable.__burpees
        ),
        Day(
            dayNumber = 8,
            exercise = R.string.exercise_8,
            description = R.string.description_8,
            image = R.drawable.__glute_bridges
        ),
        Day(
            dayNumber = 9,
            exercise = R.string.exercise_9,
            description = R.string.description_9,
            image = R.drawable.__dumbbell_overhead_press
        ),
        Day(
            dayNumber = 10,
            exercise = R.string.exercise_10,
            description = R.string.description_10,
            image = R.drawable._0_lunges
        ),
        Day(
            dayNumber = 11,
            exercise = R.string.exercise_11,
            description = R.string.description_11,
            image = R.drawable._1_wall_sits
        ),
        Day(
            dayNumber = 12,
            exercise = R.string.exercise_12,
            description = R.string.description_12,
            image = R.drawable._2_high_knees_running_in_place
        ),
        Day(
            dayNumber = 13,
            exercise = R.string.exercise_13,
            description = R.string.description_13,
            image = R.drawable._3_deadlift
        ),
        Day(
            dayNumber = 14,
            exercise = R.string.exercise_14,
            description = R.string.description_14,
            image = R.drawable._4_superman
        ),
        Day(
            dayNumber = 15,
            exercise = R.string.exercise_15,
            description = R.string.description_15,
            image = R.drawable._5_russian_twists
        ),
        Day(
            dayNumber = 16,
            exercise = R.string.exercise_16,
            description = R.string.description_16,
            image = R.drawable._6_step_ups
        ),
        Day(
            dayNumber = 17,
            exercise = R.string.exercise_17,
            description = R.string.description_17,
            image = R.drawable._7_calf_raises
        ),
        Day(
            dayNumber = 18,
            exercise = R.string.exercise_18,
            description = R.string.description_18,
            image = R.drawable._8_high_plank_leg_lifts
        ),
        Day(
            dayNumber = 19,
            exercise = R.string.exercise_19,
            description = R.string.description_19,
            image = R.drawable._9_jump_squats
        ),
        Day(
            dayNumber = 20,
            exercise = R.string.exercise_20,
            description = R.string.description_20,
            image = R.drawable._0_dumbbell_rows
        ),
        Day(
            dayNumber = 21,
            exercise = R.string.exercise_21,
            description = R.string.description_21,
            image = R.drawable._1_reverse_crunches
        ),
        Day(
            dayNumber = 22,
            exercise = R.string.exercise_22,
            description = R.string.description_22,
            image = R.drawable._2_side_plank
        ),
        Day(
            dayNumber = 23,
            exercise = R.string.exercise_23,
            description = R.string.description_23,
            image = R.drawable._3_tuck_jumps
        ),
        Day(
            dayNumber = 24,
            exercise = R.string.exercise_24,
            description = R.string.description_24,
            image = R.drawable._4_tricep_dips
        ),
        Day(
            dayNumber = 25,
            exercise = R.string.exercise_25,
            description = R.string.description_25,
            image = R.drawable._5_dumbbell_bicep_curls
        ),
        Day(
            dayNumber = 26,
            exercise = R.string.exercise_26,
            description = R.string.description_26,
            image = R.drawable._6_jump_lunges
        ),
        Day(
            dayNumber = 27,
            exercise = R.string.exercise_27,
            description = R.string.description_27,
            image = R.drawable._7_side_lying_leg_lifts
        ),
        Day(
            dayNumber = 28,
            exercise = R.string.exercise_28,
            description = R.string.description_28,
            image = R.drawable.bird_dog
        ),
        Day(
            dayNumber = 29,
            exercise = R.string.exercise_29,
            description = R.string.description_29,
            image = R.drawable._9_sumo_squats
        ),
        Day(
            dayNumber = 30,
            exercise = R.string.exercise_30,
            description = R.string.description_30,
            image = R.drawable._0_inchworms
        ),
    )
}
