# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.10

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /Applications/CLion.app/Contents/bin/cmake/bin/cmake

# The command to remove a file.
RM = /Applications/CLion.app/Contents/bin/cmake/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = "/Users/vasanthrajasekaran/Documents/Sophomore Year/CMPS 1600/project2"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "/Users/vasanthrajasekaran/Documents/Sophomore Year/CMPS 1600/project2/cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/project2.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/project2.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/project2.dir/flags.make

CMakeFiles/project2.dir/main.c.o: CMakeFiles/project2.dir/flags.make
CMakeFiles/project2.dir/main.c.o: ../main.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/Users/vasanthrajasekaran/Documents/Sophomore Year/CMPS 1600/project2/cmake-build-debug/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/project2.dir/main.c.o"
	/Library/Developer/CommandLineTools/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/project2.dir/main.c.o   -c "/Users/vasanthrajasekaran/Documents/Sophomore Year/CMPS 1600/project2/main.c"

CMakeFiles/project2.dir/main.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/project2.dir/main.c.i"
	/Library/Developer/CommandLineTools/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E "/Users/vasanthrajasekaran/Documents/Sophomore Year/CMPS 1600/project2/main.c" > CMakeFiles/project2.dir/main.c.i

CMakeFiles/project2.dir/main.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/project2.dir/main.c.s"
	/Library/Developer/CommandLineTools/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S "/Users/vasanthrajasekaran/Documents/Sophomore Year/CMPS 1600/project2/main.c" -o CMakeFiles/project2.dir/main.c.s

CMakeFiles/project2.dir/main.c.o.requires:

.PHONY : CMakeFiles/project2.dir/main.c.o.requires

CMakeFiles/project2.dir/main.c.o.provides: CMakeFiles/project2.dir/main.c.o.requires
	$(MAKE) -f CMakeFiles/project2.dir/build.make CMakeFiles/project2.dir/main.c.o.provides.build
.PHONY : CMakeFiles/project2.dir/main.c.o.provides

CMakeFiles/project2.dir/main.c.o.provides.build: CMakeFiles/project2.dir/main.c.o


# Object files for target project2
project2_OBJECTS = \
"CMakeFiles/project2.dir/main.c.o"

# External object files for target project2
project2_EXTERNAL_OBJECTS =

project2: CMakeFiles/project2.dir/main.c.o
project2: CMakeFiles/project2.dir/build.make
project2: CMakeFiles/project2.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="/Users/vasanthrajasekaran/Documents/Sophomore Year/CMPS 1600/project2/cmake-build-debug/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable project2"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/project2.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/project2.dir/build: project2

.PHONY : CMakeFiles/project2.dir/build

CMakeFiles/project2.dir/requires: CMakeFiles/project2.dir/main.c.o.requires

.PHONY : CMakeFiles/project2.dir/requires

CMakeFiles/project2.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/project2.dir/cmake_clean.cmake
.PHONY : CMakeFiles/project2.dir/clean

CMakeFiles/project2.dir/depend:
	cd "/Users/vasanthrajasekaran/Documents/Sophomore Year/CMPS 1600/project2/cmake-build-debug" && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" "/Users/vasanthrajasekaran/Documents/Sophomore Year/CMPS 1600/project2" "/Users/vasanthrajasekaran/Documents/Sophomore Year/CMPS 1600/project2" "/Users/vasanthrajasekaran/Documents/Sophomore Year/CMPS 1600/project2/cmake-build-debug" "/Users/vasanthrajasekaran/Documents/Sophomore Year/CMPS 1600/project2/cmake-build-debug" "/Users/vasanthrajasekaran/Documents/Sophomore Year/CMPS 1600/project2/cmake-build-debug/CMakeFiles/project2.dir/DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/project2.dir/depend

