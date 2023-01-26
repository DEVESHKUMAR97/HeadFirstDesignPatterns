package com.deveshkumar.ch2observerpattern.lifechangingswingobserver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 26-01-2023
 * @time : 03:59 pm
 */
public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();

    }
    public void go() {
        frame = new JFrame();

        // Creating Subject/Observable, JButton is observable class
        // notification is sent when button is clicked
        JButton button = new JButton("Should I do it?");


        // Without lambdas
        // registering observers with the subject, equivalent to registerObserver
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());


//        // With lambdas
//        button.addActionListener(event ->
//                System.out.println("With lambdas ==> Don't do it, you might regret it!")
//        );
//        button.addActionListener(event ->
//                System.out.println("With lambdas ==> Come on, do it!")
//        );




        frame.getContentPane().add(BorderLayout.CENTER, button);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

    // Creating observer, here AngelListener is concrete observer and ActionListener is observer interface
    class AngelListener implements ActionListener {

        // equivalent to update
        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("Don't do it, you might regret it!");
        }
    }

    // Creating another observer, here DevilListener is concrete observer and ActionListener is observer interface
    class DevilListener implements ActionListener {

        // equivalent to update
        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("Come on, do it!");
        }
    }



}
