# Log4j Vulnerability - Proof-of-concept

This repo has the source for a sample Java app that suffers from CVE-2201-4428.

Follow [this blog](https://ankurkatiyar0.wixsite.com/legosamurai/post/cve-2021-44228-proof-of-concept-on-kubernetes) to understand how all of this is tied together.

#
## Instructions

The main repo to refer is [GitHub Repo - log4j-docker](https://github.com/ankur-katiyar/log4j-docker)


#
## Vulnerability

Apache Log4j is a Java-based logging utility. It is part of the Apache Logging Services, a project of the Apache Software Foundation. Log4j is one of several Java logging frameworks.

Apache Log4j2 2.0-beta9 through 2.12.1 and 2.13.0 through 2.15.0 JNDI features used in configuration, log messages, and parameters do not protect against attacker controlled LDAP and other JNDI related endpoints. An attacker who can control log messages or log message parameters can execute arbitrary code loaded from LDAP servers when message lookup substitution is enabled. From log4j 2.15.0, this behavior has been disabled by default. From version 2.16.0, this functionality has been completely removed. Note that this vulnerability is specific to log4j-core and does not affect log4net, log4cxx, or other Apache Logging Services projects.
<br/><br/>

![](https://www.govcert.ch/blog/zero-day-exploit-targeting-popular-java-library-log4j/assets/log4j_attack.png) 


#
## Authors
- **[@ankur-katiyar](https://www.github.com/ankur-katiyar)**

## Resources
 - [CVE-2021-44228](https://nvd.nist.gov/vuln/detail/CVE-2021-44228)


## License

[GNU General Public License v3.0](https://choosealicense.com/licenses/gpl-3.0/)