JC=javac
OBJDIR=obj
SRCDIR=src
all:
	$(JC) -d $(OBJDIR) $(SRCDIR)/*.java
clean:
	$(RM) $(OBJDIR)/*.class
