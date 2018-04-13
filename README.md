# Rock-Paper-Scissors-Game

A simple game that is coded in Java using random number generator and if-else-if statements.

<b>How It Works:</b>

User chooses between rock, paper and scissors. 
Now, I use the Random function to generate a number in the range [0,99] and decide computer's 
choice on the basis of it.

<b>&nbsp;&nbsp;&nbsp;&nbsp; Range &nbsp;&nbsp;&nbsp;&nbsp; ---> &nbsp;&nbsp;&nbsp;&nbsp; Computer's choice</b>

&nbsp;&nbsp;&nbsp;&nbsp; 0 - 33 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Rock </br>
&nbsp;&nbsp;&nbsp;&nbsp; 33 - 66 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	Paper </br>
&nbsp;&nbsp;&nbsp;&nbsp; 66 - 99	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Scissors </br>

Once I have both the choices, I just use the rules to determine the winner.

<b>RULES: </b>

<b>&nbsp;&nbsp;&nbsp;&nbsp;Choice 1 &nbsp;&nbsp;&nbsp;&nbsp; Choice 2 &nbsp;&nbsp;&nbsp;&nbsp; ----> &nbsp;&nbsp;&nbsp;&nbsp; Outcome</b>

&nbsp;&nbsp;&nbsp;&nbsp;Paper &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Rock &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ----> &nbsp;&nbsp;&nbsp;&nbsp; Paper Wins </br>
&nbsp;&nbsp;&nbsp;&nbsp;Rock &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Scissors &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ----> &nbsp;&nbsp;&nbsp;&nbsp; Rock Wins </br>
&nbsp;&nbsp;&nbsp;&nbsp;Scissors &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Paper &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ----> &nbsp;&nbsp;&nbsp;&nbsp; Scissors Wins </br>



<b>Steps for implementation:</b>

<i>In WINDOWS</i>
- First you need to find the address of where the jdk is installed in your pc. It would probably be stored in a location like this "C:\Program Files\Java\jdk-9.0.1\bin" or
  "WindowsDrive:\Program Files\Java\jdk-9.0.1\bin". You need to copy the address.
- Now, open CMD and write "path= C:\Program Files\Java\jdk-9.0.1\bin" or "path= paste what you copied" which sets the path temporarily. You need to do this everytime you need to run Java programs on your PC.
- Type <b>javac</b> to check whether you were able to set the path without any errors, if you were then proceed to the next step otherwise repeat the above step and make sure that you followed it correctly.
- Make sure that you change your current directory to where your programs are stored. If you don't know how to do it then simply paste the programs on Desktop and type "cd Desktop" on CMD.
- To run the program, type <b>javac <i>RockPaperScissors</i>.java</b> then after it compiles successfully type <b>java <i>RockPaperScissors</i></b>.
- That's it, enjoy!

<i>In Ubuntu 16.04LTS</i>
- Just change your current directory to where your programs are stored. If you don't know how to do it then simply paste the programs on Desktop and type "cd Desktop" on Terminal.
- To run the program, type <b>javac <i>RockPaperScissors</i>.java</b> then after it compiles successfully type <b>java RockPaperScissors</b>.
- That's it, enjoy!
