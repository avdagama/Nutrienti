# nutrienti

The code in this repository only represents the beginning stages of the nutrienti android app, and is not represenative of where the project stands today. The demo video below is a better representation of where the app is today.

# Short demo video

https://youtu.be/-_5rAbKT5BY

# Purpose
According to Withings, only 34.3% of Americans are considered to have a normal weight (using the World Health Organization's classification of BMI levels)<sup>1</sup>. While this figure is suprising, what's even more surpising is that excess weight is considered to be one of the five main causes of mortality<sup>1</sup>. We believe the solution to this problem is fitness, which we can breakdown into two main pillars: exercise and nutrition. Our app aims to provide the tools necessary to allow individuals to meet their fitness goals, by providing a robust fitness-inspired, macronutrient-focused approach to food tracking. Whether your goal is to gain muscle, lose fat, both, or maintain your weight, we want to make the experience as seamless as possible.

1. At the time of writing. Source: https://obs.withings.com/us/weight

# Features:
- Ability to sign up for and sign into a nutrienti account
- Add food to your diary by searching our database of user-submitted foods
- Single ring design that is used throughout the app to show macro and calorie effect based on your goals
- Rebalance food portions in diary to meet your goals with one button tap
- Add friends by searching for their username
- Track consistency with a "streak" that counts how many days in a row you've logged food
- See friend's rings for the day, and their streaks on the home screen, in realtime
- Log your weight so you can track your progress over time with an inutitive sparkline chart that supports scrubbing
- Flat and modern design

# Technical:
- Coded in Java using Android Studio
- Repository pattern (Single source of truth, decoupling)
- Observer pattern (LiveData)
- Firebase authentication
- Firebase realtime database (for social features)
- Firebase cloud firestore (for all other database needs)
- All visuals are vector-based
