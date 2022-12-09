# Principles and Practice in Programming Languages
# Mini-Project: Fall 2022

See [instructions.md](instructions.md) for submission instructions.

# TODO: Small-Step Substitution

## Description

Project Team: Jason Mu, Anna Rahn, Uri Soltz

During class, we used small-step substitution to determine evaluation order of arithmetic expressions and to implement short circuiting. In our video tutorial, we will give a brief review of the requisite logic and inference rule structure before providing a complete walkthrough of an exam-like example question.

First, we will explain small-step evaluation using addition. We will write three rules: one do rule and two search rules. We explain the differences between the rule types, then walk through an example. This example can be found in drafts/Materials.pdf and will illustrate how to enforce order of operations.

Our exam question is as follows: "Write a set of inference rules such that the evaluation of e1 / e2 short-circuits if e2 is zero." Such an expression always produces an invalid result, so by short-circuiting, we can improve the efficiency of the evaluation. The grammars for the expression language, example, and final inference rules can be found in drafts/Materials.pdf. We will explain the thought process behind writing the inference rules, how to enforce associativity and order of operations, and how to implement short-circuiting. After this, we will translate these inference rules into Scala code.

## Repository Organization

The video tutorial will be linked below under the Presentation section of the readme. Viewers can follow along using the materials in the presentation_materials folder.

For the checkpoint, the drafts of both our materials and script can be found in the drafts folder.

## Building and Testing Instructions

TODO: Replace with building and testing instructions. Please minimize the number of dependencies and as simple and platform-independent as possible. Consider, for example, using [Docker](https://www.docker.com/).

## Presentation

TODO: Update the following links and remove this line.

- YouTube: https://www.youtube.com/watch?v=Wdck-WmsthI&ab_channel=UriSoltz.
- Script: [script.md](script.md).
- Recording: [recording.mp4](recording.mp4).
- Slides (if you use them in your recording): [slides.pdf](slides.pdf) and slide sources (e.g., [slides.pptx](slides.pptx) or [slides.key](slides.key)).
