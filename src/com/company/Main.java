package com.company;

import com.company.iterator.BrowseHistory;
import com.company.iterator.Iterator;
import com.company.memento.Editor;
import com.company.memento.History;
import com.company.state.BrushTool;
import com.company.state.Canvas;
import com.company.state.EraserTool;
import com.company.state.SelectionTool;

public class Main {

    public static void main(String[] args) {
	    User user = new User("Mosh", 30);
        System.out.println(user.name);
        user.sayHello();

        // In the example, the main class is coupled or dependent on the user class.
        // If you change the User class, the main class might be affected.
        // All the class dependent on the changed class have to be recompiled.

        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
        // In this method we have a dependency or coupling to this interface.
        // As long as we keep the signature of calculateTax() method exactly as these,
        // we are not going to have a breaking change.

        var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());

        var mailService = new MailService();
        mailService.sendEmail();
        // customers don't care about the connect/disconnect/auth methods.

        var textBox = new TextBox();
        textBox.enable();

        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());

        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());

        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();

        // iterator
        var history_i = new BrowseHistory();
        history_i.push("a");
        history_i.push("b");
        history_i.push("c");

        Iterator iterator = history_i.createIterator();
        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }

    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }

    public static void drawUIControl(UIControl control) {
        control.draw();
        // UIControl is the parent of the TextBox and CheckBox classes.
        // The object control can take on different forms.
    }
}
