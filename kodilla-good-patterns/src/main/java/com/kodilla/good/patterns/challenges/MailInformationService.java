package com.kodilla.good.patterns.challenges;

public class MailInformationService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Sending email to: "+user.getUserMail() + "\n Dear " + user.getUserName() + "\nThank you for your order");
    }
}
