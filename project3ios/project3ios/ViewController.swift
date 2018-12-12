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
    @IBOutlet weak var weightField: UITextField!
    
    var calc = 0.0;
    var heightsq = 0.0;
    var temp = 0.0;
    override func viewDidLoad() {
        super.viewDidLoad()
        newNameField.delegate = self
        weightField.delegate = self
        
        // Do any additional setup after loading the view, typically from a nib.
    }
    
    @IBAction func addNameButton(_ sender: Any) {
        temp = Double(newNameField.text!)!
        heightsq = pow(temp,2)
        calc = (Double(weightField.text!)!/heightsq) * 703
        
        sentenceField.text = "BMI: \(calc)"
    }
   
    
}

extension ViewController:UITextFieldDelegate{
    func textFieldShouldReturn(_ textField: UITextField) -> Bool {
        textField.resignFirstResponder()
        return true
    }
}
