## **AndroidViewTalkBack project**

### Introduction:

We have been experiencing difficulties with TalkBack apparently as a result of using an AndroidView as a container for a Readium fragment. The issue is that in Talkback the Radium content always "bleeds through" the layers above it so that tapping on benign areas in the top levels cause the TalkBack focus to be sent to the underlying redium content, even through a higher level Surface. By contrast, with TalkBack disabled, taps on the overlaying surfaces and composables do not "bleed through" to the obscured Readium content.

For our use case it is essential that the underlying Readium content in the AndroidView remain in place while being overlayed by user controls. The "bleed through" renders the app extremely diffuicult to use for the blind andthe significantly sight challenged.

### Purpose of this Demonstration Project: 

A great deal of research eliminated a number of possible causes for the above observed issue. The end result of this research is that the issue appears to be related to AndroidView.

This project illustrates the difference in TalkBack behavior with and then without using an AndroidView as described below.

### There are two productFlavors:

##### withoutAndroidView: 

This flavor populates the main screen with content generated with "standard" @Composables.

In this flavor, the overlaying "Scrim" shields lower layers from user interaction. Press any of the "Settings" buttons or the "BUTTON BUTTON BUTTON" button to bring up the "Scrim". Then attempt to tap on any underlying items, especially the "BUTTON BUTTON BUTTON", as expected, no lower level item will respond.

Repeat the above with TalkBack disabled then again with TalkBack enabled. You will eperience this exact same behavior with TalkBack enabled or disabled.

##### withAndroidView: 

This flavor populates the main screen with content generated with AndroidViews that are backed by view based content (ie XML layouts and programmatically added widget Button)

With TalkBack disabled you will observe the same behavior as described above for the withoutAndroidView flavor above.

Now enable TalkBack. In this flavor, the overlaying "Scrim" surprisingly allows user interaction to "bleed through" to the lower layers. Press any of the "Settings" buttons or the "BUTTON BUTTON BUTTON" button to bring up the "Scrim". Then attempt to tap on any underlying items, especially the "BUTTON BUTTON BUTTON". Shockingly, tapping above any underlying item will cause TalkBack to read the hidden control descriptions. Tapping where the "BUTTON BUTTON BUTTON" button is covered will allow you to close the Scrim by following the TalkBack instructions (double tap anywhere).

### Attempted resolutions:

I have tried many numerous combinations of modifiers especially semantics, including onClick(), invisibleToUser(), etc, etc. on the surrounding Composables as well as numerous attempts to programmatically set the AdroidView contained view's acessibility settings to make it invisible as well. Nothing disrupts the AndroidView's contents from "bleeding through" the overlying layers.

### Conclusion:

It seems clear that AndroidView does not interact with TalkBack in the way other @Compsables do. It seems equally clear that AndroidView does not properly interact with TalkBack.







