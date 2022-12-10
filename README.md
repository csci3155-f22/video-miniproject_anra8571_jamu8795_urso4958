# Principles and Practice in Programming Languages
# Mini-Project: Fall 2022

See [instructions.md](instructions.md) for submission instructions.

# TODO: Small-Step Substitution

## Description

Project Team: Jason Mu, Anna Rahn, Uri Soltz

During class, we used small-step substitution to determine evaluation order of arithmetic expressions and to implement short circuiting. In our video tutorial, we will give a brief review of the requisite logic and inference rule structure before providing a complete walkthrough of an exam-like example question (with both inference rules and Scala code)

First, we will explain small-step evaluation using simple addition. We provide three inference rules: one do rule and two search rules. We explain the differences between the rule types and how to use them, each with a real expression. This problem can be found in production/Materials.pdf and will illustrate how to use inference rules to enforce order of operations/use small-step evaluation.

Our exam question is as follows: "Write a set of inference rules such that the evaluation of e1 / e2 short-circuits if e2 is zero." Such an expression always produces an invalid result, so by short-circuiting, we can improve the efficiency of the evaluation. The grammars for the expression language, example, and final inference rules can be found in production/Materials.pdf. We will explain what short-circuiting is, the thought process behind writing the inference rules, and how to enforce order of evaluation. After this, we will translate these inference rules into Scala code, which can be found in production/short_circuit.worksheet.sc.

## Repository Organization

The video tutorial will be linked below under the Presentation section of the readme. Viewers can follow along using the materials in the production folder (which includes the questions, solutions, and examples we are using in the video).

For the checkpoint, the drafts of both our materials and script can be found in the drafts folder.

## Building and Testing Instructions

Download the worksheet from production/short_circuit.worksheet.sc. Move the file from your Downloads directory to your lab3/src/main/scala/jsy/student directory. Start Metals, then run the worksheet. Once everything compiles and evaluates, you can experiment with the code, write tests and examples, expand the grammar to include multiplication, and more!

## Contributions
Anna Rahn: Wrote the examples, solutions, and code example, then did the audio/visual explanation of each, created thumbnail

Uri Soltz: Recorded and directed video, edited video and audio, created credits outro

Jason Mu: Recorded video, proofread all presentation materials

## Presentation
- YouTube: https://www.youtube.com/watch?v=Wdck-WmsthI&ab_channel=UriSoltz.
- Script: [script.md](https://github.com/csci3155-f22/video-miniproject_anra8571_jamu8795_urso4958/blob/main/drafts/script.md).
- Inference Rule Examples: [examples](https://github.com/csci3155-f22/video-miniproject_anra8571_jamu8795_urso4958/blob/main/production/Presentation%20Materials.pdf)
- Short-Circuiting Division Example: [division.worksheet.sc](https://github.com/csci3155-f22/video-miniproject_anra8571_jamu8795_urso4958/blob/main/production/division.worksheet.sc)