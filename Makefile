.SUFFIXES: .java .class
SRCDIR=src
BINDIR=bin
JAVAC=/usr/bin/javac
JAVA=/usr/bin/java

$(BINDIR)/%.class: $(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<

CLASSES = bin/Post.class \
	  bin/account.class \
          bin/BinaryTreeNode.class \
          bin/BinaryTree.class \
          bin/BinarySearchTree.class \
          bin/fileReader.class bin/Xtras.class bin/TokTik.class

default: $(CLASSES)

run: $(CLASSES)
	$(JAVA) -cp $(BINDIR) TokTik

clean:
	rm $(BINDIR)/*.class
