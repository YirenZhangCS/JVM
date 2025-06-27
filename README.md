# JVM
A Java Virtual Machine using C to explore the development of HLL features such as polymorphism, object orientation, automatic memory management, exceptions and native methods.

This JVM was developed referencing Oracle's [Java Virtual Machine
Specification](https://docs.oracle.com/javase/specs/jvms/se8/html/index.html).


### Setup ###

You'll need a JDK 1.8 environment installed to build programs to run
with Hawkbeans (i.e. using `javac`).  By default, Hawkbeans
will compile with Clang, but will use GCC if Clang isn't available.
You'll also want to have `libreadline` installed. Feel free to use
the provided `Vagrantfile` to get a dev environment up and running 
(no GUI necessary).

### Building ###

To build the JVM, simply run `make`. To build the Java libs (required for
building test programs) run `make jlibs`.  To build test programs (in
`testcode/`), run `make testcode`.

### Running ###
Hawkbeans can be run as follows:

```
$> bin/hawkbeans-clang-debug SomeClass
```

Be careful about where you put classes. The hardcoded class search paths are
in `javasrc`, in `testcode`, and in the Hawkbeans top-level directory. If you
try to use a class outside these paths, it will fail.

### Source Tree ###

The source is organized into the following directories:

* `jvm`: The code for the platform-independent portion of Hawkbeans. 
	 Note this organization is not very sane at the moment.
   - `arch/x64-linux`: The linux specific code, and the only
   one that currently works.
   - `arch/hawknest`: A platform directory for the Hawknest emulator. Not working.
* `include`: The header files for the code.
* `javasrc`: The Java code for the Hawkbeans standard libraries.
* `scripts`: Various utility scripts, mostly used when I wrote the code.
* `testcode`: A set of simple Java programs to test functionality
* `bin`: This is where the build toolchain puts binaries.

