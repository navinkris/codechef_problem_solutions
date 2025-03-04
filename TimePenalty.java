/* Time Penalty
Unlike a usual CodeChef Starters contest, Starters 173 has a time penalty for every wrong submission.

You are participating in CodeChef Starters 173, which has a time penalty of 10 minutes for every incorrect submission you make.
That is, the total penalty for a problem equals the number of minutes from the start of the contest till your submission receives the AC verdict, plus 
10 minutes for every incorrect submission made before that.

You solved a problem X minutes after the start of the contest, and made 
Y incorrect submissions while doing so. What's the total time penalty for this problem?

Input Format
The first and only line of input will contain two space-separated integers 
X and Y — the number of minutes after which you solved the problem, and the number of wrong submissions you made.

Output Format
Output a single integer: the total time penalty for the problem.

Constraints
1≤X≤150
0≤Y≤10

Sample 1:
Input
3 2

Output
23

Explanation:
The problem was solved 3 minutes after the start of the contest, with 
2 incorrect submissions. Since each incorrect submission adds 
10 minutes to the penalty, the total penalty equals 3+2×10=23.

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class TimePenalty
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int y = read.nextInt();
        read.close();
        System.out.println(x + y * 10);
	}
}
