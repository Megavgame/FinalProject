
# Final Project

Dice Roller Supreme

By Christopher LeBlanc

1111510

_________________________________________________________________________________________________________________________________________________________________


Welcome to Dice Roller Supreme!

Here you will find things such as:

Introduction

Features

Configuration/Installation Instructions

Operating Instructions

Manifest

Bug List

Troubleshooting Tips

Change Log

_________________________________________________________________________________________________________________________________________________________________

Introduction

Welcome to Dice Roller Supreme, this application was made entirely by me. 
There are a lot of topics to cover in this read me so the intoduction will be short.
But before that happens, some info on whats to come. 
Firstly this readme will have in detail of pretty much every aspect of the files you may encounter
Also this readme will include any instructions, a list of bugs and such.
Lastly this readme will include my contact info as well as a change log and troubleshooting tips for you leisure
Get onto it already!

_________________________________________________________________________________________________________________________________________________________________

Features 

![Screenshot_321](https://user-images.githubusercontent.com/82187028/115604248-26de2000-a2af-11eb-97af-9022d4a0022b.png)

This picture is a layout of the application when you first lanuch it, I will highlight the main features before going into another one

Starting from the top the first thing you will see is a triangle, after you click roll, a number randomly from 1-4 will be shown in the center of it. This is because you have not chosen a specific dice yet or an amount, so it will default to that.

Just below all of that is the roll button and clear total, the roll button will roll the selected dice once and show you the output. 

The clear total button will clear the total when it is on screen or not, this button will not be hidden in case if you want to clear it without it being visible.

Next up is the spinners, which is likely the more complicated part.

Spinner 1 the dice chooser, when you tap on this spinner it will show a list of dice you may choose from, going from d4-d100 standard dungeons and dragons dice. It will change the image and the bounds of the dice rolled.
Spinner 2 to the right of that one is the amount of dice you wish to roll at once, due to limitations with the screen size, you may only roll 4 dice at once without having problems with spacing so use that to your advantage if you need to roll 6 or more.

The last object is the switch, this switch will tell the program weither or not you want to add up all of the dice into one subtotal or an overall total, which we will get onto the next image.

![Screenshot_322](https://user-images.githubusercontent.com/82187028/115611101-acfe6480-a2b7-11eb-8435-7b35c078b1b2.png)

Here there are 4 new text boxes that show up, for the subtotal it will only work when there are 2 or more dice on screen. Total will work regardless of dice. The subtotal will add up the current dice roll only, while the total will add up all dice and add it to the total. 

Small notice here, with choosing an amount of dice you wish to roll, you must first choose a dice other than the one selected for it to show the pictures. This is included in the bug list.

_________________________________________________________________________________________________________________________________________________________________

Configuration/Installation Instructions

Use whatever you require to install this on your machine, weither you use an export to your android studio or directly copy the code to a new project it should work. There is no current way to install this project using one easy button, but you may wish to export this to a file and import it to android studio.

_________________________________________________________________________________________________________________________________________________________________

Operating Instructions

To operate this app, you must use an AVD or connect an android device and run the program through android studio, from there you may access the programs features and dice rolling stuff. If you need an explanation on each part of the app, refer to the features where a detailed step by step program is explained.

_________________________________________________________________________________________________________________________________________________________________

Manifest

MainActivity.kt - includes all of the logic for each button, textview, image, spinner, or switch for the main view controller

Drawable folder - Includes the pictures that are used for the imageviews in the program.

activity_main.xml - This file is the layout for the app.

strings.xml - This includes arrays and names for certain items. 

colors.xml - This includes the colors that are used in the program

This is a list of each directory that matter to the overall program or are changed from an empty project.


_________________________________________________________________________________________________________________________________________________________________

Bug List

-Bug with the dice not showing up with the change of amount of dice

-Possible issues with reading text in some dice, if changes need to be made then contact me

-Clear total can still clear the total when it is not visible. This does not need to be changed but can be on request

_________________________________________________________________________________________________________________________________________________________________

Troubleshooting Tips

First off if there is any problems contact me using my email, caleblan@lakeheadu.ca for school purposes

If you are having problems with dice not showing up with the change in amounts, just switch to another dice then back again.

If there are any other problems possibly refer to the features which may fix your problem, if not contact details are at the beginning of these tips

_________________________________________________________________________________________________________________________________________________________________

Change Log

v0.2

-Added basic functionality to roll buttons and spinners

-Added textview

-Added buttons and spinners

-First stage of the program

v0.4 

-Added photos

-Added functionality with spinner to change photos

-Added single imageview to project

v0.6

-Added a total text box

-Added a switch to tell if you want to add to a total or not

-Gave functionality to the switch and textview

-Gave funtionality to switch by hiding and unhiding the total textbox and total view textbox

v0.8

-Added another spinner to select an amount of dice

-Added 9 more imageviews and textviews

-Added a subtotal text box

-Gave functionality to spinner

-Changed around the function of spinners and switches

-Switch now hides all totals and subtotals


v1.0

-Final Stage of the program, this is a completed version but more still may be added in the future

-Added comments to the kotlin file

-Added new images that work with the imageviews

-Changed d100 to accept new picture

-Changed textcolors to help with visibility

_________________________________________________________________________________________________________________________________________________________________


