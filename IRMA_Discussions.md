### 17 Oct 2025

Example used
```
IRMA FLU data/sequence/21331/2/251010_M09180.XXXXXXXX_R1_001.fastq /opt/irida/data/sequence/21332/2/251010_M09180.XXXXXXXX_S18_R2_001.fastq resultDir
```

Get about 10 smaples (woth good/ok/bad variations) from cathrine and run in commandline with the options we discussed here. 

#### Deletion situation 
- Using module FLU is fine
  - FHI is also using FLU module/config
  - Align last deletion type DEL so we know exactly what happened. NNNN can represent so many stuffs and mislaead us
  - DEL_TYPE=DEL
    
- MIN_CONS_SUPPORT=10 - We need to test this
- PADDED_CONSENSUS=1
- MIN_CONS_SUPPORT=10
- MIN_CONS_QUALITY=10

# Wait until the the decision on INSERTION

#### Insertion situation - by default it wont care about insertion 
- Are we gonna use insertion information in the sequence if its there
- INS_T
- INS_T_DEPTH


## Updated configs: 
The final params/config looks like this. 
 
 
DEL_TYPE=DEL
MIN_CONS_SUPPORT=10
MIN_CONS_SUPPORT=10
MIN_CONS_QUALITY=10
 
GRID_ON=0 #off

```
### REFERENCE ###
SKIP_E=0        # skip reference elongation
 
### Does secondary assembly for admxiture testing ###
RESIDUAL_ASSEMBLY_FACTOR=400 # integer  Assembles secondary data if observed factor is less than integer RESIDUAL_ASSEMBLY_FACTOR. Leave 0 for off.
MIN_RP_RESIDUAL=150 # ≥ 1   Minimum number of read patterns to continue to attempt residual assembly per gene segment.
MIN_RC_RESIDUAL=150 # ≥ 1   Minimum read count to continue to attempt residual assembly per gene segment.
DO_SECONDARY=1  # 0, 1  off, on Given a successful residual assembly, create a patchwork consensus and run a secondary assembly
``` 
 
 
 
### THE COMMAND: 
```
irma FLU Test_Data/250918_M09180.2025-04-21457-1-4_S5_R1_001.fastq Test_Data/250918_M09180.2025-04-21457-1-4_S5_R2_001.fastq output_2 --external-config userconfig/local_config.sh
```
