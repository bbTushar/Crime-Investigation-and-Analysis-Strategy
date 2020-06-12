/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tushar.cias_btushar;

import com.jfoenix.controls.JFXButton;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Tushar
 */
public class FXMLHotNewsController implements Initializable {

    @FXML
    private ImageView img1;
    @FXML
    private Label h1;
    @FXML
    private JFXButton next;
    static int i = 0;
    @FXML
    private JFXButton back;
    @FXML
    private Label label;
    @FXML
    private Label content1;
    @FXML
    private Label content2;
    /**
     * Initializes the controller class.
     */

    @Override
    public void initialize(URL url, ResourceBundle rb) {


        Image image;
        image = new Image(getClass().getResourceAsStream("/image/1.jpg"));
        img1.setImage(image);
        h1.setText("Sweeper held for molesting minor at Yavatmal wedding:");
        content1.setText("Yavatmal: A 25-Year-old sweeper was arrested for allegedly molesting a 10-year-old girl at a wedding in the city on Wednesday night, police said on Thursday.\n" +
                "Lohara police arrested akshay chandekar after he was allegedly caught molesting the minor in a lawn of a hotel on darwha road where the wedding was taking place, an official said. Chandekar had approached the girl on the pretext of giving her food and took her to the lawn and molested her, he said, adding that the act was caught on the hotel’s CCTV camera.\n" +
                "SEC- Arrested Under 354 and provision of prevention of children from sexual offence act (POCSO). he added agencies.");



    }

    @FXML
    private void next(ActionEvent event) {


        if(i==0)
        {
            Image image;
            try {

                image = new Image(new FileInputStream("F:\\My Netbeans\\CIAS\\src\\image\\1.jpg"));
                img1.setImage(image);
                h1.setText("Sweeper held for molesting minor at Yavatmal wedding:");
                content1.setText("Yavatmal: A 25-Year-old sweeper was arrested for allegedly molesting a 10-year-old girl at a wedding in the city on Wednesday night, police said on Thursday.\n" +
                        "Lohara police arrested akshay chandekar after he was allegedly caught molesting the minor in a lawn of a hotel on darwha road where the wedding was taking place, an official said. Chandekar had approached the girl on the pretext of giving her food and took her to the lawn and molested her, he said, adding that the act was caught on the hotel’s CCTV camera.\n" +
                        "SEC- Arrested Under 354 and provision of prevention of children from sexual offence act (POCSO). he added agencies.");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FXMLHotNewsController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else
        if(i==1)
        {
            Image image;
            image = new Image(getClass().getResourceAsStream("/image/2.jpg"));
            img1.setImage(image);
            h1.setText("Nagpur: Gang targeting mobile phones of cabbies held");
            content1.setText("Nagpur: A two-member gang, having past criminal record, was busted by a patrolling of Beltarodi police station during a combing operation on Feb-24. Around 10 stolen mobile phones were recovered from the duo.\n" +
                    "The persons arrested, Joginder Singh Juni and Ajit Juni, targeted mobile phones and wallets of cabbies who had dozed off after parking their cars at desolate places. They would also steal mobile phones and other valuables of truckers and drivers who parked their vehicles on the sides of highways for a quick nap.\n" +
                    "The Details of the mobile phone matched those of one stolen from cab driver Vijay Sharma. His mobile phone and wallet had been stolen from his car when it was parked at Beltarodi on Feb-22.\n" +
                    "Police said another nine mobile phones were recovered from the duo, who are in the custody of Beltarodi police station till feb-29. Attempts are now being made to trace the owners of the other stolen mobile phones.");
        }else
        if(i==2)
        {

            Image image;
            image = new Image(getClass().getResourceAsStream("/image/3.jpg"));
            img1.setImage(image);
            h1.setText("Maharashtra: Minor Nephew Among Four Held for Mans Murder.");
            content1.setText("Nagpur: Gadchiroli police have rounded up four persons, including a minor, for allegedly axing a man to death on feb-20 and leaving behind a letter labelling him a police informer to mislead cops. The assailants had planned to mislead cops into assuming that the man was eliminated by the Naxals.\n" +
                    "Police said the minor was the mastermind behind eliminating his uncle, sonu gota for destroying his crop. The minor had roped in the other three accomplices to average the uncles so-called misdeed. Sonu was killed while sleeping at his farm at Bidri Village. His body was brought to Jhuri and Laid on the Kasnasur Road with some pamphlets strewn beside him, just like the Maoists are known to do when they target civilians.");
        }else
        if(i==3)
        {

            Image image;
            image = new Image(getClass().getResourceAsStream("/image/4.jpg"));
            img1.setImage(image);
            h1.setText("Std XII student goes missing from exam centre :");
            content1.setText("Nagpur: sadar police have launched a search operation to trace a 17-year-old girl who went missing from the exam centre on Wednesday. Police have registered a case of kidnapping, as per the direction of the supreme court regarding missing minors.\n" +
                    "The teenager was taken to the exam centre by her mother. After examination, the mother went to pick her up but could not find her even after all the students came out. She later contacted her daughters’ friends who told her that she did not appear in the exam.\n" +
                    "Sources Said the teenager had mobile phone and police are currently trying trace its location. Cops are also scrutinizing CCTV footage from nearby spots to ascertain where the teenager might have gone.");
        }else
        if(i==4)
        {

            Image image;
            image = new Image(getClass().getResourceAsStream("/image/5.jpg"));
            img1.setImage(image);
            h1.setText("Nagpur: Gang of The Thieves Targets Elderly Woman in Auto");
            content1.setText("Nagpur: A gang of women thieves targeted a 56-years-old woman while she was Travelling in an autorickshaw on Tuesday at jaripatka.\n" +
                    "Earlier, TOI had reported how women thieves steal valuables from other woman travelling in autorickshaws or public transports. Sources said that the most of the time, these women thieves are hand in glove with the autorickshaw drivers and they pickup elderly women from busy streets to avoid getting caught.\n" +
                    "Firozabegum Khan (56), was looking for auto to return home. And there were already three women inside the auto. While travelling in the auto, one of the women started vomiting following which the auto driver stopped the vehicle and asked khan to get out before leaving the spot. After some time, khan realized that her two tola chain worth Rs80,000 was missing from her neck. Khan then approached to jaripatka police station. Police are scrutinizing CCTV footage of the spot where the accused asked khan to get out.");
        }else
        if(i==5)
        {

            Image image;
            image = new Image(getClass().getResourceAsStream("/image/6.jpg"));
            img1.setImage(image);
            h1.setText("Maharashtra: Father, One Other Arrested for Sodomizing 11-year-old Boy");
            content1.setText("Chandrapur: Rajura police have arrested two persons for allegedly sodomizing a 11-year-old boy. One of the accused is father of the survivor, the arrests were made on Friday morning following a complaint lodged by the boy’s mother.\n" +
                    "Sources informed that the boy was alone at home with his father-date not confirmed-left for a relative’s place. The father allegedly sodomized the boy in the night. The sexual assault allegedly continued for two more days.\n" +
                    "Father also allegedly threatened to kill the boy if he narrated the incident to anybody. The boy was also allegedly sexually assaulted by a shopkeeper while he was on his way home from tution class on feb-25. Accused took the boy to his go down and sodomized him there, said sources.\n" +
                    "The mother filed a police complaint against her husband and shopkeeper after the survivor narrated the incidents.");
        }else
        if(i==6)
        {

            Image image;
            image = new Image(getClass().getResourceAsStream("/image/7.jpg"));
            img1.setImage(image);
            h1.setText("Maharashtra: Denied Blanket, Worker Murders Dhaba Owner");
            content1.setText("Nagpur; Enraged over denial of a blanket for sleeping at night, a dhaba worker allegedly killed the eatery owner in the early hours of Tuesday. Prakash Jaiswal 53 owner of a dhaba at wadamba village on pauni-navegaon road. The police arrested accused Kara bawan, who was allegedly left angry Jaiswal had denied him a blanket after two guests had walked in at the dhaba for a night stay. Its learnt that Jaiswal was fast asleep when bawan assaulted him with a stick on his neck.\n" +
                    "He is shorted -tempered vagabond, was sheltered at the dabha by Jaiswal. Though bawan was learnt to be working at the dhaba without any fixed salary.\n" +
                    "According to sources two persons from Madhya Pradesh, who worked till late at a brick-kiln in the vicinity and could not return home had stay at the dhaba.and other were asleep, and hey woke up on hearing sudden commotion and witnessed Bawan hitting Jaiswal with astick.one of the guests reached to Deolapur police station, under Nagpur rural police.\n" +
                    "Police rushed to the spot and found Jaiswal dead. They sent the body for post mortem and took bawan into custody for further investigation.");
        }else
        if(i==7)
        {

            Image image;
            image = new Image(getClass().getResourceAsStream("/image/8.jpg"));
            img1.setImage(image);
            h1.setText("Fined For traffic Violation, Man attempts to mow down cop :");
            content1.setText("Nagpur: Angry over being challaned for violating traffic rules a few days ago, a 34-year-old van driver allegedly attempted to mow down a head constable at bhande plot square on Thursday. the cop Subhash lande, attached to sakkardara traffic zone, sustained injuries on his right leg, while the van driver fled leaving the vehicle on the spot.\n" +
                    " The accused has been identified as Arvind mete, a resident of old bidi Peth. Lande is undergoing treatment at a private hospital in sakkardara. According to sources, on Monday (feb-24), lande had caught Arvind for violating traffic rules. The cop had detained Arvind’s van and issued him a challan. An infuriated Arvind had then threatened the cop of dire consequences. On Thursday, Arvind paid the fine and collected his vehicle.\n" +
                    "After the incident, sakardara police led by senior PI Ajit Sid and traffic cops rushed to the spot and shifted the injured cop to a private hospital.");
        }else
        if(i==8)
        {

            Image image;
            image = new Image(getClass().getResourceAsStream("/image/9.jpg"));
            img1.setImage(image);
            h1.setText("Nagpur: 14-year-old tribal ends life after gang rape.");
            content1.setText("Nagpur: a 14-year-old tribal girl, student of standard 8th, had ended life by setting herself on fire at her residence on Tuesday following gang rape in Beitul District of Madhya Pradesh.\n" +
                    "The minor was rushed to government medical college and hospital (GMCH) in Nagpur with more than 95% burns in the early hours of Wednesday. She was subsequently declared dead. Her post -mortem was performed at GMCH under supervision of Head of forensic dept Dr AA Mukherjee.\n" +
                    "Police said We have already arrested two perons while one is on the run. Offences of gang rape have been slapped on them. We have also invoked relevant sections under of children from sexual offences Act,2012,” he said.\n" +
                    "Sources said the victim knew the accused persons with whom she worked in a catering team.\n" +
                    "It learnt the girl had come to beitul for some work on Tuesday and had set herself on fire after returning home. “Mother was filling water outside while younger sisters were playing on the terrace when she had set herself on fire dousing with kerosene,” said a family friend.\n" +
                    "Police said the minor was exploited around one-and -half months ago and few times in the past too by the three persons.");
        }else
        if(i==9)
        {

            Image image;
            image = new Image(getClass().getResourceAsStream("/image/10.jpg"));
            img1.setImage(image);
            h1.setText("Forest Officials arrest 5 for illegal fishing and cooking :");
            content1.setText("Nagpur : A fire was averted at the ambazari biodiversity park after forest officials apprehended a group of five people who were illegally fishing and cooking food near the water body on Thursday.\n" +
                    "Forest officials have been on high alert for such incidents ever since a PIL regarding forest fires came up before the high court. \n" +
                    "The group of five forest guard were on their regular rounds when they spotted the group indulging in illegal fishing. The forest officials booked all five of them under the forest act following which the district court granted one day custody.\n" +
                    "S Prabhu Nath Shukla , the deputy conservator of forests, said ,”The Ambazari biodiversity park is spread over 750 Hectares and hence, forest officials are always on high alert because of threats due to fire ");
        }
        i++;
        if(i==10)   //i==n+1
        {
            i=0;
        }
    }

    @FXML
    private void back(ActionEvent event) {

        if(i==0)
        {
            Image image;
            image = new Image(getClass().getResourceAsStream("/image/1.jpg"));
            img1.setImage(image);
            h1.setText("Sweeper held for molesting minor at Yavatmal wedding:");
            content1.setText("Yavatmal: A 25-Year-old sweeper was arrested for allegedly molesting a 10-year-old girl at a wedding in the city on Wednesday night, police said on Thursday.\n" +
                    "Lohara police arrested akshay chandekar after he was allegedly caught molesting the minor in a lawn of a hotel on darwha road where the wedding was taking place, an official said. Chandekar had approached the girl on the pretext of giving her food and took her to the lawn and molested her, he said, adding that the act was caught on the hotel’s CCTV camera.\n" +
                    "SEC- Arrested Under 354 and provision of prevention of children from sexual offence act (POCSO). he added agencies.");
        }else
        if(i==1)
        {
            Image image;
            image = new Image(getClass().getResourceAsStream("/image/2.jpg"));
            img1.setImage(image);
            h1.setText("Nagpur: Gang targeting mobile phones of cabbies held");
            content1.setText("Nagpur: A two-member gang, having past criminal record, was busted by a patrolling of Beltarodi police station during a combing operation on Feb-24. Around 10 stolen mobile phones were recovered from the duo.\n" +
                    "The persons arrested, Joginder Singh Juni and Ajit Juni, targeted mobile phones and wallets of cabbies who had dozed off after parking their cars at desolate places. They would also steal mobile phones and other valuables of truckers and drivers who parked their vehicles on the sides of highways for a quick nap.\n" +
                    "The Details of the mobile phone matched those of one stolen from cab driver Vijay Sharma. His mobile phone and wallet had been stolen from his car when it was parked at Beltarodi on Feb-22.\n" +
                    "Police said another nine mobile phones were recovered from the duo, who are in the custody of Beltarodi police station till feb-29. Attempts are now being made to trace the owners of the other stolen mobile phones.");
        }else
        if(i==2)
        {

            Image image;
            image = new Image(getClass().getResourceAsStream("/image/3.jpg"));
            img1.setImage(image);
            h1.setText("Maharashtra: Minor Nephew Among Four Held for Mans Murder.");
            content1.setText("Nagpur: Gadchiroli police have rounded up four persons, including a minor, for allegedly axing a man to death on feb-20 and leaving behind a letter labelling him a police informer to mislead cops. The assailants had planned to mislead cops into assuming that the man was eliminated by the Naxals.\n" +
                    "Police said the minor was the mastermind behind eliminating his uncle, sonu gota for destroying his crop. The minor had roped in the other three accomplices to average the uncles so-called misdeed. Sonu was killed while sleeping at his farm at Bidri Village. His body was brought to Jhuri and Laid on the Kasnasur Road with some pamphlets strewn beside him, just like the Maoists are known to do when they target civilians.");
        }else
        if(i==3)
        {

            Image image;
            image = new Image(getClass().getResourceAsStream("/image/4.jpg"));
            img1.setImage(image);
            h1.setText("Std XII student goes missing from exam centre :");
            content1.setText("Nagpur: sadar police have launched a search operation to trace a 17-year-old girl who went missing from the exam centre on Wednesday. Police have registered a case of kidnapping, as per the direction of the supreme court regarding missing minors.\n" +
                    "The teenager was taken to the exam centre by her mother. After examination, the mother went to pick her up but could not find her even after all the students came out. She later contacted her daughters’ friends who told her that she did not appear in the exam.\n" +
                    "Sources Said the teenager had mobile phone and police are currently trying trace its location. Cops are also scrutinizing CCTV footage from nearby spots to ascertain where the teenager might have gone.");
        }else
        if(i==4)
        {

            Image image;
            image = new Image(getClass().getResourceAsStream("/image/5.jpg"));
            img1.setImage(image);
            h1.setText("Nagpur: Gang of The Thieves Targets Elderly Woman in Auto");
            content1.setText("Nagpur: A gang of women thieves targeted a 56-years-old woman while she was Travelling in an autorickshaw on Tuesday at jaripatka.\n" +
                    "Earlier, TOI had reported how women thieves steal valuables from other woman travelling in autorickshaws or public transports. Sources said that the most of the time, these women thieves are hand in glove with the autorickshaw drivers and they pickup elderly women from busy streets to avoid getting caught.\n" +
                    "Firozabegum Khan (56), was looking for auto to return home. And there were already three women inside the auto. While travelling in the auto, one of the women started vomiting following which the auto driver stopped the vehicle and asked khan to get out before leaving the spot. After some time, khan realized that her two tola chain worth Rs80,000 was missing from her neck. Khan then approached to jaripatka police station. Police are scrutinizing CCTV footage of the spot where the accused asked khan to get out.");
        }else
        if(i==5)
        {

            Image image;
            image = new Image(getClass().getResourceAsStream("/image/6.jpg"));
            img1.setImage(image);
            h1.setText("Maharashtra: Father, One Other Arrested for Sodomizing 11-year-old Boy");
            content1.setText("Chandrapur: Rajura police have arrested two persons for allegedly sodomizing a 11-year-old boy. One of the accused is father of the survivor, the arrests were made on Friday morning following a complaint lodged by the boy’s mother.\n" +
                    "Sources informed that the boy was alone at home with his father-date not confirmed-left for a relative’s place. The father allegedly sodomized the boy in the night. The sexual assault allegedly continued for two more days.\n" +
                    "Father also allegedly threatened to kill the boy if he narrated the incident to anybody. The boy was also allegedly sexually assaulted by a shopkeeper while he was on his way home from tution class on feb-25. Accused took the boy to his go down and sodomized him there, said sources.\n" +
                    "The mother filed a police complaint against her husband and shopkeeper after the survivor narrated the incidents.");
        }else
        if(i==6)
        {

            Image image;
            image = new Image(getClass().getResourceAsStream("/image/7.jpg"));
            img1.setImage(image);
            h1.setText("Maharashtra: Denied Blanket, Worker Murders Dhaba Owner");
            content1.setText("Nagpur; Enraged over denial of a blanket for sleeping at night, a dhaba worker allegedly killed the eatery owner in the early hours of Tuesday. Prakash Jaiswal 53 owner of a dhaba at wadamba village on pauni-navegaon road. The police arrested accused Kara bawan, who was allegedly left angry Jaiswal had denied him a blanket after two guests had walked in at the dhaba for a night stay. Its learnt that Jaiswal was fast asleep when bawan assaulted him with a stick on his neck.\n" +
                    "He is shorted -tempered vagabond, was sheltered at the dabha by Jaiswal. Though bawan was learnt to be working at the dhaba without any fixed salary.\n" +
                    "According to sources two persons from Madhya Pradesh, who worked till late at a brick-kiln in the vicinity and could not return home had stay at the dhaba.and other were asleep, and hey woke up on hearing sudden commotion and witnessed Bawan hitting Jaiswal with astick.one of the guests reached to Deolapur police station, under Nagpur rural police.\n" +
                    "Police rushed to the spot and found Jaiswal dead. They sent the body for post mortem and took bawan into custody for further investigation.");
        }else
        if(i==7)
        {

            Image image;
            image = new Image(getClass().getResourceAsStream("/image/8.jpg"));
            img1.setImage(image);
            h1.setText("Fined For traffic Violation, Man attempts to mow down cop :");
            content1.setText("Nagpur: Angry over being challaned for violating traffic rules a few days ago, a 34-year-old van driver allegedly attempted to mow down a head constable at bhande plot square on Thursday. the cop Subhash lande, attached to sakkardara traffic zone, sustained injuries on his right leg, while the van driver fled leaving the vehicle on the spot.\n" +
                    " The accused has been identified as Arvind mete, a resident of old bidi Peth. Lande is undergoing treatment at a private hospital in sakkardara. According to sources, on Monday (feb-24), lande had caught Arvind for violating traffic rules. The cop had detained Arvind’s van and issued him a challan. An infuriated Arvind had then threatened the cop of dire consequences. On Thursday, Arvind paid the fine and collected his vehicle.\n" +
                    "After the incident, sakardara police led by senior PI Ajit Sid and traffic cops rushed to the spot and shifted the injured cop to a private hospital.");
        }else
        if(i==8)
        {

            Image image;
            image = new Image(getClass().getResourceAsStream("/image/9.jpg"));
            img1.setImage(image);
            h1.setText("Nagpur: 14-year-old tribal ends life after gang rape.");
            content1.setText("Nagpur: a 14-year-old tribal girl, student of standard 8th, had ended life by setting herself on fire at her residence on Tuesday following gang rape in Beitul District of Madhya Pradesh.\n" +
                    "The minor was rushed to government medical college and hospital (GMCH) in Nagpur with more than 95% burns in the early hours of Wednesday. She was subsequently declared dead. Her post -mortem was performed at GMCH under supervision of Head of forensic dept Dr AA Mukherjee.\n" +
                    "Police said We have already arrested two perons while one is on the run. Offences of gang rape have been slapped on them. We have also invoked relevant sections under of children from sexual offences Act,2012,” he said.\n" +
                    "Sources said the victim knew the accused persons with whom she worked in a catering team.\n" +
                    "It learnt the girl had come to beitul for some work on Tuesday and had set herself on fire after returning home. “Mother was filling water outside while younger sisters were playing on the terrace when she had set herself on fire dousing with kerosene,” said a family friend.\n" +
                    "Police said the minor was exploited around one-and -half months ago and few times in the past too by the three persons.");
        }else
        if(i==9)
        {

            Image image;
            image = new Image(getClass().getResourceAsStream("/image/10.jpg"));
            img1.setImage(image);
            h1.setText("Forest Officials arrest 5 for illegal fishing and cooking :");
            content1.setText("Nagpur : A fire was averted at the ambazari biodiversity park after forest officials apprehended a group of five people who were illegally fishing and cooking food near the water body on Thursday.\n" +
                    "Forest officials have been on high alert for such incidents ever since a PIL regarding forest fires came up before the high court. \n" +
                    "The group of five forest guard were on their regular rounds when they spotted the group indulging in illegal fishing. The forest officials booked all five of them under the forest act following which the district court granted one day custody.\n" +
                    "S Prabhu Nath Shukla , the deputy conservator of forests, said ,”The Ambazari biodiversity park is spread over 750 Hectares and hence, forest officials are always on high alert because of threats due to fire ");
        }
        i--;
        if(i==-1)
        {

            i=9;   //i=n
        }
    }

}
