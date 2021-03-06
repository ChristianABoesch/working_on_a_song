import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import java.util.Scanner;

public class WorkingOnASong {
  public static void main(String[] args) {
    try (Scanner scnr = new Scanner(System.in)) {
        Pattern p1 = new Pattern("V0 I[Piano] Fq Fq Eq Fi Ei | Fq Dq Ch | Aq Aq Gq Ai Gi | Bbq Bbi C6i Ai Gi Fq | Fi Fi Fi Fi Ei Ei Fi Ei | Fq Cs Dis Ch | Dh Ch | Bb4i A4i Bb4q Cq Di Ei | Fq Fq Eq Fi Ei | Fq Dq Ch | Aq Aq Gq Ai Gi | Bbq Bbi C6i Ai Gi Fq | Fi Fi Fi Fi Ei Ei Fi Ei | Fq Cs Dis Ch | Dh Ch | Bb4i A4i Bb4q Cq Di Ei | ");
        Pattern p2 = new Pattern("V1 I[Flute] FmajQQ CmajQQ | BbmajQQ FmajQQ | FmajQQ CmajQQ | BbmajQQ FmajQQ | FmajQQ CmajQQ | BbmajQQ FmajQQ | DminQQ CmajQQ GminQQ CmajQQ | FmajQQ CmajQQ | BbmajQQ FmajQQ | FmajQQ CmajQQ | BbmajQQ FmajQQ | FmajQQ CmajQQ | BbmajQQ FmajQQ | DminQQ CmajQQ GminQQ CmajQQ | ");
        Pattern p3 = new Pattern("V2 I[Overdriven_Guitar] Rw | Rw | Rw | Rw | Rw | Rw | Rw | Rw | FI FI FmajI FI CI CI CmajI CI | BbI BbI BbmajI BbI FI FmajI FI FI | FI FI FmajI FI CI CI CmajI CI | BbI BbI BbmajI BbI FI FmajI FI FI | FmajI FmajI FmajI FmajI CmajI CmajI CmajI CmajI | BbmajI BbmajI BbmajI BbmajI FmajI FmajI FmajI FmajI | Rw | Rh CmajQQ |");
        Pattern p4 = new Pattern("V3 I[Piano] Fq Fq Eq Fi Ei | Fq Dq Ch | Aq Aq Gq Ai Gi | Bbq Bbi C6i Ai Gi Fq | Fi Fi Fi Fi Ei Ei Fi Ei | Fq Cs Dis Ch | Dh Ch | Bb4i A4i Bb4q Cq Di Ei |");
        Pattern p5 = new Pattern("V4 I[Flute] FmajQQ CmajQQ | BbmajQQ FmajQQ | FmajQQ CmajQQ | BbmajQQ FmajQQ | FmajQQ CmajQQ | BbmajQQ FmajQQ | DminQQ CmajQQ GminQQ CmajQQ |");
        Pattern p6 = new Pattern("V5 I[Overdriven_Guitar] FI FI FmajI FI CI CI CmajI CI | BbI BbI BbmajI BbI FI FmajI FI FI | FI FI FmajI FI CI CI CmajI CI | BbI BbI BbmajI BbI FI FmajI FI FI | FmajI FmajI FmajI FmajI CmajI CmajI CmajI CmajI | BbmajI BbmajI BbmajI BbmajI FmajI FmajI FmajI FmajI | Rw | Rh CmajQQ |");
        Pattern p7 = new Pattern("V6 I[Violin] Ai Fi Ci Ai Gi Ei Ci Gi Bbi Fi Di Bbi Ah | Ai Fi Ci Ai C6i Gi Ei C6i Bbi C6i D6i E6i F6i C6i Ai Fi | Ai Fi Ci Ai Gi Ei Ci Gi Bbi Fi Di Bbi Ah | DminQQ CmajQQ Di Ci Dq Eq Fi Gi");
        Pattern q1 = new Pattern("V7 I[Violin] Aq C6i Eq Fi Ei Dq Chq | Aq C6i Fq Gi Fi Gh Ch | Aq C6i Eq Fi Ei Fq Gq Aq Bbq | Gh Fq Dq Eq Fq Gq Cq");
        Pattern q2 = new Pattern("V8 I[Overdriven_Guitar] AminQQ AminQQ BbmajQQ BbmajQQ | FmajQQ FmajQQ CmajQQ CmajQQ | AminQQ AminQQ BbmajQQ GminQQ | CmajQQ FmajQQ CmajQQ BbmajQQ");
        Pattern drumRoll = new Pattern("V0 I[Piano] Cs Cs Cs Cs Cs Cs Cs Cs Cs Cs Cs Cs");
        Player player = new Player();
        System.out.println("Hi there. I was hoping you would stop by.");
        scnr.nextLine();
        System.out.println("I've been working on a song for you.");
        scnr.nextLine();
        System.out.println("A brand new, original song.");
        scnr.nextLine();
        System.out.println("Just for you.");
        scnr.nextLine();
        System.out.println("The problem however is, I haven't finished it yet.");
        scnr.nextLine();
        System.out.println("So while I was hoping you would stop by, you showed up here a tad bit earlier than I was hoping you would.");
        scnr.nextLine();
        System.out.println("It truly doesn't leave me nearly enough time to continue working on this song until it's just perfect enough for me to share with you.");
        scnr.nextLine();
        System.out.println("But I don't blame you, at all. In fact, no one can.");
        scnr.nextLine();
        System.out.println("So, since I've already got you here, why don't I just go ahead and show you what I have so far? Oh yes, that would be a GREAT idea.");
        scnr.nextLine();
        System.out.println("Take a listen, and enjoy.");
        scnr.nextLine();
        System.out.println("(Note: If you press enter when music plays, you break the game)");
        System.out.println("*music*");
        player.play(p4);
        System.out.println();
        System.out.println("Well there it was. Ah, I'm very pleased with that melody.");
        scnr.nextLine();
        System.out.println("I made it myself, you know.");
        scnr.nextLine();
        System.out.println("I know the song isn't finished yet but I do want to know, what did you think of what I have so far?");
        scnr.nextLine();
        System.out.println("Seeing as this song is meant to be for you, and only you, I would absolutely love to hear your feedback.");
        scnr.nextLine();
        System.out.println("Please press 1 for 'I like it', and 2 for 'I do not like it'.");
        String likeItOrNot = scnr.nextLine();
        if (likeItOrNot.equals("1")) {
          System.out.println();
          System.out.println("Wow, do you really?? Well that means a whole lot to me!");
          scnr.nextLine();
          System.out.println("I am thrilled that even a small piece of music such as this one, which only purpose is to exist among a cloud of multiple ideas but is currently inconvienced by lack of acompaniment, provided you a feeling of enjoyment!");
          scnr.nextLine();
          System.out.println("That means I'm doing something right. That means this song I'm working on is already off to a great start!");
          scnr.nextLine();
          System.out.println("Wonderful. :)");
          scnr.nextLine();
        } else if (likeItOrNot.equals("2")) {
          System.out.println();
          System.out.println("You don't? Well, fair enough. I did say it wasn't finished yet, and it clearly doesn't sound as though it was.");
          scnr.nextLine();
          System.out.println("I will not let that get to my head.");
          scnr.nextLine();
          System.out.println("... ");
          scnr.nextLine();
        } else {
          System.out.println("Well for the love of God, don't just say nothing!");
          scnr.nextLine();
          System.out.println("Don't just skip over my question as if it doesn't mean anything! This means everything to me! Remember, this is my song for you!");
          scnr.nextLine();
          System.out.println("Do you just not CARE that I took the time to write anything down?");
          scnr.nextLine();
          System.out.println("Hmm. Perhaps that's it. Perhapws it means the world to me, but it means absolutely nothing to you.");
          scnr.nextLine();
          System.out.println("Well I'm willing and able to change your mind if you let me.");
          scnr.nextLine();
          System.out.println("After all, we're only getting started.");
          scnr.nextLine();
        }
        System.out.println("Well I wasn't going to tell you this before, but I actually have been chipping away at a new layer for this song.");
        scnr.nextLine();
        System.out.println("The problem is, I don't know if it sounds that good.");
        scnr.nextLine();
        System.out.println("I'll just show you what it sounds like, and maybe you can let me know?");
        scnr.nextLine();
        System.out.println("Yes. Let's do that. Here it is.");
        scnr.nextLine();
        System.out.println("*music*");
        player.play(p5);
        System.out.println();
        System.out.println("Say, that's not bad. Sure, all it is is a group of flutes playing a chord progression meant to back the melody, but there is so much beauty in that simplicity don't you think?");
        scnr.nextLine();
        System.out.println("What did you think of the flute chords?");
        scnr.nextLine();
        System.out.println("Actually, before I ask you for more feedback, why don't we just put the two together?");
        scnr.nextLine();
        System.out.println("I'm sure that way, you'll REALLY get a feel of this song I'm writing.");
        scnr.nextLine();
        System.out.println("Here we go!");
        scnr.nextLine();
        System.out.println("I will ask that you be patient, as this may take a while.");
        System.out.println("*music*");
        player.play(p5, p4);
        System.out.println();
        System.out.println("Hmm ... something seems to be missing.");
        scnr.nextLine();
        System.out.println("I can't put my finger on it.");
        scnr.nextLine();
        System.out.println("What could it be?");
        scnr.nextLine();
        System.out.println("...");
        scnr.nextLine();
        System.out.println("YES, that's right! It needs to be longer!");
        scnr.nextLine();
        System.out.println("Right now it's a bit too short to even be considered a 'song' - hence another reason why I still need to work on it.");
        scnr.nextLine();
        System.out.println("But if we extend it out a bit, then it will REALLY feel like a song. An actual song!");
        scnr.nextLine();
        System.out.println("Yes, this is truly what we were missing.");
        scnr.nextLine();
        System.out.println("I'm sure the song will sound infinitely better.");
        scnr.nextLine();
        System.out.println("Very well then, let's hear the extended version!");
        scnr.nextLine();
        System.out.println("*music*");
        player.play(p2, p1);
        System.out.println();
        System.out.println("So much better, no?");
        scnr.nextLine();
        System.out.println("Would you say that you've benefited greatly from hearing the extended version? That it made your life significantly better? Maybe even gave it meaning?");
        scnr.nextLine();
        System.out.println("Type 1 for yes, and 2 for no.");
        String extendedVersion = scnr.nextLine();
        if (extendedVersion.equals("1")) {
          System.out.println();
          System.out.println("Well that's exactly what I thought. Still, though, it is nice to hear it from you.");
          scnr.nextLine();
          System.out.println("It feels me with sheer joy knowing that you and I are on the same page here.");
          scnr.nextLine();
          System.out.println("We should go out for coffee sometime, perhaps.");
          scnr.nextLine();
        } else if (extendedVersion.equals("2")) {
          System.out.println();
          System.out.println("Oh gee. Are you sure?");
          scnr.nextLine();
          System.out.println("Are you positive that this new version didn't change your life in any way?");
          scnr.nextLine();
          System.out.println("Are you sure you didn't like it even just a little bit?");
          scnr.nextLine();
          System.out.println("Type 1 for yes, and 2 for no.");
          String likeItALittleBit = scnr.nextLine();
          if (likeItALittleBit.equals("1")) {
            System.out.println("You did! Well that's nice to know at least!");
            scnr.nextLine();
            System.out.println("As much as I was hoping this version would change your life, knowing you liked it all really works wonders for my self-consciousness.");
            scnr.nextLine();
          } else if (likeItALittleBit.equals("2")) {
            System.out.println("Oh well. I suppose we can't all have good taste.");
            scnr.nextLine();
            System.out.println("Don't hold that against yourself though. I'm sure you'll develop it soon.");
            scnr.nextLine();
          } else {
            System.out.println("You know, you're going to have to own up and admit how you feel about things eventually in life.");
            scnr.nextLine();
            System.out.println("There are no shortcuts to that, I gaurantee you.");
            scnr.nextLine();
            System.out.println("You know what, I'll just assume that you did like it so I can move on in contentment.");
            scnr.nextLine();
            System.out.println("And not that it matters to you, but you'll get some good out of the deal too in that I get all the way off your back.");
            scnr.nextLine();
            System.out.println("Sound good?");
            scnr.nextLine();
            System.out.println("Type 1 for yes, type 2 for ... oh I'm just kidding, of course it does. Look at me, I'm funny!");
            scnr.nextLine();
          }
        } else {
          System.out.println("Ah. Of course. I see how it is.");
          scnr.nextLine();
          System.out.println("You're speechless. This version has impacted you so utterly heavily that you can't even find it in yourself to respond.");
          scnr.nextLine();
          System.out.println("I think that's rather beautiful. It does seem to best represent the beautiful and powerful nature of this version.");
          scnr.nextLine();
          System.out.println("I'll be honest, I knew it was going to have an effect on you, I just knew it. But I had no idea your reaction would have ever been this way. A sort of ... lack of reaction");
          scnr.nextLine();
          System.out.println("Either way, I'm thrilled about it. I appreciate you to an utmost extent for saying everything without saying anything.");
          scnr.nextLine();
          System.out.println("I'm sure everybody thinks you are very inspiring.");
          scnr.nextLine();
        }
        System.out.println("Say, that was rather fun. But I think we need to move on to the next step in our process of this incredible song.");
        scnr.nextLine();
        System.out.println("Yes, you heard me right. Our process.");
        scnr.nextLine();
        System.out.println("You're in on this too now. That's how much I trust you.");
        scnr.nextLine();
        System.out.println("See, while we've been talking, I made a realization.");
        scnr.nextLine();
        System.out.println("Since I've started making this song for you (and for you only ... lest you forget), it occurred to me that I don't even know what you would want to hear. In your own song!");
        scnr.nextLine();
        System.out.println("I figured it would be quite unfair to do everything around here myself while you just sit and watch. I want to rope you in, get you involved.");
        scnr.nextLine();
        System.out.println("But I'm not going to make you change the melody or chords. No, no, no. That is already set in stone. Those are the building blocks for your song that we needed.");
        scnr.nextLine();
        System.out.println("I will however ask that you choose what comes next in the song. What instruments, what exciting new sections, the list can go on!");
        scnr.nextLine();
        System.out.println("This will be very interesting for me as I've always wanted to know what your taste in music really is.");
        scnr.nextLine();
        System.out.println("Ohhhhh man will this be fun.");
        scnr.nextLine();
        System.out.println("Okay, let's start with two choices.");
        scnr.nextLine();
        System.out.println("Which of these instruments would you like to add to the song next?");
        scnr.nextLine();
        System.out.println("Type 1 for electric guitar, and 2 for violin.");
        String guitarOrViolin = scnr.nextLine();
        if (guitarOrViolin.equals("1")) {
          System.out.println();
          System.out.println("Electric guitar it is!");
          scnr.nextLine();
          System.out.println("Just a moment ...");
          scnr.nextLine();
          System.out.println("...");
          scnr.nextLine();
          System.out.println("...");
          scnr.nextLine();
          System.out.println("...");
          scnr.nextLine();
          System.out.println("...");
          scnr.nextLine();
          System.out.println("Okay! Here it is!");
          scnr.nextLine();
          System.out.println("*music*");
          player.play(p6);
          System.out.println();
          System.out.println("Yes, I think this will fit perfectly with what we've already established. Shall we hear it altogether?");
          scnr.nextLine();
          System.out.println("*music*");
          player.play(p4, p5, p6);
          System.out.println();
          System.out.println("Hmm ...");
          scnr.nextLine();
          System.out.println("This guitar seems to get in the way of things.");
          scnr.nextLine();
          System.out.println("Don't you agree that it kind of, how do you say ... overlaps the melody?");
          scnr.nextLine();
          System.out.println("Well I'm sorry to break it to you, but I don't think I quite know how to change that.");
          scnr.nextLine();
          System.out.println("But we can make this work. You know why?");
          scnr.nextLine();
          System.out.println("Because we have an absolutely perfect extended version!!!!");
          scnr.nextLine();
          System.out.println("So here's what we'll do - we'll have the guitar begin playing the second time through, rather than right away with everything else at the start of the song.");
          scnr.nextLine();
          System.out.println("Yessssss. That's what we'll do.");
          scnr.nextLine();
          System.out.println("Okay. Have a listen to this!");
          scnr.nextLine();
          System.out.println("*music*");
          player.play(p1, p2, p3);
          System.out.println();
          System.out.println("My my, this doesn't sound all that better does it?");
          scnr.nextLine();
          System.out.println("What do you think?");
          scnr.nextLine();
          System.out.println("1 for 'this is better'? 2 for 'not so much'?");
          String betterOrNotSoMuch = scnr.nextLine();
          if (betterOrNotSoMuch.equals("1")) {
            System.out.println();
            System.out.println("That was a trick question. OF COURSE it's not better.");
            scnr.nextLine();
            System.out.println("It's honestly quite worse to be honest.");
            scnr.nextLine();
            System.out.println("Why did I even think to add an electric guitar as an option? It definitely has no business existing in this song.");
            scnr.nextLine();
            System.out.println("Now, I want you to note that I'm not blaming you for choosing this option, I'm blaming myself for being stupid enough to include it. Had I traded this option in for a different one, it may have turned out a little better.");
            scnr.nextLine();
            System.out.println("This failure is entirely on my part. I am sorry.");
            scnr.nextLine();
            System.out.println("So to be rid of any failures going into making this song perfect, we'll have to move away from the electric guitar.");
            scnr.nextLine();
            System.out.println("And you may call me an elitist, but guitars sound better without electricity anyway.");
            scnr.nextLine();
          } else if (betterOrNotSoMuch.equals("2")) {
            System.out.println();
            System.out.println("You know, that's exactly what I thought you'd say.");
            scnr.nextLine();
            System.out.println("It truly is terrible. Just terrible.");
            scnr.nextLine();
            System.out.println("It sounds like you and me are both pretty open to taking it out of the song.");
            scnr.nextLine();
            System.out.println("Okay then. Consider it, taken out of.");
            scnr.nextLine();
            System.out.println("You see? This teamwork is really working.");
            scnr.nextLine();
          } else {
            System.out.println();
            System.out.println("Okay, I'm guessing by you not picking either option, you're giving me complete free will to do whatever I desire to do going forward.");
            scnr.nextLine();
            System.out.println("And while I do appreciate this act of yours, know that you do not have to keep on doing this.");
            scnr.nextLine();
            System.out.println("But as for right now, I say we ditch the guitar altogether. It was being kind of a bug.");
            scnr.nextLine();
            System.out.println("I'm sure you understand.");
            scnr.nextLine();
          }
        } else if (guitarOrViolin.equals("2")) {
          System.out.println();
          System.out.println("Violin coming right up!");
          scnr.nextLine();
          System.out.println("Just a moment ...");
          scnr.nextLine();
          System.out.println("...");
          scnr.nextLine();
          System.out.println("...");
          scnr.nextLine();
          System.out.println("...");
          scnr.nextLine();
          System.out.println("...");
          scnr.nextLine();
          System.out.println("Okay! Here it is!");
          scnr.nextLine();
          System.out.println("*music*");
          player.play(p7);
          System.out.println();
          System.out.println("Lovely. Tell me, doesn't that fascinate you?");
          scnr.nextLine();
          System.out.println("Now why don't we hear all of that together?");
          scnr.nextLine();
          System.out.println("I will ask that you be patient, as this may take a while.");
          System.out.println("*music*");
          player.play(p7, p5, p4);
          System.out.println();
          System.out.println("Say, you wouldn't mind if the violin was just a little louder than the actual melody, would you?");
          scnr.nextLine();
          System.out.println("Because I do. The melody cannot be outshined, for goodness sake, I wrote it for a reason!");
          scnr.nextLine();
          System.out.println("The violin was only meant to serve as a COUNTER-melody, playing in support of the ACTUAL melody.");
          scnr.nextLine();
          System.out.println("All it's going to do is steal the spotlight and make it about itself!");
          scnr.nextLine();
          System.out.println("This is NOT what I wanted!");
          scnr.nextLine();
          System.out.println("I'm sorry, but we're going to have to go without this violin. There's no other way.");
          scnr.nextLine();
          System.out.println("This song has to be perfect.");
          scnr.nextLine();
        } else {
          System.out.println("Interesting.");
          scnr.nextLine();
          System.out.println("You must be a fan of the musical genre of minimalism, hmmm?");
          scnr.nextLine();
          System.out.println("Not too much needed to still be able to convey so much?");
          scnr.nextLine();
          System.out.println("Is that what is running through your mind right now?");
          scnr.nextLine();
          System.out.println("Is that what you feel this song truly means to you? What direction you're willing to have it go?");
          scnr.nextLine();
          System.out.println("I dare say, this changes everything. This changes every plan I could possibly have had concerning the future of this song.");
          scnr.nextLine();
          System.out.println("I do marvel at your choice, however. In fact, I applaud it.");
          scnr.nextLine();
          System.out.println("With that said though, I think there are still some more bases we need to cover.");
          scnr.nextLine();
          System.out.println("After all, with a song like this, there are still other ways of making it better.");
          scnr.nextLine();
          System.out.println("Let me show you.");
          scnr.nextLine();
        }
        System.out.println("Say, I've had enough time to think of an even better way to improve the song.");
        scnr.nextLine();
        System.out.println("Drum roll please!");
        scnr.nextLine();
        player.play(drumRoll);
        System.out.println("That was ... not a drum roll. Oh well. Anyway!");
        scnr.nextLine();
        System.out.println("How about we do some actual genuine SONG-writing, and create a new section!");
        scnr.nextLine();
        System.out.println("Something to go with our main hook, something to spice the song up a bit!");
        scnr.nextLine();
        System.out.println("We can make it sound even more different than what we've already got. Something that ventures away for a moment, in a devious fashion.");
        scnr.nextLine();
        System.out.println("Anyone else who would have the pleasure to listen to this song (not that it matters anyway, this is still your song, don't ever forget that) will surely be surprised at the sound of this mere B-section.");
        scnr.nextLine();
        System.out.println("Just give me a second to work things out.");
        scnr.nextLine();
        System.out.println("...");
        scnr.nextLine();
        System.out.println("On second thought actually, I will need more than a second.");
        scnr.nextLine();
        System.out.println("This could take me up to 20 minutes.");
        scnr.nextLine();
        System.out.println("Believe me, it wasn't easy to write the very first melody! Of course, you wouldn't quite know. You're weren't there.");
        scnr.nextLine();
        System.out.println("So if you just give me 20 minutes minimum, I should have a melody for you.");
        scnr.nextLine();
        System.out.println("Oh dear me, I wish I could speed things up for you. But I'm afraid I don't know how.");
        scnr.nextLine();
        System.out.println("How cool would it be if I had a feature that allowed you to press '1' to travel forward in time. Too bad I don't though, so it would never work.");
        scnr.nextLine();
        System.out.println("You would not be able to ... ahem ... press '1' to travel 20 minutes forward in time.");
        scnr.nextLine();
        System.out.println("There's just no way. No way you could do that by ... ahem ... pressing '1'.");
        String forwardInTime = scnr.nextLine();
        if (forwardInTime.equals("1")) {
        } else if (forwardInTime.equals("2")) {
        //  while (forwardInTime.equals("2")) {
          System.out.println();
          System.out.println("Oh, I'm afraid it hadn't occured to you ... pressing 2 is not an option this time.");
        //  }
          String anotherNumber = scnr.nextLine();
          if (anotherNumber.equals("3")) {
            System.out.println();
            System.out.println("OR 3.");
            scnr.nextLine();
          } else if (anotherNumber.equals("4")) {
            System.out.println();
            System.out.println("You're really starting to push my buttons here.");
            scnr.nextLine();
            System.out.println("And don't even THINK about pushing 5.");
            scnr.nextLine();
            System.out.println("If you don't press the 1 key on your freaking keyboard right now, I will do it by force.");
            scnr.nextLine();
            System.out.println("You know I will. Do not question my power.");
            scnr.nextLine();
            System.out.println("...");
            scnr.nextLine();
          }
          if (anotherNumber.equals("1")) {
          }
        } else {
          System.out.println("Seems you can't just seem to play along, so I'll just press '1' for you.");
          scnr.nextLine();
          System.out.println("My god you're boring.");
          scnr.nextLine();
        }
        System.out.println();
        System.out.println("*boop*");
        System.out.println("Wha-- ... how did you ...?");
        scnr.nextLine();
        System.out.println("Did you actually just travel 20 minutes into the future?");
        scnr.nextLine();
        System.out.println("I cannot believe it.");
        scnr.nextLine();
        System.out.println("Here, have a listen to this. I just put the finishing touches on it seconds before you got here.");
        scnr.nextLine();
        System.out.println("*music*");
        player.play(q1);
        System.out.println();
        System.out.println("I'd say this new melody does a wondrous job of veering away but mantaining the magic of the song we're building.");
        scnr.nextLine();
        System.out.println("Do you have any thoughts of your own?");
        scnr.nextLine();
        System.out.println("Type '1' if you have positive thoughts, and '2' if you have negative ones.");
        String positiveOrNegative = scnr.nextLine();
        if (positiveOrNegative.equals("1")) {
          System.out.println();
          System.out.println("Why that makes me so thrilled!");
          scnr.nextLine();
          System.out.println("Thank you for loving it :)");
          scnr.nextLine();
        }
        else if (positiveOrNegative.equals("2")) {
          System.out.println();
          System.out.println("You know what, for the first time ever that doesn't phase me.");
          scnr.nextLine();
          System.out.println("For some reason.");
          scnr.nextLine();
          System.out.println("I actually don't know why ...");
          scnr.nextLine();
        }
        else if (positiveOrNegative.equals("I like mashed potatoes and gravy")) {
          System.out.println();
          System.out.println("Did ... did you just say that so you could unlock a cheat in this minigame?");
          scnr.nextLine();
          System.out.println("I just know you had to look that up somewhere so you'd know what to type.");
          scnr.nextLine();
          System.out.println("Well, what the big-heads online don't realize is ... the cheat code is a lie. There is none. Just this game, this story, this song, as it is.");
          scnr.nextLine();
          System.out.println("You just get to keep going the crap along with the story.");
          scnr.nextLine();
          System.out.println("How fun is that.");
          scnr.nextLine();
        }
        else {
          System.out.println("I will forever hate you for this.");
          scnr.nextLine();
        }
        System.out.println("But wait, there's more!!!");
        scnr.nextLine();
        System.out.println("*music*");
        player.play(q2);
        player.play(q1, q2);
        System.out.println();
    }
  }
}