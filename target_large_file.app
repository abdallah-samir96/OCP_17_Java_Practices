This article is about the Java programming language. For other uses, see History of Java.
The Java language has undergone several changes since JDK 1.0 as well as numerous additions
of classes and packages to the standard library. Since J2SE 1.4, the evolution of the Java
language has been governed by the Java Community Process (JCP), which uses Java Specification Requests (JSRs) to propose and specify additions and changes to the Java platform. The language is specified by the Java Language Specification (JLS); changes to the JLS are managed under JSR 901. In September 2017, Mark Reinhold, chief architect of the Java Platform, proposed to change the release train to "one feature release every six months" rather than the then-current two-year schedule.[1][2] This proposal took effect for all following versions, and is still the current release schedule.

In addition to the language changes, other changes have been made to the Java Class
Library over the years, which has grown from a few hundred classes in JDK 1.0 to over three thousand in J2SE 5. Entire new APIs, such as Swing and Java2D, have been introduced, and many of the original JDK 1.0 classes and methods have been deprecated, and very few APIs have been removed (at least one, for threading, in Java 22[3]). Some programs allow the conversion of Java programs from one version of the Java platform to an older one (for example Java 5.0 backported to 1.4) (see Java backporting tools).

Regarding Oracle's Java SE support roadmap,[4] Java SE 25 (LTS) is the latest version as of September 2025 (and Java 26 a later released version) while versions 21, 17, 11 and 8 are the other still supported (long-term support − LTS) versions, where Oracle customers will receive Oracle Premier Support. Oracle continues to release no-cost public Java 8 updates for development[4] and personal use indefinitely.[5]

In the case of OpenJDK, both commercial long-term support and free software updates are available from multiple organizations in the broader community.[6]

Java 26 was released on 17 March 2026 and Java 25 LTS was released on 16 September 2025.[7]

JDK 1:
The first version was released on January 23, 1996.[20][21] The first stable version, JDK 1.0.2, is called Java 1.[21]

It included:

core language features (basic java types in java.lang, and utility classes in java.util)
support for graphics (AWT framework)
support for creating a Java applet
libraries for I/O and networking

JDK 1.1:
Major additions in the release on February 19, 1997 included:[22]

extensive retooling of the Abstract Window Toolkit (AWT) event model
inner classes added to the language
JavaBeans
Java Database Connectivity (JDBC) and support for sql
Java remote method invocation (RMI) and serialization
reflection which supported Introspection only, no modification at runtime was possible. (The ability to modify objects reflectively was added in J2SE 1.2, by introducing the AccessibleObject class and its subclasses such as the Field class.)
Just-in-time compilation (JIT) on Microsoft Windows platforms, produced for JavaSoft by Symantec
Internationalization and Unicode support originating from Taligent[23]
Hello From Java & Java Comunity