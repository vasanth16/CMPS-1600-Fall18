//
//  ViewController.swift
//  project3ios
//
//  Created by Vasanth Rajasekaran on 12/4/18.
//  Copyright © 2018 Vasanth. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet var nameField: UIView!
    @IBOutlet var newNameField: UITextField!
    @IBOutlet weak var sentenceField: UILabel!
    override func viewDidLoad() {
        super.viewDidLoad()
        newNameField.delegate = self
        
        // Do any additional setup after loading the view, typically from a nib.
    }
    
    @IBAction func addNameButton(_ sender: Any) {
        sentenceField.text = "Hello \(newNameField.text!)"
    }
   
    
}

extension ViewController:UITextFieldDelegate{
    func textFieldShouldReturn(_ textField: UITextField) -> Bool {
        textField.resignFirstResponder()
        return true
    }
}
