# Mule-Munit-Examples

This example project covers the list of options available on Mule 4.X. The mule flow has event processor and event source.
The individual mule component consider as an event processor and a listener are consider as an event source for event processor.

## mocking-event-processor-test-suite.xml
 It explains how to mock event processor in the mule flow.

## mocking-connector-test-suite.xml
For example, event processor makes any external call using connectors, the external calls could be mocked as mentioned in code.

## testcustomassertion-test-suite.xml
Developers are able to create own assertion using java code(HelloWorldAsser.java), and use it internally while writing unit test cases.
It allows to customize the assertion process which is specially required for handling complex use cases.

## testerrorpath-test-suite.xml
It explains how to test error path in the code. It helps to cover all the paths in the flow which includes error/negative path in the flow.

## testseteventservice-test-suite.xml
Create a new event message for the flow before making calls to flow during unit test case execution.

## testspyeventprocessor-test-suite.xml
The spy option allows to test individual event processor. For example, while testing dataweave code, spy help to test what is going to dataweave tranformation and what is coming out of the dataweave transformation.
Most of the business logic is written here. The verify call helps to understand how many times the particular connector get called for specific request.  

## testxml-test-suite.xml
It compare the XML files from payload and has option for normalize whitespace, ignore comments, ignore whitespace.

## testjson-test-suite.xml
It compare json output from payload.

Refer the link for more information : https://gitlab.codecentric.de/danijel.dragicevic/assert-object-equals-module

### Installation
"Import to Anypoint study 7.X". Maven project.

### Usage
Go to src/test/munit -> right click the file -> move to Munit -> Run tests.  

## Contributing
Pull requests are welcome.
