# Automatically check diffs

INP_PREFIX="./public-testcases/poohpj"
MYGEN_PREFIX="./public-testcases/mygen"
cd $INP_PREFIX
java_file_names=(*.java)
cd ../../
for i in "${java_file_names[@]}"
do
    java Main < public-testcases/poohpj/$i > public-testcases/mygen/$i
done

cd public-testcases/mygen/
for i in "${java_file_names[@]}"
do
    javac $i
    GEN="$(basename $i .java)"
    java $GEN > $GEN\_output
done

cd ../poohpj/
for i in "${java_file_names[@]}"
do
    javac $i
    GEN="$(basename $i .java)"
    java $GEN > $GEN\_output
done

# finding the diff
cd ../../
for i in "${java_file_names[@]}"
do
    echo "diff in $i"
    BASENAME="$(basename $i .java)"
    diff $INP_PREFIX/$BASENAME\_output $MYGEN_PREFIX/$BASENAME\_output
done
