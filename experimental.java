/*HAND CRICKET
 * 
 * 
 */

import java.util.Scanner;
public class experimental
{
    static Scanner sc = new Scanner(System.in);
    public static void main()
    {
        
        System.out.println("You will be playing odd eve today with me");
        System.out.println("Toss. press 1 for eve and 2 for odd");
        int tossno = sc.nextInt();
        confirmtoss(tossno);
        int tossrand = (int)(1 + Math.random()*3);
        if(tossno == tossrand)
        {
          System.out.println("Congratulations, you have won the toss");
          System.out.println("Press one to bat first and two to bat second");
          int tosschoice = sc.nextInt();
          confirmtoss(tosschoice);
          if(tosschoice == 1)
          {
              batfirst();
            }
          else
          {
              bowlfirst();
            }
        }
        if(tossno != tossrand)
        {
             System.out.println("Congratulations, you have lost the toss");
             if (tossrand == 1)
             {
                 System.out.println("You shall be batting first");
                 batfirst();
             }
             else
             {
                 System.out.println("You shall be bowling first");
                 bowlfirst();
             }
        }
    }
    public static void batfirst()
    {
        int batscoreuserfirst = 0;
        int num;
        int rand;
        int ballcount = 0;
        System.out.println("If you enter the same number as the computer, it is a wicket");
        do
        {
         System.out.println("Enter number between 0 and 6");
         num = sc.nextInt();
         confirm(num);
         rand = (int)(0 + Math.random()*7);
         System.out.println(rand);
         ballcount++;
          if (num == rand)
         {
            System.out.println("OUT !");
            System.out.println("Your score is : " + batscoreuserfirst + "/1 in " + ballcount + " balls");
            bowlsecond(batscoreuserfirst);
            break;
         }
         else
         {
            batscoreuserfirst = batscoreuserfirst + num;
            System.out.println("Score = " + batscoreuserfirst + "/0 in " + ballcount + " balls");
         }
        }
        while(num != rand);
    }
    public static void bowlsecond(int batscoreuserfirst)
    {
        int num = 0;
        int rand = 0;
        int batscorecompsecond = 0;
        int ballcount = 0;
        System.out.println("Computer is chasing a score of " + (batscoreuserfirst + 1));
        do{
        System.out.println("Enter number");
        num = sc.nextInt();
        confirm(num);
        rand = (int)(0 + Math.random()*7);
        System.out.println(rand);
        ballcount ++;
        if (num == rand)
        {
            System.out.println("OUT !");
            System.out.println("Computer's score is : " + batscorecompsecond + "/1 in " + ballcount + " balls");
            if(batscorecompsecond == batscoreuserfirst)
            {
                System.out.println("TIE!");
                break;
            }
            else
            {
                System.out.println("You have won");
                break;
            }
        }
        else
        {
            batscorecompsecond = batscorecompsecond + rand;
            System.out.println("Score = " + batscorecompsecond + "/0");
        }
        if(batscorecompsecond > batscoreuserfirst)
        {
            System.out.println("You have lost. Your score : " + batscoreuserfirst + ". Computer score : " + batscorecompsecond);
            break;
        }
        }while(num != rand);
      }
    public static void bowlfirst()
    {
        System.out.println("You are bowling");
        int batscorecompfirst = 0;
        int rand = 0;
        int num = 0;
        do
        {
        rand = (int)(0 + Math.random()*7);
        System.out.println("Enter number");
        num = sc.nextInt();
        confirm(num);
        System.out.println(rand);
        if (num == rand)
        {
            System.out.println("OUT !");
            System.out.println("Computer's score is : " + batscorecompfirst + "/1");
            batsecond(batscorecompfirst);
            break;
        }
        else
        {
            batscorecompfirst = batscorecompfirst + rand;
            System.out.println("Score = " + batscorecompfirst + "/0");
        }
        }
        while(num != rand);
        }
    public static void batsecond(int batscorecompfirst)
    {
        int batscoreusersecond = 0;
        int num = 0; 
        int rand = 0;
        System.out.println("You are batting");
        System.out.println("You are chasing a score of " + batscorecompfirst + "runs");
        do
        {
        System.out.println("Enter number");
        num = sc.nextInt();
        confirm(num);
        rand = (int)(0 + Math.random()*7);
        System.out.println(rand);
        if (num == rand)
        {
            System.out.println("OUT !");
            System.out.println("Your score is : " + batscoreusersecond + " /1");
            if(batscoreusersecond == batscorecompfirst)
            {
                System.out.println("TIE");
                superoverbatfirst();
            }
            else
            {
                System.out.println("You have lost");
                break;
            }
        }
        else
        {
            batscoreusersecond = batscoreusersecond + num;
            System.out.println("Score : " + batscoreusersecond + " /0");
            if(batscoreusersecond > batscorecompfirst)
            {
              System.out.println("You have won this game");
              break;
            }
        }
        }
        while(num != rand);
    }
    public static void confirm(int num)
    {
        if(num >= 0 && num <=6)
        {
        }
        else
        {
            System.out.println("Please enter value between 0 and 6");
            
        }
    }
    public static void confirmtoss(int tossno)
    {
        if(tossno > 0 && tossno <=2)
        {
        }
        else
        {
            System.out.println("Please enter value which is either 1 and 2");
            System.exit(0);
        }
    }
    public static void superoverbatfirst()
    {
        System.out.println("SUPER OVER. You are batting first. You have 6 balls to make as many runs as you can");
        int batscoreuserfirst = 0;
        int num;
        int rand;
        int ballcount = 0;
        int wicket = 0;
        System.out.println("If you enter the same number as the computer, it is a wicket");
        do
        {
         System.out.println("Enter number between 0 and 6");
         num = sc.nextInt();
         confirm(num);
         rand = (int)(4 + Math.random()*3);
         System.out.println(rand);
         ballcount++;
          if (num == rand)
         {
            wicket ++;
            System.out.println("OUT !");
            System.out.println("Your score is : " + batscoreuserfirst + "/ " + wicket + " in " + ballcount + " balls");
         }
         else
         {
            batscoreuserfirst = batscoreuserfirst + num;
            System.out.println("Score = " + batscoreuserfirst + "/" + wicket + " in " + ballcount + " balls");
         }
        }
        while(ballcount != 6 && wicket <=2);
       superoverbowlsecond(batscoreuserfirst); 
     }
    public static void superoverbowlsecond(int batscoreuserfirst)
    {
        int num = 0;
        int rand = 0;
        int batscorecompsecond = 0;
        int ballcount = 0;
        int wicket = 0;
        System.out.println("Computer is chasing a score of " + (batscoreuserfirst + 1));
        do{
        System.out.println("Enter number");
        num = sc.nextInt();
        confirm(num);
        rand = (int)(4 + Math.random()*3);
        System.out.println(rand);
        ballcount ++;
        if (num == rand)
        {
            System.out.println("OUT !");
            System.out.println("Computer's score is : " + batscorecompsecond + "/ " + wicket + " in " + ballcount + " balls");
        }
        else
        {
            batscorecompsecond = batscorecompsecond + rand;
            System.out.println("Score = " + batscorecompsecond + "/ " + wicket);
        }
        }
        while(ballcount !=6 && wicket <=2);
        if(batscorecompsecond == batscoreuserfirst)
            {
                System.out.println("TIE!");
            }
            else if(batscorecompsecond < batscoreuserfirst)
            {
                System.out.println("You have won");
            }
            else
            {
                System.out.println("You have LOST!");
            }
      }
    public static void superoverbowlfirst()
    {
        System.out.println("SUPER OVER. You are bowling");
        int batscorecompfirst = 0;
        int rand = 0;
        int num = 0;
        int ballcount = 0;
        int wicket = 0;
        do
        {
        rand = (int)(4 + Math.random()*3);
        System.out.println("Enter number");
        num = sc.nextInt();
        confirm(num);
        System.out.println(rand);
        if (num == rand)
        {
            System.out.println("OUT !");
            System.out.println("Computer's score is : " + batscorecompfirst + "/ " + wicket);
        }
        else
        {
            batscorecompfirst = batscorecompfirst + rand;
            System.out.println("Score = " + batscorecompfirst + "/" + wicket);
        }
        }
        while(ballcount !=6 && wicket <=2);
        superoverbatsecond(batscorecompfirst);
        }
    public static void superoverbatsecond(int batscorecompfirst)
    {
        int batscoreusersecond = 0;
        int num = 0; 
        int rand = 0;
        int ballcount = 0;
        int wicket = 0;
        System.out.println("You are batting");
        System.out.println("You are chasing a score of " + batscorecompfirst + 1 + "runs");
        do
        {
        System.out.println("Enter number");
        num = sc.nextInt();
        confirm(num);
        rand = (int)(4 + Math.random()*3);
        System.out.println(rand);
        if (num == rand)
        {
            System.out.println("OUT !");
            System.out.println("Your score is : " + batscoreusersecond + "/" + wicket);
        }
        else
        {
            batscoreusersecond = batscoreusersecond + num;
            System.out.println("Score : " + batscoreusersecond + " /" + wicket);
        }
        }
        while(ballcount !=6 && wicket <=2);
        if(batscorecompfirst == batscoreusersecond)
            {
                System.out.println("TIE!");
            }
            else if(batscorecompfirst < batscoreusersecond)
            {
                System.out.println("You have won");
            }
            else
            {
                System.out.println("You have LOST!");
            }
    }
}

