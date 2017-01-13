package com.example.anna_.bombcharades;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {

    String[] easy ={"Skip","Jumping","Jack","Shark","Chicken","Alligator","Chair","Robot","Head","Smile","Baseball","Bird","Happy", "Scissors","Cheek","Back","Jump","Drink","Ice","Cream","Cone","Car","Airplane","Clap","Circle","Pillow","Pinch", "Kick","Dog","Basketball","Sleep","Camera","Kangaroo","Arm","Eat","Prayer","Elephant","Blink","Doll","Spider", "Point","Balloon","Book","Glasses","Stop","Sneeze","Mouth","Draw","Football","Telephone","Pig","Wave","Door", "Tail","Turtle","Baby","Ear","Monkey","Hopscotch","Mosquito","Toothbrush","Ring","Angry","Elephant","Pinch","Baby","Fish","Reach","Ball","Flick","Remote", "Baseball","Football","Roll","Basketball","Fork","Sad","Bounce","Giggle","Scissors", "Cat","Golf","Skip","Chicken","Guitar","Sneeze","Chimpanzee","Hammer","Spin","Clap", "Happy","Spoon","Cough","Horns","Stomp","Cry","Joke","Stop","Dog","Mime","Tail","Drink", "Penguin","Toothbrush","Drums","Phone","Wiggle","Duck","Photographer"};
    String[] medium = {"Balance beam","Haircut","Shoelaces","Ballet","Halo","Sick","Balloon","Hiccup","Singer","Banana peel","Hot dog","Skateboard","Book","Hungry","Slippery","Braces","Hurt","Soccer","Button","Ice skating","Strong","Car","Karate","Stubbed toe","Cheers","Ladder","Sunshine","Clown","Light bulb","Surprise","Dinosaur","Limbo","Swing","Disco","Macarena","Sword","Dizzy","Paint","Tap dance","Fart","Pirate","Wheelbarrow","Fishing","Read","Wizard of Oz","Gallop","River dance","Ping Pong","Snowball","Roof","Fly","Fang","Bicycle","Bear","Cape","Puppet","Piano","Lipstick","Salute","Hula","Hoop","Penguin","Banana Peel","Whisper","Popsicle","Frankenstein","Earthquake","Yo-Yo","Road","Rain","Alarm","Clock","Dog Leash","Chop","Pajamas","Slam","Dunk","Fiddle","Seashell","Jog","Seesaw","Nap","Cheerleader","Blind","Beg","Shopping Cart","Michael Jackson","Limbo","Newspaper","Twist","Rhinoceros","Cow","Tickle","Fetch","Violin","Cage","Cello","Braid","Skateboard","Stairs","Trumpet","Mop","Shovel","Money","Soap","Saddle","Wink","Tree","Spider Man","Think"
    };
    String[] hard ={"Windmill","Party","Dentist","Lawn Mower","Softball","Wig","Stain","Cuff","Sunburn","Funny","Sheet","Hair Dryer","Nightmare","Ipad","Shadow","Wax","Fog","Sip","Bathroom","Scale","Taxi","Pizza","Sand","Huddle","Cowboy","Ticket","Doghouse","Stiff","Knot","President","Owl","Wrench","Story","Whisk","Quicksand","Spine","Chess","Artist","Vest","Gingerbread Man","Spider Web","Bobsled","Lung","Washing Machine","Oar","Torch","Eraser","Mini","Blinds","Mouse Trap","Swordfish","Jar","Cramp","Flamingo","Cast","Honk","Mirror","Business Trip","Chalk","Gym","Volcano","Blanket","Helicopter","President","Bright","Hurricane","Rainbow","Bump","Kite","Rollercoaster","Christmas","Light","Shadow","Coffee","Magic","Shopping","Cradle","Makeup","Shuffle","Deer","Marriage","Slice","Drool","Mash","Slip n’ slide","Electric Slide","Measure","Smear","Excitement","Mirror","Spider","Fight Club","Monster","The Lion King","Firefighter","Motorcycle","Trampoline","Flashlight","Nightmare","Waterfall","Garden","Nosey","Window","Giraffe","Overwhelmed","Yo-yo","Heavy","Pancakes"
    };

    ArrayList<String> level1 = new ArrayList<String>();
    ArrayList<String> level2 = new ArrayList<String>();
    ArrayList<String> level3 = new ArrayList<String>();

    // this function and the above ArrayLists can be changed to be initialized from a text file
    private void initArray(ArrayList<String> array, String[] string){
        int i;

        for(i=0;i<string.length;i++){
            array.add(string[i]);
        }
    }


    public void newDeck(){
        Intent intent = new Intent(this, PersonalizeDeck.class);
        startActivity(intent);
    }
    public void StartGame(String level){
        Intent intent = new Intent(this, DisplayWords.class);
        // if can be replaced with a switch statement
        if(level.equals("easy")){
            initArray(level1,easy);
            intent.putStringArrayListExtra("wordlist", level1);
        }else if(level.equals("medium")){
            initArray(level2,medium);
            intent.putStringArrayListExtra("wordlist", level2);
        }else if(level.equals("hard")){
            initArray(level3,hard);
            intent.putStringArrayListExtra("wordlist", level3);
        }

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);



        //New Deck

        Button Deck =  (Button) findViewById(R.id.deck);
        Deck.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                newDeck();

            }
        });

        //Easy Button

        Button Easy = (Button) findViewById(R.id.Easy);
        Easy.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                StartGame("easy");

            }
        });

        //Medium Button

        Button medium = (Button) findViewById(R.id.medium);
        medium.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                StartGame("medium");

            }
        });

        //Hard

        Button hard = (Button) findViewById(R.id.hard);
        hard.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                StartGame("hard");

            }
        });


    }

}
