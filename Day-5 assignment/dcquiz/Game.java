package com.dcquiz;

public class Game {

    Questions[] questions=new Questions[10];
    Player player=new Player();

    public void initGame()
    {
        //creating five objects
        for(int i=0;i<10;i++)
        {
            questions[i]=new Questions();
        }
        //applying values to the five objects
        questions[0].question="In Batman V Superman, Diana Prince and Bruce Wayne meet while gazing at which ancient weapon?";
        questions[0].option1="Staff of Amun-Ra";
        questions[0].option2="Sword of Alexander the Great";
        questions[0].option3="Seven-branched sword";
        questions[0].option4="Sword of Mercy";
        questions[0].correctAns=2;

        questions[1].question="Which superhero dies in Batman V Superman?";
        questions[1].option1="Superman";
        questions[1].option2="Wonderwoman";
        questions[1].option3="Batman";
        questions[1].option4="Flash";
        questions[1].correctAns=1;

        questions[2].question="What is WonderWoman's civilian name?";
        questions[2].option1="Lois Lane";
        questions[2].option2="Lena Luthor";
        questions[2].option3="Rachel Daws";
        questions[2].option4="Diana Prince";
        questions[2].correctAns=4;

        questions[3].question="Who is Barry Allen?";
        questions[3].option1="The Atom";
        questions[3].option2="MoonKnight";
        questions[3].option3="The Flash";
        questions[3].option4="Aquaman";
        questions[3].correctAns=3;

        questions[4].question="What is the name of Aquaman's kingdom?";
        questions[4].option1="The Deep";
        questions[4].option2="Atlantis";
        questions[4].option3="Egypt";
        questions[4].option4="Arcelon";
        questions[4].correctAns=2;

        questions[5].question="What was WonderWoman's original name before DC Comics changed it?";
        questions[5].option1="She-Ra";
        questions[5].option2="Suprema";
        questions[5].option3="Amazonia";
        questions[5].option4="Super Woman";
        questions[5].correctAns=2;

        questions[6].question="Which supervillain is not part of the Suicide Squad?";
        questions[6].option1="Deadshot";
        questions[6].option2="NightShade";
        questions[6].option3="Lex Luthor";
        questions[6].option4="Rick Flag";
        questions[6].correctAns=3;

        questions[7].question="What was the name of the villain of Justice League Movie?";
        questions[7].option1="Steppenwolf";
        questions[7].option2="Darkseid";
        questions[7].option3="Lex Luthor";
        questions[7].option4="Chrome";
        questions[7].correctAns=1;

        questions[8].question="Superman is from which planet?";
        questions[8].option1="Mars";
        questions[8].option2="Alpha Centuari";
        questions[8].option3="Jupiter";
        questions[8].option4="Krypton";
        questions[8].correctAns=4;

        questions[9].question="How did Cyborg get his powers?";
        questions[9].option1="Excalibur";
        questions[9].option2="Motherbox";
        questions[9].option3="Ring of Power";
        questions[9].option4="Trident of Poseidon";
        questions[9].correctAns=2;

    }
    public void play()
    {
        player.getDetails();
        for(int i=0;i<10;i++)
        {
            boolean status=questions[i].askQuestion();
            if(status==true)
            {
                System.out.println("Amazing!!! Correct Answer!!");
                player.score++;
            }
            else{
                System.out.println("Sorry Wrong answer!!!");
            }

        }
        System.out.println(player.name+" your score is "+player.score);

    }
}
