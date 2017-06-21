resolvers += Resolver.sonatypeRepo("snapshots")

addSbtPlugin("org.ensime"          % "sbt-ensime"             % "1.12.9")
// addSbtPlugin("org.ensime"          % "sbt-ensime"             % "2.0.0-SNAPSHOT")
addSbtPlugin("net.virtual-void"    % "sbt-dependency-graph"   % "0.8.2")
addSbtPlugin("com.timushev.sbt"    % "sbt-updates"            % "0.1.10")
addSbtPlugin("io.get-coursier"     % "sbt-coursier"           % "1.0.0-RC1")
addSbtPlugin("com.scalapenos"      % "sbt-prompt"             % "1.0.0")
addSbtPlugin("com.typesafe.sbt"    % "sbt-git"                % "0.9.3")

//addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.8.0")
