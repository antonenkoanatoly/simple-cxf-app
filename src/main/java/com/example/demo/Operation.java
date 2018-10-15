package com.example.demo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "operation")
public enum  Operation {
    confirm, reject
}
