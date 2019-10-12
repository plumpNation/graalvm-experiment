GraalVM experiment
==================

I wanted to see what it would take to get a SSR rendered app running with Next.js and GraalVM.

## Install GraalVM

I followed the instructions here:
https://www.graalvm.org/docs/getting-started/#install-graalvm

I moved the graalvm folder to the /opt folder and then added the graalvm `bin` location to the path
and changed the `JAVA_HOME` to point at the graalvm folder.
