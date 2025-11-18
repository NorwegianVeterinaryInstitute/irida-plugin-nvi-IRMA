```
 diff  2025-07-2990-4-1/logs/FLU-output_2.sh output_2/logs/FLU-output_2.sh  --unified=0
```

```
Falcon-Pro:IRMA_Test_New_Parameters jeevka$ diff -y --suppress-common-lines --label "DEFAULT" --label "MODIFIED" output_2/logs/FLU-output_2.sh 2025-07-2990-4-1/logs/FLU-output_2.sh
## Default                                                |            ## Modified
------------------------------------------------------------------------------------------------------------------------------
SKIP_E=1		# skip reference elongation	              |	SKIP_E=0		# skip reference elongation
DO_SECONDARY=0		# do secondary assembly		          |	DO_SECONDARY=1		# do secondary assembly
RESIDUAL_ASSEMBLY_FACTOR=0	# the primary match to altern |	RESIDUAL_ASSEMBLY_FACTOR=400	# the primary match to altern
DEL_TYPE=""	# rough assembly deletion handling: NNN, REF, |	DEL_TYPE="DEL"	# rough assembly deletion handling: NNN, REF,
MIN_CONS_SUPPORT=1	# minimum consensus support for amend |	MIN_CONS_SUPPORT=10	# minimum consensus support for amend
MIN_CONS_QUALITY=0	# minimum consensus average quality f |	MIN_CONS_QUALITY=10	# minimum consensus average quality f
PADDED_CONSENSUS=0	# attempt to pad amended_consensus wi |	PADDED_CONSENSUS=1	# attempt to pad amended_consensus wi
```
