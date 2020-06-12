/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tushar.cias_btushar;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;

/**
 * FXML Controller class
 *
 * @author Tushar
 */
public class TempController implements Initializable {

    @FXML
    private Button btnClose;
    public static AnchorPane fxmlCias;
    private WebEngine engine;
    @FXML
    private Pane sajaPane;
    @FXML
    private Label saja;
    @FXML
    private Label label;
    @FXML
    private Label info;
    static int abc;
    /**
     * Initializes the controller class.
     */

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // TODO
        if(abc==1)
        {
            info.setText("An assault is the act of inflicting physical harm or unwanted physical contact upon a person or, in some specific legal definitions,\n" +
                    "a threat or attempt to commit such an action. It is both a crime and a tort and, therefore, may result in either criminal and/or civil liability. ");
            label.setText("Assault");
            saja.setText("According to section 352 of Indian penal code, Whoever assaults or uses criminal force to any person otherwise than on grave and sudden \n" +
                    "provocation given by that person, shall be punished with imprisonment of either description for a term which may extend to three months,\n" +
                    "or with fine which may extend to five hundred rupees, or with both.");
        }
        if(abc==2)
        {
            label.setText("Robbery");
            info.setText("A robbery is when someone takes something from you with violence or threats –\n" +
                    "usually in the street or another public place. It’s considered to be a relatively common\n" +
                    "crime, and can sometimes happen in relation to other crimes. for example, gang\n" +
                    "violence, hate crime or antisocial behaviour. the impact it has on you can still be very\n" +
                    "damaging.");
            saja.setText("Section-392, Whoever commits robbery shall be punished with\n" +
                    "rigorous imprisonment for a term which may extend to ten years, and shall also be\n" +
                    "liable to fine; and, if the robbery be committed on the highway between sunset and\n" +
                    "sunrise, the imprisonment may be extended to fourteen years.");
        }
        if(abc==3)
        {
            label.setText("Terrorism");
            info.setText("An act of terror in India includes any intentional act of violence that causes\n" +
                    "death, injury or property damage, induces fear, and is targeted against any group of\n" +
                    "people identified by their political, philosophical, ideological, racial, ethnic, religious\n" +
                    "or any other nature.");
            saja.setText("Under this Act whoever advocates directly or indirectly for cession or secession\n" +
                    "in any part of India is liable to be punished. The Act provided that a person can be\n" +
                    "detained up to 1 year without formal charges or trial against him.");
        }
        if(abc==4)
        {
            label.setText("Abduction");
            info.setText("Being abducted is one of the worst things that can happen to you.To abduct is to\n" +
                    "kidnap to take someone against their will and imprison them. After an abduction, the\n" +
                    "abductors (kidnappers) may send a ransom note, asking for money.");
            saja.setText("Section 363 in The Indian Penal Code – Punishment for kidnapping. Whoever\n" +
                    "kidnaps any person from India or from lawful guardianship, shall be punished with\n" +
                    "imprisonment of either description for a term which may extend to seven years, and\n" +
                    "shall also be liable to fine.");
        }
        if(abc==5)
        {
            label.setText("Dowry");
            info.setText("The predominant types of dowry crimes relate to cruelty (which includes\n" +
                    "torture and harassment), domestic violence (including physical, emotional and sexual\n" +
                    "assault), abetment to suicide and dowry death (including, issues of bride burning\n" +
                    "and murder).");
            saja.setText("Dowry is illegal in India under the anti-dowry law. Under the Dowry\n" +
                    "Prohibition Act, any act to take or give dowry is punishable in India. The punishment\n" +
                    "\n" +
                    "for violating the anti-dowry law is imprisonment for up to 5 years and fine of Rs.\n" +
                    "15,000 or the value of dowry given, whichever is more.");
        }
        if(abc==6)
        {
            label.setText("Murder");
            info.setText("Murder is the deliberate and illegal killing of a person. To murder someone\n" +
                    "means to commit the crime of killing them deliberately. Murder includes premeditated\n" +
                    "murder, unpremeditated murder where the defendant intended to inflict grievous\n" +
                    "bodily harm, and felony murder (death caused during the commission of a dangerous\n" +
                    "felony).");
            saja.setText(" The punishment for murder under India's Penal Code is life imprisonment or death and the person is also liable to a fine.[16] Guidance on the application of the death sentence was provided by the Supreme Court of India in Jagmohan Singh v.\n" +
                    "According to section 302 of Indian penal code, whoever commits murder shall be punished with death, or imprisonment for life, and shall also be liable to fine.");
        }
        if(abc==7)
        {
            label.setText("Extortion");
            info.setText("Extortion is the wrongful use of actual or threatened force, violence or intimidation to gain money or property from an individual or entity.\n" +
                    " Extortion generally involves a threat being made to the victim’s person or property, or to their family or friends. While the threat of violence or property\n" +
                    " damage is commonplace in extortion, it can also involve reputational harm or unfavorable government action");
            saja.setText("Section-384, Punishment for extortion. Whoever commits extortion shall be punished with imprisonment of either description for a term which may extend to three years,\n" +
                    " or with fine, or with both.");
        }
        if(abc==8)
        {
            label.setText("Money Laundering");
            info.setText("Money laundering is the process of making large amounts of money generated by a criminal activity, such as drug trafficking or terrorist funding, appear to have come from a legitimate source. The money from the criminal activity is considered dirty, and the process \"launders\" it to make it look clean.Money laundering is itself a crime.");
            saja.setText("Under the Prevention of Money Laundering Act, whoever commits the crime of money-laundering are liable to be punished with imprisonment for a period of not less than 3 years but may continue for seven years and a penalty of Rs.5 lakhs. This may also extend to 10 years for certain crimes.");
        }
        if(abc==9)
        {
            label.setText("Black Marketing");
            info.setText(" Black market refers to an illegal trading of goods and services without government's knowledge in order to avoid price control, tax or government regulations. In black market, consumers also can get the goods which is prohibited by the government such as drugs, firearms, listed animals, and animal's allied goods.");
            saja.setText("The civil and criminal liabilities for holding black money range from rigorous imprisonment for not less than three years and up to seven to 10 years, along with a fine. By the Income Tax Act, any Indian citizen who holds money abroad on which tax was owed but not paid becomes liable to pay tax, interest and penalty.");
        }
        if(abc==10)
        {
            label.setText("Corruption");
            info.setText("Corruption is the abuse of entrusted power for private gain. It can be classified as grand, petty and political, depending on the amounts of money lost and the sector where it occurs. Forms of corruption vary, but include bribery, extortion, cronyism, nepotism, parochialism, patronage, influence peddling, graft, and embezzlement. ");
            saja.setText("Punishment for abetment of offences defined in Section 7 or 11 shall be punishable with imprisonment for a term which shall be not less than six months but which may extend to five years and shall also be liable to fine.");
        }
        if(abc==11)
        {
            label.setText("Arm Trafficking");
            info.setText("Arms trafficking, also known as gunrunning, is the illegal trafficking or smuggling of contraband weapons or ammunition. Ammunition and explosives also form an integral part of small arms and light weapons used in conflict.");
            saja.setText(" Bring into, or takes out of, India, any arms or ammunition of any class or description in contravention of section 11,shall be punishable with imprisonment for a term which shall not be less than three years but which may extend to seven years and shall also be liable to fine.");
        }
        if(abc==12)
        {
            label.setText("Cyber Crime");
            info.setText("Cybercrime is defined as a crime in which a computer is the object of the crime (hacking, phishing, spamming) or is used as a tool to commit an offense (child pornography, hate crimes). Criminals can also use computers for communication and document or data storage.");
            saja.setText("Section – 66,Computer Related Offences If any person, dishonestly, or fraudulently, does any act referred to in section 43, he shall be punishable with imprisonment for a term which may extend to two three years or with fine which may extend to five lakh rupees or with both.");
        }
        if(abc==13)
        {
            label.setText("Drugs Trafficking");
            info.setText("It is a global illicit trade involving the cultivation, manufacture, distribution and sale of substances which are subject to drug prohibition laws. Most jurisdictions prohibit trade, except under license, of many types of drugs through the use of drug prohibition laws.");
            saja.setText("Drug Trafficking and illicit use of Narcotic Drugs and Psychotropic Substances. and Psychotropic Substances and for matters connected Nye ro therewith.\" imprisonment of three years with or without fine and four years imprisonment with or without fine with repeat offences.");
        }
        if(abc==14)
        {
            label.setText("Stalking");
            info.setText(" Stalking is any repeated and unwanted contact with you that makes you feel unsafe. You can be stalked by a stranger, but most stalkers are people you know even an intimate partner. Stalking may get worse or become violent over time. Stalking may also be a sign of an abusive relationship.");
            saja.setText("Under Section 354 of the IPC, whoever assaults a woman knowing that it would outrage her modesty is liable to be punished under the law. The essence of a woman’s modesty is her sex. The law makes it punishable only if three ingredients are met – that is, the assault must be on a woman, the accused must have used criminal force and that it should outrage her modesty.");
        }
        if(abc==15)
        {
            label.setText("Rape");
            info.setText("Rape is a type of sexual assault usually involving sexual intercourse or other forms of sexual penetration carried out against a person without that person's consent. The act may be carried out by physical force, coercion, abuse of authority, or against a person who is incapable of giving valid consent");
            saja.setText("If convicted, the minimum punishment is imprisonment for two years and imposition of a fine (Section 376B, IPC).\n" +
                    "Section 375 of the IPC made punishable the act of sex by a man with a woman if it was done against her will or without her consent\n" +
                    "Section 376 provided for seven years of jail term to life imprisonment to whoever commits the offence of rape.");
        }
        if(abc==16)
        {
            label.setText("Child Pornography");
            info.setText(" It is a form of child sexual exploitation. Federal law defines child pornography as any visual depiction of sexually explicit conduct involving a minor (persons less than 18 years old).  Images of child pornography are also referred to as child sexual abuse images. The law prohibits the production, distribution, importation, reception, or possession of any image of child pornography.  ");
            saja.setText("Under Section 14 of the POCSO Act, 2012 whoever uses a child or children for pornographic purposes shall be punished with imprisonment of either description which may extend to five years and shall be liable to fine.");
        }
        if(abc==17)
        {
            label.setText("Human Trafficking");
            info.setText("It is a serious and often hidden crime. It comprises slavery, servitude, forced and compulsory labour and human trafficking, which is the harbouring and transportation of individuals for exploitation.Victims can be any nationality, gender and age but children, young people and vulnerable adults are often targeted.");
            saja.setText("Through the Immoral Trafficking Prevention Act (ITPA), the Indian Government penalizes trafficking for commercial sexual exploitation, with prescribed penalty of 7 years to life imprisonment. India also prohibits bonded and forced labour through: Bonded Labour Abolition Act, Child Labour Act.");
        }
        if(abc==18)
        {
            label.setText("Forced Marriage");
            info.setText(" It occurs when one or both spouses do not consent to the marriage and duress is involved. Children and at-risk adults (those with developmental disabilities) cannot consent to marriage. Girls under the age of 18 and boys under the age of 21 cannot legally marry in India.");
            saja.setText("Those performing, participating or abetting child marriage can be prosecuted. A woman, however, cannot be imprisoned under this Act. Under PCMA, offenders can be punished for up to two years imprisonment and/or a fine of up to Rs 1 lakh for violations.");
        }
        if(abc==19)
        {
            label.setText("Acid Attack");
            info.setText(" An Acid Attack also called acid throwing, vitriol attack, or vitriol age, is a form of violent assault involving the act of throwing acid or a similarly corrosive substance onto the body of another \"with the intention to disfigure, maim, torture, or kill\".");
            saja.setText("The Section 326 A in the Indian Penal Code lays down the punishment for acid attacks. The minimum punishment is 10 years' imprisonment. It can extend up to life imprisonment with fine. A separate law to punish offenders in such cases was passed along with amendment of law on sexual offences.");
        }
        if(abc==20)
        {
            label.setText("Ragging");
            info.setText("Ragging involves abuse, humiliation or harassment of new entrants or junior students by the senior students. It often takes a malignant form wherein the newcomers may be subjected to psychological or physical torture.");
            saja.setText("Maharashtra Prohibition of Ragging Act, 1999 section 4 also provides punishment up to 2 years imprisonment or fine which may extend to ₹10000 or both. This according to my knowledge being the lowest punishment for ragging.");
        }
    }

    @FXML
    private void close(ActionEvent event){
        ((Node)(event.getSource())).getScene().getWindow().hide();
        FXMLCrimeController c = new FXMLCrimeController();
        fxmlCias = c.getPane();
        fxmlCias.setEffect(null);

    }
    public void saja(int i)
    {
        abc = i;

    }


}
